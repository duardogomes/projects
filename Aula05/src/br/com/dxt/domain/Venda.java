package br.com.dxt.domain;

import java.util.Date;
import javax.persistence.Entity;

@Entity
public class Venda extends BaseEntity {

	public Date d;

	// @OneToMany
	// @JoinColumn(name="id_venda")
	// public List<ItemVenda> itens;

	@Override
	public String toString() {
		return "Venda [d=" + d + ", id_venda=" + id + "]";
	}

}
