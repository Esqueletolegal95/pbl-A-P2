package model;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ArbitroImplDao extends PessoaImplDao implements ArbitroDAO{
	Scanner input = new Scanner(System.in);
	List<Arbitro> arbitros = new ArrayList<Arbitro>();
	protected int idArb = 0;
	

	 @Override
	public void inserirArbitro() {
		Arbitro arbitro = new Arbitro();

		System.out.print("Digite o nome do Arbitro:");
		arbitro.setNome(input.nextLine());
		System.out.print("Digite a idade do Arbitro:");
		arbitro.setIdade(input.nextInt());
		input.nextLine();
		System.out.print("Digite a nacionalidade do Arbitro:");
		arbitro.setNacionalidade(input.nextLine());
		System.out.print("Digite o tipo do Arbitro:");
		arbitro.setTipoArb(input.nextLine());
		arbitro.setId(idArb);
		idArb++;
		arbitros.add(arbitro);
		
		
	}

	@Override
	public void editarArbitro() {
		System.out.println("Digite o id do Arbitro a ser alterado.");
		int id = input.nextInt();
		input.nextLine();
		for(Arbitro x	: arbitros) {
			if(x.getId() == id) {
				System.out.println("Alterando...");
				System.out.print("Digite o nome do Arbitro:");
				x.setNome(input.nextLine());
				System.out.print("Digite a idade do Arbitro:");
				x.setIdade(input.nextInt());
				input.nextLine();
				System.out.print("Digite a nacionalidade do Arbitro:");
				x.setNacionalidade(input.nextLine());
				System.out.print("Digite o tipo do Arbitro:");
				x.setTipoArb(input.nextLine());
				
			}
		}
		
	}

	@Override
	public void excluirArbitro() {
		System.out.println("Digite o id do Arbitro a ser excluído.");
		int id = input.nextInt();
		input.nextLine();
		for(Arbitro x	: arbitros) {
			if(x.getId() == id) {
				arbitros.remove(x);
				}
			}
		
	}

	@Override
	public void listarArbitros() {
		for(Arbitro x: arbitros) {
			System.out.println("|Id:" + x.getId() + "|Nome: " + x.getNome() + "|Idade: " + x.getIdade() + "|Nacionalidade: " + x.getNacionalidade() + "|Tipo: " + x.getTipoArb() + "|");
		}
		return;
		
	}

}
