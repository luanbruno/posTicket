package br.infnet.ticket.sistema.ticket.vos;

public class Telefone {

	private int num_ddd;
	private int numero;

	public Telefone() {
		super();
	}

	public Telefone( int num_ddd, int numero) {
		super();
		this.num_ddd = num_ddd;
		this.numero = numero;
	}

	public int getNum_ddd() {
		return num_ddd;
	}

	public void setNum_ddd(int num_ddd) {
		this.num_ddd = num_ddd;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	
}
