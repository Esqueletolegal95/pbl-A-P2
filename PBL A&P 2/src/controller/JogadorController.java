package controller;


import model.Jogador;
import model.Selecao;


public class JogadorController {
	Singleton menu = new Singleton();
	
	public void inserirJogador(Selecao selecao, String nome, int idade, double altura, boolean titular, String nacio, int posicao, int camisa) {
		menu.getJogadordao().inserirJogador(selecao, nome, idade, altura, titular, nacio, posicao, camisa);
	}
	
	public String listarJogador(int id){
		String s = "";
			for(Selecao selecao: menu.getSelecaodao().listarSelecao()) {
				if(selecao.getId()== id) {
					for (Jogador x:selecao.getJogadores()) {
						s = s +("|Id: " +x.getId()+"|Nome: "+x.getNome()+"|Idade: "+x.getIdade()+"|Nacionalidade: "+x.getNacionalidade()+"|Altura: "+ x.getAltura()+"|Titular: "+x.isTitular()+"|Posicao: "+ x.getPosicao()+"|Quantidade de gols: "+x.getQuantGols()+"|Cartao amarelo: "+x.getCartaoAmarelo()+"|Cartao vermelho: "+x.getCartaoVermelho()+"|Numero da camisa: " +x.getCamisa() + "\n");
					}
				}
			}
		return s;
	}
	public void excluirJogador(int idselecao, int id) {
		for(Selecao selecao: menu.getSelecaodao().listarSelecao()) {
			if(selecao.getId()== id) {
				menu.getJogadordao().excluirJogador(selecao, id);
			}
		}
	}
		

	public void editarJogador(int id, int num, String dado) {
		for(Selecao selecao: menu.getSelecaodao().listarSelecao()) {
			for(Jogador y:selecao.getJogadores()) {
				if(y.getId()==id);
				menu.getJogadordao().editarJogador(selecao, id, num, dado);
				return;
			}
		}
	}

}

