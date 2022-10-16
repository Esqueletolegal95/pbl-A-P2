package controller;

import java.util.List;

import model.Arbitro;
import model.ArbitroDAO;
import model.ArbitroImplDao;


public class ArbitroController {
	ArbitroDAO arbitrodao = new ArbitroImplDao();
	
	public void inserirArbitro(String nome, int idade, String nacionalidade, int tipoArb) {
		arbitrodao.inserirArbitro(nome, idade, nacionalidade, tipoArb);
	}
	
	public void editarArbitro(int id, int num, String dado) {
		arbitrodao.editarArbitro(id, num, dado);
	}
	
	public void excluirArbitro(int id) {
		arbitrodao.excluirArbitro(id);
	}
	
	public List<Arbitro> listarArbitros(){
		return arbitrodao.listarArbitros();
		
	}

}
