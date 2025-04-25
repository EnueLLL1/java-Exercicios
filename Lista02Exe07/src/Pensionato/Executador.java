package Pensionato;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
 * A dona de um pensionato possui dez quartos para alugar para estudantes, sendo esses
 * quartos identificados pelos números 0 a 9. Fazer um programa que inicie com todos os
 * dez quartos vazios, e depois leia uma quantidade N representando o número de
 * estudantes que vão alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel
 * dos N estudantes.
 * 
 * Para cada registro de aluguel, informar o nome e email do estudante, bem como qual
 * dos quartos ele escolheu (de 0 a 9). Suponha que seja escolhido um quarto vago. Ao
 * final, seu programa deve imprimir um relatório de todas as ocupações do pensionato,
 * por ordem de quarto.
 * 
 * Obs: Utilize vetores para resolver o problema
*/
public class Executador {

	public static void main(String[] args) {
		Scanner lt = new Scanner(System.in);

		System.out.println("Quantos quartos serão alugados? (Max 10)");
		int nQ = lt.nextInt();

		Estudante[] vtquarto = new Estudante[nQ];

		int i = 0;
		do {

			System.out.println("Qual é o seu nome?");
			String nome = lt.next();

			System.out.println("Qual é o seu e-mail?");
			String e_mail = lt.next();

			System.out.println("Qual é o numero do quarto?");
			int numero = lt.nextInt();

			Estudante q1 = new Estudante(nome, e_mail, numero);

			vtquarto[i] = q1;

			i++;
		} while (i < nQ);
		
		// Ordenando com base no número do quarto (ordem crescente)
        Arrays.sort(vtquarto, Comparator.comparingInt(Estudante::getNumero));
		
		//Printar a organização
		for (int j = 0; j < nQ; j++) {

			System.out.println(vtquarto[j].pQuarto());

		}
		lt.close();
	}
}
