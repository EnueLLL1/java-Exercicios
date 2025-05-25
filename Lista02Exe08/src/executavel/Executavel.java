package executavel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import entidades.EstudanteQuarto;

public class Executavel {

	public static void main(String[] args) {
		
		Scanner lt = new Scanner(System.in);

		// Criação de um Array de Quartos
		// O tamanho máximo do array é 10
		ArrayList<EstudanteQuarto> listaQuartos = new ArrayList<>(10);

		System.out.println("Bem-vindo ao sistema de aluguel de quartos!");
		System.out.print("Quantos quartos serão alugados? (Max 10) ");
		int numeroQuartos = lt.nextInt();
		lt.nextLine(); // Limpar o buffer

		int i = 0;
		do {
			System.out.println("Quarto #" + (i + 1) + ":");

			System.out.print("Qual é o seu nome? ");
			String nome = lt.nextLine();

			System.out.print("Qual é o seu e-mail? ");
			String email = lt.nextLine();

			System.out.print("Qual é o numero do quarto? ");
			int numero = lt.nextInt();
			lt.nextLine(); // Limpar o buffer

			EstudanteQuarto q1 = new EstudanteQuarto(nome, email, numero);

			listaQuartos.add(q1);
			System.out.println("Quarto #" + (i + 1) + " alugado com sucesso!");

			i++;
		} while (i < numeroQuartos);
		
		// Ordenando com base no número do quarto (ordem crescente)
		Collections.sort(listaQuartos, (a, b) -> Integer.compare(a.getNumero(), b.getNumero()));

		//Imprimindo os quartos ocupados
		System.out.println("Quartos ocupados:");
		for (int j = 0; j < numeroQuartos; j++) {
			System.out.println(listaQuartos.get(j).pQuarto());
		}
		lt.close();
	}
}
