package controller;

import model.ArbitroDAO;
import model.ArbitroImplDao;
import model.JogadorDao;
import model.JogadorImplsDao;
import model.SelecaoDAO;
import model.SelecaoImplDao;
import model.TecnicoDAO;
import model.TecnicoImplDao;

public class Singleton {
	private static JogadorDao jogadordao;
	private static ArbitroDAO arbitrodao;
	private static TecnicoDAO tecnicodao ;
	private static SelecaoDAO selecaodao;
	
	
	
	
	public JogadorDao getJogadordao() {
		if(jogadordao == null)
			jogadordao = new JogadorImplsDao();
		return jogadordao;
	}

	public ArbitroDAO getArbitrodao() {
		if(arbitrodao == null)
			arbitrodao = new ArbitroImplDao();
		return arbitrodao;
	}

	
	public TecnicoDAO getTecnicodao() {
		if(tecnicodao == null)
			tecnicodao = new TecnicoImplDao();
		return tecnicodao;
	}

	
	public SelecaoDAO getSelecaodao() {
		if(selecaodao == null)
			selecaodao = new SelecaoImplDao();
		return selecaodao;
	}



}
