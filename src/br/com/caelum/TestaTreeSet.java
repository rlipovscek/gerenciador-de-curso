package br.com.caelum;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestaTreeSet {
	public static void main(String[] args) {
		
		Set<Funcionario> funs = new TreeSet<Funcionario>(new ComparaPorIdade());
		
		funs.add(new Funcionario("Rodolpho", 4));
		funs.add(new Funcionario("Gabi", 2));
		funs.add(new Funcionario("Marco", 1));
		
		Iterator interacao = funs.iterator();
		
		while(interacao.hasNext()){
			
			System.out.println(interacao.next());
		}
		
	}
}
