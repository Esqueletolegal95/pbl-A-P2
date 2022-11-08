package controller;

import java.util.List;

import model.Selecao;
import model.SelecaoDAO;
import model.SelecaoImplDao;
import model.Grupo;
import model.GrupoDao;
import model.GrupoImplDao;

public class GrupoController {
	GrupoDao grupodao = new GrupoImplDao();
	SelecaoDAO selecaodao = new SelecaoImplDao();
	
	public void criarGrupo(String nome) {
		grupodao.criarGrupo(nome);
	}
	
	
	
	public void excluirGrupo(int id) {
		grupodao.excluirGrupo(id);
	}
	
	public List<Grupo> listarGrupo(){
		return grupodao.listarGrupo();
	}
	
	public GrupoDao getGrupodao(){
		return grupodao;
		
	}
	
	public List<Selecao> listarSelecao(int id){
		
				
				
			return selecaodao.IdsParaSelecoes(grupodao.retornaGrupo(id).getSelecoes());
					
	
					
					
				
			
		
	}
	public void excluirSelecao(int idgrupo, int id) {
		for(Grupo grupo: grupodao.listarGrupo()) {
			if(grupo.getId()== idgrupo) {
				for(Integer Time : grupo.getSelecoes()) {
					if(Time==id) {
						grupodao.retornaGrupo(id).getSelecoes().remove(id);						
					}				
			}
		}
	}
	}
		

	public Grupo retornaGrupo(int id) {
		return grupodao.retornaGrupo(id);
	}
}
