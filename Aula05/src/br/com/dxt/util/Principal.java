package br.com.dxt.util;

import java.util.ArrayList;
import java.util.List;

import br.com.dxt.domain.Agencia;
import br.com.dxt.domain.Endereco;
import br.com.dxt.domain.Pessoa;
import br.com.dxt.domain.PessoaFisica;
import br.com.dxt.domain.PessoaJuridica;
import br.com.dxt.domain.UF;
import br.com.dxt.service.Service;

public class Principal {

	public static void main(String[] args) {

		Service s = new Service();

		Endereco end = new Endereco();
		end.rua = "RUA DEXTRA";
		end.cidade = "POLIS II";
		end.estado = UF.SP;
		s.salvar(end);

		PessoaFisica pf = new PessoaFisica();
		pf.nome = "PESSOA FISICA1";
		pf.cpf = "12345678900";
		pf.endereco = end;
		//pf.agencia = age;
		s.salvar(pf);
		
		PessoaFisica pf1 = new PessoaFisica();
		pf1.nome = "PESSOA FISICA2";
		pf1.cpf = "74588912399";
		pf1.endereco = end;
		//pf.agencia = age;
		s.salvar(pf1);
		
		PessoaFisica pf2 = new PessoaFisica();
		pf2.nome = "PESSOA FISICA3";
		pf2.cpf = "45698732155";
		pf2.endereco = end;
		//pf.agencia = age;
		s.salvar(pf2);		
		
		PessoaFisica pf3 = new PessoaFisica();
		pf3.nome = "PESSOA FISICA3";
		pf3.cpf = "45698732155";
		pf3.endereco = end;
		//pf.agencia = age;
		s.salvar(pf3);
		
		List<Pessoa> lp = new ArrayList<Pessoa>();
		lp.add(pf);
		lp.add(pf1);
		lp.add(pf2);
		lp.add(pf3);
				
		Agencia age = new Agencia();
		age.codigo = "0520";
		age.nomeGerente = "NOME DO GERENTE";
		age.pessoas = lp;
		s.salvar(age);
		

		System.out.println("======================");

		for (Pessoa pe : s.buscarPessoaAgencia("0520")) {
			System.out.println(pe);
		}

		System.out.println("======================");

		for (Pessoa pe : s.buscarPessoaUF(UF.SP)) {

			if (pe instanceof PessoaJuridica) {
				System.out.println((PessoaJuridica) pe);
			} else if (pe instanceof PessoaFisica) {
				System.out.println((PessoaFisica) pe);
			}

		}

		/*
		 * for (PessoaFisica p : s.buscar(PessoaFisica.class)) {
		 * System.out.println(p); }
		 * 
		 * 
		 * PessoaFisica pE = s.buscar(PessoaFisica.class, 1L);
		 * System.out.println(pE.nome); System.out.println(pE.endereco.cidade);
		 */

	}

}
