package modelTests;

import static org.junit.Assert.assertEquals;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import model.Grupo;
import model.GrupoDao;
import model.GrupoImplDao;


class GrupodaoTest {
	GrupoDao grupodao = new GrupoImplDao();
	Grupo grupo = new Grupo(null);
	@BeforeEach
	void antes() {
		grupodao = new GrupoImplDao();
		 grupo = new Grupo(null);
	}
	@Test
	void testeInsercaodeSelecoes() {
		grupo  = grupodao.criarGrupo("A");				
		assertEquals("Testando criacao de uma grupo pelo sistema",grupo, grupodao.listarGrupo().get(0));
	}
	
	@Test
	void testeInsercaodeVariasSelecoesParaVerSeUltrapassaoNumeroMaximo() {
		
		grupo  = grupodao.criarGrupo("A");
		grupo  = grupodao.criarGrupo("B"); 
		grupo  = grupodao.criarGrupo("C");
		grupo  = grupodao.criarGrupo("D");
		grupo  = grupodao.criarGrupo("E");
		grupo  = grupodao.criarGrupo("F");
		grupo  = grupodao.criarGrupo("G");
		grupo  = grupodao.criarGrupo("H");
		grupo  = grupodao.criarGrupo("I");
		grupo  = grupodao.criarGrupo("J");
		grupo  = grupodao.criarGrupo("K");
		grupo  = grupodao.criarGrupo("L");
		
		assertEquals("Testando Qquantidade de grupos cadastraos",8, grupodao.listarGrupo().size());
	}

	@Test
	void testeEditarNomeDoGrupo() {
		grupo  = grupodao.criarGrupo("D");
		
		assertEquals("Testando nome do grupo ", "D", grupo.getNome());
		
	}
	
	
	
	
	
}

	
