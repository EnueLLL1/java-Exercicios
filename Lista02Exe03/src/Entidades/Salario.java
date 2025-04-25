package Entidades;

//Classes
public class Salario {
	//Atributos
	private double sb;
	private double imp;
	//Construtor
	public Salario(Double sb, Double imp){
		this.sb = sb;
		this.imp = imp;
	}
	
	//Metodos
	
	public double getSl() {
		return sb - imp;
	}
	public void almSl(Double alm) {
		 this.sb = sb + (sb * (alm/100));
	}
	
	
}