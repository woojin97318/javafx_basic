package label;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Ex02 extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		HBox hb = new HBox();
		hb.setPadding(new Insets(10));
		
		Label lb1 = new Label("aA", new ImageView("/img/search.png"));
		
		Label lb2 = new Label();
		lb2.setText("search");
		lb2.setTextFill(Color.web("#0076a3"));
		lb2.setGraphic(new ImageView("/img/search.png"));
		
		hb.getChildren().addAll(lb1, lb2);
		hb.setPrefSize(300, 200);
		
		arg0.setScene(new Scene(hb));
		arg0.show();
	}
}
