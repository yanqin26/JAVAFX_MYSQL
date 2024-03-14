package UI;



import Backend.Login;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Cursor;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
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
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.util.Duration;

public class LoginPane extends AnchorPane{
	
	String t1 = "";
	String t2	= "";
	
	boolean t1N = false;
	boolean t2N = false;
	
	static boolean isLogin = false;
	
	TextField tf1 = new TextField();
	PasswordField tf2 = new PasswordField();
	Rectangle rec10 = new Rectangle(100, 40);
	
	LoginPane(){
	
		
		Rectangle rec1 = new Rectangle(300, 40);
		Label l1 = new Label("請輸入用戶名");
		l1.setFont(Font.font(27));
		l1.setTextFill(Color.WHITE);
		Rectangle rec2  = new Rectangle(4,40);
		Rectangle rec3  = new Rectangle(20,20,Color.WHITE);
		
		
		tf1.setBorder(new Border(new BorderStroke(Color.valueOf("#8B8878"), BorderStrokeStyle.SOLID, new CornerRadii(0), new BorderWidths(2.5))));
		tf1.setBackground(new Background(new BackgroundFill(Paint.valueOf("#ffffff99"), new CornerRadii(0), new Insets(0))));
		tf1.setPrefWidth(350);
		tf1.setPrefHeight(30);
		tf1.setFont(Font.font(18));
		
		Rectangle rec4 = new Rectangle(300, 40);
		Label l2 = new Label("請輸入密碼");
		l2.setFont(Font.font(27));
		l2.setTextFill(Color.WHITE);
		Rectangle rec5  = new Rectangle(4,40);
		Rectangle rec6  = new Rectangle(20,20,Color.WHITE);
		
		
		tf2.setBorder(new Border(new BorderStroke(Color.valueOf("#8B8878"), BorderStrokeStyle.SOLID, new CornerRadii(0), new BorderWidths(2.5))));
		tf2.setBackground(new Background(new BackgroundFill(Paint.valueOf("#ffffff99"), new CornerRadii(0), new Insets(0))));
		tf2.setPrefWidth(350);
		tf2.setPrefHeight(30);
		tf2.setFont(Font.font(18));
		
		Rectangle rec7 = new Rectangle(100, 40);
		rec7.setFill(Color.valueOf("#36363620"));
		Rectangle rec8  = new Rectangle(4,40);
		Rectangle rec9  = new Rectangle(25,25,Color.BLACK);
		
		
		Rectangle rec11  = new Rectangle(25,25,Color.WHITE);

		
		this.getChildren().addAll(rec1,l1,rec2,rec3);
		this.getChildren().addAll(tf1);
		this.getChildren().addAll(rec4,l2,rec5,rec6);
		this.getChildren().addAll(tf2);
		this.getChildren().addAll(rec7,rec8,rec9);
		
		this.setTopAnchor(rec1, 70.0);
		this.setLeftAnchor(rec1, 50.0);
		this.setTopAnchor(l1, 72.0);
		this.setLeftAnchor(l1, 85.0);
		this.setTopAnchor(rec2, 70.0);
		this.setLeftAnchor(rec2, 42.0);
		this.setTopAnchor(rec3, 81.0);
		this.setLeftAnchor(rec3, 57.0);
		
		this.setTopAnchor(tf1, 130.0);
		this.setLeftAnchor(tf1, 42.0);
		
		this.setTopAnchor(rec4, 190.0);
		this.setLeftAnchor(rec4, 50.0);
		this.setTopAnchor(l2, 192.0);
		this.setLeftAnchor(l2, 85.0);
		this.setTopAnchor(rec5, 190.0);
		this.setLeftAnchor(rec5, 42.0);
		this.setTopAnchor(rec6, 201.0);
		this.setLeftAnchor(rec6, 58.0);
		
		this.setTopAnchor(tf2, 250.0);
		this.setLeftAnchor(tf2, 42.0);
		
		this.setTopAnchor(rec7, 320.0);
		this.setLeftAnchor(rec7, 50.0);
		this.setTopAnchor(rec8, 320.0);
		this.setLeftAnchor(rec8, 42.0);
		this.setTopAnchor(rec9, 328.0);
		this.setLeftAnchor(rec9, 55.0);
		
		this.setTopAnchor(rec10, 320.0);
		this.setLeftAnchor(rec10, 50.0);
		this.setTopAnchor(rec11, 328.0);
		this.setLeftAnchor(rec11, 55.0);
		
		Label l3 = new Label("登錄");
		l3.setFont(Font.font(20));
		
		this.getChildren().add(l3);
		
		this.setTopAnchor(l3, 326.0);
		this.setLeftAnchor(l3, 88.0);
		
		tf1.textProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
				// TODO Auto-generated method stub
				if(arg2 != null) {
					t1N = true;
				}if(arg2 == null) {
					t1N = false;
				}
				
				if(t1N && t2N) {
					LoginPane.this.getChildren().remove(rec10);
					LoginPane.this.getChildren().remove(rec11);
					LoginPane.this.getChildren().remove(l3);
					
					LoginPane.this.getChildren().add(rec10);
					LoginPane.this.getChildren().add(rec11);
					LoginPane.this.getChildren().add(l3);
					l3.setTextFill(Color.WHITE);
					
				}
				
			}
		});
		
		tf2.textProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
				// TODO Auto-generated method stub
				if(arg2 != null) {
					t2N = true;
				}if(arg2 == null) {
					t2N = false;
				}
				
				if(t1N && t2N) {
					LoginPane.this.getChildren().remove(rec10);
					LoginPane.this.getChildren().remove(rec11);
					LoginPane.this.getChildren().remove(l3);
					
					LoginPane.this.getChildren().add(rec10);
					LoginPane.this.getChildren().add(rec11);
					LoginPane.this.getChildren().add(l3);
					l3.setTextFill(Color.WHITE);
					
				}
				
				
			}
		});
		
		rec10.setOnMouseEntered(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.HAND);
			}
		});
		
		
		rec10.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.DEFAULT);
			}
		});
		

		Rectangle rec35 = new Rectangle(20,7);
		Rectangle rec36 = new Rectangle(7,20);
		Rectangle rec37 = new Rectangle(20,7);
		Rectangle rec38 = new Rectangle(7,20);
		Rectangle rec39 = new Rectangle(20,7);
		Rectangle rec40 = new Rectangle(7,20);
		Rectangle rec41 = new Rectangle(20,7);
		Rectangle rec42 = new Rectangle(7,20);
		
//		this.getChildren().addAll(rec35,rec36,rec37,rec38);
//		
		this.setTopAnchor(rec35, 0.0);
		this.setLeftAnchor(rec35, 0.0);
		
		this.setTopAnchor(rec36, 0.0);
		this.setLeftAnchor(rec36, 0.0);
		
		this.setTopAnchor(rec37, 642.0);
		this.setLeftAnchor(rec37, 580.0);
		
		this.setTopAnchor(rec38, 630.0);
		this.setLeftAnchor(rec38, 593.0);
		
		this.setPrefWidth(600);
		this.setPrefHeight(650);
		this.setBackground(new Background(new BackgroundFill(Color.valueOf("#CDC8B1"), new CornerRadii(0), new Insets(0))));
	}

}
