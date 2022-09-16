package model;

import java.util.List;

public interface ArbitroDAO {
	
	abstract void inserirArbitro(String nome, int idade, String nacionalidade, int tipoArb);
	abstract void editarArbitro(int id, int num, String dado);
	abstract void excluirArbitro(int id);
	abstract List<Arbitro> listarArbitros();

}
