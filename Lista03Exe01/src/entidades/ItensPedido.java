package entidades;

public class ItensPedido {
	private Integer quant;
	private Double preco;
	private Produto produto;

	public ItensPedido(Integer quant, Double preco, Produto produto) {
		this.preco = preco;
		this.quant = quant;
		this.produto = produto;
	}

	public Integer getQuant() {
		return quant;
	}

	public void setQuant(Integer quant) {
		this.quant = quant;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Double subTotal() {
		return quant * preco;
	}

	@Override
	public String toString() {
		return produto.getpNome() + 
				String.format(", R$ %.2f",preco) +
				", Quantidade: " + quant +
				", Subtotal: " + String.format("R$ %.2f",subTotal());
	}

}
