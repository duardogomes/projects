package br.com.dxt.domain;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Pessoa extends BaseEntity {

	public String nome;
	@Column(unique = true)
	public String cpf;

	@Embedded
	public Endereco endereco;

}
