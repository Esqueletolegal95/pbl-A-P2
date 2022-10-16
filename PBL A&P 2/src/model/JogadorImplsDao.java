package model;

import java.util.List;

public class JogadorImplsDao extends PessoaImplDao implements JogadorDao {
	protected int idJog= 30000; //Valor será incrementado para gerar o id
	String[] posicoes = {"Goleiro", "Lateral Direito", "Lateral Esquerdo", "Zagueiro Central", "Quarto Zagueiro",
"Volante", "Ponta Direita", "Segundo Volante", "Atacante", "Meia Armador" , "Ponta Esquerda", "Ponta Direita"}; //Lista com as posicoes que poderão ser escolhidas

	@Override
	public Jogador inserirJogador(Selecao selecao, String nome, int idade, double altura, boolean titular, String nacio, int posicao, int camisa) { //Insere o jogador no atributo de Selecao
		if(selecao.getJogadores().size() >= 26) //Garante que a selecao não terá mais que 26 jogadores
			System.out.println("A selecao está cheia");
			else {
				Jogador jogador = new Jogador();
				jogador.setNome(nome);
				jogador.setAltura(altura);
				jogador.setIdade(idade);
				jogador.setNacionalidade(nacio);
				jogador.setCartaoAmarelo(0);
				jogador.setCartaoVermelho(0);
				jogador.setTitular(titular);
				jogador.setQuantGols(0);
				jogador.setPosicao(posicoes[posicao]);
				jogador.setId(idJog);
				selecao.getJogadores().add(jogador);
				idJog ++;
				return jogador;
			}
		return null;
	}

	@Override
	public void editarJogador(Selecao selecao, int id, int num, String dado) {//Edita o jogador no atributo de Selecao
		for(Jogador x: selecao.getJogadores()) {
			if (x.getId()==id) {
				switch(num) {
				case(1):
					x.setNome(dado);
				break;
				case(2):
					x.setAltura(Double.parseDouble(dado));
				break;
				case(3):
					x.setIdade(Integer.parseInt(dado));
				break;
				case(4):
					x.setNacionalidade(dado);
				break;
				case(5):
					x.setCartaoAmarelo(Integer.parseInt(dado));
				break;
				case(6):
					x.setCartaoVermelho(Integer.parseInt(dado));
				break;
				case(7):
					x.setQuantGols(Integer.parseInt(dado));
				case(8):
					if (dado == "s") 
						x.setTitular(true);
					else
						x.setTitular(false);
				break;
				case(9):
					x.setPosicao(posicoes[Integer.parseInt(dado)]);
				break;
				case(10):
					x.setCamisa(Integer.parseInt(dado));
				}
			}
		}
	}	


	@Override
	public Jogador excluirJogador(Selecao selecao, int id) {
		for(Jogador jogador: selecao.getJogadores()) {
			if(jogador.getId()==id) {
				selecao.getJogadores().remove(jogador);
				return jogador;
			}
		}
		return null;
	}

	@Override
	public Jogador retornaJogador(Selecao selecao, int id) {
		for(Jogador jogador: selecao.getJogadores()) {
			if(jogador.getId()==id) {
				return jogador;
			}
		}
		return null;
	}

}
