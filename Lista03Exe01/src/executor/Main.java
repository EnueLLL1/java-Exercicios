package executor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entidades.Clientes;
import entidades.ItensPedido;
import entidades.Pedido;
import entidades.Produto;
import entidades.Status;

public class Main {

	public static void main(String[] args) throws ParseException {
	
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Informe os dados do Cliente:");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Email: ");
		String email = sc.nextLine();
		
		System.out.print("Data de Nacimento (DD/MM/AAAA): ");
		Date date_ani = data.parse(sc.nextLine());
		
		Clientes clt = new Clientes(nome,email,date_ani);
		
		System.out.println("Informe os dados do Pedido:");
		
		System.out.print("Status:");
		
		Status status = Status.valueOf(sc.next());
		
		Pedido pedido = new Pedido(new Date(), status, clt);
		
		System.out.print("Quantos itens para este pedido? ");
		int N = sc.nextInt();
		sc.nextLine();		
		
		for (int i = 0; i <N; i++) {
		System.out.println("Informe os dados do item "+(i+1)+":" );
		
		System.out.print("Nome do produto: ");
		String nomeProd = sc.nextLine();
		
		System.out.print("Preço do produto: ");
		Double precoProd = sc.nextDouble();
		sc.nextLine();
		
		Produto produto = new Produto(nomeProd, precoProd);
		
		System.out.print("Quantidade: ");
		Integer quantProd = sc.nextInt();
		sc.nextLine();
		
		ItensPedido itensPedido = new ItensPedido(quantProd,precoProd, produto);
		
		pedido.addItem(itensPedido);
		}
		
		System.out.println(pedido.toString());
		
		sc.close();
	}	

}
