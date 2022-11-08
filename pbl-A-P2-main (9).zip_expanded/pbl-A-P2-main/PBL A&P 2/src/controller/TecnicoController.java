package controller;


import model.Selecao;
import model.Tecnico;


public class TecnicoController {
	Singleton menu = new Singleton();
	
	public void inserirTecnico(Selecao selecao,String nome, int idade, String nacionalidade, String time) {
		menu.getTecnicodao().inserirTecnico(selecao, nome, idade, nacionalidade, time);
	}
	
	public void editarTecnico(Selecao selecao,int num, String dado) {
		menu.getTecnicodao().editarTecnico(selecao, num, dado);
	}
	public void excluirTecnico(Selecao selecao) {
		menu.getTecnicodao().excluirTecnico(selecao);
	}

	public String listarTecnico() {
		String s = "";
		for(Tecnico x :menu.getTecnicodao().listarTecnico(menu.getSelecaodao().listarSelecao())) {
			s = s + ("|Nome: "+x.getNome()+"|Idade: "+x.getIdade()+"|Nacionalidade: "+x.getNacionalidade()+"|Time anterior: "+x.getTimeAnterior()+"\n");
		}
		return s;
	}
	
}
