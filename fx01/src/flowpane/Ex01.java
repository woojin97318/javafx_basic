package flowpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Ex01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		FlowPane flowPane = new FlowPane();
		
		Button[] btn = new Button[3];
		for(int i = 0; i < 3; i++) {
			btn[i] = new Button("버튼0" + (i+1));
			flowPane.getChildren().add(btn[i]);
		}
		
		Scene sc = new Scene(flowPane, 200, 100);
		
		arg0.setScene(sc);
		arg0.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
