package br.com.dxt.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Endereco extends BaseEntity {

	public String rua;
	public String cidade;
	@Column(length=2)
	public String estado;
	
}
