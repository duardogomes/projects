package br.com.dxt.domain;

import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "tipo_pessoa")
public class Pessoa extends BaseEntity {

	public String nome;

	@OneToMany(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "pessoa_id")
	public List<Telefone> telefones;

	// @OneToOne(cascade = CascadeType.PERSIST)
	// @JoinColumn(name = "endereco")
	@Embedded
	public Endereco endereco;

	// (cascade = CascadeType.PERSIST)
	// @JoinColumn(name = "endereco")
	@AttributeOverrides({
			@AttributeOverride(name = "rua", column = @Column(name = "rua2")),
			@AttributeOverride(name = "cidade", column = @Column(name = "cidade2")),
			@AttributeOverride(name = "estado", column = @Column(name = "estado2")), })
	@Embedded
	public Endereco endereco_comercial;

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", telefones=" + telefones
				+ ", endereco=" + endereco + ", id=" + id + "]";
	}

	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name = "agencia") public Agencia agencia;
	 */

}
