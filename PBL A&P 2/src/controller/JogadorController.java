package controller;

import java.util.List;

import model.Jogador;
import model.JogadorDao;
import model.JogadorImplsDao;
import model.Selecao;


public class JogadorController {
	JogadorDao jogadordao = new JogadorImplsDao();
	
	public void inserirJogador(Selecao selecao, String nome, int idade, double altura, boolean titular, String nacio, int posicao, int camisa) {
		jogadordao.inserirJogador(selecao, nome, idade, altura, titular, nacio, posicao, camisa);
	}

	public void editarJogador(Selecao selecao, int id, int num, String dado) {
		jogadordao.editarJogador(selecao, id, num, dado);
	}

}

