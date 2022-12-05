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
import javafx.scene.layout.Pane;
import model.Selecao;
import model.Singleton;
import model.Tecnico;


public class TecnicoController implements Initializable{
	Singleton menu = new Singleton();
	@FXML
	TableView<Tecnico> tableViewTecnico = new TableView<Tecnico>();

    @FXML
    ChoiceBox<Selecao> choice_Selecao;

    @FXML
    Pane fundo = new AnchorPane();
    @FXML
    TableColumn<Tecnico, Integer> column_Id = new TableColumn<Tecnico, Integer>();

    @FXML
   	TableColumn<Tecnico, Integer> column_Idade = new TableColumn<Tecnico, Integer>();

    @FXML
    TableColumn<Tecnico, String> column_Nacio = new TableColumn<Tecnico, String>();

    @FXML
    TableColumn<Tecnico, String> column_Nome = new TableColumn<Tecnico, String>();

    @FXML
    TableColumn<Tecnico, String> column_Time = new TableColumn<Tecnico, String>();
    @FXML
    TableColumn<Tecnico, String> column_Selecao = new TableColumn<Tecnico, String>();

    @FXML
    TextField text_Idade;
    
    

    @FXML
    TextField text_Nacionalidade;

    @FXML
    TextField text_Nome;

    @FXML
    TextField text_PrevTeam;
    
    @FXML
    Tab voltar_tab;
    @FXML
    Button botao_inserir_Tecnico;
	
	public void inserirTecnico(Selecao selecao,String nome, int idade, String nacionalidade, String time) {
		menu.getTecnicodao().inserirTecnico(selecao, nome, idade, nacionalidade, time);
	}
	
	public void editarTecnico(Selecao selecao,int num, String dado) {
		menu.getTecnicodao().editarTecnico(selecao, num, dado);
	}
	public void excluirTecnico(Selecao selecao) {
		menu.getTecnicodao().excluirTecnico(selecao);
	}

	public ObservableList<Tecnico> listarTecnico() {
		return FXCollections.observableArrayList(menu.getTecnicodao().listarTecnico(menu.getSelecaodao().listarSelecao()));
		
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
	  @FXML
	    void botao_inserirIn() {
		  inserirTecnico(choice_Selecao.getValue(), text_Nome.getText(), Integer.parseInt(text_Idade.getText()), text_Nacionalidade.getText(), text_PrevTeam.getText());
	    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		choice_Selecao.getItems().addAll(FXCollections.observableArrayList(menu.getSelecaodao().listarSelecao()));
		choice_Selecao.setConverter(null);
		tableViewTecnico.setItems(listarTecnico());
		column_Id.setCellValueFactory(new PropertyValueFactory<>("id"));
		column_Idade.setCellValueFactory(new PropertyValueFactory<>("idade"));
		column_Nacio.setCellValueFactory(new PropertyValueFactory<>("nacionalidade"));
		column_Nome.setCellValueFactory(new PropertyValueFactory<>("nome"));
		column_Time.setCellValueFactory(new PropertyValueFactory<>("timeAnterior"));
		column_Selecao.setCellValueFactory(new PropertyValueFactory<>("selecao"));
	}
	
}
