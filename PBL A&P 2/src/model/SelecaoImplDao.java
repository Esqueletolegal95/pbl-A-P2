package model;

import java.util.List;

public class SelecaoImplDao extends EntidadeImplDao implements SelecaoDAO {
	List<Selecao> selecoes;
	protected int idSelec = 300;

	@Override
	public void inserirSelecao(String grupo, String nome, int posicaoGrupo) {
		Selecao selecao = new Selecao();
		selecao.setGrupo(grupo);
		selecao.setNome(nome);
		selecao.setPosicaoGrupo(posicaoGrupo);
		selecoes.add(selecao);
		selecao.setId(idSelec);
		idSelec++;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editarSelecao(int id,int num, String dado) {	
		for(Selecao x : selecoes) {
			switch(num) {
				case(1):
					x.setNome(dado);
				case(2):
					x.setGrupo(dado);					
				case(3):
					x.setPosicaoGrupo(Integer.parseInt(dado));
			}
		}
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluirSelecao(int id) {
		for(Selecao x : selecoes) {
			if (x.getId() == id)
				selecoes.remove(x);
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Selecao> listarSelecao() {
		return selecoes;
		// TODO Auto-generated method stub
		
	}
}
	


