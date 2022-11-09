package model;

import java.util.Date;


public class Partida extends Entidade {
	
	private Date data;
	private Date horario;
	private String local;
	private int time1;
	private int time2;
	private int golsTime1;
	private int golsTime2;
	
	
	
	
	
	public Partida(Date data2, Date horario2, String local2, int time1, int time2, int golsTime1,
			int golsTime2) {
		this.setData(data2);		
		this.setLocal(local2);
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
	public Date getHorario() {
		return horario;
	}
	public void setHorario(Date horario) {
		this.horario = horario;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public int getTime1() {
		return time1;
	}
	public void setTime1(int time1) {
		this.time1 = time1;
	}
	public int getTime2() {
		return time2;
	}
	public void setTime2(int time2) {
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
