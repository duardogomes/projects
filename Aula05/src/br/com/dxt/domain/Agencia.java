package br.com.dxt.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Agencia extends BaseEntity {

	public String nomeGerente;
	public String codigo;
	
	@OneToMany
	@JoinColumn(name = "agencia")
	public List<Pessoa> pessoas;
	
	@Override
	public String toString() {
		return "Agencia [nomeGerente=" + nomeGerente + ", codigo=" + codigo
				+ ", id=" + id + "]";
	}	
	
}
