package model;

public class Jogador extends Pessoa{
	private String posicao;
	private int cartaoAmarelo;
	private int cartaoVermelho;
	private int quantGols;
	private boolean titular;
	private double altura;
	private int camisa;
	
	public String getPosicao() {
		return posicao;
	}
	
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	
	public int getCartaoAmarelo() {
		return cartaoAmarelo;
	}
	
	public void setCartaoAmarelo(int cartaoAmarelo) {
		this.cartaoAmarelo = cartaoAmarelo;
	}
	
	public int getCartaoVermelho() {
		return cartaoVermelho;
	}
	
	public void setCartaoVermelho(int cartaoVermelho) {
		this.cartaoVermelho = cartaoVermelho;
	}
	
	public int getQuantGols() {
		return quantGols;
	}
	
	public void setQuantGols(int quantGols) {
		this.quantGols = quantGols;
	}
	
	public boolean isTitular() {
		return titular;
	}
	
	public void setTitular(boolean titular) {
		this.titular = titular;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getCamisa() {
		return camisa;
	}

	public void setCamisa(int camisa) {
		this.camisa = camisa;
	}
	
}
