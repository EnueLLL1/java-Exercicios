package Banco;
//Classes
public class Contas {
	//Atributos
	public Integer NumC;
	public String Nome;
	public Double Saldo;
	//Construtores
	
	//Construtor sem Saldo Inicial
	public Contas(int NumC, String Nome){
		this.Nome = Nome;
		this.NumC = NumC;
		this.Saldo = 0.0;
	}
	//Construtor com Saldo Inicial
	public Contas(int NumC,String Nome, Double DepI) {
		this.Nome = Nome;
		this.NumC = NumC;
		this.Saldo = DepI;
	}
	//Metodos
	public void Nds(Double Deposito) {
		Saldo = Saldo + Deposito ;
	}
	public void Nss(Double Saque) {
		Saldo = Saldo - (Saque + 5);
	}
    public int getNumC() {
        return NumC;
    }

    public String getNome() {
        return Nome;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setNomeN(String Nome) {
        this.Nome = Nome;
    }
	public String toString() {
        return "DADOS DA CONTA ATUALIZADOS\n" + "Conta " + NumC + ", Nome do Titular: " + Nome + ", Saldo: R$ " + String.format("%.2f", Saldo);
    }
	
}
