package model;

import java.util.List;

public interface GrupoDao extends EntidadeDAO{
	abstract List<Grupo> listarGrupo();
	abstract Grupo retornaGrupo(int id);
}
