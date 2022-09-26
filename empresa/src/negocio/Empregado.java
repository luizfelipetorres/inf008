package negocio;

import java.util.List;

public class Empregado extends Pessoa{

	public Empregado(String nome, Chefe chefe) {
		super(nome, chefe);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Pessoa> getListaEmpregadosAssociados() {
		// TODO Auto-generated method stub
		return null;
	}

}
