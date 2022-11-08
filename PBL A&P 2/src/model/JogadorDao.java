package model;

public interface JogadorDao{
	abstract Jogador inserirJogador(Selecao selecao, String nome, int idade, double altura, boolean titular, String nacio, int posicao,int camisa);
	abstract void editarJogador(Selecao selecao, int id, int num, String dado);
	abstract Jogador excluirJogador(Selecao selecao, int id);
	abstract Jogador retornaJogador(Selecao selecao, int id);
}
