package controller;

import java.util.ArrayList;
import java.util.List;


import model.Selecao;
//import model.SelecaoDAO;
//import model.SelecaoImplDao;
import model.Grupo;
import model.GrupoDao;


public class GrupoController {

	Singleton menu = new Singleton();
	
	public void criarGrupo(String nome) {
		menu.getGrupodao().criarGrupo(nome);
		
	}
	
	
	
	public void excluirGrupo(int id) {
		menu.getGrupodao().excluirGrupo(id);
		
		
	}
	
	public String listarGrupo(){
			
		
		 
		String s= "";
		for(Grupo x: menu.getGrupodao().listarGrupo()) {
			ArrayList<String> nomes = new ArrayList<String>();
			for(int i=0;i<4;i++) {
			
			
		nomes.add(menu.getSelecaodao().retornaSelecao(x.getSelecoes().get(i)).getNome());
			
			}
			
				System.out.println("|Id: "+x.getId()+"|Nome: "+x.getNome()+"|Selecao1: "+ nomes.get(0) +"|Selecao2: "+nomes.get(1)+"|Selecao3: "+nomes.get(2)+"|Selecao4: "+nomes.get(3)+"|\n");
			
		}
		return s;
	
		
				
	}
	
	public GrupoDao getGrupodao(){
		return menu.getGrupodao();
				
			
		
	}
	
	public List<Selecao> listarSelecao(int id){
		
		//return selecaodao.IdsParaSelecoes(grupodao.retornaGrupo(id).getSelecoes());
				
			return menu.getSelecaodao().IdsParaSelecoes(menu.getGrupodao().retornaGrupo(id).getSelecoes());
					
					
					
	
					
					
				
			
		
	}
	public void excluirSelecao(int idgrupo, int id) {
		
		for(Grupo grupo: menu.getGrupodao().listarGrupo()) {
			if(grupo.getId()== idgrupo) {
				for(Integer Time : grupo.getSelecoes()) {
					if(Time==id) {
						menu.getGrupodao().retornaGrupo(id).getSelecoes().remove(id);
						
					}				
			}
		}
	}
	}
		

	public Grupo retornaGrupo(int id) {
		return menu.getGrupodao().retornaGrupo(id);
				
	}
}
