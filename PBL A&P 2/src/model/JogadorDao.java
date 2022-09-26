package model;


public interface JogadorDao{
	abstract void inserirJogador(Selecao selecao, String nome, int idade, double altura, boolean titular, String nacio, int posicao,int camisa);
	abstract void editarJogador(Selecao selecao, int id, int num, String dado);
	abstract void excluirJogador(Selecao selecao, int id);
}
