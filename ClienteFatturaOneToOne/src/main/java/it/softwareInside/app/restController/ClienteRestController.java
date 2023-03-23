package it.softwareInside.app.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.softwareInside.app.model.Cliente;
import it.softwareInside.app.service.ClienteService;


@RequestMapping("/api")
@RestController
public class ClienteRestController {

	
	
	@Autowired
	ClienteService clienteService;
	
	
	
	@PostMapping("/add-cliente")
	public boolean addCliente (@RequestBody Cliente cliente) {
		
		return clienteService.addCliente(cliente);
	}
	
	
	
	
	@DeleteMapping("/remove-cliente")
	public Cliente removeCliente (@RequestParam (name="id") int id) {
		
		return clienteService.removeCliente(id);
	}
	
	
	
	@GetMapping("/all-clienti")
	public Iterable<Cliente> allClienti () {
		
		return clienteService.allClienti();
	}
	
	
	
	@GetMapping("/get-cliente-by-id")
	public Cliente getById (@RequestParam(name="id") int id) {
		
		return clienteService.getClienteById(id);
	}
	
	
	
	@DeleteMapping("/delete-all")
	public boolean deleteAll () {
		
		return clienteService.removeAll();
	}
	
	
	
	
}
