package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

public class ControllerJogador implements Initializable{
	
	@FXML
	Button botaoInserir = new Button();
	
	@FXML
	Button botaoEditar = new Button();
	
	@FXML
	Button botaoExcluir = new Button();
	
	@FXML
	Button botaoListar = new Button();
	
	@FXML
	AnchorPane fundo = new AnchorPane();

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
