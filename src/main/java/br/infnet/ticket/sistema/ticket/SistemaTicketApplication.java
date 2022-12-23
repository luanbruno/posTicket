package br.infnet.ticket.sistema.ticket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.infnet.ticket.sistema.ticket.service.TiketService;


@SpringBootApplication
public class SistemaTicketApplication implements CommandLineRunner{

	@Autowired
	private TiketService service;
	
	public static void main(String[] args) {
		SpringApplication.run(SistemaTicketApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		service.printTicketinformation(1);
	}

}
