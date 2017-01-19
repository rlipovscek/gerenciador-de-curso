package br.com.caelum;

import java.util.HashSet;
import java.util.Set;

public class TestaAluno {

	public static void main(String[] args) {
		
		Set<String> alunos = new HashSet<>();
		
        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");
        alunos.add("Sergio Lopes");
        alunos.add("Renan Saggio");
        alunos.add("Mauricio Aniche");
        
        System.out.println(alunos);
        
        alunos.forEach(aluno ->{
        	
        	System.out.println(aluno);
        	
        });
        
	}
}