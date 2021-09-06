package quiz.membership;

import javafx.scene.Parent;

public interface MembershipService {
	public void membershipProc();
	public void check();	
	public boolean getGender();
	public String getComboBox();
	public int getCheckBox();
	public void memberCancle();
	public void setRoot(Parent root);
	public void addComboBox();
}
