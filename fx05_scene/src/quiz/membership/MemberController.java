package quiz.membership;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import quiz.common.CommonService;
import quiz.common.CommonServiceImpl;
import quiz.main.MemberDTO;

public class MemberController implements Initializable{
	Parent root;
	MembershipService ms;
	CommonService cs;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ms = new MembershipServiceImpl();
		cs = new CommonServiceImpl();
	}

	public void setRoot(Parent root) {
		this.root = root;
		ms.setRoot(root);
	}
	
	public void membershipProc() {
		System.out.println("회원가입");
		ms.membershipProc();
	}
	
	public void memberCancle() {
		System.out.println("회원가입 취소");
		ms.memberCancle();
	}
	
	public void memberSucess() {
		System.out.println("회원정보 저장");
		MemberDTO dto = new MemberDTO();
		TextField fx1 = (TextField)root.lookup("#fx1");
		TextField fx2 = (TextField)root.lookup("#fx2");
		TextField fx3 = (PasswordField)root.lookup("#fx3");
		TextField fx4 = (TextField)root.lookup("#fx4");
		TextField fx5 = (TextField)root.lookup("#fx5");
		fx1.setText(dto.getName());
		fx2.setText(dto.getId());
		fx3.setText(dto.getPw());
		if(dto.isGender())
			fx4.setText("남성");
		else
			fx4.setText("여성");
		String str = "";
		switch(dto.getHobby()) {
		case 0 : str += "없음"; break;
		case 1 : str += "음악 "; break;
		case 2 : str += "운동 "; break;
		case 3 : str += "음악, 운동 "; break;
		case 4 : str += "영화 "; break;
		case 5 : str += "음악, 영화 "; break;
		case 6 : str += "운동, 영화 "; break;
		case 7 : str += "음악, 운동, 영화 "; break;
		default : str += "\n";
		}
		fx5.setText(str);
//		fx1.setText(((TextField)root.lookup("#fxName")).getText());
//		fx2.setText(((TextField)root.lookup("#fxId")).getText());
//		fx3.setText(((PasswordField)root.lookup("#fxPw")).getText());
//		if(ms.getGender())
//			fx4.setText("남성");
//		else
//			fx4.setText("여성");
//		fx5.setText(ms.getComboBox());
	}
}
