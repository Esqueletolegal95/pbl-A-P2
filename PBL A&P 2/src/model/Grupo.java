package model;

import java.util.ArrayList;

import java.util.List;

public class Grupo extends Entidade {


	
	private List<Integer> idSelecoes = new ArrayList<Integer>();/*lista de ids das 4 selecoes do grupo*/
	//private List<Integer> idPartidas = new ArrayList<Integer>();/*lista de ids das 6 partidas do grupo*/
	
	public Grupo(String nome){
		
		this.setNome(nome);
		
					
	}
	
	
	
	public List<Integer> getSelecoes() {
		return idSelecoes;
	}
	public void setSelecoes(List<Integer> IdSelecoes) {
		this.idSelecoes = idSelecoes;
	}

}

