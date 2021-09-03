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
			if(tfId.getText().isEmpty()) {
				msgBox("아이디를 입력해야 합니다.");
				tfId.requestFocus();
				tfPw.clear();
			}else if(tfPw.getText().isEmpty()) {
				msgBox("비밀번호를 입력해야 합니다.");
				tfPw.requestFocus();
			}else {
				MyDB mydb = new MyDB();
				if(mydb.getTable().containsKey(tfId.getText()) && mydb.getPassword(tfId.getText()).equals(tfPw.getText()) ) {
					msgBox("로그인 성공");
				}else {
					msgBox("로그인 실패");
					tfId.clear();
					tfPw.clear();
				}
			}
		});
	}
	
	public void msgBox(String msg) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setContentText(msg);
		alert.show();
	}
}
