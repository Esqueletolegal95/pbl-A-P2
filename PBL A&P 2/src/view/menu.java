package view;

import model.*;

public class menu {
	
	public static void main(String[] args) {
		ArbitroDAO arbitrodao = new ArbitroImplDao();

		
		
		while(true) {
			arbitrodao.inserirArbitro();
			arbitrodao.listarArbitros();

		}
	}
	
	
	

}
