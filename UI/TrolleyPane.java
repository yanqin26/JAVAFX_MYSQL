package UI;

import Backend.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;

public class TrolleyPane extends AnchorPane{
	
	String name = "";
	String password = "";
	
	VBox vbox = new VBox();
	
	public TrolleyPane() {
		// TODO Auto-generated constructor stub
		
		Label l1 = new Label("TROLLEY");
		l1.setFont(Font.font(51));
		l1.setTextFill(Color.valueOf("#36363680"));
		Label l2 = new Label("TROLLEY");
		l2.setFont(Font.font(51));
		
		Label l3 = new Label("在這裏查看購物車");
		l3.setFont(Font.font(20));
		Rectangle rec1 = new Rectangle(15,5);
		Label l4 = new Label("在這裏查看購物車");
		l4.setFont(Font.font(20));
		Rectangle rec2 = new Rectangle(15,5);
		
		
		vbox.setPrefWidth(600);
		vbox.setPrefHeight(716);
		vbox.setPadding(new Insets(15));
		
		Background bg = new Background(new BackgroundFill(Paint.valueOf("#CDC8B1"), new CornerRadii(0), new Insets(0)));
		vbox.setBackground(bg);
		vbox.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, new CornerRadii(0), new BorderWidths(2))));
		
		
		
		
		
		
		this.getChildren().addAll(l1,l2);
		this.getChildren().addAll(vbox);
		
		
		
		
		
		
		this.setTopAnchor(l1, 100.0);
		this.setLeftAnchor(l1, 60.0);
		this.setTopAnchor(l2, 96.0);
		this.setLeftAnchor(l2, 56.0);
		
		
		this.setTopAnchor(l3, 169.0);
		this.setLeftAnchor(l3, 86.0);
		this.setTopAnchor(rec1, 180.0);
		this.setLeftAnchor(rec1, 60.0);
		

		this.setTopAnchor(vbox, 6.0);
		this.setLeftAnchor(vbox, 380.0);
		
		
		
		
		this.setPrefHeight(728);
		this.setPrefWidth(1396);
	}

}
