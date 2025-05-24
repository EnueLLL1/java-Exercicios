package executavel;

import java.util.Scanner;
import notas.Aluno;

public class Apresentacao {

	public static void main(String[] args) {
		Scanner lt = new Scanner(System.in);
		
		System.out.println("BEM VINDO AO PROGRAMA DE NOTAS");
		
		System.out.print("ADICIONE O NOME DO ALUNO: ");
		String nome = lt.nextLine();
		
		System.out.println("ADCIONE A PRIMEIRA NOTA SENDO NO MAXIMO 30");
		double nt01 = lt.nextDouble();
		lt.nextLine();
			// Verifica se a nota é maior que 30
			if (nt01 > 30) {
				System.out.println("A primeira nota não pode ser maior que 30");
				nt01 = 0;
				}

		System.out.println("ADCIONE A SEGUNDA NOTA SENDO NO MAXIMO 35");
		double nt02 = lt.nextDouble();		
		lt.nextLine();
			// Verifica se a nota é maior que 35
			if (nt02 > 35) {
				System.out.println("A segunda nota não pode ser maior que 35");
				nt02 = 0;
				}

		System.out.println("ADCIONE A TERCEIRA NOTA SENDO NO MAXIMO 35");
		double nt03 = lt.nextDouble();
		lt.nextLine();
			// Verifica se a nota é maior que 35
			if (nt03 > 35) {
				System.out.println("A terceira nota não pode ser maior que 35");
				nt03 = 0;
				}

		Aluno notasAluno = new Aluno(nome,nt01,nt02,nt03);
		
		System.out.println(notasAluno.ntF());
		lt.close();
	}

}
