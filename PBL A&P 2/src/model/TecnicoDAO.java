package model;

import java.util.List;

public interface TecnicoDAO extends PessoaDAO{
	abstract void inserirTecnico(Selecao selecao,String nome, int idade, String nacionalidade, String time);
	abstract void editarTecnico(Selecao selecao,int num, String dado);
	abstract void excluirTecnico(Selecao selecao);
	abstract List<Tecnico> listarTecnico(List<Selecao> Selecoes);
	

}

