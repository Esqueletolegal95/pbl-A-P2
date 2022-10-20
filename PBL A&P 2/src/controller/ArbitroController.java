package controller;


import model.Arbitro;



public class ArbitroController {
	Singleton menu = new Singleton();
	
	public void inserirArbitro(String nome, int idade, String nacionalidade, int tipoArb) {
		menu.getArbitrodao().inserirArbitro(nome, idade, nacionalidade, tipoArb);
	}
	
	public void editarArbitro(int id, int num, String dado) {
		menu.getArbitrodao().editarArbitro(id, num, dado);
	}
	
	public void excluirArbitro(int id) {
		menu.getArbitrodao().excluirArbitro(id);
	}
	
	public String listarArbitros(){
		String s ="";
		for(Arbitro x: menu.getArbitrodao().listarArbitros()) {
			s = s+("|Id: " + x.getId() + "|Nome: " + x.getNome() + "|Idade: " + x.getIdade()+ "|Nacionalidade: " + x.getNacionalidade()+ "|Tipo: " + x.getTipoArb() + "|\n");
			}
		return s;
		
	}

}
