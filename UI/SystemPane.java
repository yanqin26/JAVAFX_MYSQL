package UI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Backend.*;
import Foods.Food;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Effect;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.util.Duration;

public class SystemPane extends BackgroundPane{
	
	String name = "";
	String password = "";
	
	OrderPane op = new OrderPane();
	TrolleyPane tp = new TrolleyPane();
	ListPane lp = new ListPane();
	ExitPane ep  = new ExitPane();
	
	Food[] food = op.food;
	
	InformationPane[] imp = op.imp;
	
	String TEL1;
	String listNumber1;
	String TEL2;
	String listNumber2;
	String TEL3;
	String listNumber3;
	String TEL4;
	String listNumber4;
	String TEL5;
	String listNumber5;
	
	TrolleyFoodPane[] tfp = new TrolleyFoodPane[33];
	TrolleyFoodPane tfp1 = new TrolleyFoodPane(food[1]);
	TrolleyFoodPane tfp2 = new TrolleyFoodPane(food[2]);
	TrolleyFoodPane tfp3 = new TrolleyFoodPane(food[3]);
	TrolleyFoodPane tfp4 = new TrolleyFoodPane(food[4]);
	TrolleyFoodPane tfp5 = new TrolleyFoodPane(food[5]);
	TrolleyFoodPane tfp6 = new TrolleyFoodPane(food[6]);
	TrolleyFoodPane tfp7 = new TrolleyFoodPane(food[7]);
	TrolleyFoodPane tfp8 = new TrolleyFoodPane(food[8]);
	TrolleyFoodPane tfp9 = new TrolleyFoodPane(food[9]);
	TrolleyFoodPane tfp10 = new TrolleyFoodPane(food[10]);
	TrolleyFoodPane tfp11 = new TrolleyFoodPane(food[11]);
	TrolleyFoodPane tfp12 = new TrolleyFoodPane(food[12]);
	TrolleyFoodPane tfp13 = new TrolleyFoodPane(food[13]);
	TrolleyFoodPane tfp14 = new TrolleyFoodPane(food[14]);
	TrolleyFoodPane tfp15 = new TrolleyFoodPane(food[15]);
	TrolleyFoodPane tfp16 = new TrolleyFoodPane(food[16]);
	TrolleyFoodPane tfp17 = new TrolleyFoodPane(food[17]);
	TrolleyFoodPane tfp18 = new TrolleyFoodPane(food[18]);
	TrolleyFoodPane tfp19 = new TrolleyFoodPane(food[19]);
	TrolleyFoodPane tfp20 = new TrolleyFoodPane(food[20]);
	TrolleyFoodPane tfp21 = new TrolleyFoodPane(food[21]);
	TrolleyFoodPane tfp22 = new TrolleyFoodPane(food[22]);
	TrolleyFoodPane tfp23 = new TrolleyFoodPane(food[23]);
	TrolleyFoodPane tfp24 = new TrolleyFoodPane(food[24]);
	TrolleyFoodPane tfp25 = new TrolleyFoodPane(food[25]);
	TrolleyFoodPane tfp26 = new TrolleyFoodPane(food[26]);
	TrolleyFoodPane tfp27 = new TrolleyFoodPane(food[27]);
	TrolleyFoodPane tfp28 = new TrolleyFoodPane(food[28]);
	TrolleyFoodPane tfp29 = new TrolleyFoodPane(food[29]);
	TrolleyFoodPane tfp30 = new TrolleyFoodPane(food[30]);
	TrolleyFoodPane tfp31 = new TrolleyFoodPane(food[31]);
	TrolleyFoodPane tfp32 = new TrolleyFoodPane(food[32]);
	
	boolean Clicked = false;
	
	public SystemPane() {
		
		
		tfp[1] = tfp1;
		tfp[2] = tfp2;
		tfp[3] = tfp3;
		tfp[4] = tfp4;
		tfp[5] = tfp5;
		tfp[6] = tfp6;
		tfp[7] = tfp7;
		tfp[8] = tfp8;
		tfp[9] = tfp9;
		tfp[10] = tfp10;
		tfp[11] = tfp11;
		tfp[12] = tfp12;
		tfp[13] = tfp13;
		tfp[14] = tfp14;
		tfp[15] = tfp15;
		tfp[16] = tfp16;
		tfp[17] = tfp17;
		tfp[18] = tfp18;
		tfp[19] = tfp19;
		tfp[20] = tfp20;
		tfp[21] = tfp21;
		tfp[22] = tfp22;
		tfp[23] = tfp23;
		tfp[24] = tfp24;
		tfp[25] = tfp25;
		tfp[26] = tfp26;
		tfp[27] = tfp27;
		tfp[28] = tfp28;
		tfp[29] = tfp29;
		tfp[30] = tfp30;
		tfp[31] = tfp31;
		tfp[32] = tfp32;
		
		
		op.tp = this.tp;
		op.tfp = this.tfp;
		
		int pd = 240;
		
		Rectangle rec1 = new Rectangle(1396,2);
		Rectangle rec2 = new Rectangle(10,50);
		Rectangle rec3 = new Rectangle(3,50);
		Rectangle rec4 = new Rectangle(1396,2);
		
		Rectangle recOrder = new Rectangle(160,50);
		recOrder.setFill(Color.valueOf("#36363660"));
		Rectangle recTrolley = new Rectangle(160,50);
		recTrolley.setFill(Color.valueOf("#36363660"));
		Rectangle recList = new Rectangle(160,50);
		recList.setFill(Color.valueOf("#36363660"));
		Rectangle recExit = new Rectangle(160,50);
		recExit.setFill(Color.valueOf("#36363660"));
		
		Rectangle rec9 = new Rectangle(6,50);
		Rectangle rec10 = new Rectangle(6,50);
		Rectangle rec11 = new Rectangle(6,50);
		Rectangle rec12 = new Rectangle(6,50);
		
		Rectangle rec13 = new Rectangle(30,30);
		Rectangle rec14 = new Rectangle(30,30);
		Rectangle rec15 = new Rectangle(30,30);
		Rectangle rec16 = new Rectangle(30,30);
		
		Label l1 = new Label("點餐");
		l1.setFont(Font.font(27));
		Label l2 = new Label("訂單");
		l2.setFont(Font.font(27));
		Label l3 = new Label("購物車");
		l3.setFont(Font.font(27));
		Label l4 = new Label("離開");
		l4.setFont(Font.font(27));
		
		Label l5 = new Label("@2022 血圧が高い");
		l5.setFont(Font.font(17));
		Label l6 = new Label("かぶしきがいしゃ");
		l6.setFont(Font.font(17));
		l6.setTextFill(Color.WHITE);
		l6.setEffect(geteffect());
		Line line1 = new Line(1193,14 , 1193,90);
		line1.setStrokeWidth(2);
		Line line2 = new Line(1361.5,14 , 1361.5,90);
		line2.setStrokeWidth(2);
		Line line3 = new Line(1193,14 , 1361.5,14);
		line3.setStrokeWidth(2);
		Line line4 = new Line(1193,90 , 1361.5,90);
		line4.setStrokeWidth(2);
		Rectangle rec17 = new Rectangle(150,20);
		Label l7 = new Label("All Rights Reserved");
		l7.setFont(Font.font(15));
		
		
		this.getChildren().addAll(rec1,rec2,rec3,rec4);
		this.getChildren().addAll(recOrder,recTrolley,recList,recExit);
		this.getChildren().addAll(rec9,rec10,rec11,rec12);
		this.getChildren().addAll(rec13,rec14,rec15,rec16);
		this.getChildren().addAll(l1,l2,l3,l4);
		this.getChildren().addAll(line1,rec17,line2,line3,line4);
		this.getChildren().addAll(l5,l6,l7);
		
		this.setTopAnchor(rec1, 100.0);
		this.setLeftAnchor(rec1, 0.0);
		this.setTopAnchor(rec2, 27.0);
		this.setLeftAnchor(rec2, 30.0);
		this.setTopAnchor(rec3, 27.0);
		this.setLeftAnchor(rec3, 43.0);
		this.setTopAnchor(rec4, 830.0);
		this.setLeftAnchor(rec4, 0.0);
		
		this.setTopAnchor(super.label, 847.0);
		this.setLeftAnchor(super.label, 48.0);
		this.setTopAnchor(super.rec, 850.8);
		this.setLeftAnchor(super.rec, 20.0);
		
		this.setTopAnchor(recOrder, 27.0);
		this.setLeftAnchor(recOrder, 100.0);
		this.setTopAnchor(rec9, 27.0);
		this.setLeftAnchor(rec9, 100.0);
		this.setTopAnchor(rec13, 37.5);
		this.setLeftAnchor(rec13, 112.0);
		this.setTopAnchor(l1, 34.0);
		this.setLeftAnchor(l1, 160.0);
		
		this.setTopAnchor(recTrolley, 27.0);
		this.setLeftAnchor(recTrolley, 100.0 + pd);
		this.setTopAnchor(rec10, 27.0);
		this.setLeftAnchor(rec10, 100.0 + pd);
		this.setTopAnchor(rec14, 37.5);
		this.setLeftAnchor(rec14, 112.0 + pd);
		this.setTopAnchor(l2, 34.0);
		this.setLeftAnchor(l2, 160.0 + pd);
		
		this.setTopAnchor(recList, 27.0);
		this.setLeftAnchor(recList, 100.0 + 2*pd);
		this.setTopAnchor(rec11, 27.0);
		this.setLeftAnchor(rec11, 100.0 + 2*pd);
		this.setTopAnchor(rec15, 37.5);
		this.setLeftAnchor(rec15, 112.0 + 2*pd);
		this.setTopAnchor(l3, 34.0);
		this.setLeftAnchor(l3, 160.0 + 2*pd);
		
		this.setTopAnchor(recExit, 27.0);
		this.setLeftAnchor(recExit, 100.0 + 3*pd);
		this.setTopAnchor(rec12, 27.0);
		this.setLeftAnchor(rec12, 100.0 + 3*pd);
		this.setTopAnchor(rec16, 37.5);
		this.setLeftAnchor(rec16, 112.0 + 3*pd);
		this.setTopAnchor(l4, 34.0);
		this.setLeftAnchor(l4, 160.0 + 3*pd);
		
		this.setTopAnchor(l5, 14.0);
		this.setLeftAnchor(l5, 1200.0);
		this.setTopAnchor(l6, 40.0);
		this.setLeftAnchor(l6, 1209.0);
		this.setTopAnchor(rec17, 42.0);
		this.setLeftAnchor(rec17, 1200.0);
		this.setTopAnchor(l7, 65.0);
		this.setLeftAnchor(l7, 1207.0);
		
		recOrder.setOnMouseEntered(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.HAND);
				
				recTrolley.setFill(Color.valueOf("#36363660"));
				rec10.setFill(Color.BLACK);
				rec14.setFill(Color.BLACK);
				l2.setTextFill(Color.BLACK);
				
				recList.setFill(Color.valueOf("#36363660"));
				rec11.setFill(Color.BLACK);
				rec15.setFill(Color.BLACK);
				l3.setTextFill(Color.BLACK);
				
				recExit.setFill(Color.valueOf("#36363660"));
				rec12.setFill(Color.BLACK);
				rec16.setFill(Color.BLACK);
				l4.setTextFill(Color.BLACK);
				
				recOrder.setFill(Color.BLACK);
				rec9.setFill(Color.WHITE);
				rec13.setFill(Color.WHITE);
				l1.setTextFill(Color.WHITE);
				
				
		
			}
		});
		
		
		
		recTrolley.setOnMouseEntered(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.HAND);
				
				recOrder.setFill(Color.valueOf("#36363660"));
				rec9.setFill(Color.BLACK);
				rec13.setFill(Color.BLACK);
				l1.setTextFill(Color.BLACK);
				
				recList.setFill(Color.valueOf("#36363660"));
				rec11.setFill(Color.BLACK);
				rec15.setFill(Color.BLACK);
				l3.setTextFill(Color.BLACK);
				
				recExit.setFill(Color.valueOf("#36363660"));
				rec12.setFill(Color.BLACK);
				rec16.setFill(Color.BLACK);
				l4.setTextFill(Color.BLACK);
				
				recTrolley.setFill(Color.BLACK);
				rec10.setFill(Color.WHITE);
				rec14.setFill(Color.WHITE);
				l2.setTextFill(Color.WHITE);
				
			}
		});
		
		recList.setOnMouseEntered(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.HAND);
				
				recTrolley.setFill(Color.valueOf("#36363660"));
				rec10.setFill(Color.BLACK);
				rec14.setFill(Color.BLACK);
				l2.setTextFill(Color.BLACK);
				
				recOrder.setFill(Color.valueOf("#36363660"));
				rec9.setFill(Color.BLACK);
				rec13.setFill(Color.BLACK);
				l1.setTextFill(Color.BLACK);
				
				recExit.setFill(Color.valueOf("#36363660"));
				rec12.setFill(Color.BLACK);
				rec16.setFill(Color.BLACK);
				l4.setTextFill(Color.BLACK);
				
				recList.setFill(Color.BLACK);
				rec11.setFill(Color.WHITE);
				rec15.setFill(Color.WHITE);
				l3.setTextFill(Color.WHITE);
				
			}
		});
		
		recExit.setOnMouseEntered(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.HAND);
				
				recTrolley.setFill(Color.valueOf("#36363660"));
				rec10.setFill(Color.BLACK);
				rec14.setFill(Color.BLACK);
				l2.setTextFill(Color.BLACK);
				
				recList.setFill(Color.valueOf("#36363660"));
				rec11.setFill(Color.BLACK);
				rec15.setFill(Color.BLACK);
				l3.setTextFill(Color.BLACK);
				
				recOrder.setFill(Color.valueOf("#36363660"));
				rec9.setFill(Color.BLACK);
				rec13.setFill(Color.BLACK);
				l1.setTextFill(Color.BLACK);
				
				recExit.setFill(Color.BLACK);
				rec12.setFill(Color.WHITE);
				rec16.setFill(Color.WHITE);
				l4.setTextFill(Color.WHITE);
				
			}
		});
		

		
		
		recOrder.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
				
				tp.vbox.getChildren().removeAll();
				KeyValue kv1 = new KeyValue(recOrder.fillProperty(), Color.BLACK);
				KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1);
				
				KeyValue kv2 = new KeyValue(recOrder.fillProperty(), Color.WHITE);
				KeyFrame kf2 = new KeyFrame(Duration.seconds(0.07), kv2);
				
				Timeline timeline1 = new Timeline(90);
				timeline1.getKeyFrames().addAll(kf1,kf2);
				timeline1.setDelay(Duration.seconds(0));
				timeline1.setCycleCount(4);
				timeline1.setAutoReverse(true);
				timeline1.play();
				
				SystemPane.this.getChildren().remove(op);
				SystemPane.this.getChildren().remove(tp);
				SystemPane.this.getChildren().remove(lp);
				SystemPane.this.getChildren().remove(ep);
				
				SystemPane.this.getChildren().add(op);
				SystemPane.this.setTopAnchor(op, 102.0);
				SystemPane.this.setLeftAnchor(op, 0.0);
				
				
				op.name = SystemPane.this.name;
				tp.name = SystemPane.this.name;
				lp.name = SystemPane.this.name;
				op.password = SystemPane.this.password;
				tp.password = SystemPane.this.password;
				lp.password = SystemPane.this.password;
			
				
				op.rec18.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						op.getChildren().remove(op.cp);
						op.getChildren().remove(op.stp);
						op.getChildren().remove(op.sop);
						op.getChildren().remove(op.dp);
						op.getChildren().remove(op.ep);
						
						Clicked = true;
						
						KeyValue kv1 = new KeyValue(op.rec18.fillProperty(), Color.BLACK);
						KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1);
						
						KeyValue kv2 = new KeyValue(op.rec18.fillProperty(), Color.WHITE);
						KeyFrame kf2 = new KeyFrame(Duration.seconds(0.05), kv2);
						
						Timeline timeline1 = new Timeline(90);
						timeline1.getKeyFrames().addAll(kf1,kf2);
						timeline1.setDelay(Duration.seconds(0));
						timeline1.setCycleCount(4);
						timeline1.setAutoReverse(true);
						timeline1.play();
						
						String TEL = Odering_Utils.getTEL(name);
						String listNumber = Odering_Utils.odering(TEL, food);
						SumPane sump = new SumPane(listNumber,TEL,op.name);
						
						for(int i = 1 ; i <= 32 ; i++) {	
							tp.vbox.getChildren().clear();
						}
						op.timeline.play();
						op.setTopAnchor(sump, 100.0);
						op.setLeftAnchor(sump, 800.0);
						
						op.timeline.setOnFinished(new EventHandler<ActionEvent>() {

							@Override
							public void handle(ActionEvent arg0) {
								// TODO Auto-generated method stub
								op.getChildren().add(sump);
							}
						});
						
					}
				});
				

			}
		});
		
		TEL1 = Odering_Utils.getTEL(name);
		listNumber1 = lp.s[0];
		TEL2 = Odering_Utils.getTEL(name);
		listNumber2 = lp.s[1];
		TEL3 = Odering_Utils.getTEL(name);
		listNumber3 = lp.s[2];
		TEL4 = Odering_Utils.getTEL(name);
		listNumber4 = lp.s[3];
		TEL5 = Odering_Utils.getTEL(name);
		listNumber5 = lp.s[4];
		
		if(!listNumber1.equals("")) {
		lp.sump1 = new SumPane(listNumber1,TEL1,name);
		}
		if(!listNumber2.equals("")) {
		lp.sump2 = new SumPane(listNumber2,TEL2,name);
		}
		if(!listNumber3.equals("")) {
		lp.sump3 = new SumPane(listNumber3,TEL3,name);
		}
		if(!listNumber4.equals("")) {
		lp.sump4 = new SumPane(listNumber4,TEL4,name);
		}
		if(!listNumber5.equals("")) {
		lp.sump5 = new SumPane(listNumber5,TEL5,name);
		}
		
		recTrolley.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
				op.getChildren().remove(op.rec23);
				op.getChildren().remove(op.rec24);
				
				
				for(int i = 1 ; i <= 32 ; i++) {
					op.getChildren().remove(op.imp[i]);
				}
				
				KeyValue kv1 = new KeyValue(recTrolley.fillProperty(), Color.BLACK);
				KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1);
				
				KeyValue kv2 = new KeyValue(recTrolley.fillProperty(), Color.WHITE);
				KeyFrame kf2 = new KeyFrame(Duration.seconds(0.07), kv2);
				
				Timeline timeline1 = new Timeline(90);
				timeline1.getKeyFrames().addAll(kf1,kf2);
				timeline1.setDelay(Duration.seconds(0));
				timeline1.setCycleCount(4);
				timeline1.setAutoReverse(true);
				timeline1.play();
				
				SystemPane.this.getChildren().remove(op);
				SystemPane.this.getChildren().remove(tp);
				SystemPane.this.getChildren().remove(lp);
				SystemPane.this.getChildren().remove(ep);
				
				SystemPane.this.getChildren().add(lp);
				SystemPane.this.setTopAnchor(lp, 102.0);
				SystemPane.this.setLeftAnchor(lp, 0.0);
				
				op.name = SystemPane.this.name;
				tp.name = SystemPane.this.name;
				lp.name = SystemPane.this.name;
				op.password = SystemPane.this.password;
				tp.password = SystemPane.this.password;
				lp.password = SystemPane.this.password;
				
				Connection conn = null;
				Statement stmt = null;
				ResultSet rs = null;	
				
				String TEL = Odering_Utils.getTEL(name);
				
				int count = 0;
				
				try {
					//注册驱动
					Class.forName("com.mysql.jdbc.Driver");
					
					conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_tel_" + TEL, "root", "13398182161");
					
					stmt = conn.createStatement();
					
					//查询所有历史记录
					String sql = "show tables";
					
					rs = stmt.executeQuery(sql);
					
					//5.处理查询结果集
					while(rs.next() && count < 5) {
						lp.s[count] = rs.getString(1);
						count++;
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
				
				
				TEL1 = Odering_Utils.getTEL(name);
				listNumber1 = lp.s[0];
				TEL2 = Odering_Utils.getTEL(name);
				listNumber2 = lp.s[1];
				TEL3 = Odering_Utils.getTEL(name);
				listNumber3 = lp.s[2];
				TEL4 = Odering_Utils.getTEL(name);
				listNumber4 = lp.s[3];
				TEL5 = Odering_Utils.getTEL(name);
				listNumber5 = lp.s[4];
				
				
				if(!listNumber1.equals("")) {
				lp.sump1 = new SumPane(listNumber1,TEL1,name);
				}
				if(!listNumber2.equals("")) {
				lp.sump2 = new SumPane(listNumber2,TEL2,name);
				}
				if(!listNumber3.equals("")) {
				lp.sump3 = new SumPane(listNumber3,TEL3,name);
				}
				if(!listNumber4.equals("")) {
				lp.sump4 = new SumPane(listNumber4,TEL4,name);
				}
				if(!listNumber5.equals("")) {
				lp.sump5 = new SumPane(listNumber5,TEL5,name);
				}
				
				if(!listNumber1.equals("")) {
				lp.label1.setText("點餐時間 " + lp.s[0].substring(2, lp.s[0].length()));
				}
				if(!listNumber2.equals("")) {
				lp.label2.setText("點餐時間 " + lp.s[1].substring(2, lp.s[1].length()));
				}
				if(!listNumber3.equals("")) {
				lp.label3.setText("點餐時間 " + lp.s[2].substring(2, lp.s[2].length()));
				}
				if(!listNumber4.equals("")) {
				lp.label4.setText("點餐時間 " + lp.s[3].substring(2, lp.s[3].length()));
				}
				if(!listNumber5.equals("")) {
				lp.label5.setText("點餐時間 " + lp.s[4].substring(2, lp.s[4].length()));
				}
				
				
				if(lp.label1.getText() != "您還未點過餐") {
					lp.rec3.setOnMouseEntered(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						setCursor(Cursor.HAND);
						lp.label1.setTextFill(Color.valueOf("#696969"));
						lp.label2.setTextFill(Color.valueOf("#696969"));
						lp.label3.setTextFill(Color.valueOf("#696969"));
						lp.label4.setTextFill(Color.valueOf("#696969"));
						lp.label5.setTextFill(Color.valueOf("#696969"));
						
						lp.getChildren().remove(lp.c1);
						lp.getChildren().add(lp.c1);
						
						lp.setTopAnchor(lp.c1, 288.0 + 11);
						lp.setLeftAnchor(lp.c1, 70.0 + 5);
						
						lp.label1.setTextFill(Color.BLACK);
						
					}
				});
				}
				
				if(lp.label2.getText() != "") {
					lp.rec4.setOnMouseEntered(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						setCursor(Cursor.HAND);
						lp.label1.setTextFill(Color.valueOf("#696969"));
						lp.label2.setTextFill(Color.valueOf("#696969"));
						lp.label3.setTextFill(Color.valueOf("#696969"));
						lp.label4.setTextFill(Color.valueOf("#696969"));
						lp.label5.setTextFill(Color.valueOf("#696969"));
						
						lp.setTopAnchor(lp.c1, 338.0 + 11);
						lp.setLeftAnchor(lp.c1, 70.0 + 5);
						
						lp.label2.setTextFill(Color.BLACK);
					}
				});
				}
				
				if(lp.label3.getText() != "") {
					lp.rec5.setOnMouseEntered(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						setCursor(Cursor.HAND);
						lp.label1.setTextFill(Color.valueOf("#696969"));
						lp.label2.setTextFill(Color.valueOf("#696969"));
						lp.label3.setTextFill(Color.valueOf("#696969"));
						lp.label4.setTextFill(Color.valueOf("#696969"));
						lp.label5.setTextFill(Color.valueOf("#696969"));
						
						lp.getChildren().remove(lp.c1);
						lp.getChildren().add(lp.c1);
						
						lp.setTopAnchor(lp.c1, 388.0 + 11);
						lp.setLeftAnchor(lp.c1, 70.0 + 5);
						
						lp.label3.setTextFill(Color.BLACK);
					}
				});
				}
				
				if(lp.label4.getText() != "") {
					lp.rec6.setOnMouseEntered(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						setCursor(Cursor.HAND);
						lp.label1.setTextFill(Color.valueOf("#696969"));
						lp.label2.setTextFill(Color.valueOf("#696969"));
						lp.label3.setTextFill(Color.valueOf("#696969"));
						lp.label4.setTextFill(Color.valueOf("#696969"));
						lp.label5.setTextFill(Color.valueOf("#696969"));
						
						lp.getChildren().remove(lp.c1);
						lp.getChildren().add(lp.c1);
						
						lp.setTopAnchor(lp.c1, 438.0 + 11);
						lp.setLeftAnchor(lp.c1, 70.0 + 5);
						
						lp.label4.setTextFill(Color.BLACK);
					}
				});
				}
				
				
				if(lp.label5.getText() != "") {
					lp.rec7.setOnMouseEntered(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						setCursor(Cursor.HAND);
						lp.label1.setTextFill(Color.valueOf("#696969"));
						lp.label2.setTextFill(Color.valueOf("#696969"));
						lp.label3.setTextFill(Color.valueOf("#696969"));
						lp.label4.setTextFill(Color.valueOf("#696969"));
						lp.label5.setTextFill(Color.valueOf("#696969"));
						
						lp.getChildren().remove(lp.c1);
						lp.getChildren().add(lp.c1);
						
						lp.setTopAnchor(lp.c1, 488.0 + 11);
						lp.setLeftAnchor(lp.c1, 70.0 + 5);
						
						lp.label5.setTextFill(Color.BLACK);
					}
				});
				}
				
				
				if(lp.label1.getText() != "您還未點過餐") {
					lp.label1.setOnMouseEntered(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						setCursor(Cursor.HAND);
						lp.label1.setTextFill(Color.valueOf("#696969"));
						lp.label2.setTextFill(Color.valueOf("#696969"));
						lp.label3.setTextFill(Color.valueOf("#696969"));
						lp.label4.setTextFill(Color.valueOf("#696969"));
						lp.label5.setTextFill(Color.valueOf("#696969"));
						
						lp.getChildren().remove(lp.c1);
						lp.getChildren().add(lp.c1);
						
						lp.setTopAnchor(lp.c1, 288.0 + 11);
						lp.setLeftAnchor(lp.c1, 70.0 + 5);
						
						lp.label1.setTextFill(Color.BLACK);
					}
				});
				}
				
				
				if(lp.label2.getText() != "") {
					lp.label2.setOnMouseEntered(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						setCursor(Cursor.HAND);
						lp.label1.setTextFill(Color.valueOf("#696969"));
						lp.label2.setTextFill(Color.valueOf("#696969"));
						lp.label3.setTextFill(Color.valueOf("#696969"));
						lp.label4.setTextFill(Color.valueOf("#696969"));
						lp.label5.setTextFill(Color.valueOf("#696969"));
						
						lp.getChildren().remove(lp.c1);
						lp.getChildren().add(lp.c1);
						
						lp.setTopAnchor(lp.c1, 338.0 + 11);
						lp.setLeftAnchor(lp.c1, 70.0 + 5);
						
						lp.label2.setTextFill(Color.BLACK);
					}
				});
				}
				
				if(lp.label3.getText() != "") {
					lp.label3.setOnMouseEntered(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						setCursor(Cursor.HAND);
						lp.label1.setTextFill(Color.valueOf("#696969"));
						lp.label2.setTextFill(Color.valueOf("#696969"));
						lp.label3.setTextFill(Color.valueOf("#696969"));
						lp.label4.setTextFill(Color.valueOf("#696969"));
						lp.label5.setTextFill(Color.valueOf("#696969"));
						
						lp.getChildren().remove(lp.c1);
						lp.getChildren().add(lp.c1);
						
						lp.setTopAnchor(lp.c1, 388.0 + 11);
						lp.setLeftAnchor(lp.c1, 70.0 + 5);
						
						lp.label3.setTextFill(Color.BLACK);
					}
				});
				}
				
				
				if(lp.label4.getText() != "") {
					lp.label4.setOnMouseEntered(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						setCursor(Cursor.HAND);
						lp.label1.setTextFill(Color.valueOf("#696969"));
						lp.label2.setTextFill(Color.valueOf("#696969"));
						lp.label3.setTextFill(Color.valueOf("#696969"));
						lp.label4.setTextFill(Color.valueOf("#696969"));
						lp.label5.setTextFill(Color.valueOf("#696969"));
						
						lp.getChildren().remove(lp.c1);
						lp.getChildren().add(lp.c1);
						
						lp.setTopAnchor(lp.c1, 438.0 + 11);
						lp.setLeftAnchor(lp.c1, 70.0 + 5);
						
						lp.label4.setTextFill(Color.BLACK);
					}
				});
				}
				
				
				if(lp.label5.getText() != "") {
					lp.label5.setOnMouseEntered(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						setCursor(Cursor.HAND);
						lp.label1.setTextFill(Color.valueOf("#696969"));
						lp.label2.setTextFill(Color.valueOf("#696969"));
						lp.label3.setTextFill(Color.valueOf("#696969"));
						lp.label4.setTextFill(Color.valueOf("#696969"));
						lp.label5.setTextFill(Color.valueOf("#696969"));
						
						lp.getChildren().remove(lp.c1);
						lp.getChildren().add(lp.c1);
						
						lp.setTopAnchor(lp.c1, 488.0 + 11);
						lp.setLeftAnchor(lp.c1, 70.0 + 5);
						
						lp.label5.setTextFill(Color.BLACK);
					}
				});
				}
				
				lp.rec3.setOnMouseExited(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						setCursor(Cursor.DEFAULT);
					}
				});
				
				lp.rec4.setOnMouseExited(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						setCursor(Cursor.DEFAULT);
					}
				});
				
				lp.rec5.setOnMouseExited(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						setCursor(Cursor.DEFAULT);
					}
				});
				
				lp.rec6.setOnMouseExited(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						setCursor(Cursor.DEFAULT);
					}
				});
				
				lp.rec7.setOnMouseExited(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						setCursor(Cursor.DEFAULT);
					}
				});
				
			}
		});
		

		
		recList.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				op.getChildren().remove(op.rec23);
				op.getChildren().remove(op.rec24);
				
				for(int i = 1 ; i <= 32 ; i++) {
					op.getChildren().remove(op.imp[i]);
				}
				
				tfp1.l1.setText(food[1].getName());
				tfp1.l3.setText(food[1].getNumber() + "");
				tfp2.l1.setText(food[2].getName());
				tfp2.l3.setText(food[2].getNumber() + "");
				tfp3.l1.setText(food[3].getName());
				tfp3.l3.setText(food[3].getNumber() + "");
				tfp4.l1.setText(food[4].getName());
				tfp4.l3.setText(food[4].getNumber() + "");
				tfp5.l1.setText(food[5].getName());
				tfp5.l3.setText(food[5].getNumber() + "");
				tfp6.l1.setText(food[6].getName());
				tfp6.l3.setText(food[6].getNumber() + "");
				tfp7.l1.setText(food[7].getName());
				tfp7.l3.setText(food[7].getNumber() + "");
				tfp8.l1.setText(food[8].getName());
				tfp8.l3.setText(food[8].getNumber() + "");
				tfp9.l1.setText(food[9].getName());
				tfp9.l3.setText(food[9].getNumber() + "");
				tfp10.l1.setText(food[10].getName());
				tfp10.l3.setText(food[10].getNumber() + "");
				tfp11.l1.setText(food[11].getName());
				tfp11.l3.setText(food[11].getNumber() + "");
				tfp12.l1.setText(food[12].getName());
				tfp12.l3.setText(food[12].getNumber() + "");
				tfp13.l1.setText(food[13].getName());
				tfp13.l3.setText(food[13].getNumber() + "");
				tfp14.l1.setText(food[14].getName());
				tfp14.l3.setText(food[14].getNumber() + "");
				tfp15.l1.setText(food[15].getName());
				tfp15.l3.setText(food[15].getNumber() + "");
				tfp16.l1.setText(food[16].getName());
				tfp16.l3.setText(food[16].getNumber() + "");
				tfp17.l1.setText(food[17].getName());
				tfp17.l3.setText(food[17].getNumber() + "");
				tfp18.l1.setText(food[18].getName());
				tfp18.l3.setText(food[18].getNumber() + "");
				tfp19.l1.setText(food[19].getName());
				tfp19.l3.setText(food[19].getNumber() + "");
				tfp20.l1.setText(food[20].getName());
				tfp20.l3.setText(food[20].getNumber() + "");
				tfp21.l1.setText(food[21].getName());
				tfp21.l3.setText(food[21].getNumber() + "");
				tfp22.l1.setText(food[22].getName());
				tfp22.l3.setText(food[22].getNumber() + "");
				tfp23.l1.setText(food[23].getName());
				tfp23.l3.setText(food[23].getNumber() + "");
				tfp24.l1.setText(food[24].getName());
				tfp24.l3.setText(food[24].getNumber() + "");
				tfp25.l1.setText(food[25].getName());
				tfp25.l3.setText(food[25].getNumber() + "");
				tfp26.l1.setText(food[26].getName());
				tfp26.l3.setText(food[26].getNumber() + "");
				tfp27.l1.setText(food[27].getName());
				tfp27.l3.setText(food[27].getNumber() + "");
				tfp28.l1.setText(food[28].getName());
				tfp28.l3.setText(food[28].getNumber() + "");
				tfp29.l1.setText(food[29].getName());
				tfp29.l3.setText(food[29].getNumber() + "");
				tfp30.l1.setText(food[30].getName());
				tfp30.l3.setText(food[30].getNumber() + "");
				tfp31.l1.setText(food[31].getName());
				tfp31.l3.setText(food[31].getNumber() + "");
				tfp32.l1.setText(food[32].getName());
				tfp32.l3.setText(food[32].getNumber() + "");
				
				op.tfp = tfp;
				
				KeyValue kv1 = new KeyValue(recList.fillProperty(), Color.BLACK);
				KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1);
				
				KeyValue kv2 = new KeyValue(recList.fillProperty(), Color.WHITE);
				KeyFrame kf2 = new KeyFrame(Duration.seconds(0.07), kv2);
				
				Timeline timeline1 = new Timeline(90);
				timeline1.getKeyFrames().addAll(kf1,kf2);
				timeline1.setDelay(Duration.seconds(0));
				timeline1.setCycleCount(4);
				timeline1.setAutoReverse(true);
				timeline1.play();
				
				SystemPane.this.getChildren().remove(op);
				SystemPane.this.getChildren().remove(tp);
				SystemPane.this.getChildren().remove(lp);
				SystemPane.this.getChildren().remove(ep);
				
				SystemPane.this.getChildren().add(tp);
				SystemPane.this.setTopAnchor(tp, 102.0);
				SystemPane.this.setLeftAnchor(tp, 0.0);
				
				op.name = SystemPane.this.name;
				tp.name = SystemPane.this.name;
				lp.name = SystemPane.this.name;
				op.password = SystemPane.this.password;
				tp.password = SystemPane.this.password;
				lp.password = SystemPane.this.password;
				
				
				if(!Clicked) {
				for(int i = 1 ; i <= 32 ; i++) {	
					tp.vbox.getChildren().remove(tfp[i]);
					if(food[i].getNumber() != 0) {
						tp.vbox.getChildren().add(tfp[i]);
					}
				}		
				}
				if(Clicked) {
					for(int i = 1 ; i <= 32 ; i++) {	
						if(food[i].getNumber() != 0) {
							tp.vbox.getChildren().remove(tfp[i]);
						}
					}
				}
				
				

			}
		});
		
		tfp1.recAdd.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp1.food.add();
				tfp1.l3.setText(tfp1.food.getNumber() + "");
			}
		});
		
		tfp1.recSub.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp1.food.subtract();
				if(tfp1.food.getNumber() != 0) {
				tfp1.l3.setText(tfp1.food.getNumber() + "");
				}
				else {
				tp.vbox.getChildren().remove(tfp1);
				}
			}
		});
		
		tfp2.recAdd.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp2.food.add();
				tfp2.l3.setText(tfp2.food.getNumber() + "");
			}
		});
		
		tfp2.recSub.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp2.food.subtract();
				if(tfp2.food.getNumber() != 0) {
				tfp2.l3.setText(tfp2.food.getNumber() + "");
				}
				else {
				tp.vbox.getChildren().remove(tfp2);
				}
			}
		});
		
		tfp3.recAdd.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp3.food.add();
				tfp3.l3.setText(tfp3.food.getNumber() + "");
			}
		});
		
		tfp3.recSub.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp3.food.subtract();
				if(tfp3.food.getNumber() != 0) {
				tfp3.l3.setText(tfp3.food.getNumber() + "");
				}
				else {
				tp.vbox.getChildren().remove(tfp3);
				}
			}
		});
		
		tfp4.recAdd.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp4.food.add();
				tfp4.l3.setText(tfp4.food.getNumber() + "");
			}
		});
		
		tfp4.recSub.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp4.food.subtract();
				if(tfp4.food.getNumber() != 0) {
				tfp4.l3.setText(tfp4.food.getNumber() + "");
				}
				else {
				tp.vbox.getChildren().remove(tfp4);
				}
			}
		});
		
		tfp5.recAdd.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp5.food.add();
				tfp5.l3.setText(tfp5.food.getNumber() + "");
			}
		});
		
		tfp5.recSub.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp5.food.subtract();
				if(tfp5.food.getNumber() != 0) {
				tfp5.l3.setText(tfp5.food.getNumber() + "");
				}
				else {
				tp.vbox.getChildren().remove(tfp5);
				}
			}
		});
		
		tfp6.recAdd.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp6.food.add();
				tfp6.l3.setText(tfp6.food.getNumber() + "");
			}
		});
		
		tfp6.recSub.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp6.food.subtract();
				if(tfp6.food.getNumber() != 0) {
				tfp6.l3.setText(tfp6.food.getNumber() + "");
				}
				else {
				tp.vbox.getChildren().remove(tfp6);
				}
			}
		});
		
		tfp7.recAdd.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp7.food.add();
				tfp7.l3.setText(tfp7.food.getNumber() + "");
			}
		});
		
		tfp7.recSub.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp7.food.subtract();
				if(tfp7.food.getNumber() != 0) {
				tfp7.l3.setText(tfp7.food.getNumber() + "");
				}
				else {
				tp.vbox.getChildren().remove(tfp7);
				}
			}
		});
		
		tfp8.recAdd.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp8.food.add();
				tfp8.l3.setText(tfp8.food.getNumber() + "");
			}
		});
		
		
		tfp8.recSub.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp8.food.subtract();
				if(tfp8.food.getNumber() != 0) {
				tfp8.l3.setText(tfp8.food.getNumber() + "");
				}
				else {
				tp.vbox.getChildren().remove(tfp8);
				}
			}
		});
		
		tfp9.recAdd.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp9.food.add();
				tfp9.l3.setText(tfp9.food.getNumber() + "");
			}
		});
		
		tfp9.recSub.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp9.food.subtract();
				if(tfp9.food.getNumber() != 0) {
				tfp9.l3.setText(tfp9.food.getNumber() + "");
				}
				else {
				tp.vbox.getChildren().remove(tfp9);
				}
			}
		});
		
		tfp10.recAdd.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp10.food.add();
				tfp10.l3.setText(tfp10.food.getNumber() + "");
			}
		});
		
		tfp10.recSub.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp10.food.subtract();
				if(tfp10.food.getNumber() != 0) {
				tfp10.l3.setText(tfp10.food.getNumber() + "");
				}
				else {
				tp.vbox.getChildren().remove(tfp10);
				}
			}
		});
		
		tfp11.recAdd.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp11.food.add();
				tfp11.l3.setText(tfp11.food.getNumber() + "");
			}
		});
		
		tfp11.recSub.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp11.food.subtract();
				if(tfp11.food.getNumber() != 0) {
				tfp11.l3.setText(tfp11.food.getNumber() + "");
				}
				else {
				tp.vbox.getChildren().remove(tfp11);
				}
			}
		});
		
		tfp12.recAdd.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp12.food.add();
				tfp12.l3.setText(tfp12.food.getNumber() + "");
			}
		});
		
		tfp12.recSub.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp12.food.subtract();
				if(tfp12.food.getNumber() != 0) {
				tfp12.l3.setText(tfp12.food.getNumber() + "");
				}
				else {
				tp.vbox.getChildren().remove(tfp12);
				}
			}
		});
		
		tfp13.recAdd.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp13.food.add();
				tfp13.l3.setText(tfp13.food.getNumber() + "");
			}
		});
		
		tfp13.recSub.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp13.food.subtract();
				if(tfp13.food.getNumber() != 0) {
				tfp13.l3.setText(tfp13.food.getNumber() + "");
				}
				else {
				tp.vbox.getChildren().remove(tfp13);
				}
			}
		});
		
		tfp14.recAdd.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp14.food.add();
				tfp14.l3.setText(tfp14.food.getNumber() + "");
			}
		});
		
		tfp14.recSub.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp14.food.subtract();
				if(tfp14.food.getNumber() != 0) {
				tfp14.l3.setText(tfp14.food.getNumber() + "");
				}
				else {
				tp.vbox.getChildren().remove(tfp14);
				}
			}
		});
		
		tfp15.recAdd.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp15.food.add();
				tfp15.l3.setText(tfp15.food.getNumber() + "");
			}
		});
		
		tfp15.recSub.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp15.food.subtract();
				if(tfp15.food.getNumber() != 0) {
				tfp15.l3.setText(tfp15.food.getNumber() + "");
				}
				else {
				tp.vbox.getChildren().remove(tfp15);
				}
			}
		});
		
		tfp16.recAdd.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp16.food.add();
				tfp16.l3.setText(tfp16.food.getNumber() + "");
			}
		});
		
		tfp16.recSub.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp16.food.subtract();
				if(tfp16.food.getNumber() != 0) {
				tfp16.l3.setText(tfp16.food.getNumber() + "");
				}
				else {
				tp.vbox.getChildren().remove(tfp16);
				}
			}
		});
		
		tfp17.recAdd.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp17.food.add();
				tfp17.l3.setText(tfp17.food.getNumber() + "");
			}
		});
		
		tfp17.recSub.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp17.food.subtract();
				if(tfp17.food.getNumber() != 0) {
				tfp17.l3.setText(tfp17.food.getNumber() + "");
				}
				else {
				tp.vbox.getChildren().remove(tfp17);
				}
			}
		});
		
		tfp18.recAdd.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp18.food.add();
				tfp18.l3.setText(tfp18.food.getNumber() + "");
			}
		});
		
		tfp18.recSub.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp18.food.subtract();
				if(tfp18.food.getNumber() != 0) {
				tfp18.l3.setText(tfp18.food.getNumber() + "");
				}
				else {
				tp.vbox.getChildren().remove(tfp18);
				}
			}
		});
		
		tfp19.recAdd.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp19.food.add();
				tfp19.l3.setText(tfp19.food.getNumber() + "");
			}
		});
		
		tfp19.recSub.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp19.food.subtract();
				if(tfp19.food.getNumber() != 0) {
				tfp19.l3.setText(tfp19.food.getNumber() + "");
				}
				else {
				tp.vbox.getChildren().remove(tfp19);
				}
			}
		});
		
		tfp20.recAdd.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp20.food.add();
				tfp20.l3.setText(tfp20.food.getNumber() + "");
			}
		});
		
		tfp20.recSub.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp20.food.subtract();
				if(tfp20.food.getNumber() != 0) {
				tfp20.l3.setText(tfp20.food.getNumber() + "");
				}
				else {
				tp.vbox.getChildren().remove(tfp20);
				}
			}
		});
		
		tfp21.recAdd.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp21.food.add();
				tfp21.l3.setText(tfp21.food.getNumber() + "");
			}
		});
		
		tfp21.recSub.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp21.food.subtract();
				if(tfp21.food.getNumber() != 0) {
				tfp21.l3.setText(tfp21.food.getNumber() + "");
				}
				else {
				tp.vbox.getChildren().remove(tfp21);
				}
			}
		});
		
		tfp22.recAdd.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp22.food.add();
				tfp22.l3.setText(tfp22.food.getNumber() + "");
			}
		});
		
		tfp22.recSub.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp22.food.subtract();
				if(tfp22.food.getNumber() != 0) {
				tfp22.l3.setText(tfp22.food.getNumber() + "");
				}
				else {
				tp.vbox.getChildren().remove(tfp22);
				}
			}
		});
		
		tfp23.recAdd.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp23.food.add();
				tfp23.l3.setText(tfp23.food.getNumber() + "");
			}
		});
		
		tfp23.recSub.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp23.food.subtract();
				if(tfp23.food.getNumber() != 0) {
				tfp23.l3.setText(tfp23.food.getNumber() + "");
				}
				else {
				tp.vbox.getChildren().remove(tfp23);
				}
			}
		});
		
		tfp24.recAdd.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp24.food.add();
				tfp24.l3.setText(tfp24.food.getNumber() + "");
			}
		});
		
		tfp24.recSub.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp24.food.subtract();
				if(tfp24.food.getNumber() != 0) {
				tfp24.l3.setText(tfp24.food.getNumber() + "");
				}
				else {
				tp.vbox.getChildren().remove(tfp24);
				}
			}
		});
		
		tfp25.recAdd.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp25.food.add();
				tfp25.l3.setText(tfp25.food.getNumber() + "");
			}
		});
		
		tfp25.recSub.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp25.food.subtract();
				if(tfp25.food.getNumber() != 0) {
				tfp25.l3.setText(tfp25.food.getNumber() + "");
				}
				else {
				tp.vbox.getChildren().remove(tfp25);
				}
			}
		});
		
		tfp26.recAdd.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp26.food.add();
				tfp26.l3.setText(tfp26.food.getNumber() + "");
			}
		});
		
		tfp26.recSub.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp26.food.subtract();
				if(tfp26.food.getNumber() != 0) {
				tfp26.l3.setText(tfp26.food.getNumber() + "");
				}
				else {
				tp.vbox.getChildren().remove(tfp26);
				}
			}
		});
		
		tfp27.recAdd.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp27.food.add();
				tfp27.l3.setText(tfp27.food.getNumber() + "");
			}
		});
		
		tfp27.recSub.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp27.food.subtract();
				if(tfp27.food.getNumber() != 0) {
				tfp27.l3.setText(tfp27.food.getNumber() + "");
				}
				else {
				tp.vbox.getChildren().remove(tfp27);
				}
			}
		});
		
		tfp28.recAdd.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp28.food.add();
				tfp28.l3.setText(tfp28.food.getNumber() + "");
			}
		});
		
		tfp28.recSub.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp28.food.subtract();
				if(tfp28.food.getNumber() != 0) {
				tfp28.l3.setText(tfp28.food.getNumber() + "");
				}
				else {
				tp.vbox.getChildren().remove(tfp28);
				}
			}
		});
		
		tfp29.recAdd.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp29.food.add();
				tfp29.l3.setText(tfp29.food.getNumber() + "");
			}
		});
		
		tfp29.recSub.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp29.food.subtract();
				if(tfp29.food.getNumber() != 0) {
				tfp29.l3.setText(tfp29.food.getNumber() + "");
				}
				else {
				tp.vbox.getChildren().remove(tfp29);
				}
			}
		});
		
		tfp30.recAdd.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp30.food.add();
				tfp30.l3.setText(tfp30.food.getNumber() + "");
			}
		});
		
		tfp30.recSub.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp30.food.subtract();
				if(tfp30.food.getNumber() != 0) {
				tfp30.l3.setText(tfp30.food.getNumber() + "");
				}
				else {
				tp.vbox.getChildren().remove(tfp30);
				}
			}
		});
		
		tfp31.recAdd.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp31.food.add();
				tfp31.l3.setText(tfp31.food.getNumber() + "");
			}
		});
		
		tfp31.recSub.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp31.food.subtract();
				if(tfp31.food.getNumber() != 0) {
				tfp31.l3.setText(tfp31.food.getNumber() + "");
				}
				else {
				tp.vbox.getChildren().remove(tfp31);
				}
			}
		});
		
		tfp32.recAdd.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp32.food.add();
				tfp32.l3.setText(tfp32.food.getNumber() + "");
			}
		});
		
		tfp32.recSub.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tfp32.food.subtract();
				if(tfp32.food.getNumber() != 0) {
				tfp32.l3.setText(tfp32.food.getNumber() + "");
				}
				else {
				tp.vbox.getChildren().remove(tfp32);
				}
			}
		});
		
		
		recExit.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				op.getChildren().remove(op.rec23);
				op.getChildren().remove(op.rec24);
				
				for(int i = 1 ; i <= 32 ; i++) {
					op.getChildren().remove(op.imp[i]);
				}
				
				KeyValue kv1 = new KeyValue(recExit.fillProperty(), Color.BLACK);
				KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1);
				
				KeyValue kv2 = new KeyValue(recExit.fillProperty(), Color.WHITE);
				KeyFrame kf2 = new KeyFrame(Duration.seconds(0.07), kv2);
				
				Timeline timeline1 = new Timeline(90);
				timeline1.getKeyFrames().addAll(kf1,kf2);
				timeline1.setDelay(Duration.seconds(0));
				timeline1.setCycleCount(4);
				timeline1.setAutoReverse(true);
				timeline1.play();
				
				SystemPane.this.getChildren().remove(op);
				SystemPane.this.getChildren().remove(tp);
				SystemPane.this.getChildren().remove(lp);
				SystemPane.this.getChildren().remove(ep);
				
				SystemPane.this.getChildren().add(ep);
				SystemPane.this.setTopAnchor(ep, 102.0);
				SystemPane.this.setLeftAnchor(ep, 0.0);
				
				
				tp.vbox.getChildren().removeAll();
			}
		});
		
		recOrder.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.DEFAULT);
			}
		});
		
		recTrolley.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.DEFAULT);
			}
		});
		
		recList.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.DEFAULT);
			}
		});
		
		recExit.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.DEFAULT);
			}
		});
		
		
		
	}
	
	public Effect geteffect() {
		DropShadow ds = new DropShadow();
		
		return ds;
	}

}
