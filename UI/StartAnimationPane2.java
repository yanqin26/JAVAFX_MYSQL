package UI;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Effect;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.util.Duration;

public class StartAnimationPane2 extends BackgroundPane{
	
	boolean isend = false;
	
	StartAnimationPane2(){
		

		Rectangle rec1 = new Rectangle(0.01, 5, Color.BLACK);
		this.getChildren().add(rec1);
		this.setTopAnchor(rec1, 300.0);
		this.setLeftAnchor(rec1, 560.0);
		
		
		KeyValue kv1 = new KeyValue(rec1.widthProperty(), 0);
		KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1);
		
		KeyValue kv2 = new KeyValue(rec1.widthProperty(), 213);
		KeyFrame kf2 = new KeyFrame(Duration.seconds(0.1), kv2);
		
		Timeline timeline1 = new Timeline();
		timeline1.getKeyFrames().addAll(kf1,kf2);
		timeline1.setDelay(Duration.seconds(0.5));
		timeline1.play();
		
		timeline1.setOnFinished(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				rec1.setFill(Color.BLACK);
				
				//第一行
				Label label1 = new Label("ORDER OS");
				label1.setTextFill(Color.BLACK);
				label1.setFont(Font.font("", FontWeight.BOLD, FontPosture.REGULAR, 40));
				
				StartAnimationPane2.this.getChildren().add(label1);
				StartAnimationPane2.this.setTopAnchor(label1, 300.0);
				StartAnimationPane2.this.setLeftAnchor(label1, 560.0);
			}
		});
			
	
		//第二行
		Rectangle rec2 = new Rectangle(0.01, 40, Color.BLACK);
		this.getChildren().add(rec2);
		this.setTopAnchor(rec2, 346.0);
		this.setLeftAnchor(rec2, 560.0);
		
		KeyValue kv3 = new KeyValue(rec2.widthProperty(), 150);
		KeyFrame kf3 = new KeyFrame(Duration.seconds(0), kv3);
		
		KeyValue kv4 = new KeyValue(rec2.widthProperty(), 210);
		KeyFrame kf4 = new KeyFrame(Duration.seconds(0.1), kv4);
		
		Timeline timeline2 = new Timeline();
		timeline2.getKeyFrames().addAll(kf3,kf4);
		timeline2.setDelay(Duration.seconds(0.6));
		timeline2.play();
		
		KeyValue kv5 = new KeyValue(rec2.fillProperty(), Color.BLACK);
		KeyFrame kf5 = new KeyFrame(Duration.seconds(0), kv5);
		
		KeyValue kv6 = new KeyValue(rec2.fillProperty(), Color.WHITE);
		KeyFrame kf6 = new KeyFrame(Duration.seconds(0.07), kv6);
		
		Timeline timeline3 = new Timeline(90);
		timeline3.getKeyFrames().addAll(kf5,kf6);
		timeline3.setDelay(Duration.seconds(0.6));
		timeline3.setCycleCount(6);
		timeline3.setAutoReverse(true);
		timeline3.play();
		

		Line line1 = new Line(563,405 , 773,405);
		line1.setStrokeWidth(1.5);
		Line line2 = new Line(563,420 , 773,420);
		line2.setStrokeWidth(1.5);
		Line line3 = new Line(563,405 , 563,420);
		line3.setStrokeWidth(1.5);
		Line line4 = new Line(773,405 , 773,420);
		line4.setStrokeWidth(1.5);
		
		Rectangle rec3 = new Rectangle(0.01, 13, Color.valueOf("#FFFFFF"));
		
		timeline2.setOnFinished(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {

				Label label2 = new Label("ordering system");
				label2.setEffect(geteffect());
				label2.setTextFill(Color.WHITE);
				label2.setFont(Font.font(25));
				
				StartAnimationPane2.this.getChildren().add(label2);
				StartAnimationPane2.this.setTopAnchor(label2, 350.0);
				StartAnimationPane2.this.setLeftAnchor(label2, 569.0);
				
				StartAnimationPane2.this.getChildren().addAll(line1,line2,line3,line4,rec3);
				
				StartAnimationPane2.this.setTopAnchor(rec3, 404.0);
				StartAnimationPane2.this.setLeftAnchor(rec3, 562.0);
				
			}
		});
		
		rec3.setEffect(geteffect());
		
		KeyValue kv9 = new KeyValue(rec3.widthProperty(), 0);
		KeyFrame kf9 = new KeyFrame(Duration.seconds(0), kv9);
		
		KeyValue kv10 = new KeyValue(rec3.widthProperty(), 208.0);
		KeyFrame kf10 = new KeyFrame(Duration.seconds(3), kv10);
		
		Timeline timeline4 = new Timeline();
		timeline4.getKeyFrames().addAll(kf9,kf10);
		timeline4.setDelay(Duration.seconds(0.6));
		timeline4.play();
		
		timeline4.setOnFinished(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Label label201 = new Label("CONNECTED");
				
				StartAnimationPane2.this.getChildren().add(label201);
				StartAnimationPane2.setTopAnchor(label201, 430.0);
				StartAnimationPane2.setLeftAnchor(label201, 573.0);
				label201.setFont(Font.font(30));
				
				KeyValue kv20 = new KeyValue(label201.textFillProperty(), Color.BLACK);
				KeyFrame kf20 = new KeyFrame(Duration.seconds(0), kv20);
				
				KeyValue kv21 = new KeyValue(label201.textFillProperty(), Color.WHITE);
				KeyFrame kf21 = new KeyFrame(Duration.seconds(0.07), kv21);
				
				Timeline timeline5 = new Timeline(90);
				timeline5.getKeyFrames().addAll(kf20,kf21);
				timeline5.setDelay(Duration.seconds(0));
				timeline5.setCycleCount(4);
				timeline5.setAutoReverse(true);
				timeline5.play();
			}
		});

		
		
	}
	public Effect geteffect() {
		DropShadow ds = new DropShadow();
		
		return ds;
	}

}
