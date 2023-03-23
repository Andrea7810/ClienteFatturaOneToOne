package it.softwareInside.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Fattura {

	
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Id
	private int id;
	
	
	private String numero;
	

	
	public Fattura(String numero) {
		setNumero(numero);
	}
	
	
}
