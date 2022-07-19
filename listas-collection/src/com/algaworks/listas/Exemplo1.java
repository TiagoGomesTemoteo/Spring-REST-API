package com.algaworks.listas;

import java.util.ArrayList;
import java.util.List;
//import java.util.function.Consumer;


public class Exemplo1 {
	public static void main (String[] args) {
		List<String> nomes = new ArrayList<>();
		
		nomes.add("Tiago");
		nomes.add("Maria");
		nomes.add("João");

		nomes.forEach(System.out::println);
	}
}