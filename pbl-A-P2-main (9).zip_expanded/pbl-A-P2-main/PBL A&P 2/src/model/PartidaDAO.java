package model;

import java.util.Date;
import java.util.List;

public interface PartidaDAO extends EntidadeDAO{
	
	
	abstract Partida inserirPartida(Date data, Date horario, String local, int time1, int time2, int golsTime1, 
			int golsTime2);
	abstract void editarPartida(int id, int num, String dado);
	abstract void excluirPartida(int id);
	abstract List<Partida> listarPartida();
	abstract Partida retornaPartida(int id);
	abstract Integer excluirIdSelecao(Partida partida, Integer id);
		

}


