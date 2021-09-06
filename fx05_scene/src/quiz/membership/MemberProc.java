package quiz.membership;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MemberProc {
	public void memberShip() {
		try {
			Stage primaryStage = new Stage();
			FXMLLoader loader = 
					new FXMLLoader(getClass().getResource("../main/Membership.fxml"));
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
