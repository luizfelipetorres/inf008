package ex01;

public class Funcionario {
	
    private String nome;
    private String matricula;
    private double salario;
    
    
    public Funcionario(String nome, String matricula) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.salario = 1200;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void exibeDados() {
    	System.out.println("Nome: " + this.getNome() + 
    			"Matricula: " + this.getMatricula() + 
    			"Salario: " + this.salario);
    }
}
