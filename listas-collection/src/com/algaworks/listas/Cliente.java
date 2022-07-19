package com.algaworks.listas;

/**
 * @author Spring - AlgaWorks
 *
 */
public class Cliente {

	private Long id;
	private String nome;
	
	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	
	public Cliente(Long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	
	
	
}
