package it.softwareInside.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.softwareInside.app.model.Fattura;

public interface FatturaRepository extends JpaRepository<Fattura, Integer>{

}
