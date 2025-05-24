package dolar;

//Classe
public class ConversorMoeda {
	// Atributos
	private double pd;
	private double cd;
	private double pr;
	private double iof;

	// Construtor
	public ConversorMoeda(double Pd, double Cd) {
		this.pd = Pd;
		this.cd = Cd;
		this.iof = 0.06;
		this.pr = 0.0;
	}

	// Metodos
	public double cdR() {
		pr = (pd * cd) + (pd * iof * cd);
		return pr;
	}
}
