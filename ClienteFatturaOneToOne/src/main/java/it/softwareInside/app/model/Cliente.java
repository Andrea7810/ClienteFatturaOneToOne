package it.softwareInside.app.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Cliente {

	
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Id
	private int id;
	
	
	private String nome;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fattura_id")
	private Fattura fattura;

	
	
	public Cliente(String nome, Fattura fattura) {
		setFattura(fattura);
		setNome(nome);
	}
	
	
}
