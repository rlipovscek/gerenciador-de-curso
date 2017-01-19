package br.com.caelum;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Aula9 {
	public static void main(String[] args) {
		
		Map<Integer, String> pessoas = new HashMap<>();
		
		pessoas.put(21, "Leonardo Cordeiro");
		pessoas.put(27, "Fabio Pimentel");
		pessoas.put(19, "Silvio Mattos");
		pessoas.put(23, "Romulo Henrique");
		
		for(int i: pessoas.keySet()){
			System.out.println(pessoas.get(i));
		}

		
		
	}
}
