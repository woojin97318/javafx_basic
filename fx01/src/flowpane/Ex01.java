package flowpane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Ex01 extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
//		FlowPane flowPane = new FlowPane(); // 기본 가로로 배치
		FlowPane flowPane = new FlowPane(Orientation.VERTICAL); // 세로로 배치

		Button[] btn = new Button[15];
		for(int i = 0; i < 15; i++) {
			btn[i] = new Button("버튼0" + (i+1));
			flowPane.getChildren().add(btn[i]);
		}

		// padding : 안쪽으로 여백을 준다. (상하좌우)
		flowPane.setPadding(new Insets(10, 10, 10, 10));

		flowPane.setVgap(30); // 높이 간격
		flowPane.setHgap(10); // 너비 간격

		Scene sc = new Scene(flowPane, 300, 300);

		arg0.setScene(sc);
		arg0.show();
	}
}
