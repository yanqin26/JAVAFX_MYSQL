package UI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

import Foods.Food;
import JDBC_Utils.DBUtils;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;

public class SumPane extends AnchorPane{

	public SumPane(String ListNumber, String TEL,String name) {
		// TODO Auto-generated constructor stub
		
		String s1 = "";
		String s2 = "";
		
		Label label1 = new Label("訂單");
		label1.setFont(Font.font(40));
		this.getChildren().add(label1);
		this.setTopAnchor(label1, 13.0);
		this.setLeftAnchor(label1, 120.0);
		
		Line line1  =new Line(10,70 , 310,70);
		line1.setStrokeWidth(3);
		this.getChildren().add(line1);
		
		Label l1 = new Label("xxxx");
		l1.setFont(Font.font(15));
		Label l2 = new Label("xxxx");
		l2.setFont(Font.font(15));
		Label l3 = new Label("用戶：" + name);
		l3.setFont(Font.font(15));
		
		this.getChildren().addAll(l1,l2,l3);
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;	
		
		try {
			//注册驱动
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_tel_" + TEL, "root", "13398182161");
			
			stmt = conn.createStatement();
			
			//查询用户密码是否匹配
			String sql = "select * from "+ ListNumber +"";
			
			rs = stmt.executeQuery(sql);
			
			//5.处理查询结果集
			while(rs.next()) {
				s1 += rs.getString(1) + "\n";
				s2 += rs.getString(2) + "\n";
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		l1.setText(s1);
		this.setTopAnchor(l1, 80.0);
		this.setLeftAnchor(l1, 10.0);
		l2.setText(s2);
		this.setTopAnchor(l2, 80.0);
		this.setRightAnchor(l2, 10.0);
		this.setBottomAnchor(l3, 20.0);
		this.setRightAnchor(l3, 10.0);
				
		
		this.setBackground(new Background(new BackgroundFill(Paint.valueOf("#8B8970"), new CornerRadii(0), new Insets(0))));
		this.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, new CornerRadii(0), new BorderWidths(2))));
		
		this.setPrefHeight(550);
		this.setPrefWidth(320);
	}

}
