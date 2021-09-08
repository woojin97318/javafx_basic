package quiz.resultbtn;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class NextView {
	public void nextView2() {
		try {
			Stage primaryStage = new Stage();
			FXMLLoader loader =
					new FXMLLoader(getClass().getResource("resultView.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);

			ResultBtnController ctl = loader.getController();
			ctl.setRoot(root);

			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
