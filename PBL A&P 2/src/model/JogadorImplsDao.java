package model;

import java.util.List;

public class JogadorImplsDao extends PessoaImplDao implements JogadorDao{
	protected int idJog= 4000;

	@Override
	public void inserirJogador(Selecao selecao, String nome, int idade, float altura, boolean titular, String nacio, String posicao) {
		Jogador jogador = new Jogador();
		jogador.setNome(nome);
		jogador.setAltura(altura);
		jogador.setIdade(idade);
		jogador.setNacionalidade(nacio);
		jogador.setCartaoAmarelo(0);
		jogador.setCartaoVermelho(0);
		jogador.setTitular(titular);
		jogador.setQuantGols(0);
		jogador.setPosicao(posicao);
		jogador.setId(idJog);
		idJog ++;
		
		
	}

	@Override
	public void editarJogador(Selecao selecao, int id, int num, String dado) {
		for(Jogador x: selecao.getJogadores()) {
			if (x.getId()==id) {
				switch(num) {
				case(1):
					x.setNome(dado);
				case(2):
					x.setAltura(Integer.parseInt(dado));
				case(3):
					x.setIdade(Integer.parseInt(dado));
				case(4):
					x.setNacionalidade(dado);
				case(5):
					x.setCartaoAmarelo(Integer.parseInt(dado));
				case(6):
					x.setCartaoVermelho(Integer.parseInt(dado));
				case(7):
					if (dado == "s") 
						x.setTitular(true);
					else
						x.setTitular(false);
				case(8):
					x.setPosicao(dado);
				}
			}
		}
		
	}

	@Override
	public void excluirJogador(Selecao selecao, int id) {
		for(Jogador x: selecao.getJogadores()) {
			if(x.getId()==id) {
				selecao.getJogadores().remove(x);
			}
		}
		
	}

	@Override
	public List<Jogador> listarJogador(Selecao selecao) {
		return selecao.getJogadores();
		// TODO Auto-generated method stub
		
	}
}
