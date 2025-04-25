package Pensionato;

// Classe
public class Estudante {
	// Atributos
	private String nome;
	private String e_mail;
	private Integer numero;
// Construtor
	public Estudante(String nome, String e_mail, Integer numero) {
		this.e_mail = e_mail;
		this.nome = nome;
		this.numero = numero;
	}
	// Metodos

	public String pQuarto() {

		return numero + ": " + nome + ", " + e_mail;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	

}
