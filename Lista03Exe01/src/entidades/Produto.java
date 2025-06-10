package entidades;

public class Produto {
	
	private String pNome;
	private Double preco;
	
	public Produto(String pNome, Double preco){
		this.pNome = pNome;
		this.preco = preco;
	}

	public String getpNome() {
		return pNome;
	}

	public void setpNome(String pNome) {
		this.pNome = pNome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	
}
