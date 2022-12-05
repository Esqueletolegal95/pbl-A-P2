package controller;


import model.Jogador;
import model.Selecao;
import model.Singleton;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;


public class JogadorController implements Initializable{
	Singleton menu = new Singleton();
	Selecao selecao;
	Jogador jogador = new Jogador();
	boolean titular;
	@FXML private Pane fundo = new AnchorPane();
	@FXML private TextField text_Titular;
	@FXML private TextField text_Nome;
	@FXML private TextField text_Idade;
	@FXML private TextField text_Nacio;
	@FXML private TextField text_Altura;
	@FXML private TextField text_NumCamisa;
	@FXML private ChoiceBox<Selecao> choice_selecao= new ChoiceBox<Selecao>();
	@FXML private ChoiceBox<String> choice_Pos;
	@FXML private Button button_Inserir;
	@FXML private Tab tab_Voltar;

    @FXML
    private TableView<Jogador> table_View_Jogador;
    
    @FXML
    private TableColumn<Jogador, Integer> column_Camisa;

    @FXML
    private TableColumn<Jogador, Integer> column_Gols;

    @FXML
    private TableColumn<Jogador, Integer> column_Id;

    @FXML
    private TableColumn<Jogador, Integer> column_Idade;

    @FXML
    private TableColumn<Jogador, String> column_Nacionalidade;

    @FXML
    private TableColumn<Jogador, String> column_Nome;

    @FXML
    private TableColumn<Jogador, String> column_Pocisao;

    @FXML
    private TableColumn<Jogador, Boolean> column_Titular;


	
	public void inserirJogador(Selecao selecao, String nome, int idade, double altura, boolean titular, String nacio, String pocisao, int camisa) {
		menu.getJogadordao().inserirJogador(selecao, nome, idade, altura, titular, nacio, pocisao, camisa);
	}
	public ObservableList<Jogador> listarJogador(){
		return FXCollections.observableArrayList(menu.getJogadordao().listarJogadores());
	}
	public void excluirJogador(int idselecao, int id) {
		for(Selecao selecao: menu.getSelecaodao().listarSelecao()) {
			if(selecao.getId()== id) {
				menu.getJogadordao().excluirJogador(selecao, id);
			}
		}
	}
		

	public void editarJogador(int id, int num, String dado) {
		for(Selecao selecao: menu.getSelecaodao().listarSelecao()) {
			for(Jogador y:selecao.getJogadores()) {
				if(y.getId()==id);
				menu.getJogadordao().editarJogador(selecao, id, num, dado);
				return;
			}
		}
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
	

	@FXML public void botao_inserir_jogador() {
		inserirJogador(choice_selecao.getValue(), text_Nome.getText(), Integer.parseInt(text_Idade.getText()), Double.parseDouble(text_Altura.getText()), false, text_Nacio.getText(), choice_Pos.getValue(), Integer.parseInt(text_NumCamisa.getText()));
		
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		choice_selecao.getItems().addAll(listaParaChoiceBox());
		choice_selecao.setConverter(null);;
		choice_Pos.getItems().addAll(listaParaChoiceBoxPos());
		table_View_Jogador.getItems().setAll(listarJogador());
		column_Camisa.setCellValueFactory(new PropertyValueFactory<>("camisa"));
		column_Gols.setCellValueFactory(new PropertyValueFactory<>("quantGols"));
		column_Id.setCellValueFactory(new PropertyValueFactory<>("id"));
		column_Idade.setCellValueFactory(new PropertyValueFactory<>("idade"));
		column_Nacionalidade.setCellValueFactory(new PropertyValueFactory<>("nacionalidade"));
		column_Nome.setCellValueFactory(new PropertyValueFactory<>("nome"));
		column_Pocisao.setCellValueFactory(new PropertyValueFactory<>("posicao"));
		column_Titular.setCellValueFactory(new PropertyValueFactory<>("titular"));
		// TODO Auto-generated method stub
		
	}
	private ObservableList<Selecao> listaParaChoiceBox(){
		 return FXCollections.observableArrayList(menu.getSelecaodao().listarSelecao());
		
	}
	private ObservableList<String> listaParaChoiceBoxPos(){
		 return FXCollections.observableArrayList(jogador.getPosicoes());
		
	}



}

