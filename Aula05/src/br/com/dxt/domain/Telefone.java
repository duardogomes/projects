package br.com.dxt.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Telefone extends BaseEntity {

	public String tipo;
	@Column(length=3)
	public String ddd;
	public String numero;
	
}
