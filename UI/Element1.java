package UI;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Effect;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.util.Duration;

public class Element1 extends AnchorPane{

	Label label1 = new Label("PERMISSIONS");
	Label label2 = new Label("TO CONFIRM");
	
	
	Element1(){
		label2.setEffect(geteffect());
		
		label1.setTextFill(Color.BLACK);
		label1.setFont(Font.font(30));
		
		label2.setTextFill(Color.WHITE);
		label2.setFont(Font.font(20));
		
		this.getChildren().add(label1);
		this.setLeftAnchor(label1, 20.0);
		
		Rectangle rec1 = new Rectangle(0.001,27,Color.BLACK);
		this.getChildren().add(rec1);
		this.setTopAnchor(rec1, 40.0);
		this.setLeftAnchor(rec1, 22.0);
		
		KeyValue kv1 = new KeyValue(rec1.widthProperty(), 40);
		KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1);
		
		KeyValue kv2 = new KeyValue(rec1.widthProperty(), 200);
		KeyFrame kf2 = new KeyFrame(Duration.seconds(0.2), kv2);
		
		Timeline timeline1 = new Timeline(90);
		timeline1.getKeyFrames().addAll(kf1,kf2);
		timeline1.setDelay(Duration.seconds(3.6));
		timeline1.play();
		
		KeyValue kv3 = new KeyValue(rec1.fillProperty(), Color.BLACK);
		KeyFrame kf3 = new KeyFrame(Duration.seconds(0), kv3);
		
		KeyValue kv4 = new KeyValue(rec1.fillProperty(), Color.WHITE);
		KeyFrame kf4 = new KeyFrame(Duration.seconds(0.05), kv4);
		
		Timeline timeline2 = new Timeline(90);
		timeline2.getKeyFrames().addAll(kf3,kf4);
		timeline2.setDelay(Duration.seconds(3.5));
		timeline2.setCycleCount(4);
		timeline2.setAutoReverse(true);
		timeline2.play();
		
		Rectangle rec2 = new Rectangle(3, 0.1, Color.BLACK);
		this.getChildren().add(rec2);
		this.setTopAnchor(rec2, 8.0);

		Rectangle rec3 = new Rectangle(3, 0.1, Color.BLACK);
		this.getChildren().add(rec3);
		this.setTopAnchor(rec3, 8.0);
		this.setLeftAnchor(rec3, 13.0);
		
		KeyValue kv5 = new KeyValue(rec2.heightProperty(), 0);
		KeyValue kv7 = new KeyValue(rec3.heightProperty(), 0);
		KeyFrame kf5 = new KeyFrame(Duration.seconds(0), kv5,kv7);
		
		KeyValue kv6 = new KeyValue(rec2.heightProperty(), 60);
		KeyValue kv8 = new KeyValue(rec3.heightProperty(), 60);
		KeyFrame kf6 = new KeyFrame(Duration.seconds(1), kv6,kv8);
		Timeline timeline3 = new Timeline(90);
		timeline3.getKeyFrames().addAll(kf5,kf6);
		timeline3.setDelay(Duration.seconds(3.3));
		timeline3.play();
		
		timeline1.setOnFinished(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
			}
		});
		
		
		timeline2.setOnFinished(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Element1.this.getChildren().add(label2);
				Element1.this.setTopAnchor(label2, 40.0);
				Element1.this.setLeftAnchor(label2, 23.0);
			}
		});
		
		
		this.setWidth(300);
		this.setHeight(300);
		
		
		
	}
	
	public Effect geteffect() {
		DropShadow ds = new DropShadow();
		
		return ds;
	}
	
	
}
