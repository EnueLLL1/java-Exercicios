package Notas;

//Classe
public class Aluno {
	// Atributo
	private String nome;
	private double nt01;
	private double nt02;
	private double nt03;
	private double ntF;

	// Construtor
	public Aluno(String nome, Double nt01, Double nt02, Double nt03) {
		this.nome = nome;
		this.nt01 = nt01;
		this.nt02 = nt02;
		this.nt03 = nt03;
		this.ntF = nt01 + nt02 + nt03;
	}
	// Metodos

	public String ntF() {
		if (ntF >= 60) {
			return "O Aluno " + nome + " foi Aprovado com a nota final " + ntF + " Tendo as segintes notas, Nota 1:" + nt01 + ", Nota 2 :"+ nt02 + ", é Nota 3:" + nt03;
		} else {
			double pF;
			pF = 60 - ntF;
			return "Falta pouco, a sua nota final é " + ntF + ", e os pontos faltantes são " + pF
					+ " e para ser aprovado precisa de 60.";

		}
	}

}
