package negocio;

public class Professor extends Pesquisador{

	public Professor(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getQtdSubordinados() throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("Professores não possuem subordinados!");
	}

	@Override
	public Pesquisador inserirPesquisador(Pesquisador p) throws Exception {
		throw new Exception("Professores não possuem subordinados!");
	}

	@Override
	public float calcularValorPago() {
		// TODO Auto-generated method stub
		return 220f + (getCoordenador().calcularValorPago() * 0.3f);
	}
	
	
}
