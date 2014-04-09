package br.com.dxt.util;

import br.com.dxt.domain.PessoaFisica;
import br.com.dxt.service.Service;

public class Principal {

	public static void main(String[] args) {

		Service s = new Service();
		
		PessoaFisica pf = new PessoaFisica();
		pf.nome = "PESSOA FISICA1";
		pf.cpf = "12345678900";
		s.salvar(pf);
		
		for (PessoaFisica p : s.buscar(PessoaFisica.class)) {
			System.out.println(p);
		}
		System.out.println("\n\n\n");
		
		pf.cpf = "00987654321";
		s.salvar(pf);
		
		PessoaFisica pf1 = new PessoaFisica();
		pf1.nome = "PESSOA FISICA2";
		pf1.cpf = "85274196355";
		s.salvar(pf1);
		
		System.out.println("\n\n\n");
		for (PessoaFisica p : s.buscar(PessoaFisica.class)) {
			System.out.println(p);
		}
				
	}

}
