package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Clientes {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private String nome;
	private String email;
	private Date data_ani;
			
	public Clientes(String nome, String email, Date data_ani) {
		super();
		this.nome = nome;
		this.email = email;
		this.data_ani = data_ani;
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getData_ani() {
		return data_ani;
	}

	public void setData_ani(Date data_ani) {
		this.data_ani = data_ani;
	}


	@Override
	public String toString() {
		return "Cliente: "+nome+" (" + sdf.format(data_ani) + ") - " + email;
	}
	
	
	
}
