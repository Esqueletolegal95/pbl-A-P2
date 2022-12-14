package model;

import java.util.ArrayList;

import java.util.List;

public class GrupoImplDao extends EntidadeImplDao implements GrupoDao {
	List<Grupo> grupos = new ArrayList<Grupo>();//Lista como base de dados
	protected int idGrupo = 1;
	

	
		
	
	@Override
	public void excluirGrupo(int id) {//Exclui grupo na lista
		for(Grupo x : grupos) {
			if (x.getId() == id)
				grupos.remove(x);
		}
	}
		
	@Override
	public Grupo criarGrupo(String nome) {//Insere Grupo na lista
		if (grupos.size() >=8)
			System.out.println("Quantidade maxima de grupo excedida(8 grupos)");
		else {
		Grupo grupo = new Grupo("");
		grupo.setNome(nome);		
		grupo.setId(idGrupo);
		idGrupo++;
		grupos.add(grupo);
		return grupo;	
		}
		return null;
	}
	@Override
	public List<Grupo> listarGrupo() {//Retorna os grupos da lista
		return grupos;
		
	}

	@Override
	public Grupo retornaGrupo(int id) {//Retorna o grupo escolhido
		for(Grupo x : grupos) {
			if (x.getId() == id)
				return x;
		}
		return null;
		}
	@Override
	public int retornaIdGrupo(String grupo) {
			 int id=9999;
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
		       
		}
		return id;
		
		
		
		
		
	}
	}
	
