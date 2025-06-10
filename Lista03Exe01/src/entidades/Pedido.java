package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Date momento;
	private Status status;
	private Clientes cliente;


	private List<ItensPedido> itens = new ArrayList<>();

	public Pedido(Date momento, Status status, Clientes cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Clientes getCliente() {
		return cliente;
	}

	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}

	public List<ItensPedido> getItens() {
		return itens;
	}

	public void setItens(List<ItensPedido> itens) {
		this.itens = itens;
	}

	public static SimpleDateFormat getSdf() {
		return sdf;
	}

	public void addItem(ItensPedido item) {
		itens.add(item);
	}

	public void removerItem(ItensPedido item) {
		itens.remove(item);
	}

	public Double total() {
		double ttl = 0.0; 
		for (ItensPedido itensPedido : itens) {
			ttl += itensPedido.subTotal();
		}
		return ttl;
	}

	@Override
	public String toString() {
		StringBuilder sd = new StringBuilder();
		
		sd.append("RESUMO DO PEDIDO");
		sd.append("Momento do pedido: "+ sdf.format(momento) + "\n"); 
		sd.append("Status do Pedido: "  + status );
		sd.append("\n" + cliente.toString() + "\n");
		sd.append("\nITEMS DO PEDIDO\n" );
		for (ItensPedido itenspedido : itens) {
		sd.append(itenspedido + "\n");
		}
		sd.append("\nValor Total R$: " + total());
		
		return	sd.toString();
	}

}
