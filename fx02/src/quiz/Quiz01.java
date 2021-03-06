package quiz;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Quiz01 extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage arg0) throws Exception {
		BorderPane bp = new BorderPane();
		
		HBox topHb = new HBox(20);
		topHb.getChildren().addAll(new Label("홈"), new Label("사회"),
				new Label("경제"), new Label("국제"), new Label("문화"));
		topHb.setPadding(new Insets(15, 0, 15, 280));
		bp.setTop(topHb);
		
		VBox leftVb = new VBox(10);
		leftVb.getChildren().addAll(new Label("카테고리"), new Label("노트북/PC"),
				new Label("자동차용품"), new Label("휴대폰"), new Label("캠핑/낚시"));
		leftVb.setPadding(new Insets(0, 15, 0, 15));
		bp.setLeft(leftVb);
		
		VBox centerVb = new VBox();
		HBox centerHb1 = new HBox(10);
		centerHb1.getChildren().addAll(new Label(" ID "), new TextField());
		centerHb1.setAlignment(Pos.CENTER_LEFT);
		HBox centerHb2 = new HBox(10);
		centerHb2.getChildren().addAll(new Label("PW"), new TextField());
		centerHb2.setAlignment(Pos.CENTER_LEFT);
		HBox centerHb3 = new HBox(10);
		RadioButton rb1 = new RadioButton("여");
		RadioButton rb2 = new RadioButton("남");
		ToggleGroup tg = new ToggleGroup();
		rb1.setToggleGroup(tg);
		rb2.setToggleGroup(tg);
		rb1.setSelected(true);
		centerHb3.getChildren().addAll(rb1, rb2);
		HBox centerHb4 = new HBox(10);
		centerHb4.getChildren().addAll(new CheckBox("게임"), new CheckBox("공부"));
		TextArea ta = new TextArea();
		ta.setPrefSize(100, 50);
		FlowPane centerFp = new FlowPane(Orientation.VERTICAL);
		centerFp.getChildren().addAll(centerHb1, centerHb2, centerHb3, centerHb4,
				new Label("하고 싶은 말"), ta);
		centerFp.setVgap(10);
		centerVb.getChildren().addAll(centerFp);
		bp.setCenter(centerVb);
		
		HBox rightHb = new HBox();
		VBox rightVb = new VBox();
		rightVb.getChildren().addAll(new TextField(), new TextField());
		rightVb.setPrefSize(100, 100);
		Button btn = new Button("로그인");
		btn.setPrefSize(65, 45);
		rightHb.getChildren().addAll(rightVb, btn);
		rightHb.setPadding(new Insets(0, 15, 0, 15));
		bp.setRight(rightHb);
		
		arg0.setScene(new Scene(bp, 500, 300));
		arg0.show();
	}

}
