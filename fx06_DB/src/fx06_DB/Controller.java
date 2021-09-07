package fx06_DB;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import Auser.LoginService;
import Auser.LoginServiceImpl;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class Controller implements Initializable {
	Parent root;
	public static DBClass db;
	private common.db.DBClass comDB;
	private LoginService ls;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		db = new DBClass();
		comDB = new common.db.DBClass();
		ls = new LoginServiceImpl();
	}

	public void setRoot(Parent root) {
		this.root = root;
	}

	// 회원가입 버튼 클릭
	public void membership() {
		TextField id = (TextField)root.lookup("#memberId");
		TextField pwd = (TextField)root.lookup("#memberPwd");
		TextField name = (TextField)root.lookup("#memberName");

		MemberDTO dto = new MemberDTO();
		dto.setId(id.getText());
		dto.setPwd(pwd.getText());
		dto.setName(name.getText());

		Alert alert = new Alert(AlertType.INFORMATION);
		if(db.insert(dto) == 1)	alert.setContentText("회원가입에 성공하셨습니다.");
		else	alert.setContentText("동일한 아이디가 존재합니다.");
		alert.show();
	}

	// 로그인 버튼 클릭
	public void login() {
		ls.loginChk(root);
	}
}
