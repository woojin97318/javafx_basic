package gridpane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Ex02 extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		GridPane gridpane = new GridPane();

		Button btn01 = new Button("Button01");
		GridPane.setConstraints(btn01, 0, 0); // 가로, 세로

		Label label01 = new Label("Label01");
		GridPane.setConstraints(label01, 1, 1);

		gridpane.getChildren().addAll(btn01, label01);

		Button btn02 = new Button("Button02");
		gridpane.add(btn02, 1, 0);

		gridpane.add(new Label("label01"), 0, 1);

		gridpane.setPadding(new Insets(20));

		gridpane.setVgap(10); // 높이 간격
		gridpane.setHgap(50); // 가로 너비 간격

		arg0.setScene(new Scene(gridpane, 300, 100));

		FlowPane flowpane = new FlowPane();
		flowpane.getChildren().add(new Button("merge col(0), row(2)"));
		flowpane.setStyle("-fx-background-color:black;");
		flowpane.setAlignment(Pos.CENTER);

		gridpane.add(flowpane, 0, 2, 2, 1); // 가로, 세로, 가로병합, 세로병합

		arg0.show();
	}
}
