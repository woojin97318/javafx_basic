package radio;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Ex01 extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		HBox hbox = new HBox(10); // 사이 간격 설정
		
		RadioButton rb1 = new RadioButton("rb1");
		RadioButton rb2 = new RadioButton("rb2");
		RadioButton rb3 = new RadioButton("rb3");
		
		ToggleGroup tg = new ToggleGroup();
		rb1.setToggleGroup(tg);
		rb2.setToggleGroup(tg);
		rb3.setToggleGroup(tg);
		
		rb1.setText("10대");
		rb2.setText("20대");
		rb3.setText("30대");
		rb1.setSelected(true);
		
		hbox.setPadding(new Insets(20));
		hbox.setMargin(rb2, new Insets(50, 20, 20, 50));
		hbox.getChildren().addAll(rb1, rb2, rb3);
		
		arg0.setScene(new Scene(hbox));
		arg0.show();
	}
}
