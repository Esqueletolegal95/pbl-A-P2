package model;

import java.util.ArrayList;
import java.util.List;

public class GrupoImplDao extends EntidadeImplDao implements GrupoDao {//Lista como base de dados

	static List<Grupo> grupos;
	Grupo grupoA = new Grupo("A");
	Grupo grupoB = new Grupo("B");
	Grupo grupoC = new Grupo("C");
	Grupo grupoD = new Grupo("D");
	Grupo grupoE = new Grupo("E");
	Grupo grupoF = new Grupo("F");
	Grupo grupoG = new Grupo("G");
	Grupo grupoH = new Grupo("H");
	
	protected int idGrupo = 0;
	

	
		
	
	

	
	public List<Grupo> listarGrupo() {//Retorna os grupos da lista
		if (grupos ==null) {
			grupos = new ArrayList<Grupo>();
			grupos.add(grupoA);
			grupos.add(grupoB);
			grupos.add(grupoC);
			grupos.add(grupoD);
			grupos.add(grupoE);
			grupos.add(grupoF);
			grupos.add(grupoG);
			grupos.add(grupoH);
			
		}
			
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
	public void inserirSelecaoGrupo(Selecao selecao, String grupo) {
		if (grupos ==null) {
			grupos = new ArrayList<Grupo>();
			grupos.add(grupoA);
			grupos.add(grupoB);
			grupos.add(grupoC);
			grupos.add(grupoD);
			grupos.add(grupoE);
			grupos.add(grupoF);
			grupos.add(grupoG);
			grupos.add(grupoH);
		}
		for(Grupo x: grupos) {
			if(x.getNome().equals(grupo)){
				if(x.getSelecoes().size() <4)
					x.getSelecoes().add(selecao);
				else {
					 throw new IllegalArgumentException("Grupo não pode ter mais que 4 selecoes");
				}
			}
		}
		
	}


	}
	


