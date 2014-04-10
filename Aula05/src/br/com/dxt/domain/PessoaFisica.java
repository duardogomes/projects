package br.com.dxt.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "pf")
public class PessoaFisica extends Pessoa {

	public String cpf;
	
}
