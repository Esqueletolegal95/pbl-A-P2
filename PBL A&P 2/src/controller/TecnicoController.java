package controller;

import java.util.List;

import model.Selecao;
import model.Tecnico;
import model.TecnicoDAO;
import model.TecnicoImplDao;

public class TecnicoController {
	TecnicoDAO tecnicodao = new TecnicoImplDao();
	
	public void inserirTecnico(Selecao selecao,String nome, int idade, String nacionalidade, String time) {
		tecnicodao.inserirTecnico(selecao, nome, idade, nacionalidade, time);
	}
	
	public void editarTecnico(Selecao selecao,int num, String dado) {
		tecnicodao.editarTecnico(selecao, num, dado);
	}
	public void excluirTecnico(Selecao selecao) {
		tecnicodao.excluirTecnico(selecao);
	}

	public List<Tecnico> listarTecnico(List<Selecao> selecoes) {
		return tecnicodao.listarTecnico(selecoes);
	}
	
}
