package model;

import java.util.ArrayList;
import java.util.List;

public class Grupo extends Entidade {

	//private List<Selecao> selecoes= new ArrayList<Selecao>();/*lista de 4 selecoes*/
	
	private List<Integer> idSelecoes = new ArrayList<Integer>();/*lista de ids das 4 selecoes do grupo*/
	
	
	public Grupo(String nome){
		
		this.setNome(nome);
		
					
	}
	
	public void addSelecoes(ArrayList<Integer> idSelecoes) {
		this.idSelecoes = idSelecoes;
		
	
		}
	
	public List<Integer> getSelecoes() {
		return idSelecoes;
	}
	public void setSelecoes(List<Integer> IdSelecoes) {
		this.idSelecoes = idSelecoes;
	}

}