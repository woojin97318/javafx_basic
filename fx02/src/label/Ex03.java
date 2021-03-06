package label;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Ex03 extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage arg0) throws Exception {
		HBox hb = new HBox();
		hb.setPadding(new Insets(10));
		
		Label lb1 = new Label("A label that needs to be wrapped");
		hb.getChildren().addAll(lb1);
		hb.setPrefSize(100, 100);
		lb1.setWrapText(true); // 공간이 부족하면 엔터값을 준다.
		lb1.setFont(new Font(20)); // 글씨 크기 조절
		lb1.setRotate(48); // 각도 조절
		lb1.setTranslateY(50); // Y 축 조절
		
		lb1.setOnMouseClicked(e-> {
			lb1.setRotate(10);
		});
		
		arg0.setScene(new Scene(hb));
		arg0.show();
	}

}
