package br.infnet.ticket.sistema.ticket.domain;

import br.infnet.ticket.sistema.ticket.vos.Email;
import br.infnet.ticket.sistema.ticket.vos.Name;
import br.infnet.ticket.sistema.ticket.vos.Telefone;

public class Usuario {

	private int id;
	private Name name;
	private Telefone fixoTelefone;
	private Telefone cellTelefone;
	private Email email;

	
	public Usuario() {
	}
	public Usuario(Name name, Email email, Telefone fixoTelefone, Telefone cellTelefone) {
		super();
		this.name = name;
		this.fixoTelefone = fixoTelefone;
		this.cellTelefone = cellTelefone;
		this.email = email;

	}	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	
	public Telefone getFixoTelefone() {
		return fixoTelefone;
	}
	public void setFixoTelefone(Telefone fixoTelefone) {
		this.fixoTelefone = fixoTelefone;
	}
	public Telefone getCellTelefone() {
		return cellTelefone;
	}
	public void setCellTelefone(Telefone cellTelefone) {
		this.cellTelefone = cellTelefone;
	}
	public Email getEmail() {
		return email;
	}
	public void setEmail(Email email) {
		this.email = email;
	}

	
	
	
	
}
