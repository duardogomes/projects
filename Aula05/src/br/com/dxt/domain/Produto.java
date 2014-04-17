package br.com.dxt.domain;

import javax.persistence.Entity;

@Entity
public class Produto extends BaseEntity {

	public String descritivo;
	public float estoqueAtual;

	public Produto(String descritivo, float estoqueAtual) {
		super();
		this.descritivo = descritivo;
		this.estoqueAtual = estoqueAtual;
	}

	@Override
	public String toString() {
		return "Produto [descritivo=" + descritivo + ", estoqueAtual="
				+ estoqueAtual + ", id=" + id + "]";
	}

}
