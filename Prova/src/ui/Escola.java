package ui;

import java.util.*;

import negocio.Funcionario;

public class Escola {
	private List<Funcionario> listaFuncionarios;
	
	
	public Escola() {
		super();
		this.listaFuncionarios = new ArrayList<Funcionario>();
	}

	public void cadastrarFuncionario(Funcionario f) {
		listaFuncionarios.add(f);
	}
	
	public double calcularFolhaPagamento() {
		double soma = 0;
		for (int i = 0; i < listaFuncionarios.size(); i++) {
			soma = soma + listaFuncionarios.get(i).calcularSalario();
		}
		return soma;
	}
}
