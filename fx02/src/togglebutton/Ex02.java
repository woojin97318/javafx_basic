package togglebutton;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Ex02 extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		HBox hbox = new HBox();
		
		ToggleButton tb1 = new ToggleButton("tb1");
		ToggleButton tb2 = new ToggleButton("tb2");
		ToggleButton tb3 = new ToggleButton("tb3");
		
		ToggleGroup tg = new ToggleGroup();
		tb1.setToggleGroup(tg);
		tb2.setToggleGroup(tg);
		tb3.setToggleGroup(tg);
		tb1.setSelected(true);
		
		hbox.getChildren().addAll(tb1, tb2, tb3);
		hbox.setPrefSize(300, 200);
		
		arg0.setScene(new Scene(hbox));
		arg0.show();
	}
}
