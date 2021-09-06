package quiz.main;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.Parent;
import quiz.common.CommonService;
import quiz.common.CommonServiceImpl;
import quiz.membership.MemberProc;

public class MainController implements Initializable{
	Parent root;
	MemberProc mp;
	CommonService cs;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		mp = new MemberProc();
		cs = new CommonServiceImpl();
	}
	
	public void setRoot(Parent root) {
		this.root = root;
	}

	public void btnOk() {
		System.out.println("ok");
	}
	public void btnCancel() {
		System.out.println("로그인 취소");
		cs.windowClose(root);
	}
	public void btnMembership() {
		System.out.println("회원가입으로 이동");
		mp.memberShip();
	}
}
