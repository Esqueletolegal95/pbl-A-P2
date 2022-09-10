package module;

public interface JogadorDao extends PessoaDAO{
	abstract void inserir();
	abstract void editar();
	abstract void excluir();
	abstract void listar();

}
