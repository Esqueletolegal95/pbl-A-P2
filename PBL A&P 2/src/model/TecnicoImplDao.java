package model;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class TecnicoImplDao extends PessoaImplDao implements TecnicoDAO {
	int idTec = 20000;
	Scanner input = new Scanner(System.in);



	@Override
	public void inserirTecnico(Selecao selecao,String nome, int idade, String nacionalidade, String time) {
		Tecnico tecnico = new Tecnico();
		tecnico.setNome(nome);
		tecnico.setIdade(idade);
		tecnico.setNacionalidade(nacionalidade);
		tecnico.setTimeAnterior(time);
		tecnico.setId(idTec);
		idTec++;
		selecao.setTecnico(tecnico);
		
	}

	@Override
	public void editarTecnico(Selecao selecao,int num, String dado) {
		
			switch(num) {
			case(1):{
				selecao.getTecnico().setNome(dado);
					break;}
			case(2):{
				selecao.getTecnico().setIdade(Integer.parseInt(dado));
					break;}
			case(3):{
				selecao.getTecnico().setNacionalidade(dado);
				break;}
			case(4):{
				selecao.getTecnico().setTimeAnterior(dado);
				break;}
			}
		}

	@Override
	public void excluirTecnico(Selecao selecao) {
		selecao.setTecnico(null);
	}

	@Override
	public List<Tecnico> listarTecnico(List<Selecao> selecoes) {
		List<Tecnico> tecnicos = new ArrayList<Tecnico>();
		for(Selecao x : selecoes) {
			if(x.getTecnico() != null) {
			tecnicos.add(x.getTecnico());
			}
		}
		return tecnicos;
	}
}