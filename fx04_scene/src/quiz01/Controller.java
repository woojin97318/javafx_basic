package quiz01;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import quiz01.loginservice.LoginServiceImpl;

public class Controller implements Initializable{
	@FXML TextField fxId;
	@FXML PasswordField fxPwd;
	private Parent root;

	public void setRoot(Parent root) {
		this.root =  root;
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
	
	LoginServiceImpl ls = new LoginServiceImpl();
	public void LoginProc() {
		ls.LoginProc(root);
	}
	
	public void CancelProc() {
		ls.CancelProc(root);
	}
	
	public void OpenMembershipForm() {
		ls.OpenMembershipForm();
	}
}
