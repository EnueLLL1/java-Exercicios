package Entidades;

import java.util.Scanner;

/*
 Fazer um programa para ler os valores da largura e altura de um retângulo. Em seguida,
mostrar na tela o valor de sua área, perímetro e diagonal.
 */
public class Executavel {
	public static void main(String[] args) {
		Scanner let = new Scanner(System.in);
		double tamanho, base;
		
		System.out.println("Adcione o tamanho: ");
		tamanho = let.nextDouble();
		System.out.println("Adcione a Base: ");
		base = let.nextDouble();
		Retangulo ret = new Retangulo(tamanho,base);
		System.out.println("Atributos: Area:" + ret.metodoArea() + " Perimetro:" + ret.metodoPerimetro() + " e Diagonal: " + ret.metodoDiagonal() );
		
		let.close();
	}

}
