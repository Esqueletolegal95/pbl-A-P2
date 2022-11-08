package model;

import java.util.Date;


public class Partida extends Entidade {
	
	private Date data;
	private int horario;
	private String local;
	private Selecao time1;
	private Selecao time2;
	private int golsTime1;
	private int golsTime2;
	
	
	
	
	
	public Partida(Date data2, int horario2, String local2, Selecao time1, Selecao time2, int golsTime1,
			int golsTime2) {
		this.setData(data);		
		this.setLocal(local);
		this.setTime1(time1);
		this.setTime2(time2);
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
	public Selecao getTime1() {
		return time1;
	}
	public void setTime1(Selecao time1) {
		this.time1 = time1;
	}
	public Selecao getTime2() {
		return time2;
	}
	public void setTime2(Selecao time2) {
		this.time2 = time2;
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
	
	
	
}
