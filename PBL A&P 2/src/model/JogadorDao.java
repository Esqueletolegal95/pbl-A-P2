package model;

import java.util.List;

public interface JogadorDao extends PessoaDAO{
	abstract void inserirJogador(Selecao selecao, String nome, int idade, float altura, boolean titular, String nacio, int posicao,int camisa);
	abstract void editarJogador(Selecao selecao, int id, int num, String dado);
	abstract void excluirJogador(Selecao selecao, int id);
	abstract List<Jogador> listarJogador(Selecao selecao);

}
