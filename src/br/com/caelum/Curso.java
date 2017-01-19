package br.com.caelum;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Curso {

	private String instrutor;
	private String nomeDoCurso;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos = new LinkedHashSet<Aluno>();
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

	public Curso(String nomeDoCurso,String instrutor) {
		this.instrutor = instrutor;
		this.nomeDoCurso = nomeDoCurso;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public String getNomeDoCurso() {
		return this.nomeDoCurso;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	public int getTempo() {
		int tempoTotal = 0;
		for (Aula aula : aulas) {
			tempoTotal += aula.getTempo();
		}

		return tempoTotal;
	}

	@Override
	public String toString() {
		return "[Curso: " + this.getNomeDoCurso() + ", tempo total: " + this.getTempo() + ", aulas: + " + this.aulas
				+ "]";
	}
	
	public void matricula(Aluno aluno){
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(),aluno);
	}
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public boolean estaMatriculado(Aluno aluno) {
		
		return alunos.contains(aluno);
	}
	
	public Aluno buscaMatriculado(int i){		
		return matriculaParaAluno.get(i);
	}
	
}
