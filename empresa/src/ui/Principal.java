package ui;

import negocio.Chefe;
import negocio.Empregado;
import negocio.Pessoa;

public class Principal {
	public static void main(String[] args) throws Exception {
		Pessoa raiz = new Chefe("Antonio Carlos");
		Pessoa empregado = new Empregado("Antoninho");
		Pessoa chefe = new Chefe("Renato");
		
		raiz.listarCoordenadores();
		raiz.setEmpregadosAssociados(chefe);
		chefe.setEmpregadosAssociados(empregado);
		raiz.getListaEmpregadosAssociados();
	}
}
