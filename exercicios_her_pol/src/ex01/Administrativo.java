package ex01;

public class Administrativo extends Assistente{
	
	private Turno turno;
	
	public Administrativo(String nome, String matricula, Turno turno) {
		super(nome, matricula);
		this.turno = turno;
		// TODO Auto-generated constructor stub
	}

	public Turno getTurno() {
		return turno;
	}

	public void setTurno(Turno turno) {
		this.turno = turno;
	}
	
	public double getAdicionalNoturno(double percentual) {
		if(this.turno == Turno.NOITE) {
			return this.getSalario() * percentual;
		}
		return 0;
	}
}
