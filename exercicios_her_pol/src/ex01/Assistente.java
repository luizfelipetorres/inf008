package ex01;

public class Assistente extends Funcionario{

	public Assistente(String nome, String matricula) {
		super(nome, matricula);
	}
	
	@Override
	public void exibeDados() {
    	System.out.println("Nome: " + this.getNome() + "Matricula: " + this.getMatricula());
    }
}
