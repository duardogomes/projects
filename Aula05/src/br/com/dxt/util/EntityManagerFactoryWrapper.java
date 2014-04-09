package br.com.dxt.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactoryWrapper {

	public static EntityManagerFactory emf = null;
	
	public static EntityManager getEntityManager(String bd) {
		if (emf == null) {
			emf = Persistence.createEntityManagerFactory(bd);
		}
		return emf.createEntityManager();
	}
	
}
