package br.com.dxt.util;

import java.util.ArrayList;
import java.util.List;

import br.com.dxt.domain.Agencia;
import br.com.dxt.domain.Endereco;
import br.com.dxt.domain.Pessoa;
import br.com.dxt.domain.PessoaFisica;
import br.com.dxt.domain.PessoaJuridica;
import br.com.dxt.domain.Telefone;
import br.com.dxt.domain.TipoTelefone;
import br.com.dxt.domain.UF;
import br.com.dxt.service.Service;

public class Principal {

	public static void main(String[] args) {

		Service s = new Service();

		Endereco end = new Endereco();
		end.rua = "RUA DEXTRA";
		end.cidade = "POLIS II";
		end.estado = UF.SP;
		//s.salvar(end);
		
		Endereco end2 = new Endereco();
		end2.rua = "RUA CIANDT";
		end2.cidade = "POLIS II";
		end2.estado = UF.SP;
		//s.salvar(end2);
		
		Telefone tel1 = new Telefone();
		tel1.tipo = TipoTelefone.CEL;
		tel1.ddd = "19";
		tel1.numero = "98877-6655";
		//s.salvar(tel1);
		
		Telefone tel2 = new Telefone();
		tel2.tipo = TipoTelefone.FIXO;
		tel2.ddd = "19";
		tel2.numero = "98877-4433";
		//s.salvar(tel2);
		
		Telefone tel3 = new Telefone();
		tel3.tipo = TipoTelefone.CEL;
		tel3.ddd = "19";
		tel3.numero = "98877-2211";
		//s.salvar(tel3);
		
		List<Telefone> lt1 = new ArrayList<Telefone>();
		lt1.add(tel1);
		lt1.add(tel2);
		
		List<Telefone> lt2 = new ArrayList<Telefone>();
		lt2.add(tel3);
		
			
		PessoaFisica pf = new PessoaFisica();
		pf.nome = "PESSOA FISICA1";
		pf.cpf = "12345678900";
		pf.endereco = end;
		pf.endereco_comercial = end2;
		//pf.agencia = age;
		pf.telefones = lt1;
		s.salvar(pf);
		/*
		PessoaFisica pf1 = new PessoaFisica();
		pf1.nome = "PESSOA FISICA2";
		pf1.cpf = "74588912399";
		pf1.endereco = end2;
		//pf.agencia = age;
		pf1.telefones = lt2;
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
				*/
		Agencia age = new Agencia();
		age.codigo = "0520";
		age.nomeGerente = "NOME DO GERENTE";
		//age.pessoas = lp;
		s.salvar(age);
		
		
		for (Pessoa pe : s.buscarPessoaCelular()) {
			System.out.println(pe);
		}
		
		
		
		/*
		System.out.println("======================");

		for (Pessoa pe : s.buscarPessoaAgencia("0520")) {
			System.out.println(pe);
		}

		System.out.println("======================");

		for (Pessoa pe : s.buscarPessoaUF(UF.SP)) {

			if (pe instanceof PescloseEntityManagersoaJuridica) {
				System.out.println((PessoaJuridica) pe);
			} else if (pe instanceof PessoaFisica) {
				System.out.println((PessoaFisica) pe);
			}

		}

		
		  for (PessoaFisica p : s.buscar(PessoaFisica.class)) {
		  System.out.println(p); }
		  
		  
		  PessoaFisica pE = s.buscar(PessoaFisica.class, 1L);
		  System.out.println(pE.nome); System.out.println(pE.endereco.cidade);
		 */

		EntityManagerFactoryWrapper.closeEntityManager();
		
	}

}
