package model;

import java.util.List;

public interface ArbitroDAO {
	
	abstract Arbitro inserirArbitro(String nome, int idade, String nacionalidade, String tipoArb);
	abstract void editarArbitro(int id, int num, String dado);
	abstract Arbitro excluirArbitro(int id);
	abstract List<Arbitro> listarArbitros();

}
