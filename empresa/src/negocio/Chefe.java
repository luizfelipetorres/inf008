package negocio;


public class Chefe extends Pessoa{

	public Chefe(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getListaEmpregadosAssociados() throws Exception {
		for (int i = 0; i < getEmpregadosAssociados().size(); i++) {
			Pessoa p = getEmpregadosAssociados().get(i);
			System.out.println(p.getNome());
			if (p.getClass() == Chefe.class) {
				p.getListaEmpregadosAssociados();
			}
			
		}
	}
	
	@Override
	public void setEmpregadosAssociados(Pessoa p) throws Exception{
		p.setCoordenador(this);
		getEmpregadosAssociados().add(p);
	}
}
