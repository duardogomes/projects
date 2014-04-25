package br.com.dxt.domain;

import javax.persistence.Entity;

@Entity
public class Funcionario extends Pessoa {
	public String matricula;

	@Override
	public String toString() {
		return "Funcionario [matricula=" + matricula + ", nome=" + nome
				+ ", cpf=" + cpf + ", endereco=" + endereco + ", id=" + id
				+ "]";
	}

}
