package it.softwareInside.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.softwareInside.app.model.Cliente;
import it.softwareInside.app.repository.ClienteRepository;

@Service
public class ClienteService {

	
	@Autowired
	ClienteRepository clienteRepository;
	
	
	
	public boolean addCliente (Cliente cliente) {
		
		try {
			clienteRepository.save(cliente);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
	
	
	
	
	
	public Cliente removeCliente (int id) {
		
		
		try {
			Cliente c = clienteRepository.findById(id).get();
			clienteRepository.deleteById(id);
			return c;
			
		} catch (Exception e) {
			return null;
		}
		
	}
	
	
	
	
	public Iterable<Cliente> allClienti () {
		
		return clienteRepository.findAll();
	}
	
	
	
	
	public Cliente getClienteById (int id) {
		
		try {
			
			Cliente c = clienteRepository.findById(id).get();
			clienteRepository.deleteById(id);
			return c;
			
		} catch (Exception e) {
			return null;
		}
	}
	
	
	
	public boolean removeAll () {
		
		try {
			
			clienteRepository.deleteAll();
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
	
	
	
	
	
}
