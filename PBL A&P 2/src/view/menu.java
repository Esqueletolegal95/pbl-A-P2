/*******************************************************************************
Autor: Pedro Henrique/ Tiago Moura
Componente Curricular: MI Programação 
Concluido em: 25/09/2022
Declaro que este código foi elaborado por mim de forma individual e não contém nenhum
trecho de código de outro colega ou de outro autor, tais como provindos de livros e
apostilas, e páginas ou documentos eletrônicos da Internet. Qualquer trecho de código
de outra autoria que não a minha está destacado com uma citação para o autor e a fonte
do código, e estou ciente que estes trechos não serão considerados para fins de avaliação.
******************************************************************************************/

package view;

import java.util.Scanner;
import controller.*;


public class menu {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		double altura;
		Scanner input = new Scanner(System.in);
		String nome, nacionalidade, dado, grupo,time;
		int idade, opcao, tipo, id, posGrupo, posicao, camisa, auxiliar;
		boolean titular, menu;

		menu = true;
		ArbitroController arbitrocontroller = new ArbitroController();
		JogadorController jogadorcontroller = new JogadorController();
		SelecaoController selecaocontroller = new SelecaoController();
		TecnicoController tecnicocontroller = new TecnicoController();
		GrupoController grupocontroller = new GrupoController();
		PartidaController partidacontroller = new PartidaController();

		
		while(menu){// menu
			System.out.println("Escolha uma das opcoes:\n1 - Arbitro\n2 - Selecao\n3 - Jogador\n4 - Tecnico\n5 - Sair");
			opcao = Integer.parseInt(input.nextLine());
			switch(opcao) {
			case(1):{
				System.out.println("Escolha uma das opcoes:\n1 - Inserir\n2 - Listar\n3 - Editar\n4 - Excluir\n5 - Voltar");
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
							arbitrocontroller.inserirArbitro(nome, idade, nacionalidade, tipo);
							break;
							}
						
						case(2):{
							System.out.println(arbitrocontroller.listarArbitros());
							break;	
						}
						
						case (3):{
							System.out.println("Digite o id do Arbitro a ser editado:");
							id = Integer.parseInt(input.nextLine());
							System.out.println("Escolha o que deseja editar:\n1 - Nome\n2 - Idade\n3 - Nacionalidade\n4 - Tipo de arbitro");
							opcao = Integer.parseInt(input.nextLine());
							System.out.println("Digite o dado a ser alterado:");
							if(opcao == 4) {
								System.out.println("Escolha o tipo de arbitro:\n0 - Arbitro Central \n1 - Arbitro Assistente \n2 - Quarto Arbitro:");
								}
							dado = input.nextLine();
							arbitrocontroller.editarArbitro(id, opcao, dado);
								
							break;
						}
						
						case(4):{
							System.out.println("Digite o id do Arbitro a ser excluido:");
							id = Integer.parseInt(input.nextLine());
							arbitrocontroller.excluirArbitro(id);
							break;
						}
						case(5):
							break;
						}
					}	
					break;
				
			
			case(2):{
				System.out.println("Escolha uma das opcoes:\n1 - Inserir\n2 - Listar\n3 - Editar\n4 - Excluir");
				opcao = Integer.parseInt(input.nextLine());
					switch(opcao) {
						case(1):{
							System.out.println("Digite o nome da Selecao:");
							nome = input.nextLine();
							System.out.println("Digite o grupo da Selecao:");	
							grupo = input.nextLine();
							System.out.println("Digite a posição da eleição no grupo:");
							posGrupo = Integer.parseInt(input.nextLine());
							selecaocontroller.inserirSelecao(grupo, nome, posGrupo);
							break;
						}
						case(2):{
							System.out.println(selecaocontroller.listarSelecao());
							break;
						}
						case(3):{
							System.out.println("Digite o id da Selecao a ser editado:");
							id = Integer.parseInt(input.nextLine());
							System.out.println("Escolha o que deseja editar:\n1 - Nome\n2 - Grupo\n3 - Posicao no grupo");
							opcao = Integer.parseInt(input.nextLine());
							System.out.println("Digite o dado a ser alterado:");
							dado = input.nextLine();
							selecaocontroller.editarSelecao(id, opcao, dado);
							break;
						}
						case(4):{
							System.out.println("Digite o id da Selecao a ser excluído: ");
							id = Integer.parseInt(input.nextLine());
							selecaocontroller.excluirSelecao(id);
							break;
						}
					}
					break;
				}
			case(3):{
				System.out.println("Escolha uma das opcoes:\n1 - Inserir\n2 - Listar\n3 - Editar\n4 - Excluir");
				opcao = Integer.parseInt(input.nextLine());
					switch(opcao) {
						case(1):{
							System.out.println("Digite o id da selecao onde o jogador sera adicionado:");
							id = Integer.parseInt(input.nextLine());
							System.out.println("Digite o nome:");
							nome = input.nextLine();
							System.out.println("Digite a idade:");
							idade = Integer.parseInt(input.nextLine());
							System.out.println("Digite a nacionalidade:");
							nacionalidade = input.nextLine();
							System.out.println("O jogador é titular: (Digite s se sim)");
							dado = input.nextLine();
							if(dado == "s") 
								titular = true;
							else
								titular = false;
							System.out.println("Digite a altura do Jogador");
							altura = Double.parseDouble(input.nextLine());
							System.out.println("Escolha a posicao:\n0 - Goleiro \n1 - Lateral Direito \n2 - Lateral Esquerdo\n3 - Zagueiro Central\n4 - Quarto Zagueiro\n5 - Volante \n6 - Ponta Direita \n7 - Segundo Volante \n8 - Atacante \n9 -Meia Armador \n10 - Ponta Esquerda\n11 - Ponta Direita");
							posicao = Integer.parseInt(input.nextLine());
							System.out.println("Digite o numero da camisa: ");
							camisa = Integer.parseInt(input.nextLine());
							jogadorcontroller.inserirJogador(selecaocontroller.retornaSelecao(id), nome, idade, altura, titular, nacionalidade, posicao, camisa);
							break;
						}
						case(2):{
							System.out.println("Digite o id da selecao a qual serao listadas seus jogadores: ");
							id = Integer.parseInt(input.nextLine()); 
							System.out.println(jogadorcontroller.listarJogador(id));
							break;
								}
						case(3):{
							System.out.println("Digite o id do jogador a ser alterado: ");
							id = Integer.parseInt(input.nextLine());
							System.out.println("Escolha o que deseja editar:\n1 - Nome\n2 - Altura\n3 - Idade\n4 - Nacionalidade\n5 - Cartao Amarelo\n6 - Cartao Vermelho\n7 - Qauntidade de gols\n8 - Titular\n9 - Posicao\n10 - Nº da camisa\n");
							opcao = Integer.parseInt(input.nextLine());
							if(opcao == 9) {
								System.out.println("Escolha a posicao:\n0 - Goleiro \n1 - Lateral Direito \n2 - Lateral Esquerdo\n3 - Zagueiro Central\n4 - Quarto Zagueiro\n5 - Volante \n6 - Ponta Direita \n7 - Segundo Volante \n8 - Atacante \n9 -Meia Armador \n10 - Ponta Esquerda\n11 - Ponta Direita");
							}
							if(opcao == 8) {
								System.out.println("O jogador é titular: (Digite s se sim)");
							}
							dado = input.nextLine();
							jogadorcontroller.editarJogador(id, opcao, dado);
							break;
								}
						case(4):{
							System.out.println("Digite o id da selecao que sera excluido o jogador");
							auxiliar = Integer.parseInt(input.nextLine());
							System.out.println("Digite o id do jogador a ser excluido: ");
							id = Integer.parseInt(input.nextLine());
							jogadorcontroller.excluirJogador(auxiliar, id);
							break;
						}
					}
				break;
				}
				
			
			case(4):{
				System.out.println("Escolha uma das opcoes:\n1 - Inserir\n2 - Listar\n3 - Editar\n4 - Excluir");
				opcao = Integer.parseInt(input.nextLine());
					switch(opcao) {
						case(1):{
							System.out.println("Digite o id da selecao onde sera adicionado o tecnico: ");
							id = Integer.parseInt(input.nextLine());
							System.out.println("Digite o nome: ");
							nome = input.nextLine();
							System.out.println("Digite a idade: ");
							idade = Integer.parseInt(input.nextLine());
							System.out.println("Digite a nacionalidade: ");
							nacionalidade = input.nextLine();
							System.out.println("Digite o nome do time anterior do tecnico: ");
							time = input.nextLine();
							tecnicocontroller.inserirTecnico(selecaocontroller.retornaSelecao(id), nome, idade, nacionalidade, time);
							break;
							
						}
						case(2):{
							System.out.println(tecnicocontroller.listarTecnico());
							break;
						}
						case(3):{
							System.out.println("Digite o id selecao a qual o tecnico pertence: ");
							id = Integer.parseInt(input.nextLine());
							System.out.println("Digite qual opcao voce deseja:\n1 - nome\n2 - Idade: \n3 - Nacionalidade\n4 - Time Anterior");
							opcao = Integer.parseInt(input.nextLine());
							dado = input.nextLine();
							tecnicocontroller.editarTecnico(selecaocontroller.retornaSelecao(id), opcao, dado);
							break;
						}
						case(4):{
							System.out.println("Digite o id da selecao onde sera excluido o tecnico: ");
							id = Integer.parseInt(input.nextLine());
							tecnicocontroller.excluirTecnico(selecaocontroller.retornaSelecao(id));
							break;
						}
						
					}
				break;
				}
			case(5):
				menu = false;
			}
		}
	}
}
		
	

	
