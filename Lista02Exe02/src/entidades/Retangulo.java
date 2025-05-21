package entidades;

//Classe
public class Retangulo {
	//Atributos
	private double tamanho;
	private double base;

	//Construtor
	public Retangulo(double tamanho, double base) {
		this.tamanho = tamanho;
		this.base = base;
	}
	
	//Metodos
	public double metodoArea() {
		return tamanho * base;
	}
	public double metodoPerimetro() {
		return (2 * tamanho) + (2 * base);
	}
	public double metodoDiagonal() {
		return Math.sqrt((Math.pow(tamanho, 2) + Math.pow(base, 2)));
	}
}
