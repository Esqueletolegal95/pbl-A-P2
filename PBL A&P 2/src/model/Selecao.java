package model;

import java.util.ArrayList;
import java.util.List;

public class Selecao extends Entidade{
	private List<Jogador> jogadores= new ArrayList<Jogador>();;
	private Tecnico tecnico;
	private String grupo;
	private int posicaoGrupo;
	
	public Selecao() {
	}
	
	public String getGrupo() {
		return grupo;
	}
	
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	

	public int getPosicaoGrupo() {
		return posicaoGrupo;
	}
	
	public void setPosicaoGrupo(int posicaoGrupo) {
		this.posicaoGrupo = posicaoGrupo;
	}
	
	public Tecnico getTecnico() {
		return tecnico;
	}
	
	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}

	public List<Jogador> getJogadores() {
		return jogadores;
	}

	public void setJogadores(List<Jogador> jogadores) {
		this.jogadores = jogadores;
	}
	
}
