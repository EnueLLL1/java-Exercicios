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
	public String getNome() {
		return nome;
	}

	public double getNt01() {
		return nt01;
	}
	
	public double getNt02() {
		return nt02;
	}
	
	public double getNt03() {
		return nt03;
	}

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
