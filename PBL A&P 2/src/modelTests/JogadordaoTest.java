package modelTests;



import static org.junit.Assert.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Jogador;
import model.JogadorDao;
import model.JogadorImplsDao;
import model.Selecao;

class JogadordaoTest {
	Jogador jogador = new Jogador();
	JogadorDao jogadordao = new JogadorImplsDao();
	Selecao selecao = new Selecao("nome");
	
	@BeforeEach
	public void antes() {
	JogadorDao jogadordao = new JogadorImplsDao();
	Selecao selecao = new Selecao("nome");
	Jogador jogador = new Jogador();
	}
	
	@Test
	void testeInserirUmJogador() {
		jogador = jogadordao.inserirJogador(selecao, "nome", 12, 1.45, false, "Alguma coisa", 0, 0);
		assertEquals("Testando insercao de jogador", jogador, selecao.getJogadores().get(0));
	}
	
	@Test
	void testeInserirVariosJogadoresParaVerSeONumeroDeJogadoresExcede26() {

		for(int x = 0; x<32;x++) {
			jogadordao.inserirJogador(selecao, "nome", 12, 1.45, false, "Alguma coisa", 0, 0);
		}
		assertEquals("Testando insercao de varios jogadores",26 ,  selecao.getJogadores().size());
	}
	
	@Test
	void testeEditarNomeJogador() {
		for(int x = 0; x<26;x++) {
			jogadordao.inserirJogador(selecao, "nome", 12, 1.45, false, "Alguma coisa", 0, 0);
		}
		jogadordao.editarJogador(selecao, 30001, 1, "Parangari Cutirrimi Ruaru");
		assertEquals("Testando se a edição de nome está funcionando", "Parangari Cutirrimi Ruaru", jogadordao.retornaJogador(selecao, 30001).getNome() );
	}
	
	@Test
	void testeEditarAlturaJogador() {
		for(int x = 0; x<26;x++) {
			jogadordao.inserirJogador(selecao, "nome", 12, 1.45, false, "Alguma coisa", 0, 0);
		}
		jogadordao.editarJogador(selecao, 30001, 2, "1.56");
		assertEquals("Testando se a edição de Altura está funcionando", 1.56, jogadordao.retornaJogador(selecao, 30001).getAltura(), 0.001 );
	}
	
	@Test
	void testeEditarIdadeJogador() {
		for(int x = 0; x<26;x++) {
			jogadordao.inserirJogador(selecao, "nome", 12, 1.45, false, "Alguma coisa", 0, 0);
		}
		jogadordao.editarJogador(selecao, 30001, 3, "78");
		assertEquals("Testando se a edição de idade está funcionando", 78, jogadordao.retornaJogador(selecao, 30001).getIdade() );
	
	}
	
	@Test
	void testeEditarNacionalidadeJogador() {
		for(int x = 0; x<26;x++) {
			jogadordao.inserirJogador(selecao, "nome", 12, 1.45, false, "Alguma coisa", 0, 0);
		}
		jogadordao.editarJogador(selecao, 30001, 4, "Brasileiro");
		assertEquals("Testando se a edição de idade está funcionando", "Brasileiro", jogadordao.retornaJogador(selecao, 30001).getNacionalidade()) ;
	}
	
	@Test
	void testeEditarCartaoAmareloJogador() {
		for(int x = 0; x<26;x++) {
			jogadordao.inserirJogador(selecao, "nome", 12, 1.45, false, "Alguma coisa", 0, 0);
		}
		jogadordao.editarJogador(selecao, 30001, 5, "4");
		assertEquals("Testando se a edição de Cartoes Amarelos está funcionando", 4, jogadordao.retornaJogador(selecao, 30001).getCartaoAmarelo());
	
	}
	
	@Test
	void testeEditarCartaoVermelhoJogador() {
		for(int x = 0; x<26;x++) {
			jogadordao.inserirJogador(selecao, "nome", 12, 1.45, false, "Alguma coisa", 0, 0);
		}
		jogadordao.editarJogador(selecao, 30001, 6, "423143254");
		assertEquals("Testando se a edição de Cartoes vermelhos está funcionando", 423143254, jogadordao.retornaJogador(selecao, 30001).getCartaoVermelho());
	
	}

	@Test
	void testeEditarQuantGolsJogador() {
		for(int x = 0; x<26;x++) {
			jogadordao.inserirJogador(selecao, "nome", 12, 1.45, false, "Alguma coisa", 0, 0);
		}
		jogadordao.editarJogador(selecao, 30001, 7, "423143254");
		assertEquals("Testando se a edição de Cartoes vermelhos está funcionando", 423143254, jogadordao.retornaJogador(selecao, 30001).getQuantGols());
	
	}
	
	@Test
	void testeEditarNaoTitularJogador() {
		for(int x = 0; x<26;x++) {
			jogadordao.inserirJogador(selecao, "nome", 12, 1.45, false, "Alguma coisa", 0, 0);
		}
		jogadordao.editarJogador(selecao, 30001, 8, "423143254");
		assertEquals("Testando se a edição de Cartoes vermelhos está funcionando", false, jogadordao.retornaJogador(selecao, 30001).isTitular());
	
	}
	
	@Test
	void testeEditarTitularJogador() {
		for(int x = 0; x<26;x++) {
			jogadordao.inserirJogador(selecao, "nome", 12, 1.45, false, "Alguma coisa", 0, 0);
		}
		jogadordao.editarJogador(selecao, 30001, 8, "s");
		assertEquals("Testando se a edição de Cartoes vermelhos está funcionando", true, jogadordao.retornaJogador(selecao, 30001).isTitular());
	
	}
	
	@Test
	void testeEditarPosicaoJogador() {
		for(int x = 0; x<26;x++) {
			jogadordao.inserirJogador(selecao, "nome", 12, 1.45, false, "Alguma coisa", 0, 0);
		}
		jogadordao.editarJogador(selecao, 30001, 9, "5");
		assertEquals("Testando se a edição de Pocisao está funcionando", "Volante", jogadordao.retornaJogador(selecao, 30001).getPosicao());
	
	}
	@Test
	void testeEditarNumeroCamisaJogador() {
		for(int x = 0; x<26;x++) {
			jogadordao.inserirJogador(selecao, "nome", 12, 1.45, false, "Alguma coisa", 0, 0);
		}
		jogadordao.editarJogador(selecao, 30011,10, "5");
		assertEquals("Testando se a edição de nº camisa está funcionando", 5, jogadordao.retornaJogador(selecao, 30011).getCamisa());
	
	}
	
	@Test
	void testeExcluirJogador() {
		jogador = jogadordao.inserirJogador(selecao, "nome", 12, 1.45, false, "Alguma coisa", 0, 0);
		assertEquals("Testando se a exclusão de um jogador esta funcionando", jogador, jogadordao.excluirJogador(selecao, 30000));
		
	}
}

