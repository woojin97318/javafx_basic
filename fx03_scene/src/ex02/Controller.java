package ex02;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class Controller implements Initializable{
	@FXML private Button btn;
	@FXML private TextField txtField;
	@FXML private TextField txtField02;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		btn.setOnAction(e->{
			txtField02.setText(txtField.getText());
			txtField.clear();
			
			Alert alert = new Alert(AlertType.CONFIRMATION);
			alert.setContentText("조심하세요");
			alert.show();
		});
	}
}
