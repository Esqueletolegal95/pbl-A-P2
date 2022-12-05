package model;

import java.util.ArrayList;
import java.util.List;

public class Grupo extends Entidade {

	private List<Selecao> selecoes= new ArrayList<Selecao>(); /*lista de 4 selecoes*/
	
	
	
	public Grupo(String nome){
		
		this.setNome(nome);
		
	
	
	}
	public String toString() {
		return this.getNome();
	}
	public List<Selecao> getSelecoes() {
		return selecoes;
	}
	public void setSelecoes(List<Selecao> selecoes) {
		this.selecoes = selecoes;
	}

}
