package textfield;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Ex01 extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		HBox hbox = new HBox(10);
		
		TextField tf = new TextField();
		tf.setText("내용");
		
		PasswordField pf = new PasswordField();
		pf.setText("abcd1234");
		
		ComboBox<String> cb = new ComboBox<String>();
		cb.getItems().addAll("공부", "놀기", "멍타기");
		cb.setValue("공부");
		
		TextArea ta = new TextArea();
		ta.setPrefSize(100, 100);
		
		DatePicker dp = new DatePicker();
		
		hbox.setPrefSize(800, 200);
		hbox.setPadding(new Insets(20));
		hbox.getChildren().addAll(tf, pf, cb, ta, dp);
		
		arg0.setScene(new Scene(hbox));
		arg0.show();
	}
}
