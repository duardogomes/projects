package br.com.dxt.domain;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ItemVenda extends BaseEntity {

	@ManyToOne
	@JoinColumn(name = "id_venda")
	public Venda venda;
	@ManyToOne
	public Produto produto;
	public float qtde;
	public float valorTotal;

	public ItemVenda(Produto produto, float qtde) {
		super();
		this.produto = produto;
		this.qtde = qtde;
		this.produto.estoqueAtual -= qtde;
		this.valorTotal = produto.valor * qtde;
	}

	@Override
	public String toString() {
		return "ItemVenda [venda=" + venda + ", produto=" + produto + ", qtde="
				+ qtde + ", id=" + id + "]";
	}

}
