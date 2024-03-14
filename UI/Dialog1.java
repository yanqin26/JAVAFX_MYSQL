package UI;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.util.Duration;

public class Dialog1 extends BackgroundPane{
	
	SystemPane sp = new SystemPane();
	
	public Dialog1() {
		Rectangle rec1 = new Rectangle(1396, 100);
		Rectangle rec11 = new Rectangle(120, 200);
		Rectangle rec12 = new Rectangle(120, 200);
		Rectangle rec2 = new Rectangle(800, 2);
		Rectangle rec3 = new Rectangle(10, 3);
		Rectangle rec4 = new Rectangle(10, 3);
		Rectangle rec5 = new Rectangle(1396, 4);
		Rectangle rec6 = new Rectangle(1396, 4);
		Rectangle rec7 = new Rectangle(1396, 1.5);
		Rectangle rec8 = new Rectangle(1396, 1.5);
		Label label1 = new Label("òž");
		Label label2 = new Label("×C");
		Label label3 = new Label("Í¨ß^");
		
		rec1.setFill(Color.valueOf("#363636"));
		rec2.setFill(Color.valueOf("#FFF8DC"));
		rec3.setFill(Color.valueOf("#FFF8DC"));
		rec4.setFill(Color.valueOf("#FFF8DC"));
		label1.setFont(Font.font(40));
		label1.setTextFill(Color.valueOf("#FFFACD"));
		label2.setFont(Font.font(40));
		label2.setTextFill(Color.valueOf("#FFFACD"));
		label3.setFont(Font.font(20));
		label3.setTextFill(Color.valueOf("#FFFACD"));
		
		this.getChildren().add(rec1);
		this.getChildren().add(rec2);
		this.getChildren().add(label1);
		this.getChildren().add(label2);
		this.getChildren().add(rec3);
		this.getChildren().add(rec4);
		this.getChildren().add(rec5);
		this.getChildren().add(rec6);
		//this.getChildren().add(rec7);
		//this.getChildren().add(rec8);
		
		
		this.setLeftAnchor(rec1, 0.0);
		this.setTopAnchor(rec1, 350.0);
		
		this.setLeftAnchor(rec11, 597.0);
		this.setTopAnchor(rec11, 300.0);
		
		this.setLeftAnchor(rec12, 697.0);
		this.setTopAnchor(rec12, 300.0);
		
		this.setLeftAnchor(rec2, 300.0);
		this.setTopAnchor(rec2, 420.0);
		
		this.setLeftAnchor(label1, 650.0);
		this.setTopAnchor(label1, 370.0);
		
		this.setLeftAnchor(label2, 700.0);
		this.setTopAnchor(label2, 370.0);
		
		this.setLeftAnchor(label3, 678.0);
		this.setTopAnchor(label3, 420.0);
		
		this.setLeftAnchor(rec3, 620.0);
		this.setTopAnchor(rec3, 400.0);
		
		this.setLeftAnchor(rec4, 760.0);
		this.setTopAnchor(rec4, 400.0);
		
		this.setLeftAnchor(rec5, 0.0);
		this.setTopAnchor(rec5, 348.0);
		
		this.setLeftAnchor(rec6, 0.0);
		this.setTopAnchor(rec6, 450.0);
		
		this.setLeftAnchor(rec7, 0.0);
		this.setTopAnchor(rec7, 346.0);
		
		this.setLeftAnchor(rec8, 0.0);
		this.setTopAnchor(rec8, 452.0);
		
		Timeline timeline2 = new Timeline();
		
		KeyValue kv00 = new KeyValue(rec1.fillProperty(), Color.BLACK);
		KeyFrame kf01 = new KeyFrame(Duration.seconds(0), kv00);
		
		KeyValue kv02 = new KeyValue(rec1.fillProperty(), Color.valueOf("#CDC8B1"));
		KeyFrame kf03 = new KeyFrame(Duration.seconds(0.2), kv02);
		
		timeline2.getKeyFrames().addAll(kf01,kf03);
		timeline2.setDelay(Duration.seconds(0));
		timeline2.setCycleCount(2);
		timeline2.setAutoReverse(true);
		timeline2.play();
		
		
		KeyValue kv1 = new KeyValue(rec3.translateXProperty(), 0);
		KeyValue kv3 = new KeyValue(rec4.translateXProperty(), 0);
		KeyValue kv5 = new KeyValue(label1.translateXProperty(), 0);
		KeyValue kv7 = new KeyValue(label2.translateXProperty(), 0);
		KeyValue kv9 = new KeyValue(rec5.translateYProperty(), 0);
		KeyValue kv11 = new KeyValue(rec6.translateYProperty(), 0);
		KeyValue kv13 = new KeyValue(rec7.translateYProperty(), 0);
		KeyValue kv15 = new KeyValue(rec8.translateYProperty(), 0);
		KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1,kv3,kv5,kv7,kv9,kv11,kv13,kv15);
		
		KeyValue kv2 = new KeyValue(rec3.translateXProperty(), -30);
		KeyValue kv4 = new KeyValue(rec4.translateXProperty(), 30);
		KeyValue kv6 = new KeyValue(label1.translateXProperty(), -15);
		KeyValue kv8 = new KeyValue(label2.translateXProperty(), 15);
		KeyValue kv10 = new KeyValue(rec5.translateYProperty(), -12);
		KeyValue kv12 = new KeyValue(rec6.translateYProperty(), 12);
		KeyValue kv14 = new KeyValue(rec7.translateYProperty(), -14);
		KeyValue kv16 = new KeyValue(rec8.translateYProperty(), 16);
		KeyFrame kf2 = new KeyFrame(Duration.seconds(0.7), kv2,kv4,kv6,kv8,kv10,kv12,kv14,kv16);
		
		Timeline timeline1 = new Timeline();
		timeline1.getKeyFrames().addAll(kf1,kf2);
		timeline1.setDelay(Duration.seconds(0.5));
		timeline1.play();
		
		KeyValue kv101 = new KeyValue(rec1.fillProperty(), Color.valueOf("#363636"));
		KeyFrame kf11 = new KeyFrame(Duration.seconds(0), kv101);
		
		KeyValue kv21 = new KeyValue(rec1.fillProperty(), Color.valueOf("#9C9C9C"));
		KeyFrame kf21 = new KeyFrame(Duration.seconds(0.3), kv21);
		
		Timeline timeline3 = new Timeline();
		timeline3.getKeyFrames().addAll(kf11,kf21);
		timeline3.setCycleCount(4);
		timeline3.setRate(6);
		timeline3.setAutoReverse(true);
		timeline3.setDelay(Duration.seconds(0));
		timeline3.play();
		
		timeline1.setOnFinished(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				timeline2.play();
				Dialog1.this.getChildren().add(label3);
			}
		});
		
		Rectangle rec501 = new Rectangle();
		
		KeyValue kv901 = new KeyValue(rec501.fillProperty(), Color.valueOf("#363636"));
		KeyFrame kf901 = new KeyFrame(Duration.seconds(0), kv901);

		KeyValue kv1001 = new KeyValue(rec501.fillProperty(), Color.valueOf("#363636"));
		KeyFrame kf1001 = new KeyFrame(Duration.seconds(0.05), kv1001);
		
		Timeline timeline601 = new Timeline(90);
		timeline601.getKeyFrames().addAll(kf901, kf1001);
		timeline601.setDelay(Duration.seconds(2.5));
		timeline601.setCycleCount(4);
		timeline601.setRate(6);
		timeline601.setAutoReverse(true);
		timeline601.play();	
		timeline601.setOnFinished(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				Dialog1.this.getChildren().clear();
				Dialog1.this.getChildren().add(sp);
				sp.getChildren().add(sp.op);
				sp.setTopAnchor(sp.op, 102.0);
				sp.setLeftAnchor(sp.op, 0.0);
			}
		});
		
	}
	
}
