package br.com.caelum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Testa coleções", "Paulo Siqueira");
		
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 24));
        
        System.out.println(javaColecoes.getAulas());
        

        List aulasImutaveis = javaColecoes.getAulas();
        List aulas = new ArrayList(aulasImutaveis);
        
        Collections.sort(aulas);
        
        System.out.println(aulas);
        System.out.println("Tempo Total de aula : "+javaColecoes.getTempo());
        System.out.println(javaColecoes);
	}
}
