package view;

import java.util.Scanner;

import model.*;

public class menu {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nome, nacionalidade, dado;
		int idade, opcao, tipo, id;
		ArbitroDAO arbitrodao = new ArbitroImplDao();
		JogadorDao jogadordao = new JogadorImplsDao();
		SelecaoDAO selecaodao = new SelecaoImplDao();
		TecnicoDAO tecnicodao = new TecnicoImplDao();
		
		
		while(true){
			System.out.println("Escolha uma das opcoes:\n1 - Arbitro");
			opcao = Integer.parseInt(input.nextLine());
			switch(opcao) {
			case(1):{
				System.out.println("Escolha uma das opcoes:\n1 - Inserir\n2 - Listar\n3 - Editar");
				opcao = Integer.parseInt(input.nextLine());
					switch (opcao) {
						case(1):{
							System.out.println("Digite o nome:");
							nome = input.nextLine();
							System.out.println("Digite a idade:");
							idade = Integer.parseInt(input.nextLine());
							System.out.println("Digite a nacionalidade:");
							nacionalidade = input.nextLine();
							System.out.println("Escolha o tipo de arbitro:\n0 - Arbitro Central \n1 - Arbitro Assistente \n2 - Quarto Arbitro:");
							tipo = Integer.parseInt(input.nextLine());
							arbitrodao.inserirArbitro(nome, idade, nacionalidade, tipo);
							break;
							}
						
						case(2):{
							for(Arbitro x: arbitrodao.listarArbitros()) {
								System.out.println("|Id: " + x.getId() + "|Nome: " + x.getNome() + "|Idade: " + x.getIdade()+ "|Nacionalidade: " + x.getNacionalidade()+ "|Tipo: " + x.getTipoArb() + "|");
								}
							break;	
						}
						
						case (3):{
							System.out.println("Digite o id do Arbitro:");
							id = Integer.parseInt(input.nextLine());
							for(Arbitro x: arbitrodao.listarArbitros()) {
								if(id == x.getId()) {
									System.out.println("Escolha o que deseja editar:\n1 - Nome\n2 - Idade\n3 - Nacionalidade\n4 - Tipo de arbitro");
									opcao = Integer.parseInt(input.nextLine());
									System.out.println("Digite o dado a ser alterado:");
									if(opcao == 4) {
										System.out.println("Escolha o tipo de arbitro:\n0 - Arbitro Central \n1 - Arbitro Assistente \n2 - Quarto Arbitro:");
										}
									dado = input.nextLine();
									arbitrodao.editarArbitro(id, opcao, dado);
									}
								}
							break;
						}
					}	
				}
			}
		}
	}
}