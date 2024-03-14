package UI;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.transform.Scale;
import javafx.util.Duration;

public class StartAnimationPane3 extends BackgroundPane{
	
	
	public StartAnimationPane3() {
		
		Rectangle rec = new Rectangle(0.1, 2, Color.BLACK);	
		
		this.getChildren().add(rec);
		this.setTopAnchor(rec, 330.0);
		this.setLeftAnchor(rec, 0.0);
		
		KeyValue kv1 = new KeyValue(rec.widthProperty(), 0);
		KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1);
		
		KeyValue kv2 = new KeyValue(rec.widthProperty(), 1400);
		KeyFrame kf2 = new KeyFrame(Duration.seconds(0.15), kv2);
		
		Timeline timeline1 = new Timeline(144);
		timeline1.getKeyFrames().addAll(kf1,kf2);
		timeline1.setDelay(Duration.seconds(0.3));
		timeline1.play();
		
		KeyValue kv3 = new KeyValue(rec.heightProperty(), 0);
		KeyFrame kf3 = new KeyFrame(Duration.seconds(0), kv3);
		
		KeyValue kv4 = new KeyValue(rec.heightProperty(), 100);
		KeyFrame kf4 = new KeyFrame(Duration.seconds(0.1), kv4);
		
		Timeline timeline2 = new Timeline(144);
		timeline2.getKeyFrames().addAll(kf3,kf4);
		timeline2.setDelay(Duration.seconds(0.2));
		
		
		timeline1.setOnFinished(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				timeline2.play();	
			}
		});
		
				
		Label label = new Label("WELCOME");	
		
		timeline2.setOnFinished(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {			
				label.setFont(Font.font("", FontWeight.BOLD, FontPosture.REGULAR, 80));
				label.setTextFill(Color.WHITE);
				StartAnimationPane3.this.getChildren().add(label);
				StartAnimationPane3.this.setTopAnchor(label, 330.0);
				StartAnimationPane3.this.setLeftAnchor(label, 490.0);
				
			}
		});
		
	}

}
