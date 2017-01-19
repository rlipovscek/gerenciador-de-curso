package br.com.caelum;

public class Aula implements Comparable<Aula> {

	String titulo;
	int tempo;
	
	public Aula(String titulo, int tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public int getTempo() {
		return tempo;
	}
	
	@Override
	public int compareTo(Aula outraAula) {
		return this.titulo.compareTo(outraAula.titulo);
	}	
	
	@Override
	public String toString() {
		return "(Aula: "+this.titulo+" - possui "+this.tempo + " minutos)";
	}
}
