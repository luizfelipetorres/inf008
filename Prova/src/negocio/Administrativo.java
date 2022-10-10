package negocio;

public class Administrativo extends Funcionario{

	public Administrativo(double salarioBase, double qtdDiasFalta, int qtdHorasExtras) {
		super(salarioBase, qtdDiasFalta, qtdHorasExtras, 30, 8);
		
		// TODO Auto-generated constructor stub
	}

	public double calcularSalario() {
		double descontoFalta = salarioDia() * getQtdDiasFalta();
		return getSalarioBase() - descontoFalta + (valorHoraExtra() *getQtdHorasExtras());
	}
	
	public double valorHoraExtra() {
		return 1.5 * salarioHora();
	}
}
