package br.com.dxt.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import br.com.dxt.domain.BaseEntity;
import br.com.dxt.util.EntityManagerFactoryWrapper;

public class Service {

	EntityManager em = EntityManagerFactoryWrapper.getEntityManager("hsql");

	public void salvar(BaseEntity b) {
		em.getTransaction().begin();

		if (b.id == null)
			em.persist(b);
		else
			em.merge(b);

		em.getTransaction().commit();

	}

	public <T extends BaseEntity> List<T> buscar(Class<T> clazz) {
		TypedQuery<T> qry = em.createQuery("FROM " + clazz.getSimpleName()
				+ " p", clazz);
		return qry.getResultList();
	}
	
	public <T extends BaseEntity> T buscar(Class<T> clazz, Long id) {
		return em.find(clazz, id);		
	}
	
	public void excluir(BaseEntity b) {
		em.getTransaction().begin();

		em.remove(b);

		em.getTransaction().commit();
	}
	
	
}
