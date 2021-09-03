package ex01;

import java.net.URL;
import java.util.ResourceBundle;

import ex01.login.LoginClass;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controller implements Initializable {
	@FXML TextField fxId;
	@FXML PasswordField fxPwd;
	private Parent root;

	public void setRoot(Parent root) {
		this.root =  root;
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}

	public void LoginProc() {
		//System.out.println("로그인 버튼 클릭");
		//TextField t = (TextField)root.lookup("#fxId");
		//System.out.println( t.getText() );
		//System.out.println("어노테이션 사용 : "+fxId.getText());
		LoginClass lc = new LoginClass();
		lc.loginCheck( fxId, fxPwd );
		lc.loginCheck(root);
	}
}
