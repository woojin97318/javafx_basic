package imageview;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Ex01 extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		AnchorPane ap = new AnchorPane();
		ImageView iv = new ImageView("/img/SmileReRE.png");
//		iv.setImage(new Image("/img/Calendar.png"));
		
//		iv.setFitWidth(1000);
		iv.setFitHeight(100);
		iv.setPreserveRatio(true); // Height에 맞춰 Width자동 설정
		
		iv.setRotate(45); // 각도
		
		ap.getChildren().add(iv);
		
		arg0.setScene(new Scene(ap));
		arg0.show();
	}
}
