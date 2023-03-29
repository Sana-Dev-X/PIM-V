package br.com.jgdev.smartwarehouse.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Solicitante {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	
}
