package quiz.resultbtn;

import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import quiz.common.DBClass;
import quiz.main.DTO;

public class ResultBtnController implements Initializable{
	Parent root;
	PieChart pieChart;
	BarChart barChart;
	AreaChart areaChart;
	DBClass db = new DBClass();

	public void setRoot(Parent root) {
		this.root = root;
		pieChart = (PieChart)root.lookup("#pieChart");
		barChart = (BarChart)root.lookup("#barChart");
		areaChart = (AreaChart)root.lookup("#areaChart");
		chart();
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}

	public void chart() {
		String sql = "select * from quiz";
		try {
			PreparedStatement ps = db.conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			rs.next();
			
			pieChart.setData(FXCollections.observableArrayList(
					new PieChart.Data("10대", rs.getInt("age10")),
					new PieChart.Data("20대", rs.getInt("age20")),
					new PieChart.Data("30대", rs.getInt("age30")),
					new PieChart.Data("40대", rs.getInt("age40"))
					));

			XYChart.Series series1 = new XYChart.Series();
			series1.setName("남자");
			series1.setData(FXCollections.observableArrayList(
					new XYChart.Data("성별 설문조사 비율", rs.getInt("man"))
					));
			XYChart.Series series2 = new XYChart.Series();
			series2.setName("여자");
			series2.setData(FXCollections.observableArrayList(
					new XYChart.Data( "성별 설문조사 비율", rs.getInt("woman"))
					));
			barChart.getData().addAll(series1, series2);

			XYChart.Series series3 = new XYChart.Series();
			series3.setName("평균 온도");
			series3.setData(FXCollections.observableArrayList(
					new XYChart.Data("해외여행", rs.getInt("outtrip")),
					new XYChart.Data("국내여행", rs.getInt("intrip")),
					new XYChart.Data("없음", rs.getInt("notrip"))
					));
			areaChart.getData().addAll(series3);
			
			Label lb01 = (Label)root.lookup("#lb01");
			Label lb02 = (Label)root.lookup("#lb02");
			Label lb03 = (Label)root.lookup("#lb03");
			Label lb04 = (Label)root.lookup("#lb04");
			lb01.setText("10대 : " + Integer.toString(rs.getInt("age10")) + "명");
			lb02.setText("20대 : " + Integer.toString(rs.getInt("age20")) + "명");
			lb03.setText("30대 : " + Integer.toString(rs.getInt("age30")) + "명");
			lb04.setText("40대 : " + Integer.toString(rs.getInt("age40")) + "명");
			Label lb11 = (Label)root.lookup("#lb11");
			Label lb12 = (Label)root.lookup("#lb12");
			lb11.setText("남성 : " + Integer.toString(rs.getInt("man")) + "명");
			lb12.setText("여성 : " + Integer.toString(rs.getInt("woman")) + "명");
			Label lb21 = (Label)root.lookup("#lb21");
			Label lb22 = (Label)root.lookup("#lb22");
			Label lb23 = (Label)root.lookup("#lb23");
			lb21.setText("해외여행 : " + Integer.toString(rs.getInt("outtrip")));
			lb22.setText("국내여행 : " + Integer.toString(rs.getInt("intrip")));
			lb23.setText("없음 : " + Integer.toString(rs.getInt("notrip")));
			Label lb31 = (Label)root.lookup("#lb31");
			lb31.setText("설문 조사 총 인원 : " + Integer.toString(rs.getInt("man") + rs.getInt("woman")));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
