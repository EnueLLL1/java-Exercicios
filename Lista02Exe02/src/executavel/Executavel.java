package executavel;

import java.util.Scanner;
import entidades.Retangulo;

/*
 Fazer um programa para ler os valores da largura e altura de um retângulo. Em seguida,
mostrar na tela o valor de sua área, perímetro e diagonal.
 */
public class Executavel {
	public static void main(String[] args) {

		Scanner let = new Scanner(System.in);
		
		System.out.print("Adcione o tamanho: ");
		double tamanho = let.nextDouble();
		
		System.out.print("Adcione a Base: ");
		double base = let.nextDouble();
		
		Retangulo ret = new Retangulo(tamanho,base);
		
		System.out.print("Atributos: Area:" + ret.metodoArea() + " Perimetro:" + ret.metodoPerimetro() + " e Diagonal: " + ret.metodoDiagonal() );
		
		let.close();
	}

}
