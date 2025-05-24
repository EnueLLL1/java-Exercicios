package pensionato;

// Classe
public class Estudante {
	// Atributos
	private String nome;
	private String email;
	private int numero;
// Construtor
	public Estudante(String nome, String email, int numero) {
		this.email = email;
		this.nome = nome;
		this.numero = numero;
	}

	// Metodos
	public String pQuarto() {

		return numero + ": " + nome + ", " + email;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
}
