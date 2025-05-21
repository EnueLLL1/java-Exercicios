package executavel;

import java.util.Scanner;
import notas.Aluno;

public class Apresentacao {

	public static void main(String[] args) {
		Scanner lt = new Scanner(System.in);
		
		System.out.println("BEM VINDO AO PROGRAMA DE NOTAS");
		
		System.out.print("ADICIONE O NOME DO ALUNO: ");
		String nome = lt.next();
		
		System.out.println("ADCIONE A PRIMEIRA NOTA SENDO NO MAXIMO 30");
		double nt01 = lt.nextDouble();
		lt.nextLine();

		System.out.println("ADCIONE A SEGUNDA NOTA SENDO NO MAXIMO 35");
		double nt02 = lt.nextDouble();		
		lt.nextLine();

		System.out.println("ADCIONE A TERCEIRA NOTA SENDO NO MAXIMO 35");
		double nt03 = lt.nextDouble();
		lt.nextLine();

		Aluno al1 = new Aluno(nome,nt01,nt02,nt03);
		
		System.out.println(al1.ntF());
		lt.close();
	}

}
