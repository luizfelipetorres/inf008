package ex01;

public class Tecnico extends Assistente{

	public Tecnico(String nome, String matricula) {
		super(nome, matricula);
		// TODO Auto-generated constructor stub
	}

	public double bonusSalarial(double bonus) {
		return this.getSalario() * bonus;
	}

}
