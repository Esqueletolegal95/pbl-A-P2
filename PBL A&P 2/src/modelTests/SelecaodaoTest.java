package modelTests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

import model.SelecaoImplDao;
import model.Selecao;
import model.SelecaoDAO;
import org.junit.jupiter.api.Test;

class SelecaodaoTest {
	SelecaoDAO selecaodao = new SelecaoImplDao();
	Selecao selecao = new Selecao(null);
	@BeforeEach
	void antes() {
		SelecaoDAO selecaodao = new SelecaoImplDao();
		Selecao selecao = new Selecao(null);
	}
	@Test
	void testeInsercaodeSelecoes() {
		selecao  = selecaodao.inserirSelecao(null, null, 0);;
		assertEquals("Testando insercao de uma selecao",selecao, selecaodao.listarSelecao().get(0));
	}

}
