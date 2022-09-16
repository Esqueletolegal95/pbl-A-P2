package model;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ArbitroImplDao extends PessoaImplDao implements ArbitroDAO{
	Scanner input = new Scanner(System.in);
	List<Arbitro> arbitros = new ArrayList<Arbitro>();
	String[] tipos= {"Arbitro Central", "Arbitro Assistente", "Quarto Arbitro"};
	protected int idArb = 100;
	

	 @Override
	public void inserirArbitro(String nome, int idade, String nacionalidade, int tipoArb) {
		Arbitro arbitro = new Arbitro();
		arbitro.setNome(nome);
		arbitro.setIdade(idade);
		arbitro.setNacionalidade(nacionalidade);
		arbitro.setTipoArb(tipos[tipoArb]);
		arbitro.setId(idArb);
		idArb++;
		arbitros.add(arbitro);		
	}
	 
	 
	@Override
	public void editarArbitro(int id, int num, String dado) {
		for(Arbitro x	: arbitros) {
			if(x.getId() == id) {
				switch(num) {
				case(1):{
					x.setNome(dado);
					break;}
				case(2):{
					x.setIdade(Integer.parseInt(dado));
					break;}
				case(3):{
					x.setNacionalidade(dado);
					break;}
				case(4):{
					x.setTipoArb(tipos[Integer.parseInt(dado)]);
					break;}
				default:
					break;
				}
			}
		}
	}
	
	
	@Override
	public void excluirArbitro(int id) {
		for(Arbitro x	: arbitros) {
			if(x.getId() == id) {
				arbitros.remove(x);
				}
			}
		}
	
	
	@Override
	public List<Arbitro> listarArbitros() {		
		return arbitros;
	}
}