package model;

import java.util.List;

public interface SelecaoDAO extends EntidadeDAO{
	abstract Selecao inserirSelecao(String grupo, String nome, int posicaoGrupo);
	abstract void editarSelecao(int id,int num, String dado);
	abstract Selecao excluirSelecao(int id);
	abstract List<Selecao> listarSelecao();
	abstract Selecao retornaSelecao(int id);
	abstract List<Selecao> IdsParaSelecoes(List<Integer> IdsSelecoes);
	abstract int inserirSelGrupo(Grupo grupo, int idSele);
	abstract int excluirSelGrupo(Grupo grupo, int idSele);

}
