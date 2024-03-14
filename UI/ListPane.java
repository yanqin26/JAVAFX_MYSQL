package UI;

import Backend.Odering_Utils;
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
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.util.Duration;

public class ListPane extends AnchorPane{
	
	String name = "";
	String password = "";
	
	String s1 = "";
	String s2 = "";
	String s3 = "";
	String s4 = "";
	String s5 = "";
	
	String[] s = new String[] {s1,s2,s3,s4,s5};
	
	Label label1 = new Label("您還未點過餐");
	Label label2 = new Label("");
	Label label3 = new Label("");
	Label label4 = new Label("");
	Label label5 = new Label("");
	
	Rectangle rec3 = new Rectangle(350,30);
	Rectangle rec4 = new Rectangle(350,30);
	Rectangle rec5 = new Rectangle(350,30);
	Rectangle rec6 = new Rectangle(350,30);
	Rectangle rec7 = new Rectangle(350,30);
	
	Circle c1 = new Circle(5);
	
	SumPane sump1;
	SumPane sump2;
	SumPane sump3;
	SumPane sump4;
	SumPane sump5;
	
	public ListPane() {
		// TODO Auto-generated constructor stub
		

		label1.setFont(Font.font(20));
		label2.setFont(Font.font(20));
		label3.setFont(Font.font(20));
		label4.setFont(Font.font(20));
		label5.setFont(Font.font(20));
		
		label1.setTextFill(Color.valueOf("#696969"));
		label2.setTextFill(Color.valueOf("#696969"));
		label3.setTextFill(Color.valueOf("#696969"));
		label4.setTextFill(Color.valueOf("#696969"));
		label5.setTextFill(Color.valueOf("#696969"));
		
		Label l1 = new Label("LIST");
		l1.setFont(Font.font(51));
		l1.setTextFill(Color.valueOf("#36363680"));
		Label l2 = new Label("LIST");
		l2.setFont(Font.font(51));
		
		Label l3 = new Label("在這裏可以查詢到最近五次訂單");
		l3.setFont(Font.font(20));
		Rectangle rec1 = new Rectangle(15,5);
		
		Rectangle rec2 = new Rectangle(400,300);
		rec2.setFill(Paint.valueOf("#8B897090"));
		
		
		Label l4 = new Label("點餐歷史");
		l4.setFont(Font.font(22));
		l4.setTextFill(Color.WHITE);
		
		
		Line line1 = new Line(80,250 , 440,250);
		Line line2 = new Line(61.5,530 , 460-1.5,530);
		Line line3 = new Line(61.5,231.5 , 61.5,530);
		Line line4 = new Line(460-1.5,231.5 , 460-1.5,530);
		
		
		line1.setStrokeWidth(40);
		line2.setStrokeWidth(3);
		line3.setStrokeWidth(3);
		line4.setStrokeWidth(3);
		
		
		this.getChildren().addAll(l1,l2);
		this.getChildren().addAll(l3,rec1,rec2);
		this.getChildren().addAll(line1,line2,line3,line4,l4);
		
		
		this.setTopAnchor(l1, 100.0);
		this.setLeftAnchor(l1, 60.0);
		this.setTopAnchor(l2, 96.0);
		this.setLeftAnchor(l2, 56.0);
		
		this.setTopAnchor(l3, 169.0);
		this.setLeftAnchor(l3, 86.0);
		this.setTopAnchor(rec1, 180.0);
		this.setLeftAnchor(rec1, 60.0);
		
		
		this.setTopAnchor(rec2, 230.0);
		this.setLeftAnchor(rec2, 60.0);
		
		
		this.setTopAnchor(l4, 235.0);
		this.setLeftAnchor(l4, 67.0);
		
		this.setTopAnchor(label1, 290.0);
		this.setLeftAnchor(label1, 100.0);
		this.setTopAnchor(label2, 340.0);
		this.setLeftAnchor(label2, 100.0);
		this.setTopAnchor(label3, 390.0);
		this.setLeftAnchor(label3, 100.0);
		this.setTopAnchor(label4, 440.0);
		this.setLeftAnchor(label4, 100.0);
		this.setTopAnchor(label5, 490.0);
		this.setLeftAnchor(label5, 100.0);
		
		
		rec3.setFill(Color.valueOf("#ffffff00"));
		rec4.setFill(Color.valueOf("#ffffff00"));
		rec5.setFill(Color.valueOf("#ffffff00"));
		rec6.setFill(Color.valueOf("#ffffff00"));
		rec7.setFill(Color.valueOf("#ffffff00"));
		
		this.setTopAnchor(rec3, 288.0);
		this.setLeftAnchor(rec3, 70.0);
		this.setTopAnchor(rec4, 338.0);
		this.setLeftAnchor(rec4, 70.0);
		this.setTopAnchor(rec5, 388.0);
		this.setLeftAnchor(rec5, 70.0);
		this.setTopAnchor(rec6, 438.0);
		this.setLeftAnchor(rec6, 70.0);
		this.setTopAnchor(rec7, 488.0);
		this.setLeftAnchor(rec7, 70.0);
		
		
		this.getChildren().addAll(rec3,rec4,rec5,rec6,rec7,label1,label2,label3,label4,label5);
		
		
		Rectangle rec8  =new Rectangle(320,0.01);
		rec8.setFill(Color.valueOf("#00000080"));
		this.getChildren().addAll(rec8);
		this.setTopAnchor(rec8, 110.0);
		this.setLeftAnchor(rec8, 810.0);
		
		KeyValue kv0 = new KeyValue(rec8.heightProperty(), 0);
		KeyFrame kf0 = new KeyFrame(Duration.seconds(0), kv0);
		
		KeyValue kv = new KeyValue(rec8.heightProperty(), 550);
		KeyFrame kf = new KeyFrame(Duration.seconds(0.2), kv);
		
		Timeline timeline = new Timeline(90);
		timeline.getKeyFrames().addAll(kf0,kf);
		timeline.setDelay(Duration.seconds(0));
		
		label1.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				if(!label1.getText().equals("您還未點過餐")) {
				KeyValue kv1 = new KeyValue(label1.textFillProperty(), Color.BLACK);
				KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1);
				
				KeyValue kv2 = new KeyValue(label1.textFillProperty(), Color.WHITE);
				KeyFrame kf2 = new KeyFrame(Duration.seconds(0.07), kv2);
				
				Timeline timeline1 = new Timeline(90);
				timeline1.getKeyFrames().addAll(kf1,kf2);
				timeline1.setDelay(Duration.seconds(0));
				timeline1.setCycleCount(4);
				timeline1.setAutoReverse(true);
				timeline1.play();
				
				timeline.play();
				
				timeline.play();
				ListPane.this.setTopAnchor(sump1, 100.0);
				ListPane.this.setLeftAnchor(sump1, 800.0);
				ListPane.this.getChildren().remove(sump1);
				ListPane.this.getChildren().remove(sump2);
				ListPane.this.getChildren().remove(sump3);
				ListPane.this.getChildren().remove(sump4);
				ListPane.this.getChildren().remove(sump5);
				timeline.setOnFinished(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
	
						
						ListPane.this.getChildren().add(sump1);
					}
				});
				}
			}
		});
		
		
		
			label2.setOnMouseClicked(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent arg0) {
					// TODO Auto-generated method stub
					if(!label2.getText().equals("")) {
					KeyValue kv1 = new KeyValue(label2.textFillProperty(), Color.BLACK);
					KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1);
					
					KeyValue kv2 = new KeyValue(label2.textFillProperty(), Color.WHITE);
					KeyFrame kf2 = new KeyFrame(Duration.seconds(0.07), kv2);
					
					Timeline timeline1 = new Timeline(90);
					timeline1.getKeyFrames().addAll(kf1,kf2);
					timeline1.setDelay(Duration.seconds(0));
					timeline1.setCycleCount(4);
					timeline1.setAutoReverse(true);
					timeline1.play();
					
					timeline.play();
					ListPane.this.setTopAnchor(sump2, 100.0);
					ListPane.this.setLeftAnchor(sump2, 800.0);
					ListPane.this.getChildren().remove(sump1);
					ListPane.this.getChildren().remove(sump2);
					ListPane.this.getChildren().remove(sump3);
					ListPane.this.getChildren().remove(sump4);
					ListPane.this.getChildren().remove(sump5);
					timeline.setOnFinished(new EventHandler<ActionEvent>() {

						@Override
						public void handle(ActionEvent arg0) {
							// TODO Auto-generated method stub

							
							ListPane.this.getChildren().add(sump2);
						}
					});
				}
				}
			});
			
		
		
			label3.setOnMouseClicked(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent arg0) {
					// TODO Auto-generated method stub
					if(!label3.getText().equals("")) {
					KeyValue kv1 = new KeyValue(label3.textFillProperty(), Color.BLACK);
					KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1);
					
					KeyValue kv2 = new KeyValue(label3.textFillProperty(), Color.WHITE);
					KeyFrame kf2 = new KeyFrame(Duration.seconds(0.07), kv2);
					
					Timeline timeline1 = new Timeline(90);
					timeline1.getKeyFrames().addAll(kf1,kf2);
					timeline1.setDelay(Duration.seconds(0));
					timeline1.setCycleCount(4);
					timeline1.setAutoReverse(true);
					timeline1.play();
					
					timeline.play();
					ListPane.this.setTopAnchor(sump3, 100.0);
					ListPane.this.setLeftAnchor(sump3, 800.0);
					ListPane.this.getChildren().remove(sump1);
					ListPane.this.getChildren().remove(sump2);
					ListPane.this.getChildren().remove(sump3);
					ListPane.this.getChildren().remove(sump4);
					ListPane.this.getChildren().remove(sump5);
					timeline.setOnFinished(new EventHandler<ActionEvent>() {

						@Override
						public void handle(ActionEvent arg0) {
							// TODO Auto-generated method stub
							
							ListPane.this.getChildren().add(sump3);
						}
					});
				}
				}
			});
			
		
		
			label4.setOnMouseClicked(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent arg0) {
					// TODO Auto-generated method stub
					if(!label4.getText().equals("")) {
					KeyValue kv1 = new KeyValue(label4.textFillProperty(), Color.BLACK);
					KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1);
					
					KeyValue kv2 = new KeyValue(label4.textFillProperty(), Color.WHITE);
					KeyFrame kf2 = new KeyFrame(Duration.seconds(0.07), kv2);
					
					Timeline timeline1 = new Timeline(90);
					timeline1.getKeyFrames().addAll(kf1,kf2);
					timeline1.setDelay(Duration.seconds(0));
					timeline1.setCycleCount(4);
					timeline1.setAutoReverse(true);
					timeline1.play();
					
					timeline.play();
					ListPane.this.setTopAnchor(sump4, 100.0);
					ListPane.this.setLeftAnchor(sump4, 800.0);
					ListPane.this.getChildren().remove(sump1);
					ListPane.this.getChildren().remove(sump2);
					ListPane.this.getChildren().remove(sump3);
					ListPane.this.getChildren().remove(sump4);
					ListPane.this.getChildren().remove(sump5);
					timeline.setOnFinished(new EventHandler<ActionEvent>() {

						@Override
						public void handle(ActionEvent arg0) {
							// TODO Auto-generated method stub
							
							ListPane.this.getChildren().add(sump4);
						}
					});
				}
				}
			});
			
		
		
			label5.setOnMouseClicked(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent arg0) {
					// TODO Auto-generated method stub
					if(!label5.getText().equals("")) {
					KeyValue kv1 = new KeyValue(label5.textFillProperty(), Color.BLACK);
					KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1);
					
					KeyValue kv2 = new KeyValue(label5.textFillProperty(), Color.WHITE);
					KeyFrame kf2 = new KeyFrame(Duration.seconds(0.07), kv2);
					
					Timeline timeline1 = new Timeline(90);
					timeline1.getKeyFrames().addAll(kf1,kf2);
					timeline1.setDelay(Duration.seconds(0));
					timeline1.setCycleCount(4);
					timeline1.setAutoReverse(true);
					timeline1.play();
					
					timeline.play();
					ListPane.this.setTopAnchor(sump5, 100.0);
					ListPane.this.setLeftAnchor(sump5, 800.0);
					ListPane.this.getChildren().remove(sump1);
					ListPane.this.getChildren().remove(sump2);
					ListPane.this.getChildren().remove(sump3);
					ListPane.this.getChildren().remove(sump4);
					ListPane.this.getChildren().remove(sump5);
					timeline.setOnFinished(new EventHandler<ActionEvent>() {

						@Override
						public void handle(ActionEvent arg0) {
							// TODO Auto-generated method stub
							
							ListPane.this.getChildren().add(sump5);
						}
					});
				}
				}
			});
			
		
		
			rec3.setOnMouseClicked(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent arg0) {
					// TODO Auto-generated method stub
					if(!label1.getText().equals("您還未點過餐")) {
					KeyValue kv1 = new KeyValue(label1.textFillProperty(), Color.BLACK);
					KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1);
					
					KeyValue kv2 = new KeyValue(label1.textFillProperty(), Color.WHITE);
					KeyFrame kf2 = new KeyFrame(Duration.seconds(0.07), kv2);
					
					Timeline timeline1 = new Timeline(90);
					timeline1.getKeyFrames().addAll(kf1,kf2);
					timeline1.setDelay(Duration.seconds(0));
					timeline1.setCycleCount(4);
					timeline1.setAutoReverse(true);
					timeline1.play();
					
					timeline.play();
					ListPane.this.setTopAnchor(sump1, 100.0);
					ListPane.this.setLeftAnchor(sump1, 800.0);
					ListPane.this.getChildren().remove(sump1);
					ListPane.this.getChildren().remove(sump2);
					ListPane.this.getChildren().remove(sump3);
					ListPane.this.getChildren().remove(sump4);
					ListPane.this.getChildren().remove(sump5);
					timeline.setOnFinished(new EventHandler<ActionEvent>() {

						@Override
						public void handle(ActionEvent arg0) {
							// TODO Auto-generated method stub
							
							ListPane.this.getChildren().add(sump1);
						}
					});
				}
				}
			});
			
		
		
			rec4.setOnMouseClicked(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent arg0) {
					// TODO Auto-generated method stub
					if(!label2.getText().equals("")) {
					KeyValue kv1 = new KeyValue(label2.textFillProperty(), Color.BLACK);
					KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1);
					
					KeyValue kv2 = new KeyValue(label2.textFillProperty(), Color.WHITE);
					KeyFrame kf2 = new KeyFrame(Duration.seconds(0.07), kv2);
					
					Timeline timeline1 = new Timeline(90);
					timeline1.getKeyFrames().addAll(kf1,kf2);
					timeline1.setDelay(Duration.seconds(0));
					timeline1.setCycleCount(4);
					timeline1.setAutoReverse(true);
					timeline1.play();
					
					timeline.play();
					ListPane.this.setTopAnchor(sump2, 100.0);
					ListPane.this.setLeftAnchor(sump2, 800.0);
					ListPane.this.getChildren().remove(sump1);
					ListPane.this.getChildren().remove(sump2);
					ListPane.this.getChildren().remove(sump3);
					ListPane.this.getChildren().remove(sump4);
					ListPane.this.getChildren().remove(sump5);
					timeline.setOnFinished(new EventHandler<ActionEvent>() {

						@Override
						public void handle(ActionEvent arg0) {
							// TODO Auto-generated method stub

							
							ListPane.this.getChildren().add(sump2);
						}
					});
				}
				}
			});
			
		
		
			rec5.setOnMouseClicked(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent arg0) {
					// TODO Auto-generated method stub
					if(!label3.getText().equals("")) {
					KeyValue kv1 = new KeyValue(label3.textFillProperty(), Color.BLACK);
					KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1);
					
					KeyValue kv2 = new KeyValue(label3.textFillProperty(), Color.WHITE);
					KeyFrame kf2 = new KeyFrame(Duration.seconds(0.07), kv2);
					
					Timeline timeline1 = new Timeline(90);
					timeline1.getKeyFrames().addAll(kf1,kf2);
					timeline1.setDelay(Duration.seconds(0));
					timeline1.setCycleCount(4);
					timeline1.setAutoReverse(true);
					timeline1.play();
					
					timeline.play();
					ListPane.this.setTopAnchor(sump3, 100.0);
					ListPane.this.setLeftAnchor(sump3, 800.0);
					ListPane.this.getChildren().remove(sump1);
					ListPane.this.getChildren().remove(sump2);
					ListPane.this.getChildren().remove(sump3);
					ListPane.this.getChildren().remove(sump4);
					ListPane.this.getChildren().remove(sump5);
					timeline.setOnFinished(new EventHandler<ActionEvent>() {

						@Override
						public void handle(ActionEvent arg0) {
							// TODO Auto-generated method stub
							
							ListPane.this.getChildren().add(sump3);
						}
					});
				}
				}
			});
			
		
		
			rec6.setOnMouseClicked(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent arg0) {
					// TODO Auto-generated method stub
					if(!label4.getText().equals("")) {
					KeyValue kv1 = new KeyValue(label4.textFillProperty(), Color.BLACK);
					KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1);
					
					KeyValue kv2 = new KeyValue(label4.textFillProperty(), Color.WHITE);
					KeyFrame kf2 = new KeyFrame(Duration.seconds(0.07), kv2);
					
					Timeline timeline1 = new Timeline(90);
					timeline1.getKeyFrames().addAll(kf1,kf2);
					timeline1.setDelay(Duration.seconds(0));
					timeline1.setCycleCount(4);
					timeline1.setAutoReverse(true);
					timeline1.play();
					
					timeline.play();
					ListPane.this.setTopAnchor(sump4, 100.0);
					ListPane.this.setLeftAnchor(sump4, 800.0);
					ListPane.this.getChildren().remove(sump1);
					ListPane.this.getChildren().remove(sump2);
					ListPane.this.getChildren().remove(sump3);
					ListPane.this.getChildren().remove(sump4);
					ListPane.this.getChildren().remove(sump5);
					timeline.setOnFinished(new EventHandler<ActionEvent>() {

						@Override
						public void handle(ActionEvent arg0) {
							// TODO Auto-generated method stub
							
							ListPane.this.getChildren().add(sump4);
						}
					});
				}
				}
			});
			
		
		
			rec7.setOnMouseClicked(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent arg0) {
					// TODO Auto-generated method stub
					if(!label5.getText().equals("")) {
					KeyValue kv1 = new KeyValue(label5.textFillProperty(), Color.BLACK);
					KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1);
					
					KeyValue kv2 = new KeyValue(label5.textFillProperty(), Color.WHITE);
					KeyFrame kf2 = new KeyFrame(Duration.seconds(0.07), kv2);
					
					Timeline timeline1 = new Timeline(90);
					timeline1.getKeyFrames().addAll(kf1,kf2);
					timeline1.setDelay(Duration.seconds(0));
					timeline1.setCycleCount(4);
					timeline1.setAutoReverse(true);
					timeline1.play();
					
					timeline.play();
					ListPane.this.setTopAnchor(sump5, 100.0);
					ListPane.this.setLeftAnchor(sump5, 800.0);
					ListPane.this.getChildren().remove(sump1);
					ListPane.this.getChildren().remove(sump2);
					ListPane.this.getChildren().remove(sump3);
					ListPane.this.getChildren().remove(sump4);
					ListPane.this.getChildren().remove(sump5);
					timeline.setOnFinished(new EventHandler<ActionEvent>() {

						@Override
						public void handle(ActionEvent arg0) {
							// TODO Auto-generated method stub
							
							ListPane.this.getChildren().add(sump5);
						}
					});
				}
				}
			});
			
		
		
		
		this.setPrefHeight(728);
		this.setPrefWidth(1396);
	}

}
