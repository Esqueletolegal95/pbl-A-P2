package controller;

import java.util.ArrayList;

import java.util.Date;
import java.util.List;

import model.Partida;
import model.PartidaDAO;
//import model.PartidaImplDao;
import model.Selecao;
import model.Entidade;
//import model.SelecaoDAO;
//import model.SelecaoImplDao;
import model.Grupo;
//import model.GrupoDao;
//import model.GrupoImplDao;
import model.Jogador;

public class PartidaController {
	//PartidaDAO partidadao = new PartidaImplDao();
	//GrupoDao grupodao = new GrupoImplDao();
	//SelecaoDAO selecaodao = new SelecaoImplDao();
	Singleton menu = new Singleton();
	public void inserirPartida(Date data2, Date horario2, String local2, int idTime1, int idTime2, int golsTime1,
			int golsTime2) {
		
		menu.getPartidadao().inserirPartida(data2, horario2, local2, idTime1, idTime2, golsTime1, golsTime2);
		
	}
	
	public void editarPartida(int id,int num, String dado) {
		menu.getPartidadao().editarPartida(id, num, dado);
		//partidadao.editarPartida(id, num, dado);
	}
	
	public void excluirPartida(int id) {
		menu.getPartidadao().excluirPartida(id);
		//partidadao.excluirPartida(id);
	}
	
	public List<Partida> listarPartida(){
		return menu.getPartidadao().listarPartida();
				
	}
	
	public PartidaDAO getPartidadao(){
		return menu.getPartidadao();
				//partidadao;
		
	}
	
	public String listarDadosPartida(int id){
		

		//return menu.getPartidadao().listarPartida();
				 
		String s= "";
		for(Partida x: menu.getPartidadao().listarPartida()) {
						
			
			ArrayList<String> nomes = new ArrayList<String>();
			for(int i=0;i<2;i++) {
			
				nomes.add(menu.getSelecaodao().retornaSelecao(x.getTime1()).getNome());
						
							
			}
		
			
			
			System.out.println("|Id: "+x.getId()+"|Data: "+x.getData()+"|Horario: "+x.getHorario()+"|Local: "+x.getLocal()+"|Time1: "+nomes.get(0)+"|Time2: "+nomes.get(1)+"|GolsTime1: "+x.getGolsTime1()+"|GolsTime2: "+x.getGolsTime2()+"|\n");
			
		}
		return s;
	
		
				
					
						
		
	}
	public void excluirTime(int idpartida, Integer id) {
		for(Partida partida: menu.getPartidadao().listarPartida()) {
			if(partida.getId()== id) {
				
				if (partida.getTime1()==id) {
					
						menu.getPartidadao().retornaPartida(idpartida).setTime1(9999);
				}
				else if (partida.getTime2()==id) {
					menu.getPartidadao().retornaPartida(idpartida).setTime1(9999);
				}
						
					}				
			}
		}
	
		
		
		
		
		
		/*
		for(Partida partida: partidadao.listarPartida()) {
			if(partida.getId()== idpartida) {
				
					.excluirIdSelecao(partida, id);
						
					}
		}
	*/
		
	
	public Grupo retornaGrupo(int id) {
		return menu.getGrupodao().retornaGrupo(id);
				
	}
	
	public List<Partida> pesquisarPartidasData(String nome) {

List<Partida> partidasdata = new ArrayList<Partida>();

		
		for(Partida partida:  menu.getPartidadao().listarPartida()){
				
			if (partida.getData().toString().equals(nome)){
				partidasdata.add(partida);}
		}
		return partidasdata;
					
	}
		
		
		
	}

