package label;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Ex04 extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		AnchorPane anch = new AnchorPane();
		Label lb1 = new Label("Value");
		lb1.setFont(new Font(32));
		lb1.setRotate(48);
		lb1.setTranslateX(100);
		lb1.setTranslateY(70);
		
		EventHandler<MouseEvent> entered = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				lb1.setScaleX(1.5);
				lb1.setScaleY(1.5);				
			}
		};
		
		lb1.setOnMouseEntered(entered);
		lb1.setOnMouseExited(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				lb1.setScaleX(1.0);
				lb1.setScaleY(1.0);
			}
		});
		
		lb1.setOnMousePressed(e->{
			lb1.setRotate(0);
		});
		
		anch.getChildren().add(lb1);
		anch.setPrefSize(300, 200);
		
		arg0.setScene(new Scene(anch));
		arg0.show();
	}
}
