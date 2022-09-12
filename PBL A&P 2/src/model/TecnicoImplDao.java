package model;
import java.util.List;
import java.util.Scanner;



public class TecnicoImplDao extends PessoaImplDao implements TecnicoDAO {
	int idTec = 0;
	Scanner input = new Scanner(System.in);


	@Override
	public void inserirTecnico(Selecao selecao) {
		Tecnico tecnico = new Tecnico();
		System.out.println("Digite o nome do tecnico: ");
		tecnico.setNome(input.nextLine());
		System.out.println("Digite a idade do tecnico: ");
		tecnico.setIdade(input.nextInt());
		input.nextLine();
		System.out.println("Digite a nacionalidade do tecnico: ");
		tecnico.setNacionalidade(input.nextLine());
		System.out.println("Digite o time anterior do tecnico: ");
		tecnico.setTimeAnterior(input.nextLine());
		tecnico.setId(idTec);
		idTec++;
		selecao.setTecnico(tecnico);
		
	}

	@Override
	public void editarTecnico(Selecao selecao) {
		Tecnico tecnico = new Tecnico();
		System.out.println("Digite o nome do tecnico: ");
		tecnico.setNome(input.nextLine());
		System.out.println("Digite a idade do tecnico: ");
		tecnico.setIdade(input.nextInt());
		input.nextLine();
		System.out.println("Digite a nacionalidade do tecnico: ");
		tecnico.setNacionalidade(input.nextLine());
		System.out.println("Digite o time anterior do tecnico: ");
		tecnico.setTimeAnterior(input.nextLine());
		tecnico.setId(idTec);
		selecao.setTecnico(tecnico);
		
	}

	@Override
	public void excluirTecnico(Selecao selecao) {
		selecao.setTecnico(null);
		
	}

	@Override
	public void listarTecnico(List<Selecao> selecoes) {
		for(Selecao x : selecoes) {
			System.out.println("|Nome: " + x.getTecnico().getIdade() + "|Idade: "+ x.getTecnico().getIdade() + "|Nacionalidade: " + x.getTecnico().getNacionalidade() + "|Time anterior: " + x.getTecnico().getTimeAnterior()+"|");
		}
		
	}

}
