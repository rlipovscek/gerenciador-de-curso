package br.com.caelum;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestaCursoComAlunos {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

		Aluno a1 = new Aluno("Rodolpho", 123456);
		Aluno a2 = new Aluno("Thiago", 452045);
		Aluno a3 = new Aluno("Gabi", 942043);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		javaColecoes.getAlunos().forEach(a ->{System.out.println(a);});
		
		List<String> letras = new LinkedList<>();
		letras.add("A");
		letras.add("B");
		letras.add("C");
		
		Iterator<String> interacao = letras.iterator();
		while(interacao.hasNext()){
		    System.out.println(interacao.next());
		}
	}
	
}
