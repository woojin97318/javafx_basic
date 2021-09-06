package quiz.common;

import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class CommonServiceImpl implements CommonService{

	@Override
	public void windowClose(Parent root) {
		Stage stage = (Stage)root.getScene().getWindow();
		stage.close();
	}

	@Override
	public void alertMethod(String msg) {
		Alert alert = new Alert(AlertType.ERROR);
		alert.setContentText(msg);
		alert.show();
	}
}
