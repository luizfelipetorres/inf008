package negocio;

public class Coordenador extends Pesquisador{

	public Coordenador(String nome) {
		super(nome);
	}

	@Override
	public int getQtdSubordinados() {
		return getSubordinados().size();
	}

	@Override
	public Pesquisador inserirPesquisador(Pesquisador p) {
		p.setCoordenador(this);
		getSubordinados().add(p);
		return p;
	}

	@Override
	public float calcularValorPago() {
		// TODO Auto-generated method stub
		return 300f * (1 - (getQtdSubordinados() * 0.025f));
	}	
}
