package br.com.dxt.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Venda extends BaseEntity {

	@ManyToOne
	public Funcionario funcionario;

	@ManyToOne
	public Cliente cliente;

	@Temporal(TemporalType.DATE)
	public Date d;
	public Float valorTotalVenda = 0F;

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name = "id_venda")
	public List<ItemVenda> itens;

	
	public Venda(Funcionario funcionario, Cliente cliente, List<ItemVenda> itens, Date date) {
		super();
		this.funcionario = funcionario;
		this.cliente = cliente;
		this.d = date;
		this.itens = itens;
		for (ItemVenda itemVenda : itens) {
			this.valorTotalVenda += itemVenda.valorTotal;
		}
	}

	@Override
	public String toString() {
		return "Venda [d=" + d + ", id_venda=" + id + "]";
	}

}
