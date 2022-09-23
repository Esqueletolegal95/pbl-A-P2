package model;

import java.util.ArrayList;
import java.util.List;

public class SelecaoImplDao extends EntidadeImplDao implements SelecaoDAO {
	List<Selecao> selecoes = new ArrayList<Selecao>();;
	protected int idSelec = 300;
	

	@Override
	public void inserirSelecao(String grupo, String nome, int posicaoGrupo) {
		if (selecoes.size() >=32)
			System.out.println("A lista de selecoes está cheia (32 selecoes)");
		else {
		Selecao selecao = new Selecao();
		selecao.setGrupo(grupo);
		selecao.setNome(nome);
		selecao.setPosicaoGrupo(posicaoGrupo);
		selecoes.add(selecao);
		selecao.setId(idSelec);
		idSelec++;
		}
	}

	@Override
	public void editarSelecao(int id,int num, String dado) {	
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
	public void excluirSelecao(int id) {
		for(Selecao x : selecoes) {
			if (x.getId() == id)
				selecoes.remove(x);
		}
		
	}

	@Override
	public List<Selecao> listarSelecao() {
		return selecoes;
		
	}

	@Override
	public Selecao retornaSelecao(int id) {
		for(Selecao x : selecoes) {
			if (x.getId() == id)
				return x;
		}
		return null;
		}
	}
	


