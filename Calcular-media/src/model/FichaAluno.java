package model;

public class FichaAluno {
	private String nomeAluno;
	private double prova1;
	private double prova2;
	private double trabalho;
	private double media;
	private String status;

	protected FichaAluno(String nomeAluno, double prova1, double prova2, double trabalho) {
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

	public String getNomeAluno() {
		return nomeAluno;
	}

	public double getProva1() {
		return prova1;
	}

	public double getProva2() {
		return prova2;
	}

	public double getTrabalho() {
		return trabalho;
	}

	@Override
	public String toString() {
		return String.format("%s, %.2f, %.2f, %.2f, %.2f, %s\n", nomeAluno, prova1, prova2, trabalho, media, status);
	}

	public static class Builder {
		private String nome;
		private double prova1;
		private double prova2;
		private double trabalho;

		public Builder() {
			super();
			this.nome = null;
			this.prova1 = 0;
			this.prova2 = 0;
			this.trabalho = 0;
		}

		public Builder setNome(String nome) {
			this.nome = nome;
			return this;
		}

		public Builder setProva1(double prova1) {
			this.prova1 = prova1;
			return this;
		}

		public Builder setProva2(double prova2) {
			this.prova2 = prova2;
			return this;
		}

		public Builder setTrabalho(double trabalho) {
			this.trabalho = trabalho;
			return this;
		}

		public FichaAluno build() {
			return new FichaAluno(nome, prova1, prova2, trabalho);
		}
	}
}