package br.com.dxt.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class Endereco extends BaseEntity {

	public String rua;
	public String cidade;
	@Column(length=2)
	@Enumerated(EnumType.STRING)
	public UF estado;
	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", cidade=" + cidade + ", estado="
				+ estado + ", id=" + id + "]";
	}
	
}
