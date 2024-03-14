package UI;

import Foods.Food;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Cursor;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;

public class TrolleyFoodPane extends AnchorPane{
	
	Label l1 = new Label("xxxxxxx");
	Label l2 = new Label("ÒÑ“íÓÐ:");
	Label l3 = new Label("x");
	
	Rectangle recAdd = new Rectangle(30,30);
	Rectangle recSub = new Rectangle(30,30);
	
	InformationPane[] imp = new InformationPane[32];
	
	Food food;

	public TrolleyFoodPane(Food food) {
		// TODO Auto-generated constructor stub
		
		this.food = food;
		
		Rectangle rec1 = new Rectangle(580,40);
		rec1.setFill(Color.valueOf("#1C1C1C90"));
		Rectangle rec2 = new Rectangle(580,40);
		rec2.setFill(Color.valueOf("#CDC9A5"));
		
		Line line1 = new Line(0,0 , 580,0);
		Line line2 = new Line(0,0 , 0,40);
		Line line3 = new Line(580,0 , 580,40);
		Line line4 = new Line(0,40 , 580,40);
		line1.setStrokeWidth(2);
		line2.setStrokeWidth(2);
		line3.setStrokeWidth(2);
		line4.setStrokeWidth(2);
		
		l1.setFont(Font.font(25));
		l2.setFont(Font.font(25));
		l3.setFont(Font.font(25));
		
		Rectangle rec3 = new Rectangle(30,30);
		Rectangle rec4 = new Rectangle(30,30);
		rec3.setFill(Color.valueOf("#8B8970"));
		rec4.setFill(Color.valueOf("#1C1C1C90"));
		Rectangle rec5 = new Rectangle(4,18);
		Rectangle rec6 = new Rectangle(18,4);
		rec5.setFill(Color.BLACK);
		rec6.setFill(Color.BLACK);
		
		recAdd.setFill(Color.valueOf("#1C1C1C00"));
		
		
		Rectangle rec7 = new Rectangle(30,30);
		Rectangle rec8 = new Rectangle(30,30);
		rec7.setFill(Color.valueOf("#8B8970"));
		rec8.setFill(Color.valueOf("#1C1C1C90"));
		Rectangle rec10 = new Rectangle(18,4);
		rec10.setFill(Color.BLACK);
		
		recSub.setFill(Color.valueOf("#1C1C1C00"));
		
		
		this.getChildren().addAll(rec1,rec2);
		this.getChildren().addAll(line1,line2,line3,line4);
		this.getChildren().addAll(l1,l2,l3);
		this.getChildren().addAll(rec4,rec3,rec5,rec6,recAdd);
		this.getChildren().addAll(rec8,rec7,rec10,recSub);
		
		
		this.setTopAnchor(rec1, 5.0);
		this.setLeftAnchor(rec1, 5.0);
		this.setTopAnchor(rec2, 0.0);
		this.setLeftAnchor(rec2, 0.0);
		
		this.setTopAnchor(l1, 2.0);
		this.setLeftAnchor(l1, 5.0);
		this.setTopAnchor(l2, 2.0);
		this.setLeftAnchor(l2, 250.0);
		this.setTopAnchor(l3, 4.0);
		this.setLeftAnchor(l3, 350.0);
		
		this.setTopAnchor(rec3, 5.0);
		this.setLeftAnchor(rec3, 450.0);
		this.setTopAnchor(rec4, 7.0);
		this.setLeftAnchor(rec4, 452.0);
		this.setTopAnchor(rec5, 11.5);
		this.setLeftAnchor(rec5, 462.5);
		this.setTopAnchor(rec6, 19.0);
		this.setLeftAnchor(rec6, 455.5);
		this.setTopAnchor(recAdd, 5.0);
		this.setLeftAnchor(recAdd, 450.0);
		
		this.setTopAnchor(rec7, 5.0);
		this.setLeftAnchor(rec7, 510.0);
		this.setTopAnchor(rec8, 7.0);
		this.setLeftAnchor(rec8, 512.0);
		this.setTopAnchor(rec10, 19.0);
		this.setLeftAnchor(rec10, 515.5);
		this.setTopAnchor(recSub, 5.0);
		this.setLeftAnchor(recSub, 510.0);
		
		recAdd.setOnMouseEntered(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.HAND);

				rec4.setFill(Color.valueOf("#1C1C1C90"));
				rec8.setFill(Color.valueOf("#1C1C1C90"));
				rec5.setFill(Color.BLACK);
				rec6.setFill(Color.BLACK);
				rec10.setFill(Color.BLACK);
				rec3.setFill(Color.valueOf("#8B8970"));
				rec7.setFill(Color.valueOf("#8B8970"));
				
				rec4.setFill(Color.valueOf("#1C1C1C00"));
				rec5.setFill(Color.WHITE);
				rec6.setFill(Color.WHITE);
				rec3.setFill(Color.BLACK);
				
			}
		});
		
		recSub.setOnMouseEntered(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.HAND);
				
				rec4.setFill(Color.valueOf("#1C1C1C90"));
				rec8.setFill(Color.valueOf("#1C1C1C90"));
				rec5.setFill(Color.BLACK);
				rec6.setFill(Color.BLACK);
				rec10.setFill(Color.BLACK);
				rec3.setFill(Color.valueOf("#8B8970"));
				rec7.setFill(Color.valueOf("#8B8970"));
				
				rec8.setFill(Color.valueOf("#1C1C1C00"));
				rec10.setFill(Color.WHITE);
				rec7.setFill(Color.BLACK);
				
				
			}
		});

		
		
		recAdd.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.DEFAULT);
				
				rec4.setFill(Color.valueOf("#1C1C1C90"));
				rec8.setFill(Color.valueOf("#1C1C1C90"));
				rec5.setFill(Color.BLACK);
				rec6.setFill(Color.BLACK);
				rec10.setFill(Color.BLACK);
				rec3.setFill(Color.valueOf("#8B8970"));
				rec7.setFill(Color.valueOf("#8B8970"));
			}
		});
		
		recSub.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.DEFAULT);
				
				rec4.setFill(Color.valueOf("#1C1C1C90"));
				rec8.setFill(Color.valueOf("#1C1C1C90"));
				rec5.setFill(Color.BLACK);
				rec6.setFill(Color.BLACK);
				rec10.setFill(Color.BLACK);
				rec3.setFill(Color.valueOf("#8B8970"));
				rec7.setFill(Color.valueOf("#8B8970"));
			}
		});
		
		recAdd.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				//food.add();
			}
		});
		
		recSub.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				//food.subtract();
			}
		});
		
		this.setPrefWidth(590);
		this.setPrefHeight(45);
		
		Background bg = new Background(new BackgroundFill(Paint.valueOf("#ffffff00"), new CornerRadii(0), new Insets(0)));
		this.setBackground(bg);
	}

}
