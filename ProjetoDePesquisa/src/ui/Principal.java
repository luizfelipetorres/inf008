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
		c.inserirPesquisador(new Professor("Robertão"));
		Pesquisador ricardo = c.inserirPesquisador(new Coordenador("Ricardão"));
		projeto.inserirPesquisador(c);
		System.out.println(ricardo.getCoordenador().getNome());
		Pesquisador renato = projeto.inserirPesquisador(new Professor("Renatão"));
		System.out.println(projeto.getValorPago(p));
	}
}
