package togglebutton;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Ex01 extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		HBox hbox = new HBox(10);
		
		ToggleButton tb = new ToggleButton("Toggle Button");
		
		hbox.getChildren().addAll(tb);
		hbox.setPrefSize(300, 200);
		
		arg0.setScene(new Scene(hbox));
		arg0.show();
	}
}
