package br.com.dxt.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class Telefone extends BaseEntity {

	@Enumerated(EnumType.STRING)
	public TipoTelefone tipo;
	@Column(length=3)
	public String ddd;
	public String numero;
	
	
	@Override
	public String toString() {
		return "Telefone [tipo=" + tipo + ", ddd=" + ddd + ", numero=" + numero
				+ ", id=" + id + "]";
	}
	
	
	
}
