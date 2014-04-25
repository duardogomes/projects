package br.com.dxt.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Produto extends BaseEntity {

	public String descritivo;
	public float estoqueAtual;
	public float valor;
	@ManyToMany(cascade=CascadeType.PERSIST)
	@JoinColumn(name = "id_categoria")
	public List<Categoria> categoria;

	public Produto(String descritivo, float estoqueAtual, float valor,
			List<Categoria> categoria) {
		super();
		this.descritivo = descritivo;
		this.estoqueAtual = estoqueAtual;
		this.valor = valor;
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Produto [descritivo=" + descritivo + ", estoqueAtual="
				+ estoqueAtual + ", valor=" + valor + ", id=" + id + "]";
	}

}
