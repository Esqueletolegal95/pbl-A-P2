package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;



public class ControllerTelaInicial implements Initializable{
	@FXML
	private AnchorPane fundo = new AnchorPane();
	
	
	@FXML
	public void mudarTelaTecnico() {
		try {

			AnchorPane a = (AnchorPane) FXMLLoader.load(getClass().getResource("/view/Tecnico.fxml")); // Chamando o fxml
			fundo.getChildren().setAll(a);
			} catch(Exception e) {
			e.printStackTrace();
			System.out.println("Error: Tentativa de mudar a cena \n" + e.getMessage());
			}
	}
	
	@FXML
	public void mudarTelaArbitro() {
		try {

			AnchorPane a = (AnchorPane) FXMLLoader.load(getClass().getResource("/view/Arbitro.fxml")); // Chamando o fxml
			fundo.getChildren().setAll(a);
			} catch(Exception e) {
			e.printStackTrace();
			System.out.println("Error: Tentativa de mudar a cena\n" + e.getMessage());
			}
	}
	
	@FXML
	public void mudarTelaPartidas() {
		try {

			AnchorPane a = (AnchorPane) FXMLLoader.load(getClass().getResource("/view/Partidas.fxml")); // Chamando o fxml
			fundo.getChildren().setAll(a);
			} catch(Exception e) {
			e.printStackTrace();
			System.out.println("Error: Tentativa de mudar a cena\n" + e.getMessage());
			}
	}
	
	@FXML
	public void mudarTelaSelecao() {
		try {

			AnchorPane a = (AnchorPane) FXMLLoader.load(getClass().getResource("/view/Selecao.fxml")); // Chamando o fxml
			fundo.getChildren().setAll(a);
			} catch(Exception e) {
			e.printStackTrace();
			System.out.println("Error: Tentativa de mudar a cena\n" + e.getMessage());
			}
	}
	
	@FXML
	public void mudarTelaJogador() {
		try {
			AnchorPane a = (AnchorPane) FXMLLoader.load(getClass().getResource("/view/Jogador.fxml")); // Chamando o fxml
			fundo.getChildren().setAll(a);
			} catch(Exception e) {
			e.printStackTrace();
			System.out.println("Error: Tentativa de mudar a cena\n" + e.getMessage());
			}
	}
	
	@FXML
	public void mudarTelaGrupo() {
		try {

			AnchorPane a = (AnchorPane) FXMLLoader.load(getClass().getResource("/view/Grupo.fxml")); // Chamando o fxml
			fundo.getChildren().setAll(a);
			} catch(Exception e) {
			e.printStackTrace();
			System.out.println("Error: Tentativa de mudar a cena\n" + e.getMessage());
			}
	}
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}


}
