package modelTests;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Arbitro;
import model.ArbitroDAO;
import model.ArbitroImplDao;


class ArbitroTest {
	Arbitro arbitro = new Arbitro();
	ArbitroDAO arbitrodao = new ArbitroImplDao();
	
	
	@BeforeEach
	void antes() {
		arbitro = new Arbitro();
		arbitrodao = new ArbitroImplDao();
		
	}


	@Test
	void testarInsercaoDeUmArbitro() {
		arbitro = arbitrodao.inserirArbitro(null, 0, null, 0);
		assertEquals("Testando a insercao de um arbitro", arbitro, arbitrodao.listarArbitros().get(0));
		
	}
	@Test
	void testarInsercaoDeVariosArbitro() {
		for(int x = 35420; x>0; x--)
		arbitrodao.inserirArbitro(null, 0, null, 0);
		assertEquals("Testando a insercao de vários arbitros", 35420, arbitrodao.listarArbitros().size());
		
	}
	
	@Test
	void testarEdicaoNomeArbitro() {
		arbitro = arbitrodao.inserirArbitro(null, 0, null, 0);
		arbitrodao.editarArbitro(10000, 1, "nome");
		assertEquals("Testando a edicao de nome de um arbitro", "nome", arbitro.getNome() );
		
	}
	@Test
	void testarEdicaoidadeArbitro() {
		arbitro = arbitrodao.inserirArbitro(null, 0, null, 0);
		arbitrodao.editarArbitro(10000, 2, "20");
		assertEquals("Testando a edicao de nome de um arbitro", 20, arbitro.getIdade() );
		
	}
	@Test
	void testarEdicaoNacionalidadeArbitro() {
		arbitro = arbitrodao.inserirArbitro(null, 0, null, 0);
		arbitrodao.editarArbitro(10000, 3, "Alguam");
		assertEquals("Testando a edicao de nome de um arbitro", "Alguam", arbitro.getNacionalidade() );
		
	}
	@Test
	void testarDeletarArbitro() {
		arbitro = arbitrodao.inserirArbitro(null, 0, null, 0);
		assertEquals("Testando a exclusao de um arbitro", arbitro, arbitrodao.excluirArbitro(10000));
		
	}

}
