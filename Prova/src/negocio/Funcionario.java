package negocio;

abstract public class Funcionario {
	private double salarioBase;
	private double qtdDiasFalta;
	private int qtdHorasExtras;
	private int diasTrabalhados;
	private int cargaHorariaDia;
	
	public Funcionario(
			double salarioBase, 
			double qtdDiasFalta, 
			int qtdHorasExtras, 
			int diasTrabalhados, 
			int cargaHorariaDia
			) {
		super();
		this.salarioBase = salarioBase;
		this.qtdDiasFalta = qtdDiasFalta;
		this.qtdHorasExtras = qtdHorasExtras;
		this.diasTrabalhados = diasTrabalhados;
		this.cargaHorariaDia = cargaHorariaDia;
	}
	
	
	abstract public double valorHoraExtra();
	abstract public double calcularSalario();
	

	public double salarioDia() {
		return salarioBase / diasTrabalhados;
	}
	
	public double salarioHora() {
		return salarioDia() / getCargaHorariaDia();
	}


	public int getCargaHorariaDia() {
		return cargaHorariaDia;
	}


	public double getSalarioBase() {
		return salarioBase;
	}


	public int getDiasTrabalhados() {
		return diasTrabalhados;
	}


	public double getQtdDiasFalta() {
		return qtdDiasFalta;
	}


	public int getQtdHorasExtras() {
		return qtdHorasExtras;
	}
}
