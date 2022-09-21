package ui;

import negocio.Coordenador;
import negocio.Pesquisador;
import negocio.Professor;
import negocio.ProjetoDePesquisa;

public class Principal {

	public static void main(String[] args) throws Exception {
		ProjetoDePesquisa projeto = new ProjetoDePesquisa("Projeto");
		Pesquisador c = new Coordenador("Coordenador");
		Pesquisador p = new Professor("Carlinhos");
		c.inserirPesquisador(p);
		c.inserirPesquisador(new Professor("Robert�o"));
		Pesquisador ricardo = c.inserirPesquisador(new Coordenador("Ricard�o"));
		projeto.inserirPesquisador(c);
		System.out.println(ricardo.getCoordenador().getNome());
		Pesquisador renato = projeto.inserirPesquisador(new Professor("Renat�o"));
		System.out.println(projeto.getValorPago(p));
	}
}
