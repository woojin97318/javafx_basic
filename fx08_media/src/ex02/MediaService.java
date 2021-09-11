package ex02;

import javafx.scene.Parent;

public interface MediaService {
	public void myStart();
	public void myPause();
	public void myStop();
	public void setControl(Parent root);
	public void setMedia(Parent root, String mediaName);
	public void volumeControl();
}
