package model;

import java.util.List;

public interface SelecaoDAO extends EntidadeDAO{
	abstract Selecao inserirSelecao(String grupo, String nome);
	abstract void editarSelecao(int id,int num, String dado);
	abstract Selecao excluirSelecao(int id);
	abstract List<Selecao> listarSelecao();
	abstract Selecao retornaSelecao(int id);

}
