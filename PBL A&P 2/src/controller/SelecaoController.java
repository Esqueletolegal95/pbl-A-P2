package controller;

import java.util.List;

import model.Jogador;
import model.JogadorDao;
import model.JogadorImplsDao;
import model.Selecao;
import model.SelecaoDAO;
import model.SelecaoImplDao;

public class SelecaoController {
	SelecaoDAO selecaodao = new SelecaoImplDao();
	JogadorDao jogadordao = new JogadorImplsDao();
	
	public void inserirSelecao(String grupo, String nome, int posicaoGrupo) {
		selecaodao.inserirSelecao(grupo, nome, posicaoGrupo);
	}
	
	public void editarSelecao(int id,int num, String dado) {
		selecaodao.editarSelecao(id, num, dado);
	}
	
	public void excluirSelecao(int id) {
		selecaodao.excluirSelecao(id);
	}
	
	public List<Selecao> listarSelecao(){
		return selecaodao.listarSelecao();
	}
	
	public SelecaoDAO getSelecaodao(){
		return selecaodao;
		
	}
	
	public List<Jogador> listarJogador(int id){
			for(Selecao selecao: selecaodao.listarSelecao()) {
				if(selecao.getId()== id) {
					return selecao.getJogadores();
				}
			}
		return null;
	}
	public void excluirJogador(int idselecao, int id) {
		for(Selecao selecao: selecaodao.listarSelecao()) {
			if(selecao.getId()== id) {
				jogadordao.excluirJogador(selecao, id);
			}
		}
	}
		

	public Selecao retornaSelecao(int id) {
		return selecaodao.retornaSelecao(id);
	}
}
