package label;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Ex01 extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		HBox hb = new HBox();
		hb.setPadding(new Insets(10));
		Label lb1 = new Label("lb1 test");
		hb.getChildren().addAll(lb1);
		
		hb.setPrefSize(300, 200);
		hb.setStyle("-fx-background-color:green");
		
		lb1.setPrefSize(200, 30);
		lb1.setStyle("-fx-background-color:yellow");
		lb1.setAlignment(Pos.CENTER);
		
		arg0.setScene(new Scene(hb));
		arg0.show();
	}
}
