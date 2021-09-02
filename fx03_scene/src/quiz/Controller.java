package quiz;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class Controller implements Initializable{
	@FXML private Button loginBtn;
	@FXML private TextField tfId;
	@FXML private PasswordField tfPw;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		loginBtn.setOnAction(e->{
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("메시지");
			if(tfId.getText().isEmpty()) {
				alert.setContentText("tfId를 입력해야 합니다.");
				alert.show();
			}else if(tfPw.getText().isEmpty()) {
				alert.setContentText("tfPw를 입력해야 합니다.");
				alert.show();
			}else {
				MyDB mydb = new MyDB();
				if(mydb.getTable().containsKey(tfId.getText()) && mydb.getTable().containsValue(tfPw.getText())) {
					alert.setContentText("로그인 성공");
					alert.show();
				}else {
					alert.setContentText("로그인 실패");
					alert.show();
				}
			}
		});
	}
	
}