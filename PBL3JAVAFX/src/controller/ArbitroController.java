package controller;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import model.Arbitro;
import model.Singleton;



public class ArbitroController implements Initializable{
	Singleton menu = new Singleton();
	Arbitro arbitro = new Arbitro();
    @FXML
    private AnchorPane fundo;
    
    @FXML
    private TableView<Arbitro> table_View_Arbitro;

    @FXML
    private TableColumn<Arbitro, Integer> column_Id;
    
    @FXML
    private TableColumn<Arbitro, String> column_Nome;
    
    @FXML
    private TableColumn<Arbitro, Integer> column_Idade;
    
    @FXML
    private TableColumn<Arbitro, String> column_Nacionalidade;
    
    @FXML
    private TableColumn<Arbitro, String> column_Tipo;
    
    @FXML
    private Tab tab_Voltar;

    @FXML
    private TextField text_idade;

    @FXML
    private TextField text_nacio;

    @FXML
    private TextField text_nome;
    
    @FXML
    private ChoiceBox<String> choice_tipo = new ChoiceBox<String>();
    
    @FXML
    private TableView<Arbitro> tableArbitro = new TableView<Arbitro>();
    
    @FXML
    private Button button_Inserir;
	
	public void inserirArbitro(String nome, int idade, String nacionalidade, String tipoArb) {
		menu.getArbitrodao().inserirArbitro(nome, idade, nacionalidade, tipoArb);
	}
	
	public void editarArbitro(int id, int num, String dado) {
		menu.getArbitrodao().editarArbitro(id, num, dado);
	}
	
	public void excluirArbitro(int id) {
		menu.getArbitrodao().excluirArbitro(id);
	}
	
	public String listarArbitros(){
		String s ="";
		for(Arbitro x: menu.getArbitrodao().listarArbitros()) {
			s = s+("|Id: " + x.getId() + "|Nome: " + x.getNome() + "|Idade: " + x.getIdade()+ "|Nacionalidade: " + x.getNacionalidade()+ "|Tipo: " + x.getTipoArb() + "|\n");
			}
		return s;
		
	}
	@FXML public void voltar() {
		try {

			AnchorPane a = (AnchorPane) FXMLLoader.load(getClass().getResource("/view/TelaInicial.fxml")); // Chamando o fxml
			fundo.getChildren().setAll(a);
			} catch(Exception e) {
			e.printStackTrace();
			System.out.println("Error: Tentativa de mudar a cena\n" + e.getMessage());
			}
	}
	
	@FXML public void botaoInserirArbitro(){
		try {
			inserirArbitro(text_nome.getText(), Integer.parseInt(text_idade.getText()), text_nacio.getText(), choice_tipo.getValue());
		}
		catch (Exception e) {
			System.out.println("Entradas Invalidas" + e);
		}
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		choice_tipo.getItems().setAll(listaTipoArb());
		table_View_Arbitro.getItems().setAll(listaArbitro());
		column_Id.setCellValueFactory(new PropertyValueFactory<>("id"));
		column_Idade.setCellValueFactory(new PropertyValueFactory<>("idade"));
		column_Nome.setCellValueFactory(new PropertyValueFactory<>("nome"));
		column_Nacionalidade.setCellValueFactory(new PropertyValueFactory<>("nacionalidade"));
		column_Tipo.setCellValueFactory(new PropertyValueFactory<>("tipoArb"));
		
	}
	public ObservableList<String> listaTipoArb() {
		return FXCollections.observableArrayList(arbitro.getTipos());
		
	}
	
	public ObservableList<Arbitro> listaArbitro(){
		return FXCollections.observableArrayList(menu.getArbitrodao().listarArbitros());
		
	}

}
