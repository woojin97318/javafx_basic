package ex01.login;

import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginClass {

	public void loginCheck(Parent root) {
		TextField t = (TextField)root.lookup("#fxId");
		PasswordField p = (PasswordField)root.lookup("#fxPwd");
		System.out.println("root 아이디 : "+t.getText()+p.getText());
	}
	public void loginCheck(TextField id,PasswordField pwd) {
		System.out.println("로그인 체크 기능입니다"+ id.getText()+pwd.getText());
	}
}
