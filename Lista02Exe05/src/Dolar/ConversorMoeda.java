package Dolar;

//Classe
public class ConversorMoeda {
	// Atributos
	private double Pd;
	private double Cd;
	private double Pr;
	private double Iof;

	// Construtor
	public ConversorMoeda(Double Pd, Double Cd) {
		this.Pd = Pd;
		this.Cd = Cd;
		this.Iof = 0.06;
	}

	// Metodos
	public double cdR() {
		Pr = (Pd * Cd) + (Pd * Iof * Cd);
		return Pr;
	}
}
