package br.com.dxt.domain;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class Investimento extends BaseEntity {

	@Enumerated(EnumType.STRING)
	public TipoInvest tipo;
	
}
