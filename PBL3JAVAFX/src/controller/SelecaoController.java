package controller;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import model.Grupo;
import model.Selecao;
import model.Singleton;


public class SelecaoController implements Initializable{
	Singleton menu = new Singleton();
	
	@FXML AnchorPane fundo;
	
    @FXML
    private TextField text_field_Pos;

    @FXML
    ChoiceBox<Grupo> choice_grupo= new ChoiceBox<Grupo>() ;

    @FXML
    private TextField text_field_nome;
    
    @FXML
    private TableView<Selecao> table_view_selecoes;
    
    @FXML 
    private TableColumn<Selecao, Integer> idColum = new TableColumn<Selecao, Integer>();
    
    @FXML 
    private TableColumn<Selecao, String> nomeColum = new TableColumn<Selecao, String>();
    
    @FXML 
    private TableColumn<Selecao, String> grupoColum= new TableColumn<Selecao, String>();
    
    @FXML 
    private TableColumn<Selecao, String> tecnicoColum= new TableColumn<Selecao, String>();
    
    @FXML 
    private TableColumn<Selecao, Integer> posicaoColum = new TableColumn<Selecao, Integer>();
	
	public void inserirSelecao(Grupo grupo, String nome) {
		menu.getSelecaodao().inserirSelecao(grupo.getNome(), nome);
	}
	
	public void editarSelecao(int id,int num, String dado) {
		menu.getSelecaodao().editarSelecao(id, num, dado);
	}
	
	public void excluirSelecao(int id) {
		menu.getSelecaodao().excluirSelecao(id);
	}
	
	public String listarSelecao(){
		String s= "";
		for(Selecao x: menu.getSelecaodao().listarSelecao()) {
			if(x.getTecnico() == null)
				s = s +("|Id: "+x.getId()+"|Nome: "+x.getNome()+"|Grupo: "+x.getGrupo()+"|Pocisao no Grupo: "+x.getPosicaoGrupo()+"|Tecnico: Sem Tecnico|\n");
			else
				System.out.println("|Id: "+x.getId()+"|Nome: "+x.getNome()+"|Grupo: "+x.getGrupo()+"|Pocisao no Grupo: "+x.getPosicaoGrupo()+"|Tecnico: "+x.getTecnico().getNome()+"|\n");
			
		}
		return s;
	}

	public Selecao retornaSelecao(int id) {
		return menu.getSelecaodao().retornaSelecao(id);
	}
	
	
	@FXML public void voltar() { //volta para a tela inicial
		try {

			AnchorPane a = (AnchorPane) FXMLLoader.load(getClass().getResource("/view/TelaInicial.fxml")); // Chamando o fxml
			fundo.getChildren().setAll(a);
			} catch(Exception e) {
			e.printStackTrace();
			System.out.println("Error: Tentativa de mudar a cena\n" + e.getMessage());
			}
	}
	
	@FXML
    void botao_Inserir() {
		try {
			inserirSelecao(choice_grupo.getValue(), text_field_nome.getText());}
		catch (Exception e) {
			e.printStackTrace();
		}

    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		idColum.setCellValueFactory(new PropertyValueFactory<>("id"));
		grupoColum.setCellValueFactory(new PropertyValueFactory<>("grupo"));
		nomeColum.setCellValueFactory(new PropertyValueFactory<>("nome"));
		tecnicoColum.setCellValueFactory(new PropertyValueFactory<>("tecnicoNome"));
		table_view_selecoes.setItems(listaSelecao());
		choice_grupo.getItems().addAll(listaGrupo());
		choice_grupo.setConverter(null);
		
	}
	
	private ObservableList<Selecao> listaSelecao(){
		return FXCollections.observableArrayList(menu.getSelecaodao().listarSelecao());
		
	}
	
	private ObservableList<Grupo> listaGrupo(){
		return FXCollections.observableArrayList(menu.getGrupodao().listarGrupo());
		
	}
}
