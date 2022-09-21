package negocio;

import java.util.ArrayList;
import java.util.List;

abstract public class Pesquisador {
	private String nome;
	private Pesquisador coordenador;
	private List<Pesquisador> subordinados;
	
	public Pesquisador(String nome) {
		this.nome = nome;
		subordinados = new ArrayList<Pesquisador>();
		this.coordenador = null;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Pesquisador getCoordenador() {
		return coordenador;
	}

	public void setCoordenador(Pesquisador coordenador) {
		this.coordenador = coordenador;
	}

	public List<Pesquisador> getSubordinados() {
		return subordinados;
	}

	public abstract int getQtdSubordinados() throws Exception;

	public abstract Pesquisador inserirPesquisador(Pesquisador p) throws Exception;
	
	public abstract float calcularValorPago();

	

}
