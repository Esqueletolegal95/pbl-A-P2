package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Partida extends Entidade {
	
	private Date data;
	private int horario;
	private String local;
	private int idTime1;
	private int idTime2;
	private int golsTime1;
	private int golsTime2;
	private List<Integer> idSelecoesPartida = new ArrayList<Integer>();
	
	
	
	
	public Partida(Date data2, int horario2, String local2, int IdTime1, int idTime2, int golsTime1,
			int golsTime2) {
		this.setData(data);	
		this.setHorario(horario);	
		this.setLocal(local);
		this.setTime1(idTime1);
		this.setTime2(idTime2);
		this.setGolsTime1(golsTime1);
		this.setGolsTime2(golsTime2);
	}
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public int getHorario() {
		return horario;
	}
	public void setHorario(int horario) {
		this.horario = horario;
	}
	public String getLocal() {
		return local;
	}
	
	public void setLocal(String local) {
		this.local = local;
		
	}
	
	public int getTime1() {
		return idTime1;
	}
	public void setTime1(int time1) {
		this.idTime1 = idTime1;
	}
	public int getTime2() {
		return idTime2;
	}
	public void setTime2(int time2) {
		this.idTime2 = idTime2;
	}
	public int getGolsTime1() {
		return golsTime1;
	}
	public void setGolsTime1(int golsTime1) {
		this.golsTime1 = golsTime1;
	}
	public int getGolsTime2() {
		return golsTime2;
	}
	public void setGolsTime2(int golsTime2) {
		this.golsTime2 = golsTime2;
	}
	public List<Integer> getSelecoes() {
		return idSelecoesPartida;
	}
	
	
	
}
