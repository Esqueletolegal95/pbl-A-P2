package model;

import java.util.ArrayList;
import java.util.List;

public class SelecaoImplDao extends EntidadeImplDao implements SelecaoDAO {
	List<Selecao> selecoes = new ArrayList<Selecao>();//Lista como base de dados
	protected int idSelec = 40000;
	

	@Override
	public Selecao inserirSelecao(String grupo, String nome, int posicaoGrupo) {//Insere seleção na lista
		if (selecoes.size() >=32)
			System.out.println("A lista de selecoes está cheia (32 selecoes)");
		else {
		Selecao selecao = new Selecao("");
		selecao.setGrupo(grupo);
		selecao.setNome(nome);
		selecao.setPosicaoGrupo(posicaoGrupo);
		selecoes.add(selecao);
		selecao.setId(idSelec);
		idSelec++;
		return selecao;
		}
		return null;
	}

	@Override
	public void editarSelecao(int id,int num, String dado) {//Edita seleção na lista
		for(Selecao x : selecoes) {
			switch(num) {
				case(1):
					x.setNome(dado);
				break;
				case(2):
					x.setGrupo(dado);		
				break;
				case(3):
					x.setPosicaoGrupo(Integer.parseInt(dado));
				break;
			}
		}
		
	
	}

	@Override
	public Selecao excluirSelecao(int id) {//Exclui seleção na lista
		for(Selecao x : selecoes) {
			if (x.getId() == id) {
				selecoes.remove(x);
				return x;
				}
		}
		return null;
	}

	@Override
	public List<Selecao> listarSelecao() {//Retorna todas as seleções da lista
		return selecoes;
		
	}

	@Override
	public Selecao retornaSelecao(int id) {//Retorna a selecao escolhida
		for(Selecao x : selecoes) {
			if (x.getId() == id)
				return x;
		}
		return null;
		}
	}
	


