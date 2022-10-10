package negocio;

public class Professor extends Funcionario{

	public Professor(
			double salarioBase, 
			double qtdDiasFalta, 
			int qtdHorasExtras 
			) {
		super(salarioBase, qtdDiasFalta, qtdHorasExtras, 12, 8);
		// TODO Auto-generated constructor stub
	}

	
	public double valorHoraExtra() {
		// TODO Auto-generated method stub
		return 2.5 * salarioHora();
	}

	public double calcularSalario() {
		// TODO Auto-generated method stub
		return getSalarioBase() + (valorHoraExtra() * getQtdHorasExtras());
	}

}
