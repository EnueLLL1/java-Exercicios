package executavel;

import java.util.Scanner;
import dolar.ConversorMoeda;

public class Executavel {

	public static void main(String[] args) {
		Scanner lt = new Scanner(System.in);
		System.out.println("CONVERSOR DE MOEDA");

		System.out.print("Qual é o preço do dólar? ");
		double pd = lt.nextDouble();

		System.out.print("Quantos dólares serão comprados? ");
		double cd = lt.nextDouble();

		ConversorMoeda valorR = new ConversorMoeda(pd, cd);

		System.out.println("Valor a ser pago em reais = " + valorR.cdR());

		lt.close();
	}

}
