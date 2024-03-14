package UI;


import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.util.Duration;

public class ExitPane extends AnchorPane{
	
	boolean isClicked = false;
	
	public ExitPane() {
		// TODO Auto-generated constructor stub
		
		Label l1 = new Label("EXIT");
		l1.setFont(Font.font(51));
		l1.setTextFill(Color.valueOf("#36363680"));
		Label l2 = new Label("EXIT");
		l2.setFont(Font.font(51));
		
		Rectangle rec1 = new Rectangle(12,4);
		Label l3 = new Label("執行此程序可能會導致數據丟失");
		l3.setFont(Font.font(20));
		
		Rectangle rec2 = new Rectangle(360,50);
		rec2.setFill(Color.valueOf("#36363650"));
		Rectangle rec3 = new Rectangle(25,25);
		Rectangle rec4 = new Rectangle(7,50);
		Label l4 = new Label("離開");
		l4.setFont(Font.font(30));
		
		
		this.getChildren().addAll(l1,l2);
		this.getChildren().addAll(rec1,l3);
		this.getChildren().addAll(rec2,rec3,rec4,l4);
		
		
		
		
		this.setTopAnchor(l1, 100.0);
		this.setLeftAnchor(l1, 60.0);
		this.setTopAnchor(l2, 96.0);
		this.setLeftAnchor(l2, 56.0);
		
		
		this.setTopAnchor(rec1, 172.0);
		this.setLeftAnchor(rec1, 60.0);
		this.setTopAnchor(l3, 160.0);
		this.setLeftAnchor(l3, 80.0);
		
		this.setTopAnchor(rec2, 240.0);
		this.setLeftAnchor(rec2, 60.0);
		this.setTopAnchor(rec3, 253.0);
		this.setLeftAnchor(rec3, 75.0);
		this.setTopAnchor(rec4, 240.0);
		this.setLeftAnchor(rec4, 60.0);
		this.setTopAnchor(l4, 244.0);
		this.setLeftAnchor(l4, 125.0);
		
		
		rec2.setOnMouseEntered(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.HAND);
				rec2.setFill(Color.BLACK);
				rec3.setFill(Color.WHITE);
				rec4.setFill(Color.WHITE);
				l4.setTextFill(Color.WHITE);
			}
		});
		
		rec2.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.DEFAULT);
				if(isClicked) {
					rec2.setFill(Color.BLACK);
					rec3.setFill(Color.WHITE);
					rec4.setFill(Color.WHITE);
					l4.setTextFill(Color.WHITE);
				}else {
					rec2.setFill(Color.valueOf("#36363650"));
					rec3.setFill(Color.BLACK);
					rec4.setFill(Color.BLACK);
					l4.setTextFill(Color.BLACK);
				}
			}
		});
		
		Rectangle rec5 = new Rectangle(0.01,34);
		Label l5 = new Label("最終確認");
		l5.setFont(Font.font(20));
		l5.setTextFill(Color.WHITE);
		
		Line line1 = new Line(580,130 , 580+380,130);
		Line line2 = new Line(580,130+34+280 , 580+380,130+34+280);
		Line line3 = new Line(580,130 , 580,130+34+280);
		Line line4 = new Line(580+380,130 , 580+380,130+34+280);
		
		line1.setStrokeWidth(2);
		line2.setStrokeWidth(2);
		line3.setStrokeWidth(2);
		line4.setStrokeWidth(2);
		
		this.setTopAnchor(rec5, 130.0);
		this.setLeftAnchor(rec5, 580.0);
		this.setTopAnchor(l5, 134.0);
		this.setLeftAnchor(l5, 588.0);
		
		KeyValue kv3 = new KeyValue(rec5.widthProperty(), 100);
		KeyFrame kf3 = new KeyFrame(Duration.seconds(0), kv3);
		
		KeyValue kv4 = new KeyValue(rec5.widthProperty(), 380);
		KeyFrame kf4 = new KeyFrame(Duration.seconds(0.1), kv4);
		
		Timeline timeline2 = new Timeline(90);
		timeline2.getKeyFrames().addAll(kf3,kf4);
		
		Rectangle rec6 = new Rectangle(380,280);
		rec6.setFill(Color.valueOf("#CDCDB4"));
		
		Rectangle rec7 = new Rectangle(380,280+34);
		rec7.setFill(Color.valueOf("#4F4F4F"));
		
		this.setTopAnchor(rec6, 164.0);
		this.setLeftAnchor(rec6, 580.0);
		
		this.setTopAnchor(rec7, 135.0);
		this.setLeftAnchor(rec7, 585.0);
		
		Label l6 = new Label("確認離開");
		l6.setFont(Font.font(51));
		
		this.setTopAnchor(l6, 212.0);
		this.setLeftAnchor(l6, 668.0);
		
		Rectangle rec8 = new Rectangle(90,40);
		Rectangle rec9 = new Rectangle(90,40);
		
		rec8.setFill(Color.valueOf("#36363650"));
		rec9.setFill(Color.valueOf("#36363650"));
		
		this.setTopAnchor(rec8, 310.0);
		this.setLeftAnchor(rec8, 644.0);
		this.setTopAnchor(rec9, 310.0);
		this.setLeftAnchor(rec9, 804.0);
		
		Label l7 = new Label("是");
		Label l8 = new Label("否");
		
		l7.setFont(Font.font(30));
		l8.setFont(Font.font(30));
		
		this.setTopAnchor(l7, 310.0);
		this.setLeftAnchor(l7, 673.0);
		this.setTopAnchor(l8, 310.0);
		this.setLeftAnchor(l8, 833.0);
		
		Rectangle rec10 = new Rectangle(90,3);
		Rectangle rec11 = new Rectangle(90,3);
		
		rec2.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
				KeyValue kv1 = new KeyValue(rec2.fillProperty(), Color.BLACK);
				KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1);
				
				KeyValue kv2 = new KeyValue(rec2.fillProperty(), Color.WHITE);
				KeyFrame kf2 = new KeyFrame(Duration.seconds(0.05), kv2);
				
				Timeline timeline1 = new Timeline(90);
				timeline1.getKeyFrames().addAll(kf1,kf2);
				timeline1.setDelay(Duration.seconds(0));
				timeline1.setCycleCount(4);
				timeline1.setAutoReverse(true);
				
				ExitPane.this.getChildren().remove(rec5);
				ExitPane.this.getChildren().remove(rec6);
				ExitPane.this.getChildren().remove(rec7);
				ExitPane.this.getChildren().remove(rec8);
				ExitPane.this.getChildren().remove(rec9);
				ExitPane.this.getChildren().remove(line1);
				ExitPane.this.getChildren().remove(line2);
				ExitPane.this.getChildren().remove(line3);
				ExitPane.this.getChildren().remove(line4);
				ExitPane.this.getChildren().remove(l5);
				ExitPane.this.getChildren().remove(l6);
				ExitPane.this.getChildren().remove(l7);
				ExitPane.this.getChildren().remove(l8);
				

				ExitPane.this.getChildren().addAll(rec7);
				ExitPane.this.getChildren().addAll(rec5);
				
				timeline1.setOnFinished(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
						rec2.setFill(Color.BLACK);
						rec3.setFill(Color.WHITE);
						rec4.setFill(Color.WHITE);
						l4.setTextFill(Color.WHITE);
						isClicked = true;
					}
				});
				
				timeline2.setOnFinished(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
						ExitPane.this.getChildren().addAll(l5);
						ExitPane.this.getChildren().addAll(rec6);
						ExitPane.this.getChildren().addAll(line1,line2,line3,line4);
						ExitPane.this.getChildren().addAll(l6,rec8,rec9);
						ExitPane.this.getChildren().addAll(l7,l8);
					}
				});
				
				
				timeline1.play();
				timeline2.play();
				
				
				
			}
		});
		
		rec8.setOnMouseEntered(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.HAND);
				rec8.setFill(Color.valueOf("#36363650"));
				rec9.setFill(Color.valueOf("#36363650"));
				l7.setTextFill(Color.BLACK);
				l8.setTextFill(Color.BLACK);
				ExitPane.this.getChildren().remove(rec10);
				ExitPane.this.getChildren().remove(rec11);
				
				rec8.setFill(Color.BLACK);
				l7.setTextFill(Color.WHITE);
				ExitPane.this.getChildren().add(rec10);
				ExitPane.this.getChildren().add(rec11);
				
				ExitPane.this.setTopAnchor(rec10, 303.0);
				ExitPane.this.setLeftAnchor(rec10, 644.0);
				ExitPane.this.setTopAnchor(rec11, 354.0);
				ExitPane.this.setLeftAnchor(rec11, 644.0);
			}
		});
		
		rec9.setOnMouseEntered(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.HAND);
				rec8.setFill(Color.valueOf("#36363650"));
				rec9.setFill(Color.valueOf("#36363650"));
				l7.setTextFill(Color.BLACK);
				l8.setTextFill(Color.BLACK);
				ExitPane.this.getChildren().remove(rec10);
				ExitPane.this.getChildren().remove(rec11);
				
				rec9.setFill(Color.BLACK);
				l8.setTextFill(Color.WHITE);
				ExitPane.this.getChildren().add(rec10);
				ExitPane.this.getChildren().add(rec11);
				
				ExitPane.this.setTopAnchor(rec10, 303.0);
				ExitPane.this.setLeftAnchor(rec10, 804.0);
				ExitPane.this.setTopAnchor(rec11, 354.0);
				ExitPane.this.setLeftAnchor(rec11, 804.0);
			}
		});
		
		rec8.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				KeyValue kv1 = new KeyValue(rec8.fillProperty(), Color.BLACK);
				KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1);
				
				KeyValue kv2 = new KeyValue(rec8.fillProperty(), Color.WHITE);
				KeyFrame kf2 = new KeyFrame(Duration.seconds(0.04), kv2);
				
				Timeline timeline1 = new Timeline(90);
				timeline1.getKeyFrames().addAll(kf1,kf2);
				timeline1.setDelay(Duration.seconds(0));
				timeline1.setCycleCount(4);
				timeline1.setAutoReverse(true);
				timeline1.play();
				
				timeline1.setOnFinished(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
						System.exit(1);
					}
				});
				
			}
		});
		
		rec9.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				KeyValue kv1 = new KeyValue(rec9.fillProperty(), Color.BLACK);
				KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1);
				
				KeyValue kv2 = new KeyValue(rec9.fillProperty(), Color.WHITE);
				KeyFrame kf2 = new KeyFrame(Duration.seconds(0.05), kv2);
				
				Timeline timeline1 = new Timeline(90);
				timeline1.getKeyFrames().addAll(kf1,kf2);
				timeline1.setDelay(Duration.seconds(0));
				timeline1.setCycleCount(4);
				timeline1.setAutoReverse(true);
				timeline1.play();
				
				timeline1.setOnFinished(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
						ExitPane.this.getChildren().remove(rec5);
						ExitPane.this.getChildren().remove(rec6);
						ExitPane.this.getChildren().remove(rec7);
						ExitPane.this.getChildren().remove(rec8);
						ExitPane.this.getChildren().remove(rec9);
						ExitPane.this.getChildren().remove(line1);
						ExitPane.this.getChildren().remove(line2);
						ExitPane.this.getChildren().remove(line3);
						ExitPane.this.getChildren().remove(line4);
						ExitPane.this.getChildren().remove(l5);
						ExitPane.this.getChildren().remove(l6);
						ExitPane.this.getChildren().remove(l7);
						ExitPane.this.getChildren().remove(l8);
						ExitPane.this.getChildren().remove(rec10);
						ExitPane.this.getChildren().remove(rec11);
					}
				});
				
				
				isClicked = false;
			}
		});
		
		
		rec8.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.DEFAULT);
			}
		});
		
		rec9.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.DEFAULT);
			}
		});
		
		
		this.setPrefHeight(728);
		this.setPrefWidth(1396);
	}
	
}


