package br.com.dxt.principal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import br.com.dxt.domain.Produto;
import br.com.dxt.domain.Venda;
import br.com.dxt.domain.VendaAcumuladaData;
import br.com.dxt.util.EntityManagerFactoryWrapper;

public class TestSQL {

	public static void main(String[] args) {

		try {
			String jpql = "SELECT p.descritivo, p.estoqueAtual FROM "
					+ Produto.class.getSimpleName() + " p ";
			jpql += "WHERE p.estoqueAtual >= :qtde";

			EntityManager em = EntityManagerFactoryWrapper.getEntityManager();

			Query qry = em.createQuery(jpql);
			qry.setParameter("qtde", 30F);
			List<Object[]> resultList = qry.getResultList();

			for (Object[] line : resultList) {
				System.out.println("Produto: " + line[0].toString());
				System.out.println("Valor: " + line[1].toString());
				System.out.println("====");
			}

			StringBuilder sb = new StringBuilder("SELECT new ");
			sb.append(VendaAcumuladaData.class.getName());
			sb.append("(v.d, SUM(v.valorTotalVenda)) FROM ");
			sb.append(Venda.class.getSimpleName()).append(" v ");
			sb.append(" GROUP BY v.d ");
			//sb.append(" HAVING SUM(v.valorTotalVenda) > 10.0F");
			System.out.println(sb.toString());

			TypedQuery<VendaAcumuladaData> qryVenda = em.createQuery(
					sb.toString(), VendaAcumuladaData.class);
			List<VendaAcumuladaData> list = qryVenda.getResultList();
			for (VendaAcumuladaData v : list) {
				System.out.println(v);
			}

		} finally {
			EntityManagerFactoryWrapper.closeEntityManager();
		}

	}
}
