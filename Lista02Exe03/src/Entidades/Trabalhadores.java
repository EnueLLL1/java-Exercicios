package Entidades;

import java.util.Scanner;

/*
 * Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto).
 * Em seguida, mostrar os dados do funcionário (nome e salário líquido).
 * Em seguida, aumentar o salário do funcionário com base em uma porcentagem dada (somente o
 * salário bruto é afetado pela porcentagem) e mostrar novamente os dados do
 * funcionário. 
*/
public class Trabalhadores {
	public static void main(String[] args) {
		Scanner lt = new Scanner(System.in);
		String nome;
		double sb, imp;

		System.out.println("Insira o dados do Funcionario");
		System.out.println("Escreva o Nome dele: ");
		nome = lt.nextLine();

		System.out.println("Escreva o Salario bruto: ");
		sb = lt.nextDouble();

		System.out.println("Escreva o Imposto: ");
		imp = lt.nextDouble();

		Salario salario = new Salario(sb, imp);

		System.out.println("O Trabalhador " + nome + " terá o Salario liquido de " + salario.getSl());

		System.out.println("Quer icrementar quantos %? ");
		double alm = lt.nextDouble();
		salario.almSl(alm);

		System.out.println("O Trabalhador " + nome + " terá o Salario bruto incrementado de " + alm
				+ "% sendo o novo salario liquido de " + salario.getSl());
		lt.close();

	}

}
