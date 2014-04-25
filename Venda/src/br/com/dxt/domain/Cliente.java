package br.com.dxt.domain;

import javax.persistence.Entity;

@Entity
public class Cliente extends Pessoa {

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + ", endereco="
				+ endereco + ", id=" + id + "]";
	}

}
