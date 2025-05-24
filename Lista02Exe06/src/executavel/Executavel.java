package executavel;

import java.util.Scanner;

import banco.Contas;

public class Executavel {

	public static void main(String[] args) {

		Scanner lt = new Scanner(System.in);

		System.out.println("PARA SE CADRASTAR É NECESSARIO O NÚMERO DE CONTA");
		System.out.print("INSIRA O NÚMERO DA CONTA: ");
		int NumC = lt.nextInt();

		// LIMPAR BUFFER
		lt.nextLine();

		System.out.print("INSIRA O NOME DO TITULAR: ");
		String Nome = lt.nextLine();

		System.out.print("VC QUER FAZER UM DEPOSITO INICIAL? (S/N) ");
		String CDep = lt.next();

		Contas conta;
		if (CDep.equalsIgnoreCase("S")) {
			System.out.print("INFORME O VALOR DO DEPOSITO INICIAL: ");
			double DepI = lt.nextDouble();
			conta = new Contas(NumC, Nome, DepI);
		} else {
			System.out.println("NÃO FOI SELECIONADO ALGUM DEPOSITO INICIAL");
			conta = new Contas(NumC, Nome);
		}

		System.out.println(conta);

		System.out.print("QUAL É O VALOR DO DEPOSITO?  ");
		double Deposito = lt.nextDouble();
		conta.saldoNovoDeposito(Deposito);

		System.out.println(conta);

		System.out.print("QUAL É O VALOR DO SAQUE? ");
		double Saque = lt.nextDouble();
		conta.saldoNovoSaque(Saque);

		System.out.println(conta);

		lt.close();
	}

}
