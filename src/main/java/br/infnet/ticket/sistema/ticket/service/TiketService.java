package br.infnet.ticket.sistema.ticket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.infnet.ticket.sistema.ticket.domain.Ticket;
import br.infnet.ticket.sistema.ticket.repository.TicketRepository;


@Service
public class TiketService {

	@Autowired
	private TicketRepository ticketRepository;

	public void printTicketinformation(int TicketId) {

		Ticket ticket = ticketRepository.getById(TicketId);

		System.out.println("Ticket Usuario: " + ticket.getUsuario().getName().getFirstName());
		System.out.println("Ticket Agente: " + ticket.getAgente().getName().getFirstName());
		
		ticket.getProduto().forEach(produto -> {
			System.out.println("Ticket Produto: "+produto.getName());
			System.out.println("Prioridade: "+produto.getPrioridade());
			System.out.println("teste: ");
		});

		ticket.getMessages().forEach(messagem -> {
			System.out.println("Ticket Messagem: "+messagem.getSubject() + " - " + messagem.getMessage());
		});
	}
	
}
