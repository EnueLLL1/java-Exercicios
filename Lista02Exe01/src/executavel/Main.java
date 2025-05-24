package executavel;

import java.util.Scanner;

import entidades.Produto;

public class Main {
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Escrva o nome do produto: ");
		String nome = leitor.nextLine();

		System.out.print("Escreva o preço: ");
		double preco = leitor.nextDouble();
		leitor.nextLine();

		System.out.print("Escreva a Quantidade: ");
		int quantidade = leitor.nextInt();
		leitor.nextLine();

		//Instancia a classe Produto e passa os valores para o construtor
		Produto novoProduto = new Produto(nome, preco, quantidade);

		System.out.println("Dados do Produto: " + novoProduto.toString());

		System.out.print("Informe o número de produtos a serem adicionados no estoque: ");
		quantidade = leitor.nextInt();
		leitor.nextLine();
		novoProduto.setQuantidade(quantidade + novoProduto.getQuantidade());

		System.out.println("Dados Atualizados " + novoProduto.toString());

		System.out.print("Informe o número de produtos a serem removidos do estoque: ");
		quantidade = leitor.nextInt();
		leitor.nextLine();
		novoProduto.setQuantidade(novoProduto.getQuantidade() - quantidade);

		System.out.println("Dados Atualizados: " + novoProduto.toString());

		leitor.close();

	}

}
