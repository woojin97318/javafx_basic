package quiz;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Quiz02 extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		FlowPane fp = new FlowPane();
		fp.setHgap(20);
		
		Label lb1 = new Label("Search", new ImageView("/img/search.png"));
		lb1.setTextFill(Color.BLUE);
		lb1.setFont(new Font(20));
		lb1.setOnMouseEntered(e->{
			lb1.setScaleX(1.5);
			lb1.setScaleY(1.5);
		});
		lb1.setOnMouseExited(e-> {
			lb1.setScaleX(1.0);
			lb1.setScaleY(1.0);
		});
		
		Label lb2 = new Label("values");
		lb2.setFont(new Font(30));
		lb2.setRotate(270);
		lb2.setOnMouseEntered(e-> {
			lb2.setRotate(0);
		});
		lb2.setOnMouseExited(e-> {
			lb2.setRotate(270);
		});
		
		Label lb3 = new Label("A label that needs to be wrapped");
		lb3.setWrapText(true);
		lb3.setPrefSize(100, 100);
		lb3.setOnMousePressed(e->{
			lb3.setWrapText(false);
		});
		lb3.setOnMouseReleased(e->{
			lb3.setWrapText(true);
		});
		
		fp.setAlignment(Pos.CENTER);
		fp.getChildren().addAll(lb1, lb2, lb3);
		
		arg0.setScene(new Scene(fp));
		arg0.show();
	}
}
