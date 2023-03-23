package it.softwareInside.app.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.softwareInside.app.model.Fattura;
import it.softwareInside.app.service.FatturaService;


@RequestMapping("/api")
@RestController
public class FatturaRestController {

	
	@Autowired
	FatturaService fatturaService;
	
	
	@GetMapping("/all-fatture")
	public Iterable<Fattura> allFatture () {
		
		return fatturaService.allFatture();
	}
	
	
	
}
