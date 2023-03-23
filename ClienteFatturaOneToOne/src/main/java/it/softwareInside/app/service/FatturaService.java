package it.softwareInside.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.softwareInside.app.model.Fattura;
import it.softwareInside.app.repository.FatturaRepository;

@Service
public class FatturaService {

	
	@Autowired
	FatturaRepository fatturaRepository;
	
	
	
	public Iterable<Fattura> allFatture () {
		
		return fatturaRepository.findAll();
	}
	
	
	
	
	
	
	
	
}
