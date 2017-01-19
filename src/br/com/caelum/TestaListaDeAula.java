package br.com.caelum;

import java.util.ArrayList;

public class TestaListaDeAula {
	public static void main(String[] args) {
		
		ArrayList<Aula> lista = new ArrayList<>();
		
		Aula aula1 = new Aula("Aula1",22);
		Aula aula2 = new Aula("Aula2",22);
		Aula aula3= new Aula("Aula3",22);
		
		lista.add(aula1);
		lista.add(aula2);
		lista.add(aula3);
		
		System.out.println(lista);
	}
}
