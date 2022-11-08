package model;

import java.util.ArrayList;
import java.util.List;

public class GrupoImplDao extends EntidadeImplDao implements GrupoDao {
	List<Grupo> grupos = new ArrayList<Grupo>();//Lista como base de dados
	protected int idGrupo = 0;
	

	
		
	
	

	
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
	}
	


