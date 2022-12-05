package model;

import java.util.ArrayList;
import java.util.List;

public class SemiFinais extends Entidade{
private List<Selecao> selecoes= new ArrayList<Selecao>(); /*lista de 16 selecoes*/
	
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
