package negocio;


public class Empregado extends Pessoa{

	public Empregado(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getListaEmpregadosAssociados() throws Exception{
		throw new Exception("Empregado não possui subordinados!");
	}
	
	public void setEmpregadosAssociados(Pessoa p) throws Exception{
		throw new Exception("Empregado não possui subordinados!");
	} 
	

}
