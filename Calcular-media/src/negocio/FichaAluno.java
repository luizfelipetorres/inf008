package negocio;

public class FichaAluno {
	private String nomeAluno;
	private double prova1;
	private double prova2;
	private double trabalho;
	private double media;
	private String status;
	
	public FichaAluno(String nomeAluno, double prova1, double prova2, double trabalho) {
		super();
		this.nomeAluno = nomeAluno;
		this.prova1 = prova1;
		this.prova2 = prova2;
		this.trabalho = trabalho;
		this.media = calcularMedia();
		this.status = definirStatus();
	}

	private String definirStatus() {
		return media >= 5 ? "Aprovado" : "Reprovado";
	}

	private double calcularMedia() {
		return (prova1 + prova2 + trabalho) / 3;
	}
	
}
