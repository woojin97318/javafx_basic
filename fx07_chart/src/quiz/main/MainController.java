package quiz.main;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.Parent;
import quiz.cancelbtn.CancelBtn;
import quiz.cancelbtn.CancelBtnImpl;
import quiz.okbtn.OkBtn;
import quiz.okbtn.OkBtnImpl;
import quiz.resultbtn.ResultBtn;
import quiz.resultbtn.ResultBtnImpl;

public class MainController implements Initializable{
	Parent root;
	OkBtn ob;
	CancelBtn cb;
	ResultBtn rb;
	DTO dto;
	
	public void setRoot(Parent root) {
		this.root = root;
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ob = new OkBtnImpl();
		cb = new CancelBtnImpl();
		rb = new ResultBtnImpl();
	}
	
	public void okBtn() {
		ob.setRoot(root);
		ob.okBtn();
	}
	public void cancelBtn() {
		cb.setRoot(root);
		cb.windowClose();
	}
	public void resultBtn() {
		rb.setRoot(root);
		rb.nextView();
	}
}
