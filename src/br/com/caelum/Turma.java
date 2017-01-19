package br.com.caelum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Turma {

	private List<Aluno> alunos = new ArrayList<>();

	public void adicionaAlunos(List<Aluno> lista){
		alunos = lista;
	}
	
	public void adicionaAluno(Aluno a){
		alunos.add(a);
	}
	
	public List getAlunos(){
		return Collections.unmodifiableList(alunos);
	}
}
