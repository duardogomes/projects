package br.com.dxt.domain;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity
@Inheritance(strategy= InheritanceType.JOINED)
@DiscriminatorColumn(name="tipo_pessoa")
public class Pessoa extends BaseEntity {

	public String nome;
	
	@OneToOne
	@JoinColumn(name = "endereco")
	public Endereco endereco;

	@ManyToOne
	@JoinColumn(name = "agencia")
	public Agencia agencia;
	

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", endereco=" + endereco + ", agencia="
				+ agencia + ", id=" + id + "]";
	}
	
	
	
	
}
