
package model;

public class Arbitro extends Pessoa {
	private String tipoArb;
	private String[] tipos= {"Arbitro Central", "Arbitro Assistente", "Quarto Arbitro"};
	public String getTipoArb() {
		return tipoArb;
	}
	public void setTipoArb(String tipos) {
		this.tipoArb = tipos;
	}
	public String[] getTipos() {
		return tipos;
	}
	public void setTipos(String[] tipos) {
		this.tipos = tipos;
	}

		
}
		

