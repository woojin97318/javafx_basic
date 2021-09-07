package Auser;

import common.alert.AlertClass;
import fx06_DB.MemberDTO;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

public class LoginServiceImpl implements LoginService{
	LoginDB db;

	public LoginServiceImpl() {
		db = new LoginDB();
	}
	@Override
	public void loginChk(Parent root) {
		TextField id = (TextField)root.lookup("#fxId");
		TextField pwd = (TextField)root.lookup("#fxPwd");

		MemberDTO dto = db.loginChk(id.getText());
		String msg = "";
		if(dto != null) {
			if(dto.getPwd().equals(pwd.getText())) {
				msg += "로그인 성공";
			}else {
				msg += "비밀번호가 맞지않습니다.";
			}
		}else {
			msg += "아이디가 존재하지않습니다.";
		}
		AlertClass.alert(msg);
	}
}
