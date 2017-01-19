package br.com.caelum;

import java.util.ArrayList;

public class TestandoListas {
	
	public static void main(String[] args) {
	
        String aula1 = "Modelando a classe Aula";
        String aula2 = "Conhecendo mais de listas";
        String aula3 = "Trabalhando com Cursos e Sets";	
        
        ArrayList<String> aulas = new ArrayList<String>();
 
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);
        
        System.out.println(aulas.get(0));
        System.out.println(aulas.contains(aula1));
	
        
        System.out.println("For each do java 8");
        aulas.forEach(batata ->{
        	
        	System.out.println(batata);
        });
	
	
       

		
		
	
	}
	
}
