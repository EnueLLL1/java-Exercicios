package Entidades;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String nome;
		Integer quantidade;
		Double preco;
		
		System.out.println("Escrva o nome do produto: ");
		nome = leitor.nextLine();
		System.out.println("Escreva o preço:");
		preco = leitor.nextDouble();
		System.out.println("Escreva a Quantidade");
		quantidade = leitor.nextInt();
		
		Produto novoProduto = new Produto(nome,preco,quantidade);
		System.out.println(novoProduto.toString());
		
		System.out.println("Acresente uma quantidade");
		quantidade = leitor.nextInt();
		novoProduto.setQuantidade(quantidade + novoProduto.getQuantidade());
		System.out.println(novoProduto.toString());
		
		System.out.println("Decremente uma quantidade");
		quantidade = leitor.nextInt();
		novoProduto.setQuantidade(novoProduto.getQuantidade() - quantidade );
		System.out.println(novoProduto.toString());
		leitor.close();
			
	}

}
