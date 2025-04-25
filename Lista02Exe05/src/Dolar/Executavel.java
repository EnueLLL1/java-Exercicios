package Dolar;

import java.util.Scanner;

/*
 * Faça um programa para ler a cotação do dólar e um valor em dólares a ser comprado
 * por uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares,
 * considerando ainda que a pessoa terá que pagar 6% de IOF sobre o valor em dólar.
 * Criar uma classe ConversorMoeda para ser responsável pelos cálculos.
 * Exemplo de Interação:
 * Qual é o preço do dólar? 3,10
 * Quantos dólares serão comprados? 200,00
 * Valor a ser pago em reais = 657,20
*/
public class Executavel {

	public static void main(String[] args) {
		Scanner lt = new Scanner(System.in);
		double Pd, Cd ;

		System.out.println("Qual é o preço do dólar?");
		Pd = lt.nextDouble();

		System.out.println("Quantos dólares serão comprados?");
		Cd = lt.nextDouble();

		ConversorMoeda valorR = new ConversorMoeda(Pd, Cd);

		System.out.println("Valor a ser pago em reais = " + valorR.cdR());

		lt.close();
	}

}
