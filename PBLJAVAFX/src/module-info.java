module PBLJAVAFX {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	
	opens application to javafx.graphics, javafx.fxml, javafx.controls;
	opens controller to javafx.graphics, javafx.fxml, javafx.controls;
}
