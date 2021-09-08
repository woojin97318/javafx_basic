package quiz.okbtn;

import java.sql.PreparedStatement;

import javafx.scene.Parent;
import javafx.scene.control.RadioButton;
import quiz.common.DBClass;
import quiz.main.DTO;

public class OkBtnImpl implements OkBtn{
	Parent root;
	DTO dto = new DTO();
	DBClass db = new DBClass();
	
	@Override
	public void setRoot(Parent root) {
		this.root = root;
	}
	
	@Override
	public void okBtn() {
		RadioButton fxOut = (RadioButton)root.lookup("#fxOut");
		RadioButton fxIn = (RadioButton)root.lookup("#fxIn");
		RadioButton fxX = (RadioButton)root.lookup("#fxX");
		if(fxOut.isSelected())
			dto.setOutTrip(dto.getOutTrip() + 1);
		else if(fxIn.isSelected())
			dto.setInTrip(dto.getInTrip() + 1);
		else
			dto.setNoTrip(dto.getNoTrip() + 1);
		
		RadioButton fx10 = (RadioButton)root.lookup("#fx10");
		RadioButton fx20 = (RadioButton)root.lookup("#fx20");
		RadioButton fx30 = (RadioButton)root.lookup("#fx30");
		RadioButton fx40 = (RadioButton)root.lookup("#fx40");
		if(fx10.isSelected())
			dto.setAge10(dto.getAge10() + 1);
		else if(fx20.isSelected())
			dto.setAge20(dto.getAge20() + 1);
		else if(fx30.isSelected())
			dto.setAge30(dto.getAge30() + 1);
		else
			dto.setAge40(dto.getAge40() + 1);
		
		RadioButton fxMan = (RadioButton)root.lookup("#fxMan");
		RadioButton fxWoman = (RadioButton)root.lookup("#fxWoman");
		if(fxMan.isSelected())
			dto.setMan(dto.getMan() + 1);
		else
			dto.setWoman(dto.getWoman() + 1);
		
		System.out.println("해외여행 : " + dto.getOutTrip());
		System.out.println("국내여행 : " + dto.getInTrip());
		System.out.println("없음 : " + dto.getNoTrip());
		System.out.println("10대 : " + dto.getAge10());
		System.out.println("20대 : " + dto.getAge20());
		System.out.println("30대 : " + dto.getAge30());
		System.out.println("40대 : " + dto.getAge40());
		System.out.println("남성 : " + dto.getMan());
		System.out.println("여성 : " + dto.getWoman());
		System.out.println();

		String sql = "update quiz set outtrip = ?, intrip = ?, notrip = ?, age10 = ?, age20 = ?, age30 = ?, age40 = ?, man = ?, woman = ?";
		try {
			PreparedStatement ps = db.conn.prepareStatement(sql);
			ps.setInt(1, dto.getOutTrip());
			ps.setInt(2, dto.getInTrip());
			ps.setInt(3, dto.getNoTrip());
			ps.setInt(4, dto.getAge10());
			ps.setInt(5, dto.getAge20());
			ps.setInt(6, dto.getAge30());
			ps.setInt(7, dto.getAge40());
			ps.setInt(8, dto.getMan());
			ps.setInt(9, dto.getWoman());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
