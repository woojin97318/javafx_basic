package quiz01.loginservice;

import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginServiceImpl implements LoginService{
	
	@Override
	public void LoginProc(Parent root) {
		TextField idtf = (TextField)root.lookup("#fxId");
		PasswordField pwtf = (PasswordField)root.lookup("#fxPw");
		System.out.println("ID : " + idtf.getText());
		System.out.println("PW : " + pwtf.getText());
	}

	@Override
	public void CancelProc(Parent root) {
		TextField idtf = (TextField)root.lookup("#fxId");
		PasswordField pwtf = (PasswordField)root.lookup("#fxPw");
		idtf.clear();
		pwtf.clear();
	}

	@Override
	public void OpenMembershipForm() {
		System.out.println("회원가입 버튼이 눌렸습니다.");
	}

}
