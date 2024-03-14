package UI;



import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Effect;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;

public class AboutUsPane extends AnchorPane{
	
	AboutUsPane(){
		
		//TextArea ta1 = new TextArea("11111111111111111111111111111111111111111111111");
	
		
		
		
		Label tf1 = new Label("");
		
		this.getChildren().add(tf1);
		this.setTopAnchor(tf1, 13.0);
		this.setLeftAnchor(tf1, 13.0);
		
		tf1.setFont(Font.font(14));
		
		this.setPrefWidth(600);
		this.setPrefHeight(650);
		this.setBackground(new Background(new BackgroundFill(Color.valueOf("#CDC8B1"), new CornerRadii(0), new Insets(0))));
	}
	
	public Effect geteffect() {
		DropShadow ds = new DropShadow();
		
		return ds;
	}

}
