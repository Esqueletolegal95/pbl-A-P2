package modelTests;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Selecao;
import model.SelecaoDAO;
import model.SelecaoImplDao;

class SelecaodaoTest {
	SelecaoDAO selecaodao = new SelecaoImplDao();
	Selecao selecao = new Selecao(null);
	@BeforeEach
	void antes() {
		 selecaodao = new SelecaoImplDao();
		 selecao = new Selecao(null);
	}
	@Test
	void testeInsercaodeSelecoes() {
		selecao  = selecaodao.inserirSelecao(null, null, 0);;
		assertEquals("Testando insercao de uma selecao",selecao, selecaodao.listarSelecao().get(0));
	}
	
	@Test
	void testeInsercaodeVariasSelecoesParaVerSeUltrapassaoNumeroMaximo() {
		for(int x = 0; x < 34;x++)
		selecao  = selecaodao.inserirSelecao(null, null, 0);
		
		assertEquals("Testando insercao de uma selecao",32, selecaodao.listarSelecao().size());
	}

	@Test
	void testeEditarNomeDeSelecao() {
		selecao  = selecaodao.inserirSelecao(null, null, 0);
		selecaodao.editarSelecao(0, 1, "Brasil");
		assertEquals("Testando edicao de nome da selecao", "Brasil", selecao.getNome());
		
	}
	
	@Test
	void testeEditarGrupoDeSelecao() {
		selecao  = selecaodao.inserirSelecao(null, null, 0);
		selecaodao.editarSelecao(0, 2, "a");
		assertEquals("Testando edicao de nome da selecao", "a", selecao.getGrupo());
		
	}
	
	@Test
	void testeEditarPocisaoGrupoDeSelecao() {
		selecao  = selecaodao.inserirSelecao(null, null, 0);
		selecaodao.editarSelecao(0, 3, "2");
		assertEquals("Testando edicao da pocisao do gurpo da selecao", 2, selecao.getPosicaoGrupo());
		
	}
	
	@Test
	void testeExcluirSelecao() {
		selecao = selecaodao.inserirSelecao(null, null, 0);
		assertEquals("Testando exclusão da selecao", selecao, selecaodao.excluirSelecao(40000));
	}
}

	
