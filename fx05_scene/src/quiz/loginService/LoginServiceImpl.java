package quiz.loginService;

import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginServiceImpl implements LoginService{
	Parent root;

	@Override
	public void setRoot(Parent root) {
		this.root = root;
	}

	@Override
	public void loginCheck() {
		System.out.println("로그인 체크");
		TextField tf = (TextField)root.lookup("#fxId");
		PasswordField pf = (PasswordField)root.lookup("#fxPw");
	}

	@Override
	public void loginClose() {
		System.out.println("닫기");
	}
}
