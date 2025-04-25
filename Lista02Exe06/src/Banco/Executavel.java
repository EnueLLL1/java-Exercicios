package Banco;

import java.util.Scanner;

/*
 *Em um banco, para se cadastrar uma conta bancária é necessário informar o número da
 *conta, o nome do titular da conta e o valor de depósito inicial que o titular depositou ao
 *abrir a conta. Este valor de depósito inicial, entretanto, é opcional, ou seja, se o titular
 *não tiver dinheiro a depositar no momento de abrir sua conta, o depósito inicial não
 *será feito e o saldo inicial da conta será, naturalmente, zero.
 *
 *Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca
 *poderá ser alterado. Já o nome do titular pode ser alterado (pois uma pessoa pode
 *mudar de nome por ocasião de casamento, por exemplo).
 *
 *Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um
 *mecanismo para proteger isso. O saldo só aumenta por meio de depósitos, e só diminui
 *por meio de saques. Para cada saque realizado, o banco cobra uma taxa de R$ 5,00.
 *Nota: a conta pode ficar com saldo negativo se o saldo não for suficiente para realizar o
 *saque e/ou pagar a taxa.
 *Você deve fazer um programa que realize o cadastro de uma conta, dando opção para
 *que seja ou não informado o valor de depósito inicial. Em seguida, realizar um depósito
 *e depois um saque, sempre mostrando os dados da conta após cada operação.
 *
 *Exemplo de Interação:
 *Informe o número da conta: 8532
 *Informe o nome do titular da conta: Alex Green
 *Haverá um deposito inicial (s/n)? s
 *Informe o valor do deposito inicial: 500.00
 *Dados da Conta:
 *Número 8532, Nome do Titular: Alex Green, Saldo: R$ 500,00
 *Informe um valor de Depósito: 200,00
 *Dados da conta atualizados:
 *Conta 8532, Nome do Titular: Alex Green, Saldo: R$ 700,00
 *Informe um valor de saque: 300,00
 *Dados da conta atualizados:
 *Conta 8532, Nome do Titular: Alex Green, Saldo: R$ 395.00 
*/
public class Executavel {

	public static void main(String[] args) {
		String Nome, CDep;
		int NumC;
		double DepI, Saque, Deposito;

		Scanner lt = new Scanner(System.in);

		System.out.println("PARA SE CADRASTAR É NECESSARIO O NÚMERO DE CONTA");
		System.out.println("INSIRA O NÚMERO DA CONTA");
		NumC = lt.nextInt();

		// LIMPAR BUFFER
		lt.nextLine();

		System.out.println("INSIRA O NOME DO TITULAR");
		Nome = lt.nextLine();

		System.out.println("VC QUER FAZER UM DEPOSITO INICIAL? (S/N) ");
		CDep = lt.next();

		Contas conta;
		if (CDep.equalsIgnoreCase("S")) {
			System.out.println("INFORME O VALOR DO DEPOSITO INICIAL");
			DepI = lt.nextDouble();
			conta = new Contas(NumC, Nome, DepI);
		} else {
			System.out.println("NÃO FOI SELECIONADO ALGUM DEPOSITO INICIAL");
			DepI = 0;
			conta = new Contas(NumC, Nome);
		}

		System.out.println(conta);

		System.out.println("QUAL É O VALOR DO DEPOSITO? ");
		Deposito = lt.nextDouble();
		conta.Nds(Deposito);

		System.out.println(conta);

		System.out.println("QUAL É O VALOR DO SAQUE? ");
		Saque = lt.nextDouble();
		conta.Nss(Saque);

		System.out.println(conta);

		lt.close();
	}

}
