package quiz.resultbtn;

import javafx.scene.Parent;

public class ResultBtnImpl implements ResultBtn{
	Parent root;
	
	@Override
	public void setRoot(Parent root) {
		this.root = root;
	}
	
	public void nextView() {
		NextView nv = new NextView();
		nv.nextView2();
	}

}
