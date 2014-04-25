package br.com.dxt.principal;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import br.com.dxt.domain.Categoria;
import br.com.dxt.domain.Cliente;
import br.com.dxt.domain.Endereco;
import br.com.dxt.domain.Estado;
import br.com.dxt.domain.Funcionario;
import br.com.dxt.domain.ItemVenda;
import br.com.dxt.domain.Produto;
import br.com.dxt.domain.Venda;
import br.com.dxt.service.Service;
import br.com.dxt.util.EntityManagerFactoryWrapper;

public class Teste {

	public static void main(String[] args) {

		Service s = new Service();

		System.out.println("\n INSERINDO CATEGORIA");
		Categoria c1 = new Categoria("Brinquedo");
		Categoria c2 = new Categoria("Infantil");

		List<Categoria> lc = new ArrayList<>();
		lc.add(c1);
		lc.add(c2);

		System.out.println("\n INSERINDO PRODUTO");
		Produto p1 = new Produto("Barbie", 100F, 30F, lc);
		s.salvar(p1);
		Produto p2 = new Produto("HotWhells", 50F, 5F, lc);
		s.salvar(p2);
		Produto p3 = new Produto("Thomas", 30F, 10F, lc);
		s.salvar(p3);
		Produto p4 = new Produto("Dora aventureira", 20F, 8F, lc);
		s.salvar(p4);
		Produto p5 = new Produto("Peppa Pig", 40F, 9F, lc);
		s.salvar(p5);

		System.out.println("\n INSERINDO CLIENTE");
		Cliente cl1 = new Cliente();
		cl1.nome = "Jéssika";
		cl1.cpf = "45678932185";
		cl1.endereco = new Endereco("Avenida Brasil", "Sumaré", Estado.SP);
		s.salvar(cl1);

		Cliente cl2 = new Cliente();
		cl2.nome = "Creuza";
		cl2.cpf = "74125896322";
		cl2.endereco = new Endereco("Rua Salvador", "SBO", Estado.SP);
		s.salvar(cl2);

		System.out.println("\n INSERINDO FUNCIONARIO");
		Funcionario f1 = new Funcionario();
		f1.nome = "Duardo";
		f1.cpf = "85296314755";
		f1.endereco = new Endereco("Avenida Campos Salles", "SBO", Estado.SP);
		s.salvar(f1);

		Funcionario f2 = new Funcionario();
		f2.nome = "Chiba";
		f2.cpf = "74125896335";
		f2.endereco = new Endereco("Avenida Europa", "Americana", Estado.SP);
		s.salvar(f2);

		System.out.println("\n INSERINDO ITEM VENDA");
		ItemVenda iv1 = new ItemVenda(p1, 2);
		ItemVenda iv2 = new ItemVenda(p2, 3);

		Calendar data = Calendar.getInstance();

		System.out.println("\n INSERINDO VENDA1");
		List<ItemVenda> ivL1 = new ArrayList<>();
		ivL1.add(iv1);
		ivL1.add(iv2);
		Venda v1 = new Venda(f1, cl1, ivL1, data.getTime());
		s.salvar(v1);

		ItemVenda iv3 = new ItemVenda(p3, 5);
		ItemVenda iv4 = new ItemVenda(p4, 4);

		data.add(Calendar.DATE, -1);
		System.out.println("\n INSERINDO VENDA2");
		List<ItemVenda> ivL2 = new ArrayList<>();
		ivL2.add(iv3);
		ivL2.add(iv4);
		Venda v2 = new Venda(f2, cl1, ivL2, data.getTime());
		s.salvar(v2);

		ItemVenda iv5 = new ItemVenda(p5, 3);

		data.add(Calendar.DATE, +3);
		System.out.println("\n INSERINDO VENDA3");
		List<ItemVenda> ivL3 = new ArrayList<>();
		ivL3.add(iv5);
		Venda v3 = new Venda(f1, cl2, ivL3, data.getTime());
		s.salvar(v3);

		EntityManagerFactoryWrapper.emf.close();

		System.exit(0);

	}
}
