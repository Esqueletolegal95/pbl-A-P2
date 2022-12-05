package model;

public class Tecnico extends Pessoa {
	private String timeAnterior;
	private String selecao;
	
	public String getTimeAnterior() {
		return timeAnterior;
	}
	public void setTimeAnterior(String timeAnterior) {
		this.timeAnterior = timeAnterior;
	}
	
	public String toString() {
		return this.getNome();
	}
	public String getSelecao() {
		return selecao;
	}
	public void setSelecao(String selecao) {
		this.selecao = selecao;
	}
}
