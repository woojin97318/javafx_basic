package quiz.cancelbtn;

import javafx.scene.Parent;
import javafx.stage.Stage;

public class CancelBtnImpl implements CancelBtn{
	Parent root;
	
	@Override
	public void setRoot(Parent root) {
		this.root = root;
	}

	@Override
	public void windowClose() {
		Stage stage = (Stage)root.getScene().getWindow();
		stage.close();
	}

}
