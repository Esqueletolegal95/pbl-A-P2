package model;

import java.util.ArrayList;

import java.util.List;

public class GrupoImplDao extends EntidadeImplDao implements GrupoDao {
	List<Grupo> grupos = new ArrayList<Grupo>();//Lista como base de dados
	protected int idGrupo = 0;
	

	
		
	
	@Override
	public void excluirGrupo(int id) {/**
		  * Exclui um Grupo da lista
		  * Entradas: int id
		  * retono: void
		  */
		for(Grupo x : grupos) {
			if (x.getId() == id)
				grupos.remove(x);
		}
	}
		
	@Override
	public void criarGrupo(String nome) {
		/**
		  * Insere um Grupo da lista
		  * Entradas: String nome
		  * retono: void
		  */
		Grupo grupo = new Grupo("");
		grupo.setNome(nome);		
		grupo.setId(idGrupo);
		idGrupo++;
		grupos.add(grupo);		
	}
	@Override
	public List<Grupo> listarGrupo() {
		/**
		  * Retona a lista de Grupo
		  * Entradas: 
		  * retono: List<Grupo>
		  */
		return grupos;
		
	}

	@Override
	public Grupo retornaGrupo(int id) {
		/**
		  * Retona o Grupo selecionado pelo id
		  * Entradas: int id
		  * retono: Grupo
		  */
		for(Grupo x : grupos) {
			if (x.getId() == id)
				return x;
		}
		return null;
		}
	}
	
/*	 int id;
switch (grupo) {
    case "A":
        id = 1;
        break;
    case "B":
  		id = 2;
        break;
    case "C":
    	id = 3;
        break;
    case "D":
    	id = 4;
        break;
    case "E":
        id = 5;
        break;
    case "F":
  		id = 6;
        break;
    case "G":
    	id = 7;
        break;
    case "H":
    	id = 8;
        break;
    default:
       
}*/