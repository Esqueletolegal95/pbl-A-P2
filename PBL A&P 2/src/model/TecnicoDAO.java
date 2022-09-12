package model;

import java.util.List;

public interface TecnicoDAO extends PessoaDAO{
	abstract void inserirTecnico(Selecao selecao);
	abstract void editarTecnico(Selecao selecao);
	abstract void excluirTecnico(Selecao selecao);
	abstract void listarTecnico(List<Selecao> Selecoes);
	

}

