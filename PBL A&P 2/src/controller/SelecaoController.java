package controller;


import model.Selecao;


public class SelecaoController {
	Singleton menu = new Singleton();
	
	public void inserirSelecao(String grupo, String nome, int posicaoGrupo) {
		Selecao selecao = menu.getSelecaodao().inserirSelecao(grupo, nome, posicaoGrupo);
		int idgrupo = menu.getGrupodao().retornaIdGrupo(grupo);
		
		menu.getSelecaodao().inserirSelGrupo(menu.getGrupodao().retornaGrupo(idgrupo), selecao.getId());
	}
	
	public void editarSelecao(int id,int num, String dado) {
		menu.getSelecaodao().editarSelecao(id, num, dado);
	}
	
	public void excluirSelecao(int id) {
		menu.getSelecaodao().excluirSelecao(id);
	}
	
	public String listarSelecao(){
		String s= "";
		for(Selecao x: menu.getSelecaodao().listarSelecao()) {
			if(x.getTecnico() == null)
				s = s +("|Id: "+x.getId()+"|Nome: "+x.getNome()+"|Grupo: "+x.getGrupo()+"|Pocisao no Grupo: "+x.getPosicaoGrupo()+"|Tecnico: Sem Tecnico|\n");
			else
				System.out.println("|Id: "+x.getId()+"|Nome: "+x.getNome()+"|Grupo: "+x.getGrupo()+"|Pocisao no Grupo: "+x.getPosicaoGrupo()+"|Tecnico: "+x.getTecnico().getNome()+"|\n");
			
		}
		return s;
	}

	public Selecao retornaSelecao(int id) {
		return menu.getSelecaodao().retornaSelecao(id);
	}
}
