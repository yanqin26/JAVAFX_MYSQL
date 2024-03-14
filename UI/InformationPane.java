package UI;


import Foods.Food;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.util.Duration;
import javafx.scene.Cursor;

public class InformationPane extends AnchorPane{
	
	Label label1 = new Label("xxxxxx");
	Label label2 = new Label("xxxxxx");
	Label label3 = new Label("xx");
	Label label4 = new Label("xx");
	
	Rectangle rec11 = new Rectangle(12,2);
	Rectangle rec12 = new Rectangle(12,2);
	
	Food food = new Food();

	public InformationPane(Image i,Food food) {
		// TODO Auto-generated constructor stub
		this.food = food;
		
		label1.setFont(Font.font(21));
		label2.setFont(Font.font(17));
		
		
		Rectangle rec1 = new Rectangle(318,30);
		Label l1 = new Label("詳細信息");
		l1.setTextFill(Color.WHITE);
		l1.setFont(Font.font(20));
		
		ImageView im = new ImageView(i);
		im.setFitHeight(110);
		im.setFitWidth(110);
		
		Line line1 = new Line(14,51 , 124,51);
		Line line2 = new Line(14,51 , 14,160);
		Line line3 = new Line(124,51 , 124,160);
		Line line4 = new Line(14,163 , 124,163);
		
		line1.setStrokeWidth(3);
		line2.setStrokeWidth(3);
		line3.setStrokeWidth(3);
		line4.setStrokeWidth(3);
		
		Rectangle rec2 = new Rectangle(110,110);
		rec2.setFill(Color.valueOf("#00000080"));
		
		Rectangle rec3 = new Rectangle(310,3);
		Rectangle rec4 = new Rectangle(310,3);
		
		Rectangle rec5 = new Rectangle(140,37);
		rec5.setFill(Color.valueOf("#36363650"));
		Rectangle rec6 = new Rectangle(5,37);
		Rectangle rec7 = new Rectangle(23,23);
		
		Rectangle rec8 = new Rectangle(140,37);
		rec8.setFill(Color.valueOf("#36363650"));
		Rectangle rec9 = new Rectangle(5,37);
		Rectangle rec10 = new Rectangle(23,23);
		
		Label l2 = new Label("NO ERROR");
		l2.setFont(Font.font(17));
		
		Label l3 = new Label("增加");
		l3.setFont(Font.font(20));
		
		Label l4 = new Label("減少");
		l4.setFont(Font.font(20));

		rec11.setRotate(45);
		rec12.setRotate(135);
		rec11.setFill(Color.valueOf("#36363650"));
		rec12.setFill(Color.valueOf("#36363650"));
		
		Label l5 = new Label("當前剩余:");
		Label l6 = new Label("已擁有:");
		
		l5.setFont(Font.font(20));
		l6.setFont(Font.font(20));
		
		label3.setFont(Font.font(20));
		label4.setFont(Font.font(20));
		
		String a = food.getBeforeNumber() + "";
		label3.setText(a);
		label4.setText("0");
		
		label1.setText(food.getName());
		
		Label l7 = new Label("價格:");
		l7.setFont(Font.font(20));
		
		
		
		this.getChildren().addAll(rec2);
		this.getChildren().addAll(rec1,l1,im);
		this.getChildren().addAll(line1,line2,line3,line4);
		this.getChildren().addAll(rec3,rec4);
		this.getChildren().addAll(label1,label2);
		this.getChildren().addAll(rec5,rec6,rec7);
		this.getChildren().addAll(rec8,rec9,rec10,l2,l3,l4);
		this.getChildren().addAll(rec11,rec12);
		this.getChildren().addAll(l5,l6);
		this.getChildren().addAll(label3,label4,l7);
		
		
		this.setTopAnchor(rec1, 0.0);
		this.setLeftAnchor(rec1, 0.0);
		this.setTopAnchor(l1, 1.0);
		this.setLeftAnchor(l1, 8.0);
		this.setTopAnchor(im, 50.0);
		this.setLeftAnchor(im, 13.0);
		this.setTopAnchor(rec2, 56.0);
		this.setLeftAnchor(rec2, 19.0);
		
		this.setTopAnchor(rec3, 180.0);
		this.setLeftAnchor(rec3, 4.0);
		this.setTopAnchor(rec4, 330.0);
		this.setLeftAnchor(rec4, 4.0);
		
		this.setTopAnchor(label1, 50.0);
		this.setLeftAnchor(label1, 140.0);
		this.setTopAnchor(label2, 260.0);
		this.setRightAnchor(label2, 20.0);
		
		this.setTopAnchor(rec5, 340.0);
		this.setLeftAnchor(rec5, 20.0);
		this.setTopAnchor(rec6, 340.0);
		this.setLeftAnchor(rec6, 20.0);
		this.setTopAnchor(rec7, 347.0);
		this.setLeftAnchor(rec7, 31.0);

		this.setTopAnchor(rec8, 390.0);
		this.setLeftAnchor(rec8, 20.0);
		this.setTopAnchor(rec9, 390.0);
		this.setLeftAnchor(rec9, 20.0);
		this.setTopAnchor(rec10, 397.0);
		this.setLeftAnchor(rec10, 31.0);
		
		this.setTopAnchor(l2, 305.0);
		this.setLeftAnchor(l2, 115.0);
		this.setTopAnchor(l3, 345.0);
		this.setLeftAnchor(l3, 60.0);
		this.setTopAnchor(l4, 394.0);
		this.setLeftAnchor(l4, 60.0);
		
		this.setTopAnchor(rec11, 38.0);
		this.setLeftAnchor(rec11, 300.0);
		this.setTopAnchor(rec12, 38.0);
		this.setLeftAnchor(rec12, 300.0);
		
		this.setTopAnchor(l5, 200.0);
		this.setLeftAnchor(l5, 5.0);
		this.setTopAnchor(l6, 230.0);
		this.setLeftAnchor(l6, 5.0);
		
		this.setTopAnchor(label3, 200.0);
		this.setRightAnchor(label3, 20.0);
		this.setTopAnchor(label4, 230.0);
		this.setRightAnchor(label4, 20.0);
		
		this.setTopAnchor(l7, 260.0);
		this.setLeftAnchor(l7, 5.0);
		
		rec5.setOnMouseEntered(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.HAND);
				rec5.setFill(Color.valueOf("#36363650"));
				rec6.setFill(Color.BLACK);
				rec7.setFill(Color.BLACK);
				rec8.setFill(Color.valueOf("#36363650"));
				rec9.setFill(Color.BLACK);
				rec10.setFill(Color.BLACK);
				l3.setTextFill(Color.BLACK);
				l4.setTextFill(Color.BLACK);
				
				InformationPane.this.setTopAnchor(rec5, 340.0);
				InformationPane.this.setLeftAnchor(rec5, 20.0);
				InformationPane.this.setTopAnchor(rec6, 340.0);
				InformationPane.this.setLeftAnchor(rec6, 20.0);
				InformationPane.this.setTopAnchor(rec7, 347.0);
				InformationPane.this.setLeftAnchor(rec7, 31.0);

				InformationPane.this.setTopAnchor(rec8, 390.0);
				InformationPane.this.setLeftAnchor(rec8, 20.0);
				InformationPane.this.setTopAnchor(rec9, 390.0);
				InformationPane.this.setLeftAnchor(rec9, 20.0);
				InformationPane.this.setTopAnchor(rec10, 397.0);
				InformationPane.this.setLeftAnchor(rec10, 31.0);
				
				rec5.setFill(Color.BLACK);
				rec6.setFill(Color.WHITE);
				rec7.setFill(Color.WHITE);
				l3.setTextFill(Color.WHITE);
				
				InformationPane.this.setTopAnchor(rec5, 340.0);
				InformationPane.this.setLeftAnchor(rec5, 30.0);
				InformationPane.this.setTopAnchor(rec6, 340.0);
				InformationPane.this.setLeftAnchor(rec6, 30.0);
				InformationPane.this.setTopAnchor(rec7, 347.0);
				InformationPane.this.setLeftAnchor(rec7, 41.0);
				InformationPane.this.setTopAnchor(l3, 345.0);
				InformationPane.this.setLeftAnchor(l3, 70.0);
			}
		});
		
		
		rec8.setOnMouseEntered(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.HAND);
				rec8.setFill(Color.valueOf("#36363650"));
				rec9.setFill(Color.BLACK);
				rec10.setFill(Color.BLACK);
				rec5.setFill(Color.valueOf("#36363650"));
				rec6.setFill(Color.BLACK);
				rec7.setFill(Color.BLACK);
				l3.setTextFill(Color.BLACK);
				l4.setTextFill(Color.BLACK);
				
				InformationPane.this.setTopAnchor(rec5, 340.0);
				InformationPane.this.setLeftAnchor(rec5, 20.0);
				InformationPane.this.setTopAnchor(rec6, 340.0);
				InformationPane.this.setLeftAnchor(rec6, 20.0);
				InformationPane.this.setTopAnchor(rec7, 347.0);
				InformationPane.this.setLeftAnchor(rec7, 31.0);

				InformationPane.this.setTopAnchor(rec8, 390.0);
				InformationPane.this.setLeftAnchor(rec8, 20.0);
				InformationPane.this.setTopAnchor(rec9, 390.0);
				InformationPane.this.setLeftAnchor(rec9, 20.0);
				InformationPane.this.setTopAnchor(rec10, 397.0);
				InformationPane.this.setLeftAnchor(rec10, 31.0);
				
				rec8.setFill(Color.BLACK);
				rec9.setFill(Color.WHITE);
				rec10.setFill(Color.WHITE);
				l4.setTextFill(Color.WHITE);
				
				InformationPane.this.setTopAnchor(rec8, 390.0);
				InformationPane.this.setLeftAnchor(rec8, 30.0);
				InformationPane.this.setTopAnchor(rec9, 390.0);
				InformationPane.this.setLeftAnchor(rec9, 30.0);
				InformationPane.this.setTopAnchor(rec10, 397.0);
				InformationPane.this.setLeftAnchor(rec10, 41.0);
				InformationPane.this.setTopAnchor(l4, 394.0);
				InformationPane.this.setLeftAnchor(l4, 70.0);
			}
		});
		
		rec11.setOnMouseEntered(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				rec11.setFill(Color.valueOf("#36363650"));
				rec12.setFill(Color.valueOf("#36363650"));
				
				setCursor(Cursor.HAND);
				rec11.setFill(Color.RED);
				rec12.setFill(Color.RED);
			}
		});
		
		rec12.setOnMouseEntered(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				rec11.setFill(Color.valueOf("#36363650"));
				rec12.setFill(Color.valueOf("#36363650"));
				
				setCursor(Cursor.HAND);
				rec11.setFill(Color.RED);
				rec12.setFill(Color.RED);
			}
		});
		
		rec11.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				rec11.setFill(Color.valueOf("#36363650"));
				rec12.setFill(Color.valueOf("#36363650"));
				setCursor(Cursor.DEFAULT);
			}
		});
		
		rec12.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				rec11.setFill(Color.valueOf("#36363650"));
				rec12.setFill(Color.valueOf("#36363650"));
				setCursor(Cursor.DEFAULT);
			}
		});
		
		rec5.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				KeyValue kv1 = new KeyValue(rec5.fillProperty(), Color.BLACK);
				KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1);
				
				KeyValue kv2 = new KeyValue(rec5.fillProperty(), Color.WHITE);
				KeyFrame kf2 = new KeyFrame(Duration.seconds(0.04), kv2);

				Timeline timeline1 = new Timeline(90);
				timeline1.getKeyFrames().addAll(kf1,kf2);
				timeline1.setDelay(Duration.seconds(0));
				timeline1.setCycleCount(4);
				timeline1.setAutoReverse(true);
				timeline1.play();
				
				food.add();
				
				label3.setText("" + food.getNowNumber());
				label4.setText("" + food.getNumber());
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
				
				food.subtract();
				
				label3.setText("" + food.getNowNumber());
				label4.setText("" + food.getNumber());
			}
		});
		
		
		this.setBackground(new Background(new BackgroundFill(Paint.valueOf("#8B897090"), new CornerRadii(0), new Insets(0))));
		this.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, new CornerRadii(0), new BorderWidths(2))));
		
		this.setPrefHeight(450);
		this.setPrefWidth(320);
	}
	
	public void setLabel1(String s){
		label1.setText(s);
	}
	
	public void setLabel2(String s){
		label2.setText(s);
	}
	

}
