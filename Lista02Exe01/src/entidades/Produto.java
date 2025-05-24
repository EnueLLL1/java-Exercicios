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

	/**
	 * Formata a string que representa o produto, com o nome, preco, quantidade e total.
	 * 
	 * @return String formatada com os dados do produto.
	 */
	@Override
	public String toString() {
		return String.format("%s, custa R$ %.2f, por %d unidades, o Total é R$ %.2f.", 
        nome, preco, quantidade, totalQuant());
	}	
}