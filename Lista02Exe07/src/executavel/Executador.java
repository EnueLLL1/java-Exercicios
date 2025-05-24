package executavel;

import java.util.Scanner;
import pensionato.Estudante;

public class Executador {

	public static void main(String[] args) {
		
		Scanner lt = new Scanner(System.in);
		Estudante[] vetorQuarto = new Estudante[10];
		
		System.out.println("Bem-vindo ao sistema de aluguel de quartos!");
		System.out.print("Quantos quartos serão alugados? (Max 10)");
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

			Estudante q1 = new Estudante(nome, email, numero);

			vetorQuarto[i] = q1;

			i++;
		} while (i < numeroQuartos);
		
		// Ordenando com base no número do quarto (ordem crescente)
        for (int j = 0; j < numeroQuartos - 1; j++) {
			for (int k = j + 1; k < numeroQuartos; k++) {
				if (vetorQuarto[j].getNumero() > vetorQuarto[k].getNumero()) {
					Estudante temp = vetorQuarto[j];
					vetorQuarto[j] = vetorQuarto[k];
					vetorQuarto[k] = temp;
				}
			}
		}
		//Imprimindo os quartos ocupados
		System.out.println("Quartos ocupados:");
		for (int j = 0; j < numeroQuartos; j++) {
			System.out.println(vetorQuarto[j].pQuarto());
		}
		lt.close();
	}
}
