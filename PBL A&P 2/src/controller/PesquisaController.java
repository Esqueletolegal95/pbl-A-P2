package controller;

import java.util.ArrayList;
import java.util.List;

import model.Entidade;

public class PesquisaController {
	
	public List<Entidade> pesquisa(String s, List<Entidade> entidades) {
		List<Entidade> lista = new ArrayList <Entidade>();
		for(Entidade entidade:entidades ) {
			for(String string: entidade.getNome().split(" ")) {
				if(s.equals(string)) {
					lista.add(entidade);
				}
			}
		}
		return lista;
	}
}
