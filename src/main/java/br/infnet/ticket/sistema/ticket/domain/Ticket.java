package br.infnet.ticket.sistema.ticket.domain;

import java.util.ArrayList;
import java.util.List;


public class Ticket {

	private int id;
	private Usuario usuario;
	private List<Produto> produto;
	private Usuario agente;
	private List<Messagem> messages;
	
	

	public Ticket(Usuario usuario, List<Produto> produto, Usuario agente ) {
		super();
		this.usuario = usuario;
		this.produto = produto;
		this.agente = agente;
		this.messages = messages;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public List<Produto> getProduto() {
		return produto;
	}
	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}
	
	public Usuario getAgente() {
		return agente;
	}

	public void setAgente(Usuario agente) {
		this.agente = agente;
	}

	public List<Messagem> getMessages() {
		return messages;
	}
	public void setMessages(List<Messagem> messages) {
		this.messages = messages;
	}
	public void addMessage(Messagem messagem) {
		if (this.messages == null) {
			this.messages = new ArrayList<>();
		}
		this.messages.add(messagem);
	}
	
	
	
}
