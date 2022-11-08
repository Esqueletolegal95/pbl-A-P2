package model;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PartidaImplDao extends EntidadeImplDao implements PartidaDAO {
	List<Partida> partidas = new ArrayList<Partida>();//Lista de partidas primeira fase
	protected int idPart = 0;
	

	@Override
	public Partida inserirPartida(Date data, int horario, String local, Selecao time1, Selecao time2, int golsTime1, 
			int golsTime2) {//Insere partida
		if (partidas.size() >=48) {
			System.out.println("Excedido número máximo de partidas");}
		else {
			Partida partida = new Partida(data, horario, local, time1, time2, golsTime1, golsTime2);
			
			partidas.add(partida);
			partida.setId(idPart);
			idPart++;
			return partida;
			
		
		
		}
		return null;
	}

	@Override
	public void editarPartida(int id,int num, String dado) {//Edita seleção na lista
		for(Partida x : partidas) {
			switch(num) {
				case(1):
					
			    DateFormat dataformato=DateFormat.getInstance();
				Date data=null;
				try {
					data = dataformato.parse(dado);
				} catch (ParseException e) {
					e.printStackTrace();
				} 
		
					x.setData(data);
				break;
				case(2):
					x.setHorario(Integer.parseInt(dado));		
				break;
				case(3):
					x.setLocal(dado);
				break;
				case(4):
					x.setGolsTime1(Integer.parseInt(dado));
				break;
				case(5):
					x.setGolsTime2(Integer.parseInt(dado));
				break;
				//não poderá editar as seleções que estão na partida
			}
		}
		
	
	}

	@Override
	public void excluirPartida(int id) {//Exclui seleção na lista
		for(Partida x : partidas) {
			if (x.getId() == id)
				partidas.remove(x);
		}
		
	}

	@Override
	public List<Partida> listarPartida() {//Retorna todas as seleções da lista
		return partidas;
		
	}

	@Override
	public Partida retornaPartida(int id) {//Retorna a selecao escolhida
		for(Partida x : partidas) {
			if (x.getId() == id)
				return x;
		}
		return null;
		}
	}
	


