package br.com.dxt.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="pj")
public class PessoaJuridica extends Pessoa {

	public String cnpj;
	
}
