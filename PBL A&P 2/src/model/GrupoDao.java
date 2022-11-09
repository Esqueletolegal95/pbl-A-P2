package model;

import java.util.List;

public interface GrupoDao extends EntidadeDAO{
	
	abstract List<Grupo> listarGrupo();
	
	abstract Grupo retornaGrupo(int id);

	abstract Grupo criarGrupo(String nome);
	
	

	abstract void excluirGrupo(int id);

	int retornaIdGrupo(String grupo);
	
}
