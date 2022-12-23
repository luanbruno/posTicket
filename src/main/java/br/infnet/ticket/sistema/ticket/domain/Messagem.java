package br.infnet.ticket.sistema.ticket.domain;

public class Messagem {

	private String subject;
	private String message;

	public Messagem(String subject, String messageBody) {
		super();
		this.subject = subject;
		this.message = messageBody;
	}

	public String getSubject() {
		return subject;
	}

	protected void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
