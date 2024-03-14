package UI;
import Backend.SignUP;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Cursor;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Effect;
import javafx.scene.input.MouseEvent;
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
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.util.Duration;

public class SignUpPane extends AnchorPane{
	
	String name = "";
	String TEL = "";
	String p1 = "";
	String p2 = "";
	
	boolean nameN = false;
	boolean TELN = false;
	boolean p1N = false;
	boolean p2N = false;
	
	
	public SignUpPane() {
		
		Rectangle rec1 = new Rectangle(180,30);
		Rectangle rec2  =new Rectangle(17,17,Color.WHITE);
		Label l1 = new Label("請輸入姓名");
		l1.setFont(Font.font(17));
		l1.setTextFill(Color.WHITE);
		Line line1 = new Line(46,51.5 , 46,79);
		line1.setStrokeWidth(3);
		
		TextField tf1 = new TextField();
		tf1.setBorder(new Border(new BorderStroke(Color.valueOf("#8B8878"), BorderStrokeStyle.SOLID, new CornerRadii(0), new BorderWidths(2.5))));
		tf1.setBackground(new Background(new BackgroundFill(Paint.valueOf("#ffffff99"), new CornerRadii(0), new Insets(0))));
		tf1.setPrefWidth(200);
		tf1.setPrefHeight(30);
		tf1.setFont(Font.font(13));
		
		Rectangle rec3 = new Rectangle(180,30);
		Rectangle rec4  =new Rectangle(17,17,Color.WHITE);
		Label l2 = new Label("請輸入電話");
		l2.setFont(Font.font(17));
		l2.setTextFill(Color.WHITE);
		Line line2 = new Line(47,141.5 , 47,169);
		line2.setStrokeWidth(3);
		
		TextField tf2 = new TextField();
		tf2.setBorder(new Border(new BorderStroke(Color.valueOf("#8B8878"), BorderStrokeStyle.SOLID, new CornerRadii(0), new BorderWidths(2.5))));
		tf2.setBackground(new Background(new BackgroundFill(Paint.valueOf("#ffffff99"), new CornerRadii(0), new Insets(0))));
		tf2.setPrefWidth(200);
		tf2.setPrefHeight(30);
		tf2.setFont(Font.font(13));
		
		Rectangle rec5 = new Rectangle(180,30);
		Rectangle rec6  =new Rectangle(17,17,Color.WHITE);
		Label l3 = new Label("請輸入密碼");
		l3.setFont(Font.font(17));
		l3.setTextFill(Color.WHITE);
		Line line3 = new Line(47,231.5 , 47,259);
		line3.setStrokeWidth(3);
		
		PasswordField pf1 = new PasswordField();
		pf1.setBorder(new Border(new BorderStroke(Color.valueOf("#8B8878"), BorderStrokeStyle.SOLID, new CornerRadii(0), new BorderWidths(2.5))));
		pf1.setBackground(new Background(new BackgroundFill(Paint.valueOf("#ffffff99"), new CornerRadii(0), new Insets(0))));
		pf1.setPrefWidth(200);
		pf1.setPrefHeight(30);
		pf1.setFont(Font.font(13));
		
		Rectangle rec7 = new Rectangle(180,30);
		Rectangle rec8  =new Rectangle(17,17,Color.WHITE);
		Label l4 = new Label("請再次輸入密碼");
		l4.setFont(Font.font(17));
		l4.setTextFill(Color.WHITE);
		Line line4 = new Line(47,321.5 , 47,349);
		line4.setStrokeWidth(3);
		
		PasswordField pf2 = new PasswordField();
		pf2.setBorder(new Border(new BorderStroke(Color.valueOf("#8B8878"), BorderStrokeStyle.SOLID, new CornerRadii(0), new BorderWidths(2.5))));
		pf2.setBackground(new Background(new BackgroundFill(Paint.valueOf("#ffffff99"), new CornerRadii(0), new Insets(0))));
		pf2.setPrefWidth(200);
		pf2.setPrefHeight(30);
		pf2.setFont(Font.font(13));
		
		Rectangle rec9 = new Rectangle(250,300);
		rec9.setFill(Color.valueOf("#8B8970"));
		rec9.setEffect(geteffect());
		
		Rectangle rec10 = new Rectangle(250,2.5);
		rec10.setFill(Color.valueOf("#ffffff"));
		rec10.setEffect(geteffect());
		
		Rectangle rec11 = new Rectangle(2,15);
		rec11.setFill(Color.valueOf("#ffffff"));
	
		
		Rectangle rec12 = new Rectangle(2,15);
		rec12.setFill(Color.valueOf("#ffffff"));
		
		Rectangle rec13 = new Rectangle(90,30);
		rec13.setFill(Color.valueOf("#36363620"));
		
		Rectangle rec14  =new Rectangle(17,17,Color.BLACK);
		Line line5 = new Line(50,422 , 50,448);
		line5.setStrokeWidth(3);
		
		Rectangle rec15 = new Rectangle(90,30);
		rec15.setFill(Color.BLACK);
		
		Rectangle rec16  =new Rectangle(17,17,Color.WHITE);
		
		Rectangle rec17 = new Rectangle(210,40);
		rec17.setFill(Color.valueOf("#363636"));
		
		Rectangle rec19 = new Rectangle(210,40);
		rec19.setFill(Color.valueOf("#363636"));
		
		Label l5 = new  Label("註冊失敗");
		l5.setTextFill(Color.WHITE);
		l5.setFont(Font.font(27));
		l5.setEffect(geteffect());
		
		Label l6 = new  Label("註冊成功");
		l6.setTextFill(Color.WHITE);
		l6.setFont(Font.font(27));
		l6.setEffect(geteffect());
		
		Label l7 = new  Label("您未輸入全部信息");
		l7.setTextFill(Color.WHITE);
		l7.setFont(Font.font(24));
		
		Rectangle rec18 = new Rectangle(210,90);
		rec18.setFill(Color.valueOf("#696969"));
		
		Label l8 = new  Label("前後兩次密碼不匹配");
		l8.setTextFill(Color.WHITE);
		l8.setFont(Font.font(23));
		
		
		this.getChildren().addAll(rec1,rec2,l1,line1);
		this.getChildren().add(tf1);
		this.getChildren().addAll(rec3,rec4,l2,line2);
		this.getChildren().add(tf2);
		this.getChildren().addAll(rec5,rec6,l3,line3);
		this.getChildren().add(pf1);
		this.getChildren().addAll(rec7,rec8,l4,line4);
		this.getChildren().add(pf2);
		this.getChildren().add(rec9);
//		this.getChildren().addAll(rec10,rec11,rec12);
		this.getChildren().addAll(rec13,rec14,line5,rec19);
		
		
		this.setTopAnchor(rec1, 50.0);
		this.setLeftAnchor(rec1, 50.0);
		this.setTopAnchor(rec2, 57.0);
		this.setLeftAnchor(rec2, 57.0);
		this.setTopAnchor(l1, 53.0);
		this.setLeftAnchor(l1, 87.0);
		
		this.setTopAnchor(tf1, 88.0);
		this.setLeftAnchor(tf1, 45.0);
		
		this.setTopAnchor(rec3, 140.0);
		this.setLeftAnchor(rec3, 51.0);
		this.setTopAnchor(rec4, 147.0);
		this.setLeftAnchor(rec4, 58.0);
		this.setTopAnchor(l2, 143.0);
		this.setLeftAnchor(l2, 87.0);
		
		this.setTopAnchor(tf2, 178.0);
		this.setLeftAnchor(tf2, 46.0);
		
		this.setTopAnchor(rec5, 230.0);
		this.setLeftAnchor(rec5, 51.0);
		this.setTopAnchor(rec6, 237.0);
		this.setLeftAnchor(rec6, 58.0);
		this.setTopAnchor(l3, 233.0);
		this.setLeftAnchor(l3, 87.0);
		
		this.setTopAnchor(pf1, 268.0);
		this.setLeftAnchor(pf1, 46.0);
		
		this.setTopAnchor(rec7, 320.0);
		this.setLeftAnchor(rec7, 51.0);
		this.setTopAnchor(rec8, 327.0);
		this.setLeftAnchor(rec8, 58.0);
		this.setTopAnchor(l4, 323.0);
		this.setLeftAnchor(l4, 87.0);
		
		this.setTopAnchor(pf2, 358.0);
		this.setLeftAnchor(pf2, 46.0);

		this.setTopAnchor(rec9, 95.0);
		this.setLeftAnchor(rec9, 300.0);
		
		this.setTopAnchor(rec10, 80.0);
		this.setLeftAnchor(rec10, 300.0);
		
		this.setTopAnchor(rec11, 74.0);
		this.setLeftAnchor(rec11, 305.0);
		
		this.setTopAnchor(rec12, 74.0);
		this.setLeftAnchor(rec12, 543.0);
		
		this.setTopAnchor(rec13, 420.0);
		this.setLeftAnchor(rec13, 55.0);
		
		this.setTopAnchor(rec14, 427.0);
		this.setLeftAnchor(rec14, 60.0);
		
		this.setTopAnchor(rec15, 420.0);
		this.setLeftAnchor(rec15, 55.0);
		
		this.setTopAnchor(rec16, 427.0);
		this.setLeftAnchor(rec16, 60.0);
		
		this.setTopAnchor(rec17, 130.0);
		this.setLeftAnchor(rec17, 320.0);
		
		this.setTopAnchor(rec18, 200.0);
		this.setLeftAnchor(rec18, 320.0);
		rec18.setFill(Color.valueOf("#363636"));
		
		this.setTopAnchor(rec19, 130.0);
		this.setLeftAnchor(rec19, 320.0);
		
		Rectangle rec20 = new Rectangle(210,3);
		Rectangle rec21 = new Rectangle(210,3);
		Rectangle rec22 = new Rectangle(210,3);
		Rectangle rec23 = new Rectangle(210,3);
		Rectangle rec24 = new Rectangle(210,3);
		Rectangle rec25 = new Rectangle(210,3);
		Rectangle rec26 = new Rectangle(210,3);
		
//		rec20.setFill(Color.valueOf("#363636"));
//		rec21.setFill(Color.valueOf("#363636"));
//		rec22.setFill(Color.valueOf("#363636"));
//		rec23.setFill(Color.valueOf("#363636"));
//		rec24.setFill(Color.valueOf("#363636"));
//		rec25.setFill(Color.valueOf("#363636"));
//		rec26.setFill(Color.valueOf("#363636"));
		
		this.setTopAnchor(rec20, 190.0);
		this.setLeftAnchor(rec20, 320.5);
		
		this.setTopAnchor(rec21, 350.0);
		this.setLeftAnchor(rec21, 320.5);
		
//		this.getChildren().addAll(rec20,rec21);
		
		Label l9 = new Label("電話號不可重復");
		Label l10 = new Label("密碼前後需一致");
		
		l9.setFont(Font.font(17));
		l9.setTextFill(Color.valueOf("#363636"));
		l10.setFont(Font.font(17));
		l10.setTextFill(Color.valueOf("#363636"));
		
		this.getChildren().addAll(l9,l10);
		
		this.setTopAnchor(l9, 195.0);
		this.setLeftAnchor(l9, 330.5);
		
		this.setTopAnchor(l10, 223.0);
		this.setLeftAnchor(l10, 330.5);
		
		Circle c1 = new Circle(2);
		Circle c2 = new Circle(2);
		
		c1.setFill(Color.valueOf("#363636"));
		c2.setFill(Color.valueOf("#363636"));
		
		this.getChildren().addAll(c1,c2);
		
		this.setTopAnchor(c1, 207.0);
		this.setLeftAnchor(c1, 320.5);
		
		this.setTopAnchor(c2, 235.0);
		this.setLeftAnchor(c2, 320.5);
		
		KeyValue kv1 = new KeyValue(rec17.fillProperty(), Color.valueOf("#363636"));
		KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1);
		
		KeyValue kv2 = new KeyValue(rec17.fillProperty(), Color.WHITE);
		KeyFrame kf2 = new KeyFrame(Duration.seconds(0.07), kv2);
		
		Timeline timeline2 = new Timeline(90);
		timeline2.getKeyFrames().addAll(kf1,kf2);
		timeline2.setDelay(Duration.seconds(0.3));
		timeline2.setCycleCount(4);
		timeline2.setAutoReverse(true);
		timeline2.play();
		
		Label l11 = new Label("註冊");
		l11.setFont(Font.font(15));
		
		this.getChildren().add(l11);
		
		this.setTopAnchor(l11, 424.0);
		this.setLeftAnchor(l11, 85.0);
		
		rec13.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
				SignUpPane.this.getChildren().remove(rec17);
				SignUpPane.this.getChildren().addAll(rec17);
				
				SignUpPane.this.getChildren().remove(l5);
				SignUpPane.this.getChildren().addAll(l5);
				
				
				timeline2.play();
				
				SignUpPane.this.setTopAnchor(l5, 132.0);
				SignUpPane.this.setLeftAnchor(l5, 370.0);
				
				SignUpPane.this.setTopAnchor(l7, 232.0);
				SignUpPane.this.setLeftAnchor(l7, 330.0);
				
				
				
			}
		});
		
		
		
		tf1.textProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
				// TODO Auto-generated method stub
				if(arg2 != "") {
					nameN = true;
					}else {
						nameN = false;
					}
				
				if(nameN && TELN && p1N && p2N) {
//					System.out.println("true");
				SignUpPane.this.getChildren().remove(rec15);
				SignUpPane.this.getChildren().remove(rec16);
				SignUpPane.this.getChildren().remove(l11);
				l11.setTextFill(Color.WHITE);
				SignUpPane.this.getChildren().addAll(rec15,rec16,l11);
				
				}else {
					//System.out.println("false");
					SignUpPane.this.getChildren().remove(rec15);
					SignUpPane.this.getChildren().remove(rec16);
					
				}
			}
			
		});
		
		tf2.textProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
				// TODO Auto-generated method stub
				if(arg2 != "") {
					TELN = true;
					}
				if(arg2 == null){
						TELN = false;
					}
				
				if(nameN && TELN && p1N && p2N) {
//					System.out.println("true");
					SignUpPane.this.getChildren().remove(rec15);
					SignUpPane.this.getChildren().remove(rec16);
					SignUpPane.this.getChildren().remove(l11);
					l11.setTextFill(Color.WHITE);
					SignUpPane.this.getChildren().addAll(rec15,rec16,l11);
					
				}else {
					//System.out.println("false");
					SignUpPane.this.getChildren().remove(rec15);
					SignUpPane.this.getChildren().remove(rec16);
					
				}
			}

		});
		
		pf1.textProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
				// TODO Auto-generated method stub
				if(arg2 != "") {
					p1N = true;
					}else {
						p1N = false;
					}
				
				if(nameN && TELN && p1N && p2N) {
//					System.out.println("true");
					SignUpPane.this.getChildren().remove(rec15);
					SignUpPane.this.getChildren().remove(rec16);
					SignUpPane.this.getChildren().remove(l11);
					l11.setTextFill(Color.WHITE);
					SignUpPane.this.getChildren().addAll(rec15,rec16,l11);
					
				}else {
					//System.out.println("false");
					SignUpPane.this.getChildren().remove(rec15);
					SignUpPane.this.getChildren().remove(rec16);
					
				}
			}
			
			

		});
		
		
		
		
		pf2.textProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
				// TODO Auto-generated method stub
				if(arg2 != "") {
					p2N = true;
					}else {
						p2N = false;
					}
				
				if(nameN && TELN && p1N && p2N) {
//					System.out.println("true");
					SignUpPane.this.getChildren().remove(rec15);
					SignUpPane.this.getChildren().remove(rec16);
					SignUpPane.this.getChildren().remove(l11);
					l11.setTextFill(Color.WHITE);
					SignUpPane.this.getChildren().addAll(rec15,rec16,l11);
					
				}else {
					//System.out.println("false");
					SignUpPane.this.getChildren().remove(rec15);
					SignUpPane.this.getChildren().remove(rec16);
					
				}
			}
			
		});
		
		
		rec15.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
//				System.out.println(true);
				SignUpPane.this.getChildren().remove(rec17);
				
				String name = tf1.getText();
				String TEL = tf2.getText();
				String p1 = pf1.getText();
				String p2 = pf2.getText();
				
				KeyValue kv1 = new KeyValue(rec15.fillProperty(), Color.BLACK);
				KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1);
				
				KeyValue kv2 = new KeyValue(rec15.fillProperty(), Color.WHITE);
				KeyFrame kf2 = new KeyFrame(Duration.seconds(0.07), kv2);
				
				Timeline timeline1 = new Timeline(90);
				timeline1.getKeyFrames().addAll(kf1,kf2);
				timeline1.setDelay(Duration.seconds(0));
				timeline1.setCycleCount(4);
				timeline1.setAutoReverse(true);
				timeline1.play();
				
				SignUpPane.this.getChildren().addAll(rec17);
				timeline2.play();
				
				if(p1.equals(p2)) {
//					System.out.println("yes");
					boolean isSignUp = SignUP.signUp(TEL, name, p1);
				
					if(isSignUp) {
				
//						SignUpPane.this.getChildren().remove(rec18);
//						SignUpPane.this.getChildren().addAll(rec18);
						
						SignUpPane.this.getChildren().remove(l6);
						SignUpPane.this.getChildren().add(l6);
						
						SignUpPane.this.setTopAnchor(l6, 132.0);
						SignUpPane.this.setLeftAnchor(l6, 370.0);
						
						
					}
					
				}else {
//					System.out.println("no");
					
//					SignUpPane.this.getChildren().remove(rec18);
//					SignUpPane.this.getChildren().addAll(rec18);
					
					SignUpPane.this.getChildren().remove(l5);
					SignUpPane.this.getChildren().addAll(l5);
					
					SignUpPane.this.setTopAnchor(l5, 132.0);
					SignUpPane.this.setLeftAnchor(l5, 370.0);
					
					
//					SignUpPane.this.getChildren().remove(l8);
//					SignUpPane.this.getChildren().addAll(l8);
//					
//					SignUpPane.this.setTopAnchor(l8, 232.0);
//					SignUpPane.this.setLeftAnchor(l8, 322.0);
					
				}
			}
		});
		
		rec15.setOnMouseEntered(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.HAND);
			}
		});
		
		rec15.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.DEFAULT);
			}
		});
		
//		rec15.setOnMouseClicked(new EventHandler<MouseEvent>() {
//
//			@Override
//			public void handle(MouseEvent arg0) {
//				// TODO Auto-generated method stub
//				KeyValue kv1 = new KeyValue(rec15.fillProperty(), Color.BLACK);
//				KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1);
//				
//				KeyValue kv2 = new KeyValue(rec15.fillProperty(), Color.WHITE);
//				KeyFrame kf2 = new KeyFrame(Duration.seconds(0.07), kv2);
//				
//				Timeline timeline1 = new Timeline(90);
//				timeline1.getKeyFrames().addAll(kf1,kf2);
//				timeline1.setDelay(Duration.seconds(0));
//				timeline1.setCycleCount(4);
//				timeline1.setAutoReverse(true);
//				timeline1.play();
//			}
//		});
		

		this.setPrefWidth(600);
		this.setPrefHeight(650);
		this.setBackground(new Background(new BackgroundFill(Color.valueOf("#CDC8B1"), new CornerRadii(0), new Insets(0))));
		
		
	}
	
	public Effect geteffect() {
		DropShadow ds = new DropShadow();
		
		return ds;
	}
	
}
