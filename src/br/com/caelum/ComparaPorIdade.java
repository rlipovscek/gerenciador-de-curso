package br.com.caelum;

import java.util.Comparator;

public class ComparaPorIdade implements Comparator<Funcionario> {

	@Override
	public int compare(Funcionario fun1, Funcionario fun2) {
		return fun1.getIdade()-fun2.getIdade();
	}

}
