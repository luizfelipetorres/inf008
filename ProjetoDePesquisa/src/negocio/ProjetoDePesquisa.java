package negocio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProjetoDePesquisa {
	private List<Pesquisador> pesquisadores;
	private String nomeProjeto;
	
	public ProjetoDePesquisa(String nomeProjeto)
	{
		this.nomeProjeto = nomeProjeto;
		pesquisadores = new ArrayList<Pesquisador>();
	}
	
	public int getQtdPesquisadores(Pesquisador pesquisador) throws Exception {
		Pesquisador p = null;
		for (int i = 0; i < pesquisadores.size(); i++) {
			if (pesquisadores.get(i).equals(pesquisador)) {
				p = pesquisadores.get(i);
			}
		}
		if (p != null) {
			return p.getQtdSubordinados();
		}
		return 0;
	}
	
	public Pesquisador inserirPesquisador(Pesquisador pesquisador) {
		pesquisadores.add(pesquisador);
		return pesquisador;
	}

	public List<Pesquisador> getPesquisadores() {
		return pesquisadores;
	}

	public void setPesquisadores(List<Pesquisador> pesquisadores) {
		this.pesquisadores = pesquisadores;
	}

	public String getNomeProjeto() {
		return nomeProjeto;
	}

	public void setNomeProjeto(String nomeProjeto) {
		this.nomeProjeto = nomeProjeto;
	}
	
	public float getValorPago(Pesquisador p) {
		return p.calcularValorPago();
	}
	
	
}
