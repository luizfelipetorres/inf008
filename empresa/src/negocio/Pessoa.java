package negocio;

import java.util.ArrayList;
import java.util.List;

public abstract class Pessoa {
	private String nome;
	private Chefe coordenador;
	private List<Pessoa> empregadosAssociados;
	
	
	public Pessoa(
			String nome
	) {
		super();
		this.nome = nome;
		this.coordenador = null;
		this.empregadosAssociados = new ArrayList<Pessoa>();
	}

	public abstract void getListaEmpregadosAssociados() throws Exception;
	
	public void listarCoordenadores() {
		System.out.println(coordenador.getNome());
		if (this.coordenador.getCoordenador() != null) {
			this.coordenador.listarCoordenadores();
		}
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Chefe getCoordenador() {
		return coordenador;
	}

	public void setCoordenador(Chefe coordenador) {
		this.coordenador = coordenador;
	}

	public List<Pessoa> getEmpregadosAssociados() {
		return empregadosAssociados;
	}
	
	abstract public void setEmpregadosAssociados(Pessoa p) throws Exception;
}
