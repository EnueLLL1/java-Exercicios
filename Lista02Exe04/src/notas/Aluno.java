package notas;

//Classe
public class Aluno {
	// Atributo
	private String nome;
	private double nt01;
	private double nt02;
	private double nt03;
	private double ntF;

	// Construtor
	public Aluno(String nome, double nt01, double nt02, double nt03) {
		this.nome = nome;
		this.nt01 = nt01;
		this.nt02 = nt02;
		this.nt03 = nt03;
		this.ntF = nt01 + nt02 + nt03;
	}
	// Metodos

	public String ntF() {
		if (ntF >= 60) {
			return "Nota final " + ntF + "\nAprovado";
		} else {
			double pF;
			pF = 60 - ntF;
			return "Nota Final: " + ntF + "\nReprovado\nFaltaram " + pF +" pontos para ser aprovado";

		}
	}

}
