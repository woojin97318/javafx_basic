package quiz;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Quiz01 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		BorderPane bp = new BorderPane();

		FlowPane topFp = new FlowPane();
		topFp.setStyle("-fx-background-color:pink;");
		topFp.setPrefSize(400, 40);
		topFp.setPadding(new Insets(13, 0, 0, 250));
		topFp.getChildren().add(new Label("메뉴   홈   로그인"));
		bp.setTop(topFp);

		FlowPane leftFp = new FlowPane();
		leftFp.setStyle("-fx-background-color:skyblue;");
		leftFp.setPrefSize(100, 130);
		leftFp.getChildren().add(new Button("메뉴 나열"));
		bp.setLeft(leftFp);

		FlowPane centerFp = new FlowPane();
		centerFp.setStyle("-fx-background-color:#72F279;");
		centerFp.setPrefSize(100, 130);
		centerFp.getChildren().add(new Button("내용 들어가는 곳"));
		bp.setCenter(centerFp);

		GridPane rightGp = new GridPane();
		rightGp.setStyle("-fx-background-color:lightyellow;");
		rightGp.setPrefSize(200, 130);
		Button btnId = new Button("아이디 입력");
		Button btnPw = new Button("비밀번호 입력");
		Button btnLogin = new Button("로그인");
		btnId.setPrefSize(95, 20);
		btnPw.setPrefSize(95, 20);
		btnLogin.setPrefSize(70, 45);
		rightGp.add(btnId, 0, 0);
		rightGp.add(btnPw, 0, 1);
		rightGp.add(btnLogin, 1, 0, 1, 2);
		rightGp.setPadding(new Insets(10));
		bp.setRight(rightGp);

		FlowPane bottomFp = new FlowPane();
		bottomFp.setStyle("-fx-background-color:brown;");
		bottomFp.setPrefSize(400, 30);
		bottomFp.getChildren().add(new Button("바닥글 들어가는 곳"));
		bottomFp.setAlignment(Pos.CENTER);
		bp.setBottom(bottomFp);

		arg0.setResizable(false); // 창 사이즈 고정
		arg0.setScene(new Scene(bp, 400, 200));
		arg0.show();
	}
}
