package model;

import java.util.Date;
import java.util.List;

public interface PartidaDAO extends EntidadeDAO{
	abstract Partida inserirPartida(Date data, int horario, String local, Selecao time1, Selecao time2, int golsTime1, 
			int golsTime2);
	abstract void editarPartida(int id, int num, String dado);
	abstract void excluirPartida(int id);
	abstract List<Partida> listarPartida();
	abstract Partida retornaPartida(int id);
	

	
	
	

}
