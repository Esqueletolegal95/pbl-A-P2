package model;

import java.util.ArrayList;
import java.util.List;

public class SelecaoImplDao extends EntidadeImplDao implements SelecaoDAO {
	List<Selecao> selecoes = new ArrayList<Selecao>();//Lista como base de dados
	protected int idSelec = 40000;
	

	@Override
	public Selecao inserirSelecao(String grupo, String nome, int posicaoGrupo) {
		/**
		  * insere uma Selecao na lista de selecoes
		  * Entradas: String grupo, String nome, int posicaoGrupo
		  * retono: Selecao
		  */
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
    public int inserirSelGrupo(Grupo grupo, int idSele) {



        if(grupo.getSelecoes().size() >= 4) 
        System.out.println("Grupo já está completo com 4 selecoes");
        else {
        grupo.getSelecoes().add(idSele);
        return grupo.getSelecoes().size();
        }
        return 9999;







    }
	
	@Override
	public int excluirSelGrupo(Grupo grupo, int idSele) {
		/**
		  * Exclui uma Selecao na lista de grupos
		  * Entradas: Grupo grupo, int idSele
		  * retono: int
		  */



	        if(grupo.getSelecoes().size() == 0) 
	        System.out.println("Grupo está vazio");
	        else {
	        grupo.getSelecoes().remove(idSele);
	        return grupo.getSelecoes().size();
	        }
	        return 9999;







	    }

	@Override
	public void editarSelecao(int id,int num, String dado) {
		/**
		  * Edita uma Selecao na lista de selecoes
		  * Entradas: int id,int num, String dado
		  * retono: void
		  */

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
	public Selecao excluirSelecao(int id) {
		/**
		  * Exclui uma Selecao na lista de selecoes
		  * Entradas: int id
		  * retono: Selecao
		  */

		for(Selecao x : selecoes) {
			if (x.getId() == id) {
				selecoes.remove(x);
				return x;
				}
		}
		return null;
	}

	@Override
	public List<Selecao> listarSelecao() {
		/**
		  * Retorna uma lista de selecoes
		  * Entradas: int id
		  * retono: List<Selecao>
		  */

		return selecoes;
		
	}

	@Override
	public Selecao retornaSelecao(int id) {
		/**
		  * Retorna uma determinada selecao da lista de selecoes
		  * Entradas: int id
		  * retono: Selecao
		  */
		for(Selecao x : selecoes) {
			if (x.getId() == id)
				return x;
		}
		return null;
		}
	@Override
	public List<Selecao> IdsParaSelecoes(List<Integer> IdsSelecoes){
        List<Selecao> selecoesret = new ArrayList<Selecao>();
        Selecao selecao;

            for (Integer x : IdsSelecoes){

            selecao = retornaSelecao(x);
            if (selecao != null) {
                selecoesret.add(selecao);
            }
        }
        return selecoesret;
    }
	}
	


