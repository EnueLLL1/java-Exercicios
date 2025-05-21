package executavel;

import java.util.Scanner;
import entidades.Salario;

public class Executavel {
	public static void main(String[] args) {
		Scanner lt = new Scanner(System.in);
		
		System.out.println("Insira o dados do Funcionario");

		System.out.print("Escreva o Nome dele: ");
		String nome = lt.nextLine();

		System.out.print("Escreva o Salario bruto: ");
		double sb = lt.nextDouble();
		lt.nextLine();
		
		System.out.print("Escreva o Imposto: ");
		double imp = lt.nextDouble();
		lt.nextLine();

		Salario salario = new Salario(sb, imp);

		System.out.println("O Trabalhador " + nome + " terá o Salario liquido de " + salario.getSl());

		System.out.println("Quer icrementar quantos %? ");
		double alm = lt.nextDouble();
		salario.almSl(alm);

		System.out.println("O Trabalhador " + nome + " terá o Salario bruto incrementado de " + alm	+ "% sendo o novo salario liquido de " + salario.getSl());
		lt.close();

	}

}
