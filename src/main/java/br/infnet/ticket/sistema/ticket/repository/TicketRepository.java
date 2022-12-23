package br.infnet.ticket.sistema.ticket.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import br.infnet.ticket.sistema.ticket.domain.Messagem;
import br.infnet.ticket.sistema.ticket.domain.Produto;
import br.infnet.ticket.sistema.ticket.domain.Ticket;
import br.infnet.ticket.sistema.ticket.domain.Usuario;
import br.infnet.ticket.sistema.ticket.vos.Email;
import br.infnet.ticket.sistema.ticket.vos.Name;
import br.infnet.ticket.sistema.ticket.vos.Telefone;




@Component
public class TicketRepository {

	Map<Integer, Ticket> tickets = new HashMap<>();
	
	public TicketRepository( ) throws Exception {
		Usuario usuario = getUsuario();
		Usuario agente = getAgente();
		List<Produto> produtos = getProdutos();
		Ticket ticket = new Ticket(usuario,produtos,agente);
		//ticket.addMessage(new Messagem("Iten com defeito", "Ola veio marcado e com amostra de amassado"));
		ticket.addMessage(new Messagem("PC", "O cooler do processador veio solto e danificou a memoria"));
		tickets.put(1, ticket);
	}
	
	
	private List<Produto> getProdutos() {
		//Produto produtos = new Produto();
		//produtos.setName("WII");
		//produtos.setPrioridade("Baixa");
		
		Produto produtos2 = new Produto();
		produtos2.setName("PC");
		produtos2.setPrioridade("Alta");
		
		List<Produto> produtos1 = new ArrayList<>();
		//produtos1.add(produtos);
		produtos1.add(produtos2);
		return produtos1;
	}

	
	private Usuario getAgente() throws Exception {
		
		Name agenteName= new Name("Fill","bruno");
		Telefone agenteFixoTelefone = new Telefone(21,26987855);
		Telefone agenteCellTelefone = new Telefone(21,995848755);
		Email agenteEmail = new Email("fill@suporte.com");
		Usuario agente = new Usuario(agenteName, agenteEmail,agenteCellTelefone,agenteFixoTelefone);
		return agente;
	
	}
	
		
	private Usuario getUsuario() throws Exception {
		
		Name name= new Name("luan","bruno");
		Telefone fixoTelefone = new Telefone(21,26987855);
		Telefone cellTelefone = new Telefone(21,995848755);
		Email email = new Email("wikis@gmail.com");
		Usuario usuario = new Usuario(name, email,cellTelefone,fixoTelefone);
		return usuario;
	}

	public Ticket getById(int ticketId) {
		return this.tickets.get(ticketId);
	}
	
	
}
