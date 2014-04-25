package br.com.dxt.domain;

import javax.persistence.Entity;

@Entity
public class Categoria extends BaseEntity {

	public String descritivo;

	public Categoria(String descritivo) {
		super();
		this.descritivo = descritivo;
	}

}
