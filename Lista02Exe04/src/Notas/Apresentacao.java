package Notas;

import java.util.Scanner;

/*
 * Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três 
 * trimestres do ano (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada).
 * Ao final, mostrar qual a nota final do aluno no ano. Dizer também se o aluno está aprovado 
 * ou não e, em caso negativo, quantos pontos faltam para o aluno obter o mínimo para 
 * ser aprovado (que é 60% da nota). Você deve criar uma classe Estudante para resolver 
 * este problema. 
*/
public class Apresentacao {

	public static void main(String[] args) {
		Scanner lt = new Scanner(System.in);
		
		String nome;
		double nt01, nt02, nt03 ;
		System.out.println("ADICIONE O NOME DO ALUNO: ");
		nome = lt.next();
		
		System.out.println("ADCIONE A PRIMEIRA NOTA SENDO NO MAXIMO 30");
		nt01 = lt.nextDouble();
		
		System.out.println("ADCIONE A SEGUNDA NOTA SENDO NO MAXIMO 35");
		nt02 = lt.nextDouble();		
		
		System.out.println("ADCIONE A TERCEIRA NOTA SENDO NO MAXIMO 35");
		nt03 = lt.nextDouble();
		
		Aluno al1 = new Aluno(nome,nt01,nt02,nt03);
		
		System.out.println(al1.ntF());
		lt.close();
	}

}
