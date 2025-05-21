package entidades;

public class Produto {
	private String nome;
	private double preco;
	private int quantidade;
	
	
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public double totalQuant( ) {
		return this.quantidade * this.preco;
	}

	
	
	@Override
	public String toString() {
		return nome +", custa R$ " + preco + ", por " + quantidade + " unidades, o Total é R$" + this.totalQuant()+".";
	}
	
}