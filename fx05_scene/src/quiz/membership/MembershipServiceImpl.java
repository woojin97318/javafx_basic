package quiz.membership;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import quiz.common.CommonService;
import quiz.common.CommonServiceImpl;
import quiz.main.MemberDTO;

public class MembershipServiceImpl implements MembershipService{
	Parent root;
	
	@Override
	public void membershipProc() {
		MemberDTO dto = new MemberDTO();
		check();
		
		dto.setName(((TextField)root.lookup("#fxName")).getText());
		dto.setId(((TextField) root.lookup("#fxId")).getText());
		dto.setPw(((PasswordField) root.lookup("#fxPw")).getText());
		dto.setGender(getGender());// true -> 남성
		dto.setAge(getComboBox());
		dto.setHobby(getCheckBox());
		System.out.println("이름 : " + dto.getName());
		System.out.println("아이디 : " + dto.getId());
		System.out.println("비밀번호 : " + dto.getPw());
		if(dto.isGender())
			System.out.println("성별 : 남성");
		else
			System.out.println("성별 : 여성");
		System.out.println("연령 : " + dto.getAge());
		System.out.print("취미 : ");
		switch(dto.getHobby()) {
		case 0 : System.out.println("없음"); break;
		case 1 : System.out.print("음악 "); break;
		case 2 : System.out.print("운동 "); break;
		case 3 : System.out.print("음악, 운동 "); break;
		case 4 : System.out.print("영화 "); break;
		case 5 : System.out.print("음악, 영화 "); break;
		case 6 : System.out.print("운동, 영화 "); break;
		case 7 : System.out.print("음악, 운동, 영화 "); break;
		default : System.out.println();
		}
	}
	@Override
	public void check() {
		System.out.println("기재사항 체크");
		CommonService cs = new CommonServiceImpl();
		
		TextField tfName = (TextField)root.lookup("#fxName");
		TextField tfId = (TextField)root.lookup("#fxId");
		TextField tfPw = (TextField)root.lookup("#fxPw");
		TextField tfPwOk = (TextField)root.lookup("#fxPwOk");
		if(tfName.getText().isEmpty()) {
			cs.alertMethod("이름을 입력하세요");
			tfName.requestFocus();
		}else if(tfId.getText().isEmpty()) {
			cs.alertMethod("아이디를 입력하세요");
			tfId.requestFocus();
		}else if(tfPw.getText().isEmpty()) {
			cs.alertMethod("비밀번호를 입력하세요");
			tfPw.requestFocus();
		}else if(tfPwOk.getText().isEmpty()) {
			cs.alertMethod("비밀번호 확인을 입력하세요");;
			tfPwOk.requestFocus();
		}else if(!tfPw.getText().equals(tfPwOk.getText())) {
			cs.alertMethod("비밀번호가 일치하지 않습니다");
			tfPwOk.requestFocus();
		}else if(getComboBox().equals("선택안함")) {
			cs.alertMethod("연령구분을 선택하세요");
		}else {
			try {
				Stage primaryStage = new Stage();
				FXMLLoader loader =
						new FXMLLoader(getClass().getResource("../main/MemberView.fxml"));
				Parent root = loader.load();
				Scene scene = new Scene(root);
				
				MemberController ctl = loader.getController();
				ctl.setRoot(root);

				primaryStage.setScene(scene);
				primaryStage.show();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	@Override
	public boolean getGender() {
		RadioButton rdoMan = (RadioButton)root.lookup("#rdoMan");
		if(rdoMan.isSelected())
			return true;
		else
			return false;
	}
	@Override
	public String getComboBox() {
		ComboBox<String> cmbAge = (ComboBox<String>)root.lookup("#cmbAge");
		String age = null;
		if(cmbAge.getValue() == null) {
			System.out.println("콤보박스를 선택해 주세요");
			age = "선택안함";
		}else {
			age = cmbAge.getValue().toString();
		}
		return age;
	}
	@Override
	public int getCheckBox() {
		int hobby = 0;
		CheckBox music = (CheckBox)root.lookup("#chkMusic");
		CheckBox sport = (CheckBox)root.lookup("#chkSport");
		CheckBox movie = (CheckBox)root.lookup("#chkMovie");
		if(music.isSelected())
			hobby += 1;
		if(sport.isSelected())
			hobby += 2;
		if(movie.isSelected())
			hobby += 4;
		return hobby;
	}

	@Override
	public void memberCancle() {
		CommonService cs = new CommonServiceImpl();
		cs.windowClose(root);
	}

	@Override
	public void setRoot(Parent root) {
		this.root = root;
		addComboBox();
	}
	@Override
	public void addComboBox() {
		ComboBox<String> cmbAge = (ComboBox<String>)root.lookup("#cmbAge");
		if(cmbAge != null) {
			cmbAge.getItems().addAll("20대 미만", "20대", "30대","40대 이상");
		}
	}
}
