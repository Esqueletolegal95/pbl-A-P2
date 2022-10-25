package controller;

import java.util.Date;
import java.util.List;

import model.Partida;
import model.PartidaDAO;
import model.PartidaImplDao;
import model.Selecao;
import model.SelecaoDAO;
import model.SelecaoImplDao;
import model.Grupo;
import model.GrupoDao;
import model.GrupoImplDao;

public class PartidaController {
	PartidaDAO partidadao = new PartidaImplDao();
	GrupoDao grupodao = new GrupoImplDao();
	SelecaoDAO selecaodao = new SelecaoImplDao();
	
	public void inserirPartida(Date data2, int horario2, String local2, int IdTime1, int idTime2, int golsTime1,
			int golsTime2) {
		partidadao.inserirPartida(data2, horario2, local2, IdTime1, idTime2, golsTime1, golsTime2);
	}
	
	public void editarPartida(int id,int num, String dado) {
		partidadao.editarPartida(id, num, dado);
	}
	
	public void excluirPartida(int id) {
		partidadao.excluirPartida(id);
	}
	
	public List<Partida> listarPartida(){
		return partidadao.listarPartida();
	}
	
	public PartidaDAO getPartidadao(){
		return partidadao;
		
	}
	
	public List<Selecao> listarSelecoesPartida(int id){
		
		
				
			return selecaodao.IdsParaSelecoes(partidadao.retornaPartida(id).getSelecoes());
						
		
	}
	public void excluirTime(int idpartida, Integer id) {
		for(Partida partida: partidadao.listarPartida()) {
			if(partida.getId()== idpartida) {
				
					partidadao.excluirIdSelecao(partida, id);
						
					}
		}
	}
		
	
	public Grupo retornaGrupo(int id) {
		return grupodao.retornaGrupo(id);
	}
}
