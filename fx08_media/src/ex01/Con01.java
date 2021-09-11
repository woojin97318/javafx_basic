package ex01;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.Parent;

public class Con01 implements Initializable{
	Parent root;

	public void setRoot(Parent root) {
		this.root = root;
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

	}

	public void a() {
		System.out.println("a");
	}
	public void b() {
		System.out.println("b");
	}
}
