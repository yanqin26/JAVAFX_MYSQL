package UI;


import Backend.*;
import Foods.Food;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Effect;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.util.Duration;

public class OrderPane extends AnchorPane{
	
	Rectangle rec18 = new Rectangle(430-63+2,50);
	Timeline timeline = new Timeline(90);
	
	InformationPane[] imp = new InformationPane[33];
	
	Rectangle rec23 = new Rectangle(323,0.01);
	Rectangle rec24 = new Rectangle(320,0.01);
	
	boolean Clicked = false;
	
	Food food1 = new Food("±±æ©øæ—º");
	Food food2 = new Food("Ù˘÷≠’Ù∑Ô◊¶");
	Food food3 = new Food("ÀÆæßœ∫Ω»");
	Food food4 = new Food(" ®◊”Õ∑");
	Food food5 = new Food("…’¿∞");
	Food food6 = new Food("ÀÆ÷Û»‚∆¨");
	Food food7 = new Food("ø™ÀÆ∞◊≤À");
	Food food8 = new Food("π¨±£º¶∂°");
	Food food9 = new Food("¬È∆≈∂π∏Ø");
	Food food10 = new Food("ŒƒÀº∂π∏Ø");
	Food food11 = new Food("”„œ„»‚Àø");
	Food food12 = new Food("∂´∆¬»‚");
	Food food13 = new Food("¿≠√Ê");
	Food food14 = new Food("∞◊√◊∑π");
	Food food15 = new Food("µ∞≥¥∑π");
	Food food16 = new Food("≥¥∫”∑€");
	Food food17 = new Food("œ°∑π");
	Food food18 = new Food("◊œ≤Àµ∞ª®Ã¿");
	Food food19 = new Food("∞◊≤À∂π∏ØÃ¿");
	Food food20 = new Food("∑¨«—ºÂµ∞Ã¿");
	Food food22 = new Food("Ã©π˙∂¨“ıπ¶Ã¿");
	Food food21 = new Food("—º—™∑€ÀøÃ¿");
	Food food23 = new Food("∆°æ∆");
	Food food24 = new Food("ø…¿÷");
	Food food25 = new Food("∫Ï≤Ë");
	Food food26 = new Food("∞◊ø™ÀÆ");
	Food food27 = new Food("—º ∫œ„ƒ˚√ ≤Ë");
	Food food29 = new Food("’®ÃÏ∏æ¬ﬁ");
	Food food30 = new Food(" ŸÀæ");
	Food food28 = new Food("øß‡¨µ∞∞¸∑π");
	Food food31 = new Food("µ¬÷›—Ã—¨∞≤∏ÒÀπ∫Ò≈£±§");
	Food food32 = new Food("“‚¥Û¿˚ƒ«≤ª¿’Àπ≈˚»¯");
	
	static Food[] food = new Food[33];
	
	TrolleyFoodPane[] tfp = new TrolleyFoodPane[33];
	
	String name = "";
	String password = "";
	
	TrolleyPane tp;
	
	CuisinePane cp = new CuisinePane();
	StaplePane stp = new StaplePane();
	SoupPane sop = new SoupPane();
	DrinksPane dp = new DrinksPane();
	ElsePane ep = new ElsePane();
	
	public OrderPane() {
		// TODO Auto-generated constructor stub
		
		food[1] = food1;
		food[2] = food2;
		food[3] = food3;
		food[4] = food4;
		food[5] = food5;
		food[6] = food6;
		food[7] = food7;
		food[8] = food8;
		food[9] = food9;
		food[10] = food10;
		food[11] = food11;
		food[12] = food12;
		food[13] = food13;
		food[14] = food14;
		food[15] = food15;
		food[16] = food16;
		food[17] = food17;
		food[18] = food18;
		food[19] = food19;
		food[20] = food20;
		food[21] = food21;
		food[22] = food22;
		food[23] = food23;
		food[24] = food24;
		food[25] = food25;
		food[26] = food26;
		food[27] = food27;
		food[28] = food28;
		food[29] = food29;
		food[30] = food30;
		food[31] = food31;
		food[32] = food32;
		
		food1.setPrice(49);
		food2.setPrice(23);
		food3.setPrice(17);
		food4.setPrice(52);
		food5.setPrice(15);
		food6.setPrice(33);
		food7.setPrice(100);
		food8.setPrice(25);
		food9.setPrice(17);
		food10.setPrice(55);
		food11.setPrice(17);
		food12.setPrice(40);
		food13.setPrice(35);
		food14.setPrice(3);
		food15.setPrice(15);
		food16.setPrice(15);
		food17.setPrice(3);
		food18.setPrice(20);
		food19.setPrice(20);
		food20.setPrice(20);
		food21.setPrice(30);
		food22.setPrice(30);
		food23.setPrice(8);
		food24.setPrice(3);
		food25.setPrice(3);
		food26.setPrice(1);
		food27.setPrice(15);
		food28.setPrice(30);
		food29.setPrice(25);
		food30.setPrice(80);
		food31.setPrice(50);
		food32.setPrice(75);
		
		Rectangle rec27  =new Rectangle(320,0.01);
		rec27.setFill(Color.valueOf("#00000080"));
		this.getChildren().addAll(rec27);
		this.setTopAnchor(rec27, 110.0);
		this.setLeftAnchor(rec27, 810.0);
		
		KeyValue kv0 = new KeyValue(rec27.heightProperty(), 0);
		KeyFrame kf0 = new KeyFrame(Duration.seconds(0), kv0);
		
		KeyValue kv = new KeyValue(rec27.heightProperty(), 550);
		KeyFrame kf = new KeyFrame(Duration.seconds(0.2), kv);
		

		timeline.getKeyFrames().addAll(kf0,kf);
		timeline.setDelay(Duration.seconds(0.2));
		
		
		
		Label l1 = new Label("ORDER");
		l1.setFont(Font.font(51));
		l1.setTextFill(Color.valueOf("#36363680"));
		Label l2 = new Label("ORDER");
		l2.setFont(Font.font(51));
		
		Rectangle rec1 = new Rectangle(15,280);
		Rectangle rec2 = new Rectangle(3,280);
		rec1.setFill(Color.valueOf("#4F4F4F"));
		rec2.setFill(Color.valueOf("#4F4F4F"));
		
		Rectangle rec3 = new Rectangle(320,40);
		Rectangle rec4 = new Rectangle(320,40);
		Rectangle rec5 = new Rectangle(320,40);
		Rectangle rec6 = new Rectangle(320,40);
		Rectangle rec7 = new Rectangle(320,40);
		rec3.setFill(Color.valueOf("#36363650"));
		rec4.setFill(Color.valueOf("#36363650"));
		rec5.setFill(Color.valueOf("#36363650"));
		rec6.setFill(Color.valueOf("#36363650"));
		rec7.setFill(Color.valueOf("#36363650"));
		
		Rectangle rec8 = new Rectangle(6,40);
		Rectangle rec9 = new Rectangle(6,40);
		Rectangle rec10 = new Rectangle(6,40);
		Rectangle rec11 = new Rectangle(6,40);
		Rectangle rec12 = new Rectangle(6,40);
		
		Rectangle rec13 = new Rectangle(25,25);
		Rectangle rec14 = new Rectangle(25,25);
		Rectangle rec15 = new Rectangle(25,25);
		Rectangle rec16 = new Rectangle(25,25);
		Rectangle rec17 = new Rectangle(25,25);
		
		Label l3 = new Label("≤À∆∑∑NÓê£∫≈ÎÔÉ");
		Label l4 = new Label("≤À∆∑∑NÓê£∫÷˜ ≥");
		Label l5 = new Label("≤À∆∑∑NÓê£∫ú´");
		Label l6 = new Label("≤À∆∑∑NÓê£∫Ôã¡œ");
		Label l7 = new Label("≤À∆∑∑NÓê£∫∆‰À˚");
		l3.setFont(Font.font(27));
		l4.setFont(Font.font(27));
		l5.setFont(Font.font(27));
		l6.setFont(Font.font(27));
		l7.setFont(Font.font(27));
		
		Line line1  = new Line(63,542 , 430,542);
		Line line2  = new Line(63,592 , 430,592);
		Line line3  = new Line(430,542 , 430,592);
		line1.setStrokeWidth(2);
		line2.setStrokeWidth(2);
		line3.setStrokeWidth(2);
		
		
		rec18.setFill(Color.valueOf("#36363650"));
		this.setTopAnchor(rec18, 542.0);
		this.setLeftAnchor(rec18, 62.0);
		
		Label l8 = new Label("ﬂxìÒ");
		Label l9 = new Label("ƒ˙ø…ÎSïr‘⁄ŸèŒÔ‹áÉ»≤Èø¥◊‘º∫ﬂxìÒµƒ≤À∆∑");
		Label l10 = new Label("¸cÜŒÕÍ≥…··º¥ø…‘⁄”ÜÜŒ÷–≤Èø¥");
		l8.setFont(Font.font(20));
		l9.setFont(Font.font(17));
		l10.setFont(Font.font(17));
		
		Rectangle rec19 = new Rectangle(9,4);
		Rectangle rec20 = new Rectangle(9,4);
		
		Label l11 = new Label("¡¢øÃ¸cÜŒ");
		l11.setFont(Font.font(30));
		
		Rectangle rec21  = new Rectangle(22,22);
		rec21.setRotate(45);
		
		Rectangle rec22  = new Rectangle(7,52);
		
		this.getChildren().addAll(l1,l2);
		this.getChildren().addAll(rec1,rec2);
		this.getChildren().addAll(rec3,rec4,rec5,rec6,rec7);
		this.getChildren().addAll(rec8,rec9,rec10,rec11,rec12);
		this.getChildren().addAll(rec13,rec14,rec15,rec16,rec17);
		this.getChildren().addAll(l3,l4,l5,l6,l7);
		this.getChildren().addAll(line1,line2,line3);
		this.getChildren().addAll(rec18,l8,l9,l10,rec19,rec20);
		this.getChildren().addAll(l11,rec21,rec22);
		
		this.setTopAnchor(l8, 513.0);
		this.setLeftAnchor(l8, 63.0);
		this.setTopAnchor(l9, 600.0);
		this.setLeftAnchor(l9, 80.0);
		this.setTopAnchor(l10, 620.0);
		this.setLeftAnchor(l10, 80.0);
		this.setTopAnchor(rec19, 610.0);
		this.setLeftAnchor(rec19, 63.0);
		this.setTopAnchor(rec20, 630.0);
		this.setLeftAnchor(rec20, 63.0);
		this.setTopAnchor(l11, 546.0);
		this.setLeftAnchor(l11, 120.0);
		this.setTopAnchor(rec21, 555.5);
		this.setLeftAnchor(rec21, 85.0);
		this.setTopAnchor(rec22, 541.0);
		this.setLeftAnchor(rec22, 61.0);
		
		
		this.setTopAnchor(l1, 100.0);
		this.setLeftAnchor(l1, 60.0);
		this.setTopAnchor(l2, 96.0);
		this.setLeftAnchor(l2, 56.0);
		
		this.setTopAnchor(rec1, 210.0);
		this.setLeftAnchor(rec1, 63.0);
		this.setTopAnchor(rec2, 210.0);
		this.setLeftAnchor(rec2, 84.0);
		
		this.setTopAnchor(rec3, 210.0);
		this.setLeftAnchor(rec3, 100.0);
		this.setTopAnchor(rec4, 270.0);
		this.setLeftAnchor(rec4, 100.0);
		this.setTopAnchor(rec5, 330.0);
		this.setLeftAnchor(rec5, 100.0);
		this.setTopAnchor(rec6, 390.0);
		this.setLeftAnchor(rec6, 100.0);
		this.setTopAnchor(rec7, 450.0);
		this.setLeftAnchor(rec7, 100.0);
		
		this.setTopAnchor(rec8, 210.0);
		this.setLeftAnchor(rec8, 100.0);
		this.setTopAnchor(rec9, 270.0);
		this.setLeftAnchor(rec9, 100.0);
		this.setTopAnchor(rec10, 330.0);
		this.setLeftAnchor(rec10, 100.0);
		this.setTopAnchor(rec11, 390.0);
		this.setLeftAnchor(rec11, 100.0);
		this.setTopAnchor(rec12, 450.0);
		this.setLeftAnchor(rec12, 100.0);
		
		this.setTopAnchor(rec13, 217.5);
		this.setLeftAnchor(rec13, 115.0);
		this.setTopAnchor(rec14, 277.0);
		this.setLeftAnchor(rec14, 115.0);
		this.setTopAnchor(rec15, 337.0);
		this.setLeftAnchor(rec15, 115.0);
		this.setTopAnchor(rec16, 397.0);
		this.setLeftAnchor(rec16, 115.0);
		this.setTopAnchor(rec17, 457.0);
		this.setLeftAnchor(rec17, 115.0);
		
		this.setTopAnchor(l3, 210.5);
		this.setLeftAnchor(l3, 155.0);
		this.setTopAnchor(l4, 270.0);
		this.setLeftAnchor(l4, 155.0);
		this.setTopAnchor(l5, 330.0);
		this.setLeftAnchor(l5, 155.0);
		this.setTopAnchor(l6, 390.0);
		this.setLeftAnchor(l6, 155.0);
		this.setTopAnchor(l7, 450.0);
		this.setLeftAnchor(l7, 155.0);
		
		rec3.setOnMouseEntered(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.HAND);
				rec3.setFill(Color.valueOf("#36363650"));
				rec4.setFill(Color.valueOf("#36363650"));
				rec5.setFill(Color.valueOf("#36363650"));
				rec6.setFill(Color.valueOf("#36363650"));
				rec7.setFill(Color.valueOf("#36363650"));
				rec18.setFill(Color.valueOf("#36363650"));
				l11.setTextFill(Color.BLACK);
				rec21.setFill(Color.BLACK);
				rec22.setFill(Color.BLACK);
				rec8.setFill(Color.BLACK);
				rec9.setFill(Color.BLACK);
				rec10.setFill(Color.BLACK);
				rec11.setFill(Color.BLACK);
				rec12.setFill(Color.BLACK);
				rec13.setFill(Color.BLACK);
				rec14.setFill(Color.BLACK);
				rec15.setFill(Color.BLACK);
				rec16.setFill(Color.BLACK);
				rec17.setFill(Color.BLACK);
				l3.setTextFill(Color.BLACK);
				l4.setTextFill(Color.BLACK);
				l5.setTextFill(Color.BLACK);
				l6.setTextFill(Color.BLACK);
				l7.setTextFill(Color.BLACK);
				OrderPane.this.setTopAnchor(rec3, 210.0);
				OrderPane.this.setLeftAnchor(rec3, 100.0);
				OrderPane.this.setTopAnchor(rec4, 270.0);
				OrderPane.this.setLeftAnchor(rec4, 100.0);
				OrderPane.this.setTopAnchor(rec5, 330.0);
				OrderPane.this.setLeftAnchor(rec5, 100.0);
				OrderPane.this.setTopAnchor(rec6, 390.0);
				OrderPane.this.setLeftAnchor(rec6, 100.0);
				OrderPane.this.setTopAnchor(rec7, 450.0);
				OrderPane.this.setLeftAnchor(rec7, 100.0);
				
				OrderPane.this.setTopAnchor(rec8, 210.0);
				OrderPane.this.setLeftAnchor(rec8, 100.0);
				OrderPane.this.setTopAnchor(rec9, 270.0);
				OrderPane.this.setLeftAnchor(rec9, 100.0);
				OrderPane.this.setTopAnchor(rec10, 330.0);
				OrderPane.this.setLeftAnchor(rec10, 100.0);
				OrderPane.this.setTopAnchor(rec11, 390.0);
				OrderPane.this.setLeftAnchor(rec11, 100.0);
				OrderPane.this.setTopAnchor(rec12, 450.0);
				OrderPane.this.setLeftAnchor(rec12, 100.0);
				
				OrderPane.this.setTopAnchor(rec13, 217.5);
				OrderPane.this.setLeftAnchor(rec13, 115.0);
				OrderPane.this.setTopAnchor(rec14, 277.0);
				OrderPane.this.setLeftAnchor(rec14, 115.0);
				OrderPane.this.setTopAnchor(rec15, 337.0);
				OrderPane.this.setLeftAnchor(rec15, 115.0);
				OrderPane.this.setTopAnchor(rec16, 397.0);
				OrderPane.this.setLeftAnchor(rec16, 115.0);
				OrderPane.this.setTopAnchor(rec17, 457.0);
				OrderPane.this.setLeftAnchor(rec17, 115.0);
				
				OrderPane.this.setTopAnchor(l3, 210.5);
				OrderPane.this.setLeftAnchor(l3, 155.0);
				OrderPane.this.setTopAnchor(l4, 270.0);
				OrderPane.this.setLeftAnchor(l4, 155.0);
				OrderPane.this.setTopAnchor(l5, 330.0);
				OrderPane.this.setLeftAnchor(l5, 155.0);
				OrderPane.this.setTopAnchor(l6, 390.0);
				OrderPane.this.setLeftAnchor(l6, 155.0);
				OrderPane.this.setTopAnchor(l7, 450.0);
				OrderPane.this.setLeftAnchor(l7, 155.0);
				
				rec3.setFill(Color.BLACK);
				rec8.setFill(Color.WHITE);
				rec13.setFill(Color.WHITE);
				l3.setTextFill(Color.WHITE);
				OrderPane.this.setLeftAnchor(rec3, 120.0);
				OrderPane.this.setLeftAnchor(rec8, 120.0);
				OrderPane.this.setLeftAnchor(rec13, 135.0);
				OrderPane.this.setLeftAnchor(l3, 175.0);
				
				rec3.setEffect(geteffect());
			}
		});
		
		rec4.setOnMouseEntered(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.HAND);
				rec3.setFill(Color.valueOf("#36363650"));
				rec4.setFill(Color.valueOf("#36363650"));
				rec5.setFill(Color.valueOf("#36363650"));
				rec6.setFill(Color.valueOf("#36363650"));
				rec7.setFill(Color.valueOf("#36363650"));
				rec18.setFill(Color.valueOf("#36363650"));
				l11.setTextFill(Color.BLACK);
				rec21.setFill(Color.BLACK);
				rec22.setFill(Color.BLACK);
				rec8.setFill(Color.BLACK);
				rec9.setFill(Color.BLACK);
				rec10.setFill(Color.BLACK);
				rec11.setFill(Color.BLACK);
				rec12.setFill(Color.BLACK);
				rec13.setFill(Color.BLACK);
				rec14.setFill(Color.BLACK);
				rec15.setFill(Color.BLACK);
				rec16.setFill(Color.BLACK);
				rec17.setFill(Color.BLACK);
				l3.setTextFill(Color.BLACK);
				l4.setTextFill(Color.BLACK);
				l5.setTextFill(Color.BLACK);
				l6.setTextFill(Color.BLACK);
				l7.setTextFill(Color.BLACK);
				OrderPane.this.setTopAnchor(rec3, 210.0);
				OrderPane.this.setLeftAnchor(rec3, 100.0);
				OrderPane.this.setTopAnchor(rec4, 270.0);
				OrderPane.this.setLeftAnchor(rec4, 100.0);
				OrderPane.this.setTopAnchor(rec5, 330.0);
				OrderPane.this.setLeftAnchor(rec5, 100.0);
				OrderPane.this.setTopAnchor(rec6, 390.0);
				OrderPane.this.setLeftAnchor(rec6, 100.0);
				OrderPane.this.setTopAnchor(rec7, 450.0);
				OrderPane.this.setLeftAnchor(rec7, 100.0);
				
				OrderPane.this.setTopAnchor(rec8, 210.0);
				OrderPane.this.setLeftAnchor(rec8, 100.0);
				OrderPane.this.setTopAnchor(rec9, 270.0);
				OrderPane.this.setLeftAnchor(rec9, 100.0);
				OrderPane.this.setTopAnchor(rec10, 330.0);
				OrderPane.this.setLeftAnchor(rec10, 100.0);
				OrderPane.this.setTopAnchor(rec11, 390.0);
				OrderPane.this.setLeftAnchor(rec11, 100.0);
				OrderPane.this.setTopAnchor(rec12, 450.0);
				OrderPane.this.setLeftAnchor(rec12, 100.0);
				
				OrderPane.this.setTopAnchor(rec13, 217.5);
				OrderPane.this.setLeftAnchor(rec13, 115.0);
				OrderPane.this.setTopAnchor(rec14, 277.0);
				OrderPane.this.setLeftAnchor(rec14, 115.0);
				OrderPane.this.setTopAnchor(rec15, 337.0);
				OrderPane.this.setLeftAnchor(rec15, 115.0);
				OrderPane.this.setTopAnchor(rec16, 397.0);
				OrderPane.this.setLeftAnchor(rec16, 115.0);
				OrderPane.this.setTopAnchor(rec17, 457.0);
				OrderPane.this.setLeftAnchor(rec17, 115.0);
				
				OrderPane.this.setTopAnchor(l3, 210.5);
				OrderPane.this.setLeftAnchor(l3, 155.0);
				OrderPane.this.setTopAnchor(l4, 270.0);
				OrderPane.this.setLeftAnchor(l4, 155.0);
				OrderPane.this.setTopAnchor(l5, 330.0);
				OrderPane.this.setLeftAnchor(l5, 155.0);
				OrderPane.this.setTopAnchor(l6, 390.0);
				OrderPane.this.setLeftAnchor(l6, 155.0);
				OrderPane.this.setTopAnchor(l7, 450.0);
				OrderPane.this.setLeftAnchor(l7, 155.0);
				
				rec4.setFill(Color.BLACK);
				rec9.setFill(Color.WHITE);
				rec14.setFill(Color.WHITE);
				l4.setTextFill(Color.WHITE);
				OrderPane.this.setLeftAnchor(rec4, 120.0);
				OrderPane.this.setLeftAnchor(rec9, 120.0);
				OrderPane.this.setLeftAnchor(rec14, 135.0);
				OrderPane.this.setLeftAnchor(l4, 175.0);
				
				rec4.setEffect(geteffect());
			}
		});
		
		rec5.setOnMouseEntered(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.HAND);
				rec3.setFill(Color.valueOf("#36363650"));
				rec4.setFill(Color.valueOf("#36363650"));
				rec5.setFill(Color.valueOf("#36363650"));
				rec6.setFill(Color.valueOf("#36363650"));
				rec7.setFill(Color.valueOf("#36363650"));
				rec18.setFill(Color.valueOf("#36363650"));
				l11.setTextFill(Color.BLACK);
				rec21.setFill(Color.BLACK);
				rec22.setFill(Color.BLACK);
				rec8.setFill(Color.BLACK);
				rec9.setFill(Color.BLACK);
				rec10.setFill(Color.BLACK);
				rec11.setFill(Color.BLACK);
				rec12.setFill(Color.BLACK);
				rec13.setFill(Color.BLACK);
				rec14.setFill(Color.BLACK);
				rec15.setFill(Color.BLACK);
				rec16.setFill(Color.BLACK);
				rec17.setFill(Color.BLACK);
				l3.setTextFill(Color.BLACK);
				l4.setTextFill(Color.BLACK);
				l5.setTextFill(Color.BLACK);
				l6.setTextFill(Color.BLACK);
				l7.setTextFill(Color.BLACK);
				OrderPane.this.setTopAnchor(rec3, 210.0);
				OrderPane.this.setLeftAnchor(rec3, 100.0);
				OrderPane.this.setTopAnchor(rec4, 270.0);
				OrderPane.this.setLeftAnchor(rec4, 100.0);
				OrderPane.this.setTopAnchor(rec5, 330.0);
				OrderPane.this.setLeftAnchor(rec5, 100.0);
				OrderPane.this.setTopAnchor(rec6, 390.0);
				OrderPane.this.setLeftAnchor(rec6, 100.0);
				OrderPane.this.setTopAnchor(rec7, 450.0);
				OrderPane.this.setLeftAnchor(rec7, 100.0);
				
				OrderPane.this.setTopAnchor(rec8, 210.0);
				OrderPane.this.setLeftAnchor(rec8, 100.0);
				OrderPane.this.setTopAnchor(rec9, 270.0);
				OrderPane.this.setLeftAnchor(rec9, 100.0);
				OrderPane.this.setTopAnchor(rec10, 330.0);
				OrderPane.this.setLeftAnchor(rec10, 100.0);
				OrderPane.this.setTopAnchor(rec11, 390.0);
				OrderPane.this.setLeftAnchor(rec11, 100.0);
				OrderPane.this.setTopAnchor(rec12, 450.0);
				OrderPane.this.setLeftAnchor(rec12, 100.0);
				
				OrderPane.this.setTopAnchor(rec13, 217.5);
				OrderPane.this.setLeftAnchor(rec13, 115.0);
				OrderPane.this.setTopAnchor(rec14, 277.0);
				OrderPane.this.setLeftAnchor(rec14, 115.0);
				OrderPane.this.setTopAnchor(rec15, 337.0);
				OrderPane.this.setLeftAnchor(rec15, 115.0);
				OrderPane.this.setTopAnchor(rec16, 397.0);
				OrderPane.this.setLeftAnchor(rec16, 115.0);
				OrderPane.this.setTopAnchor(rec17, 457.0);
				OrderPane.this.setLeftAnchor(rec17, 115.0);
				
				OrderPane.this.setTopAnchor(l3, 210.5);
				OrderPane.this.setLeftAnchor(l3, 155.0);
				OrderPane.this.setTopAnchor(l4, 270.0);
				OrderPane.this.setLeftAnchor(l4, 155.0);
				OrderPane.this.setTopAnchor(l5, 330.0);
				OrderPane.this.setLeftAnchor(l5, 155.0);
				OrderPane.this.setTopAnchor(l6, 390.0);
				OrderPane.this.setLeftAnchor(l6, 155.0);
				OrderPane.this.setTopAnchor(l7, 450.0);
				OrderPane.this.setLeftAnchor(l7, 155.0);
				
				rec5.setFill(Color.BLACK);
				rec10.setFill(Color.WHITE);
				rec15.setFill(Color.WHITE);
				l5.setTextFill(Color.WHITE);
				OrderPane.this.setLeftAnchor(rec5, 120.0);
				OrderPane.this.setLeftAnchor(rec10, 120.0);
				OrderPane.this.setLeftAnchor(rec15, 135.0);
				OrderPane.this.setLeftAnchor(l5, 175.0);
				
				rec5.setEffect(geteffect());
				
			}
		});
		
		rec6.setOnMouseEntered(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.HAND);
				rec3.setFill(Color.valueOf("#36363650"));
				rec4.setFill(Color.valueOf("#36363650"));
				rec5.setFill(Color.valueOf("#36363650"));
				rec6.setFill(Color.valueOf("#36363650"));
				rec7.setFill(Color.valueOf("#36363650"));
				rec18.setFill(Color.valueOf("#36363650"));
				l11.setTextFill(Color.BLACK);
				rec21.setFill(Color.BLACK);
				rec22.setFill(Color.BLACK);
				rec8.setFill(Color.BLACK);
				rec9.setFill(Color.BLACK);
				rec10.setFill(Color.BLACK);
				rec11.setFill(Color.BLACK);
				rec12.setFill(Color.BLACK);
				rec13.setFill(Color.BLACK);
				rec14.setFill(Color.BLACK);
				rec15.setFill(Color.BLACK);
				rec16.setFill(Color.BLACK);
				rec17.setFill(Color.BLACK);
				l3.setTextFill(Color.BLACK);
				l4.setTextFill(Color.BLACK);
				l5.setTextFill(Color.BLACK);
				l6.setTextFill(Color.BLACK);
				l7.setTextFill(Color.BLACK);
				OrderPane.this.setTopAnchor(rec3, 210.0);
				OrderPane.this.setLeftAnchor(rec3, 100.0);
				OrderPane.this.setTopAnchor(rec4, 270.0);
				OrderPane.this.setLeftAnchor(rec4, 100.0);
				OrderPane.this.setTopAnchor(rec5, 330.0);
				OrderPane.this.setLeftAnchor(rec5, 100.0);
				OrderPane.this.setTopAnchor(rec6, 390.0);
				OrderPane.this.setLeftAnchor(rec6, 100.0);
				OrderPane.this.setTopAnchor(rec7, 450.0);
				OrderPane.this.setLeftAnchor(rec7, 100.0);
				
				OrderPane.this.setTopAnchor(rec8, 210.0);
				OrderPane.this.setLeftAnchor(rec8, 100.0);
				OrderPane.this.setTopAnchor(rec9, 270.0);
				OrderPane.this.setLeftAnchor(rec9, 100.0);
				OrderPane.this.setTopAnchor(rec10, 330.0);
				OrderPane.this.setLeftAnchor(rec10, 100.0);
				OrderPane.this.setTopAnchor(rec11, 390.0);
				OrderPane.this.setLeftAnchor(rec11, 100.0);
				OrderPane.this.setTopAnchor(rec12, 450.0);
				OrderPane.this.setLeftAnchor(rec12, 100.0);
				
				OrderPane.this.setTopAnchor(rec13, 217.5);
				OrderPane.this.setLeftAnchor(rec13, 115.0);
				OrderPane.this.setTopAnchor(rec14, 277.0);
				OrderPane.this.setLeftAnchor(rec14, 115.0);
				OrderPane.this.setTopAnchor(rec15, 337.0);
				OrderPane.this.setLeftAnchor(rec15, 115.0);
				OrderPane.this.setTopAnchor(rec16, 397.0);
				OrderPane.this.setLeftAnchor(rec16, 115.0);
				OrderPane.this.setTopAnchor(rec17, 457.0);
				OrderPane.this.setLeftAnchor(rec17, 115.0);
				
				OrderPane.this.setTopAnchor(l3, 210.5);
				OrderPane.this.setLeftAnchor(l3, 155.0);
				OrderPane.this.setTopAnchor(l4, 270.0);
				OrderPane.this.setLeftAnchor(l4, 155.0);
				OrderPane.this.setTopAnchor(l5, 330.0);
				OrderPane.this.setLeftAnchor(l5, 155.0);
				OrderPane.this.setTopAnchor(l6, 390.0);
				OrderPane.this.setLeftAnchor(l6, 155.0);
				OrderPane.this.setTopAnchor(l7, 450.0);
				OrderPane.this.setLeftAnchor(l7, 155.0);
				
				rec6.setFill(Color.BLACK);
				rec11.setFill(Color.WHITE);
				rec16.setFill(Color.WHITE);
				l6.setTextFill(Color.WHITE);
				OrderPane.this.setLeftAnchor(rec6, 120.0);
				OrderPane.this.setLeftAnchor(rec11, 120.0);
				OrderPane.this.setLeftAnchor(rec16, 135.0);
				OrderPane.this.setLeftAnchor(l6, 175.0);
				
				rec6.setEffect(geteffect());
				
			}
		});
		
		rec7.setOnMouseEntered(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.HAND);
				rec3.setFill(Color.valueOf("#36363650"));
				rec4.setFill(Color.valueOf("#36363650"));
				rec5.setFill(Color.valueOf("#36363650"));
				rec6.setFill(Color.valueOf("#36363650"));
				rec7.setFill(Color.valueOf("#36363650"));
				rec18.setFill(Color.valueOf("#36363650"));
				l11.setTextFill(Color.BLACK);
				rec21.setFill(Color.BLACK);
				rec22.setFill(Color.BLACK);
				rec8.setFill(Color.BLACK);
				rec9.setFill(Color.BLACK);
				rec10.setFill(Color.BLACK);
				rec11.setFill(Color.BLACK);
				rec12.setFill(Color.BLACK);
				rec13.setFill(Color.BLACK);
				rec14.setFill(Color.BLACK);
				rec15.setFill(Color.BLACK);
				rec16.setFill(Color.BLACK);
				rec17.setFill(Color.BLACK);
				l3.setTextFill(Color.BLACK);
				l4.setTextFill(Color.BLACK);
				l5.setTextFill(Color.BLACK);
				l6.setTextFill(Color.BLACK);
				l7.setTextFill(Color.BLACK);
				OrderPane.this.setTopAnchor(rec3, 210.0);
				OrderPane.this.setLeftAnchor(rec3, 100.0);
				OrderPane.this.setTopAnchor(rec4, 270.0);
				OrderPane.this.setLeftAnchor(rec4, 100.0);
				OrderPane.this.setTopAnchor(rec5, 330.0);
				OrderPane.this.setLeftAnchor(rec5, 100.0);
				OrderPane.this.setTopAnchor(rec6, 390.0);
				OrderPane.this.setLeftAnchor(rec6, 100.0);
				OrderPane.this.setTopAnchor(rec7, 450.0);
				OrderPane.this.setLeftAnchor(rec7, 100.0);
				
				OrderPane.this.setTopAnchor(rec8, 210.0);
				OrderPane.this.setLeftAnchor(rec8, 100.0);
				OrderPane.this.setTopAnchor(rec9, 270.0);
				OrderPane.this.setLeftAnchor(rec9, 100.0);
				OrderPane.this.setTopAnchor(rec10, 330.0);
				OrderPane.this.setLeftAnchor(rec10, 100.0);
				OrderPane.this.setTopAnchor(rec11, 390.0);
				OrderPane.this.setLeftAnchor(rec11, 100.0);
				OrderPane.this.setTopAnchor(rec12, 450.0);
				OrderPane.this.setLeftAnchor(rec12, 100.0);
				
				OrderPane.this.setTopAnchor(rec13, 217.5);
				OrderPane.this.setLeftAnchor(rec13, 115.0);
				OrderPane.this.setTopAnchor(rec14, 277.0);
				OrderPane.this.setLeftAnchor(rec14, 115.0);
				OrderPane.this.setTopAnchor(rec15, 337.0);
				OrderPane.this.setLeftAnchor(rec15, 115.0);
				OrderPane.this.setTopAnchor(rec16, 397.0);
				OrderPane.this.setLeftAnchor(rec16, 115.0);
				OrderPane.this.setTopAnchor(rec17, 457.0);
				OrderPane.this.setLeftAnchor(rec17, 115.0);
				
				OrderPane.this.setTopAnchor(l3, 210.5);
				OrderPane.this.setLeftAnchor(l3, 155.0);
				OrderPane.this.setTopAnchor(l4, 270.0);
				OrderPane.this.setLeftAnchor(l4, 155.0);
				OrderPane.this.setTopAnchor(l5, 330.0);
				OrderPane.this.setLeftAnchor(l5, 155.0);
				OrderPane.this.setTopAnchor(l6, 390.0);
				OrderPane.this.setLeftAnchor(l6, 155.0);
				OrderPane.this.setTopAnchor(l7, 450.0);
				OrderPane.this.setLeftAnchor(l7, 155.0);
				
				rec7.setFill(Color.BLACK);
				rec12.setFill(Color.WHITE);
				rec17.setFill(Color.WHITE);
				l7.setTextFill(Color.WHITE);
				OrderPane.this.setLeftAnchor(rec7, 120.0);
				OrderPane.this.setLeftAnchor(rec12, 120.0);
				OrderPane.this.setLeftAnchor(rec17, 135.0);
				OrderPane.this.setLeftAnchor(l7, 175.0);
				
				rec7.setEffect(geteffect());
				
			}
		});
		
		rec18.setOnMouseEntered(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.HAND);
				rec18.setFill(Color.valueOf("#36363650"));
				l11.setTextFill(Color.BLACK);
				rec21.setFill(Color.BLACK);
				rec22.setFill(Color.BLACK);
				
				
				rec18.setFill(Color.BLACK);
				l11.setTextFill(Color.WHITE);
				rec21.setFill(Color.WHITE);
				rec22.setFill(Color.WHITE);
				
				rec18.setEffect(geteffect());
			}
		});
		
		rec18.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				rec18.setFill(Color.valueOf("#36363650"));
				l11.setTextFill(Color.BLACK);
				rec21.setFill(Color.BLACK);
				rec22.setFill(Color.BLACK);
				
				rec18.setEffect(null);
			}
		});
		
		
		rec3.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				OrderPane.this.getChildren().remove(cp);
				OrderPane.this.getChildren().remove(stp);
				OrderPane.this.getChildren().remove(sop);
				OrderPane.this.getChildren().remove(dp);
				OrderPane.this.getChildren().remove(ep);
				
				OrderPane.this.getChildren().addAll(cp);
				
				OrderPane.this.setTopAnchor(cp, 100.0);
				OrderPane.this.setLeftAnchor(cp, 500.0);
				
				KeyValue kv1 = new KeyValue(rec3.fillProperty(), Color.BLACK);
				KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1);
				
				KeyValue kv2 = new KeyValue(rec3.fillProperty(), Color.WHITE);
				KeyFrame kf2 = new KeyFrame(Duration.seconds(0.05), kv2);
				
				Timeline timeline1 = new Timeline(90);
				timeline1.getKeyFrames().addAll(kf1,kf2);
				timeline1.setDelay(Duration.seconds(0));
				timeline1.setCycleCount(4);
				timeline1.setAutoReverse(true);
				timeline1.play();
				
			}
		});
		
		rec4.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				OrderPane.this.getChildren().remove(cp);
				OrderPane.this.getChildren().remove(stp);
				OrderPane.this.getChildren().remove(sop);
				OrderPane.this.getChildren().remove(dp);
				OrderPane.this.getChildren().remove(ep);
				
				OrderPane.this.getChildren().addAll(stp);
				
				OrderPane.this.setTopAnchor(stp, 100.0);
				OrderPane.this.setLeftAnchor(stp, 500.0);
				
				KeyValue kv1 = new KeyValue(rec4.fillProperty(), Color.BLACK);
				KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1);
				
				KeyValue kv2 = new KeyValue(rec4.fillProperty(), Color.WHITE);
				KeyFrame kf2 = new KeyFrame(Duration.seconds(0.05), kv2);
				
				Timeline timeline1 = new Timeline(90);
				timeline1.getKeyFrames().addAll(kf1,kf2);
				timeline1.setDelay(Duration.seconds(0));
				timeline1.setCycleCount(4);
				timeline1.setAutoReverse(true);
				timeline1.play();
				
			}
		});
		
		rec5.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				OrderPane.this.getChildren().remove(cp);
				OrderPane.this.getChildren().remove(stp);
				OrderPane.this.getChildren().remove(sop);
				OrderPane.this.getChildren().remove(dp);
				OrderPane.this.getChildren().remove(ep);
				
				OrderPane.this.getChildren().addAll(sop);
				
				OrderPane.this.setTopAnchor(sop, 100.0);
				OrderPane.this.setLeftAnchor(sop, 500.0);
				
				KeyValue kv1 = new KeyValue(rec5.fillProperty(), Color.BLACK);
				KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1);
				
				KeyValue kv2 = new KeyValue(rec5.fillProperty(), Color.WHITE);
				KeyFrame kf2 = new KeyFrame(Duration.seconds(0.05), kv2);
				
				Timeline timeline1 = new Timeline(90);
				timeline1.getKeyFrames().addAll(kf1,kf2);
				timeline1.setDelay(Duration.seconds(0));
				timeline1.setCycleCount(4);
				timeline1.setAutoReverse(true);
				timeline1.play();
				
			}
		});
		
		rec6.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				OrderPane.this.getChildren().remove(cp);
				OrderPane.this.getChildren().remove(stp);
				OrderPane.this.getChildren().remove(sop);
				OrderPane.this.getChildren().remove(dp);
				OrderPane.this.getChildren().remove(ep);
				
				OrderPane.this.getChildren().addAll(dp);
				
				OrderPane.this.setTopAnchor(dp, 100.0);
				OrderPane.this.setLeftAnchor(dp, 500.0);
				
				KeyValue kv1 = new KeyValue(rec6.fillProperty(), Color.BLACK);
				KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1);
				
				KeyValue kv2 = new KeyValue(rec6.fillProperty(), Color.WHITE);
				KeyFrame kf2 = new KeyFrame(Duration.seconds(0.05), kv2);
				
				Timeline timeline1 = new Timeline(90);
				timeline1.getKeyFrames().addAll(kf1,kf2);
				timeline1.setDelay(Duration.seconds(0));
				timeline1.setCycleCount(4);
				timeline1.setAutoReverse(true);
				timeline1.play();
				
			}
		});
		
		
		rec7.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				OrderPane.this.getChildren().remove(cp);
				OrderPane.this.getChildren().remove(stp);
				OrderPane.this.getChildren().remove(sop);
				OrderPane.this.getChildren().remove(dp);
				OrderPane.this.getChildren().remove(ep);
				
				OrderPane.this.getChildren().addAll(ep);
				
				OrderPane.this.setTopAnchor(ep, 100.0);
				OrderPane.this.setLeftAnchor(ep, 500.0);
				
				KeyValue kv1 = new KeyValue(rec7.fillProperty(), Color.BLACK);
				KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1);
				
				KeyValue kv2 = new KeyValue(rec7.fillProperty(), Color.WHITE);
				KeyFrame kf2 = new KeyFrame(Duration.seconds(0.05), kv2);
				
				Timeline timeline1 = new Timeline(90);
				timeline1.getKeyFrames().addAll(kf1,kf2);
				timeline1.setDelay(Duration.seconds(0));
				timeline1.setCycleCount(4);
				timeline1.setAutoReverse(true);
				timeline1.play();
				
			}
		});
		
//		rec18.setOnMouseClicked(new EventHandler<MouseEvent>() {
//
//			@Override
//			public void handle(MouseEvent arg0) {
//				// TODO Auto-generated method stub
//				OrderPane.this.getChildren().remove(cp);
//				OrderPane.this.getChildren().remove(stp);
//				OrderPane.this.getChildren().remove(sop);
//				OrderPane.this.getChildren().remove(dp);
//				OrderPane.this.getChildren().remove(ep);
//				
//				Clicked = true;
//				
//				KeyValue kv1 = new KeyValue(rec18.fillProperty(), Color.BLACK);
//				KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1);
//				
//				KeyValue kv2 = new KeyValue(rec18.fillProperty(), Color.WHITE);
//				KeyFrame kf2 = new KeyFrame(Duration.seconds(0.05), kv2);
//				
//				Timeline timeline1 = new Timeline(90);
//				timeline1.getKeyFrames().addAll(kf1,kf2);
//				timeline1.setDelay(Duration.seconds(0));
//				timeline1.setCycleCount(4);
//				timeline1.setAutoReverse(true);
//				timeline1.play();
//				
//				for(int i = 1 ; i <= 32 ; i++) {	
//					tp.vbox.getChildren().clear();
//				}
//				
//				String TEL = Odering_Utils.getTEL(name);
//				String listNumber = Odering_Utils.odering(TEL, food);
//				SumPane sump = new SumPane(listNumber,TEL,OrderPane.this.name);
//				timeline.play();
//				OrderPane.this.setTopAnchor(sump, 100.0);
//				OrderPane.this.setLeftAnchor(sump, 800.0);
//				timeline.setOnFinished(new EventHandler<ActionEvent>() {
//
//					@Override
//					public void handle(ActionEvent arg0) {
//						// TODO Auto-generated method stub
//						OrderPane.this.getChildren().add(sump);
//					}
//				});
//				
//			}
//		});
		
		rec3.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.DEFAULT);
				
				rec3.setEffect(null);
			}
		});
		
		rec4.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.DEFAULT);
				
				rec4.setEffect(null);
			}
		});
		
		rec5.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.DEFAULT);
				
				rec5.setEffect(null);
			}
		});
		
		rec6.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.DEFAULT);
				
				rec6.setEffect(null);
			}
		});
		
		rec7.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.DEFAULT);
				
				rec7.setEffect(null);
			}
		});
		
		rec8.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.DEFAULT);
				
				rec8.setEffect(null);
			}
		});
//--------------------------------------------------------------------------------------------------------------------------------------------------------	
	
		rec23.setFill(Color.valueOf("#00000080"));

		rec24.setFill(Color.valueOf("#CDC8B1"));
				
		this.setTopAnchor(rec23, 80.0);
		this.setLeftAnchor(rec23, 250.0);
		this.setTopAnchor(rec24, 70.0);
		this.setLeftAnchor(rec24, 240.0);
		
		InformationPane imp1 = new InformationPane(cp.i1,food[1]);
		imp1.setLabel2("$" + food[1].getPrice());
		InformationPane imp2 = new InformationPane(cp.i2,food[2]);
		imp2.setLabel2("$" + food[2].getPrice());
		InformationPane imp3 = new InformationPane(cp.i3,food[3]);
		imp3.setLabel2("$" + food[3].getPrice());
		InformationPane imp4 = new InformationPane(cp.i4,food[4]);
		imp4.setLabel2("$" + food[4].getPrice());
		InformationPane imp5 = new InformationPane(cp.i5,food[5]);
		imp5.setLabel2("$" + food[5].getPrice());
		InformationPane imp6 = new InformationPane(cp.i6,food[6]);
		imp6.setLabel2("$" + food[6].getPrice());
		InformationPane imp7 = new InformationPane(cp.i7,food[7]);
		imp7.setLabel2("$" + food[7].getPrice());
		InformationPane imp8 = new InformationPane(cp.i8,food[8]);
		imp8.setLabel2("$" + food[8].getPrice());
		InformationPane imp9 = new InformationPane(cp.i9,food[9]);
		imp9.setLabel2("$" + food[1].getPrice());
		InformationPane imp10 = new InformationPane(cp.i10,food[10]);
		imp10.setLabel2("$" + food[1].getPrice());
		InformationPane imp11 = new InformationPane(cp.i11,food[11]);
		imp11.setLabel2("$" + food[11].getPrice());
		InformationPane imp12 = new InformationPane(cp.i12,food[12]);
		imp12.setLabel2("$" + food[12].getPrice());
		InformationPane imp13 = new InformationPane(stp.i1,food[13]);
		imp13.setLabel2("$" + food[13].getPrice());
		InformationPane imp14 = new InformationPane(stp.i2,food[14]);
		imp14.setLabel2("$" + food[14].getPrice());
		InformationPane imp15 = new InformationPane(stp.i3,food[15]);
		imp15.setLabel2("$" + food[15].getPrice());
		InformationPane imp16 = new InformationPane(stp.i4,food[16]);
		imp16.setLabel2("$" + food[16].getPrice());
		InformationPane imp17 = new InformationPane(stp.i5,food[17]);
		imp17.setLabel2("$" + food[17].getPrice());
		InformationPane imp18 = new InformationPane(sop.i1,food[18]);
		imp18.setLabel2("$" + food[18].getPrice());
		InformationPane imp19 = new InformationPane(sop.i2,food[19]);
		imp19.setLabel2("$" + food[19].getPrice());
		InformationPane imp20 = new InformationPane(sop.i3,food[20]);
		imp20.setLabel2("$" + food[20].getPrice());
		InformationPane imp21 = new InformationPane(sop.i4,food[21]);
		imp21.setLabel2("$" + food[21].getPrice());
		InformationPane imp22 = new InformationPane(sop.i5,food[22]);
		imp22.setLabel2("$" + food[22].getPrice());
		InformationPane imp23 = new InformationPane(dp.i1,food[23]);
		imp23.setLabel2("$" + food[23].getPrice());
		InformationPane imp24 = new InformationPane(dp.i2,food[24]);
		imp24.setLabel2("$" + food[24].getPrice());
		InformationPane imp25 = new InformationPane(dp.i3,food[25]);
		imp25.setLabel2("$" + food[25].getPrice());
		InformationPane imp26 = new InformationPane(dp.i4,food[26]);
		imp26.setLabel2("$" + food[26].getPrice());
		InformationPane imp27 = new InformationPane(dp.i5,food[27]);
		imp27.setLabel2("$" + food[27].getPrice());
		InformationPane imp28 = new InformationPane(ep.i1,food[28]);
		imp28.setLabel2("$" + food[28].getPrice());
		InformationPane imp29 = new InformationPane(ep.i2,food[29]);
		imp29.setLabel2("$" + food[29].getPrice());
		InformationPane imp30 = new InformationPane(ep.i3,food[30]);
		imp30.setLabel2("$" + food[30].getPrice());
		InformationPane imp31 = new InformationPane(ep.i4,food[31]);
		imp31.setLabel2("$" + food[31].getPrice());
		InformationPane imp32 = new InformationPane(ep.i5,food[32]);
		imp32.setLabel2("$" + food[32].getPrice());
		
		imp[1] = imp1;
		imp[2] = imp2;
		imp[3] = imp3;
		imp[4] = imp4;
		imp[5] = imp5;
		imp[6] = imp6;
		imp[7] = imp7;
		imp[8] = imp8;
		imp[9] = imp9;
		imp[10] = imp10;
		imp[11] = imp11;
		imp[12] = imp12;
		imp[13] = imp13;
		imp[14] = imp14;
		imp[15] = imp15;
		imp[16] = imp16;
		imp[17] = imp17;
		imp[18] = imp18;
		imp[19] = imp19;
		imp[20] = imp20;
		imp[21] = imp21;
		imp[22] = imp22;
		imp[23] = imp23;
		imp[24] = imp24;
		imp[25] = imp25;
		imp[26] = imp26;
		imp[27] = imp27;
		imp[28] = imp28;
		imp[29] = imp29;
		imp[30] = imp30;
		imp[31] = imp31;
		imp[32] = imp32;
		
		
		cp.im1.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				OrderPane.this.getChildren().remove(rec23);
				OrderPane.this.getChildren().remove(rec24);
				OrderPane.this.getChildren().addAll(rec23,rec24);
				
				rec23.setHeight(0.01);
				rec24.setHeight(0.01);
				
				KeyValue kv1 = new KeyValue(rec24.heightProperty(), 50);
				KeyValue kv3 = new KeyValue(rec23.heightProperty(), 50);
				KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1,kv3);
				
				KeyValue kv2 = new KeyValue(rec24.heightProperty(), 450);
				KeyValue kv4 = new KeyValue(rec23.heightProperty(), 450);
				KeyFrame kf2 = new KeyFrame(Duration.seconds(0.1), kv2,kv4);
				
				Timeline timeline2 = new Timeline(144);
				timeline2.getKeyFrames().addAll(kf1,kf2);
				timeline2.setDelay(Duration.seconds(0.2));
				timeline2.play();
				
				OrderPane.this.getChildren().remove(imp1);
				OrderPane.this.getChildren().remove(imp2);
				OrderPane.this.getChildren().remove(imp3);
				OrderPane.this.getChildren().remove(imp4);
				OrderPane.this.getChildren().remove(imp5);
				OrderPane.this.getChildren().remove(imp6);
				OrderPane.this.getChildren().remove(imp7);
				OrderPane.this.getChildren().remove(imp8);
				OrderPane.this.getChildren().remove(imp9);
				OrderPane.this.getChildren().remove(imp10);
				OrderPane.this.getChildren().remove(imp11);
				OrderPane.this.getChildren().remove(imp12);
				OrderPane.this.getChildren().remove(imp13);
				OrderPane.this.getChildren().remove(imp14);
				OrderPane.this.getChildren().remove(imp15);
				OrderPane.this.getChildren().remove(imp16);
				OrderPane.this.getChildren().remove(imp17);
				OrderPane.this.getChildren().remove(imp18);
				OrderPane.this.getChildren().remove(imp19);
				OrderPane.this.getChildren().remove(imp20);
				OrderPane.this.getChildren().remove(imp21);
				OrderPane.this.getChildren().remove(imp22);
				OrderPane.this.getChildren().remove(imp23);
				OrderPane.this.getChildren().remove(imp24);
				OrderPane.this.getChildren().remove(imp25);
				OrderPane.this.getChildren().remove(imp26);
				OrderPane.this.getChildren().remove(imp27);
				OrderPane.this.getChildren().remove(imp28);
				OrderPane.this.getChildren().remove(imp29);
				OrderPane.this.getChildren().remove(imp30);
				OrderPane.this.getChildren().remove(imp31);
				OrderPane.this.getChildren().remove(imp32);
				
				timeline2.setOnFinished(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(imp1);
						OrderPane.this.getChildren().add(imp1);
						OrderPane.this.setTopAnchor(imp1, 70.0);
						OrderPane.this.setLeftAnchor(imp1, 240.0);
						
						imp1.label3.setText("" + imp1.food.now());
						imp1.label4.setText("" + imp1.food.getNumber());
					}
				});
				
				imp1.rec11.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp1);
					}
				});
				
				imp1.rec12.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp1);
					}
				});
				
			}
		});
		
		cp.im2.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				OrderPane.this.getChildren().remove(rec23);
				OrderPane.this.getChildren().remove(rec24);
				OrderPane.this.getChildren().addAll(rec23,rec24);
				
				rec23.setHeight(0.01);
				rec24.setHeight(0.01);
				
				KeyValue kv1 = new KeyValue(rec24.heightProperty(), 50);
				KeyValue kv3 = new KeyValue(rec23.heightProperty(), 50);
				KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1,kv3);
				
				KeyValue kv2 = new KeyValue(rec24.heightProperty(), 450);
				KeyValue kv4 = new KeyValue(rec23.heightProperty(), 450);
				KeyFrame kf2 = new KeyFrame(Duration.seconds(0.2), kv2,kv4);
				
				Timeline timeline2 = new Timeline(144);
				timeline2.getKeyFrames().addAll(kf1,kf2);
				timeline2.setDelay(Duration.seconds(0.1));
				timeline2.play();
				
				OrderPane.this.getChildren().remove(imp1);
				OrderPane.this.getChildren().remove(imp2);
				OrderPane.this.getChildren().remove(imp3);
				OrderPane.this.getChildren().remove(imp4);
				OrderPane.this.getChildren().remove(imp5);
				OrderPane.this.getChildren().remove(imp6);
				OrderPane.this.getChildren().remove(imp7);
				OrderPane.this.getChildren().remove(imp8);
				OrderPane.this.getChildren().remove(imp9);
				OrderPane.this.getChildren().remove(imp10);
				OrderPane.this.getChildren().remove(imp11);
				OrderPane.this.getChildren().remove(imp12);
				OrderPane.this.getChildren().remove(imp13);
				OrderPane.this.getChildren().remove(imp14);
				OrderPane.this.getChildren().remove(imp15);
				OrderPane.this.getChildren().remove(imp16);
				OrderPane.this.getChildren().remove(imp17);
				OrderPane.this.getChildren().remove(imp18);
				OrderPane.this.getChildren().remove(imp19);
				OrderPane.this.getChildren().remove(imp20);
				OrderPane.this.getChildren().remove(imp21);
				OrderPane.this.getChildren().remove(imp22);
				OrderPane.this.getChildren().remove(imp23);
				OrderPane.this.getChildren().remove(imp24);
				OrderPane.this.getChildren().remove(imp25);
				OrderPane.this.getChildren().remove(imp26);
				OrderPane.this.getChildren().remove(imp27);
				OrderPane.this.getChildren().remove(imp28);
				OrderPane.this.getChildren().remove(imp29);
				OrderPane.this.getChildren().remove(imp30);
				OrderPane.this.getChildren().remove(imp31);
				OrderPane.this.getChildren().remove(imp32);
				
				timeline2.setOnFinished(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(imp2);
						OrderPane.this.getChildren().add(imp2);
						OrderPane.this.setTopAnchor(imp2, 70.0);
						OrderPane.this.setLeftAnchor(imp2, 240.0);
						
						imp2.label3.setText("" + imp2.food.now());
						imp2.label4.setText("" + imp2.food.getNumber());
					}
				});
				
				imp2.rec11.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp2);
					}
				});
				
				imp2.rec12.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp2);
					}
				});
			}
		});
		
		
		cp.im3.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				OrderPane.this.getChildren().remove(rec23);
				OrderPane.this.getChildren().remove(rec24);
				OrderPane.this.getChildren().addAll(rec23,rec24);
				
				rec23.setHeight(0.01);
				rec24.setHeight(0.01);
				
				KeyValue kv1 = new KeyValue(rec24.heightProperty(), 50);
				KeyValue kv3 = new KeyValue(rec23.heightProperty(), 50);
				KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1,kv3);
				
				KeyValue kv2 = new KeyValue(rec24.heightProperty(), 450);
				KeyValue kv4 = new KeyValue(rec23.heightProperty(), 450);
				KeyFrame kf2 = new KeyFrame(Duration.seconds(0.1), kv2,kv4);
				
				Timeline timeline2 = new Timeline(144);
				timeline2.getKeyFrames().addAll(kf1,kf2);
				timeline2.setDelay(Duration.seconds(0.2));
				timeline2.play();
				
				OrderPane.this.getChildren().remove(imp1);
				OrderPane.this.getChildren().remove(imp2);
				OrderPane.this.getChildren().remove(imp3);
				OrderPane.this.getChildren().remove(imp4);
				OrderPane.this.getChildren().remove(imp5);
				OrderPane.this.getChildren().remove(imp6);
				OrderPane.this.getChildren().remove(imp7);
				OrderPane.this.getChildren().remove(imp8);
				OrderPane.this.getChildren().remove(imp9);
				OrderPane.this.getChildren().remove(imp10);
				OrderPane.this.getChildren().remove(imp11);
				OrderPane.this.getChildren().remove(imp12);
				OrderPane.this.getChildren().remove(imp13);
				OrderPane.this.getChildren().remove(imp14);
				OrderPane.this.getChildren().remove(imp15);
				OrderPane.this.getChildren().remove(imp16);
				OrderPane.this.getChildren().remove(imp17);
				OrderPane.this.getChildren().remove(imp18);
				OrderPane.this.getChildren().remove(imp19);
				OrderPane.this.getChildren().remove(imp20);
				OrderPane.this.getChildren().remove(imp21);
				OrderPane.this.getChildren().remove(imp22);
				OrderPane.this.getChildren().remove(imp23);
				OrderPane.this.getChildren().remove(imp24);
				OrderPane.this.getChildren().remove(imp25);
				OrderPane.this.getChildren().remove(imp26);
				OrderPane.this.getChildren().remove(imp27);
				OrderPane.this.getChildren().remove(imp28);
				OrderPane.this.getChildren().remove(imp29);
				OrderPane.this.getChildren().remove(imp30);
				OrderPane.this.getChildren().remove(imp31);
				OrderPane.this.getChildren().remove(imp32);
				
				timeline2.setOnFinished(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(imp3);
						OrderPane.this.getChildren().add(imp3);
						OrderPane.this.setTopAnchor(imp3, 70.0);
						OrderPane.this.setLeftAnchor(imp3, 240.0);
						
						imp3.label3.setText("" + imp3.food.now());
						imp3.label4.setText("" + imp3.food.getNumber());
					}
				});
				
				imp3.rec11.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp3);
					}
				});
				
				imp3.rec12.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp3);
					}
				});
			}
		});
		
		cp.im4.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				OrderPane.this.getChildren().remove(rec23);
				OrderPane.this.getChildren().remove(rec24);
				OrderPane.this.getChildren().addAll(rec23,rec24);
				
				rec23.setHeight(0.01);
				rec24.setHeight(0.01);
				
				KeyValue kv1 = new KeyValue(rec24.heightProperty(), 50);
				KeyValue kv3 = new KeyValue(rec23.heightProperty(), 50);
				KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1,kv3);
				
				KeyValue kv2 = new KeyValue(rec24.heightProperty(), 450);
				KeyValue kv4 = new KeyValue(rec23.heightProperty(), 450);
				KeyFrame kf2 = new KeyFrame(Duration.seconds(0.1), kv2,kv4);
				
				Timeline timeline2 = new Timeline(144);
				timeline2.getKeyFrames().addAll(kf1,kf2);
				timeline2.setDelay(Duration.seconds(0.2));
				timeline2.play();
				
				OrderPane.this.getChildren().remove(imp1);
				OrderPane.this.getChildren().remove(imp2);
				OrderPane.this.getChildren().remove(imp3);
				OrderPane.this.getChildren().remove(imp4);
				OrderPane.this.getChildren().remove(imp5);
				OrderPane.this.getChildren().remove(imp6);
				OrderPane.this.getChildren().remove(imp7);
				OrderPane.this.getChildren().remove(imp8);
				OrderPane.this.getChildren().remove(imp9);
				OrderPane.this.getChildren().remove(imp10);
				OrderPane.this.getChildren().remove(imp11);
				OrderPane.this.getChildren().remove(imp12);
				OrderPane.this.getChildren().remove(imp13);
				OrderPane.this.getChildren().remove(imp14);
				OrderPane.this.getChildren().remove(imp15);
				OrderPane.this.getChildren().remove(imp16);
				OrderPane.this.getChildren().remove(imp17);
				OrderPane.this.getChildren().remove(imp18);
				OrderPane.this.getChildren().remove(imp19);
				OrderPane.this.getChildren().remove(imp20);
				OrderPane.this.getChildren().remove(imp21);
				OrderPane.this.getChildren().remove(imp22);
				OrderPane.this.getChildren().remove(imp23);
				OrderPane.this.getChildren().remove(imp24);
				OrderPane.this.getChildren().remove(imp25);
				OrderPane.this.getChildren().remove(imp26);
				OrderPane.this.getChildren().remove(imp27);
				OrderPane.this.getChildren().remove(imp28);
				OrderPane.this.getChildren().remove(imp29);
				OrderPane.this.getChildren().remove(imp30);
				OrderPane.this.getChildren().remove(imp31);
				OrderPane.this.getChildren().remove(imp32);
				
				timeline2.setOnFinished(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(imp4);
						OrderPane.this.getChildren().add(imp4);
						OrderPane.this.setTopAnchor(imp4, 70.0);
						OrderPane.this.setLeftAnchor(imp4, 240.0);
						
						imp4.label3.setText("" + imp4.food.now());
						imp4.label4.setText("" + imp4.food.getNumber());
					}
				});
				
				imp4.rec11.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp4);
					}
				});
				
				imp4.rec12.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp4);
					}
				});
			}
		});
		
		cp.im5.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				OrderPane.this.getChildren().remove(rec23);
				OrderPane.this.getChildren().remove(rec24);
				OrderPane.this.getChildren().addAll(rec23,rec24);
				
				rec23.setHeight(0.01);
				rec24.setHeight(0.01);
				
				KeyValue kv1 = new KeyValue(rec24.heightProperty(), 50);
				KeyValue kv3 = new KeyValue(rec23.heightProperty(), 50);
				KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1,kv3);
				
				KeyValue kv2 = new KeyValue(rec24.heightProperty(), 450);
				KeyValue kv4 = new KeyValue(rec23.heightProperty(), 450);
				KeyFrame kf2 = new KeyFrame(Duration.seconds(0.1), kv2,kv4);
				
				Timeline timeline2 = new Timeline(144);
				timeline2.getKeyFrames().addAll(kf1,kf2);
				timeline2.setDelay(Duration.seconds(0.2));
				timeline2.play();
				
				OrderPane.this.getChildren().remove(imp1);
				OrderPane.this.getChildren().remove(imp2);
				OrderPane.this.getChildren().remove(imp3);
				OrderPane.this.getChildren().remove(imp4);
				OrderPane.this.getChildren().remove(imp5);
				OrderPane.this.getChildren().remove(imp6);
				OrderPane.this.getChildren().remove(imp7);
				OrderPane.this.getChildren().remove(imp8);
				OrderPane.this.getChildren().remove(imp9);
				OrderPane.this.getChildren().remove(imp10);
				OrderPane.this.getChildren().remove(imp11);
				OrderPane.this.getChildren().remove(imp12);
				OrderPane.this.getChildren().remove(imp13);
				OrderPane.this.getChildren().remove(imp14);
				OrderPane.this.getChildren().remove(imp15);
				OrderPane.this.getChildren().remove(imp16);
				OrderPane.this.getChildren().remove(imp17);
				OrderPane.this.getChildren().remove(imp18);
				OrderPane.this.getChildren().remove(imp19);
				OrderPane.this.getChildren().remove(imp20);
				OrderPane.this.getChildren().remove(imp21);
				OrderPane.this.getChildren().remove(imp22);
				OrderPane.this.getChildren().remove(imp23);
				OrderPane.this.getChildren().remove(imp24);
				OrderPane.this.getChildren().remove(imp25);
				OrderPane.this.getChildren().remove(imp26);
				OrderPane.this.getChildren().remove(imp27);
				OrderPane.this.getChildren().remove(imp28);
				OrderPane.this.getChildren().remove(imp29);
				OrderPane.this.getChildren().remove(imp30);
				OrderPane.this.getChildren().remove(imp31);
				OrderPane.this.getChildren().remove(imp32);
			
				timeline2.setOnFinished(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(imp5);
						OrderPane.this.getChildren().add(imp5);
						OrderPane.this.setTopAnchor(imp5, 70.0);
						OrderPane.this.setLeftAnchor(imp5, 240.0);
						
						imp5.label3.setText("" + imp5.food.now());
						imp5.label4.setText("" + imp5.food.getNumber());
					}
				});
				
				imp5.rec11.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp5);
					}
				});
				
				imp5.rec12.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp5);
					}
				});
			}
		});
		
		
		cp.im6.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				OrderPane.this.getChildren().remove(rec23);
				OrderPane.this.getChildren().remove(rec24);
				OrderPane.this.getChildren().addAll(rec23,rec24);
				
				rec23.setHeight(0.01);
				rec24.setHeight(0.01);
				
				KeyValue kv1 = new KeyValue(rec24.heightProperty(), 50);
				KeyValue kv3 = new KeyValue(rec23.heightProperty(), 50);
				KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1,kv3);
				
				KeyValue kv2 = new KeyValue(rec24.heightProperty(), 450);
				KeyValue kv4 = new KeyValue(rec23.heightProperty(), 450);
				KeyFrame kf2 = new KeyFrame(Duration.seconds(0.1), kv2,kv4);
				
				Timeline timeline2 = new Timeline(144);
				timeline2.getKeyFrames().addAll(kf1,kf2);
				timeline2.setDelay(Duration.seconds(0.2));
				timeline2.play();
				
				OrderPane.this.getChildren().remove(imp1);
				OrderPane.this.getChildren().remove(imp2);
				OrderPane.this.getChildren().remove(imp3);
				OrderPane.this.getChildren().remove(imp4);
				OrderPane.this.getChildren().remove(imp5);
				OrderPane.this.getChildren().remove(imp6);
				OrderPane.this.getChildren().remove(imp7);
				OrderPane.this.getChildren().remove(imp8);
				OrderPane.this.getChildren().remove(imp9);
				OrderPane.this.getChildren().remove(imp10);
				OrderPane.this.getChildren().remove(imp11);
				OrderPane.this.getChildren().remove(imp12);
				OrderPane.this.getChildren().remove(imp13);
				OrderPane.this.getChildren().remove(imp14);
				OrderPane.this.getChildren().remove(imp15);
				OrderPane.this.getChildren().remove(imp16);
				OrderPane.this.getChildren().remove(imp17);
				OrderPane.this.getChildren().remove(imp18);
				OrderPane.this.getChildren().remove(imp19);
				OrderPane.this.getChildren().remove(imp20);
				OrderPane.this.getChildren().remove(imp21);
				OrderPane.this.getChildren().remove(imp22);
				OrderPane.this.getChildren().remove(imp23);
				OrderPane.this.getChildren().remove(imp24);
				OrderPane.this.getChildren().remove(imp25);
				OrderPane.this.getChildren().remove(imp26);
				OrderPane.this.getChildren().remove(imp27);
				OrderPane.this.getChildren().remove(imp28);
				OrderPane.this.getChildren().remove(imp29);
				OrderPane.this.getChildren().remove(imp30);
				OrderPane.this.getChildren().remove(imp31);
				OrderPane.this.getChildren().remove(imp32);
				
				timeline2.setOnFinished(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(imp6);
						OrderPane.this.getChildren().add(imp6);
						OrderPane.this.setTopAnchor(imp6, 70.0);
						OrderPane.this.setLeftAnchor(imp6, 240.0);
						
						imp6.label3.setText("" + imp6.food.now());
						imp6.label4.setText("" + imp6.food.getNumber());
					}
				});
				
				imp6.rec11.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp6);
					}
				});
				
				imp6.rec12.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp6);
					}
				});
			}
		});
		
		cp.im7.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				OrderPane.this.getChildren().remove(rec23);
				OrderPane.this.getChildren().remove(rec24);
				OrderPane.this.getChildren().addAll(rec23,rec24);
				
				rec23.setHeight(0.01);
				rec24.setHeight(0.01);
				
				KeyValue kv1 = new KeyValue(rec24.heightProperty(), 50);
				KeyValue kv3 = new KeyValue(rec23.heightProperty(), 50);
				KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1,kv3);
				
				KeyValue kv2 = new KeyValue(rec24.heightProperty(), 450);
				KeyValue kv4 = new KeyValue(rec23.heightProperty(), 450);
				KeyFrame kf2 = new KeyFrame(Duration.seconds(0.1), kv2,kv4);
				
				Timeline timeline2 = new Timeline(144);
				timeline2.getKeyFrames().addAll(kf1,kf2);
				timeline2.setDelay(Duration.seconds(0.2));
				timeline2.play();
				
				OrderPane.this.getChildren().remove(imp1);
				OrderPane.this.getChildren().remove(imp2);
				OrderPane.this.getChildren().remove(imp3);
				OrderPane.this.getChildren().remove(imp4);
				OrderPane.this.getChildren().remove(imp5);
				OrderPane.this.getChildren().remove(imp6);
				OrderPane.this.getChildren().remove(imp7);
				OrderPane.this.getChildren().remove(imp8);
				OrderPane.this.getChildren().remove(imp9);
				OrderPane.this.getChildren().remove(imp10);
				OrderPane.this.getChildren().remove(imp11);
				OrderPane.this.getChildren().remove(imp12);
				OrderPane.this.getChildren().remove(imp13);
				OrderPane.this.getChildren().remove(imp14);
				OrderPane.this.getChildren().remove(imp15);
				OrderPane.this.getChildren().remove(imp16);
				OrderPane.this.getChildren().remove(imp17);
				OrderPane.this.getChildren().remove(imp18);
				OrderPane.this.getChildren().remove(imp19);
				OrderPane.this.getChildren().remove(imp20);
				OrderPane.this.getChildren().remove(imp21);
				OrderPane.this.getChildren().remove(imp22);
				OrderPane.this.getChildren().remove(imp23);
				OrderPane.this.getChildren().remove(imp24);
				OrderPane.this.getChildren().remove(imp25);
				OrderPane.this.getChildren().remove(imp26);
				OrderPane.this.getChildren().remove(imp27);
				OrderPane.this.getChildren().remove(imp28);
				OrderPane.this.getChildren().remove(imp29);
				OrderPane.this.getChildren().remove(imp30);
				OrderPane.this.getChildren().remove(imp31);
				OrderPane.this.getChildren().remove(imp32);
			
				timeline2.setOnFinished(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(imp7);
						OrderPane.this.getChildren().add(imp7);
						OrderPane.this.setTopAnchor(imp7, 70.0);
						OrderPane.this.setLeftAnchor(imp7, 240.0);
						
						imp7.label3.setText("" + imp7.food.now());
						imp7.label4.setText("" + imp7.food.getNumber());
					}
				});
				
				imp7.rec11.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp7);
					}
				});
				
				imp7.rec12.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp7);
					}
				});
			}
		});
		
		cp.im8.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				OrderPane.this.getChildren().remove(rec23);
				OrderPane.this.getChildren().remove(rec24);
				OrderPane.this.getChildren().addAll(rec23,rec24);
				
				rec23.setHeight(0.01);
				rec24.setHeight(0.01);
				
				KeyValue kv1 = new KeyValue(rec24.heightProperty(), 50);
				KeyValue kv3 = new KeyValue(rec23.heightProperty(), 50);
				KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1,kv3);
				
				KeyValue kv2 = new KeyValue(rec24.heightProperty(), 450);
				KeyValue kv4 = new KeyValue(rec23.heightProperty(), 450);
				KeyFrame kf2 = new KeyFrame(Duration.seconds(0.1), kv2,kv4);
				
				Timeline timeline2 = new Timeline(144);
				timeline2.getKeyFrames().addAll(kf1,kf2);
				timeline2.setDelay(Duration.seconds(0.2));
				timeline2.play();
				
				OrderPane.this.getChildren().remove(imp1);
				OrderPane.this.getChildren().remove(imp2);
				OrderPane.this.getChildren().remove(imp3);
				OrderPane.this.getChildren().remove(imp4);
				OrderPane.this.getChildren().remove(imp5);
				OrderPane.this.getChildren().remove(imp6);
				OrderPane.this.getChildren().remove(imp7);
				OrderPane.this.getChildren().remove(imp8);
				OrderPane.this.getChildren().remove(imp9);
				OrderPane.this.getChildren().remove(imp10);
				OrderPane.this.getChildren().remove(imp11);
				OrderPane.this.getChildren().remove(imp12);
				OrderPane.this.getChildren().remove(imp13);
				OrderPane.this.getChildren().remove(imp14);
				OrderPane.this.getChildren().remove(imp15);
				OrderPane.this.getChildren().remove(imp16);
				OrderPane.this.getChildren().remove(imp17);
				OrderPane.this.getChildren().remove(imp18);
				OrderPane.this.getChildren().remove(imp19);
				OrderPane.this.getChildren().remove(imp20);
				OrderPane.this.getChildren().remove(imp21);
				OrderPane.this.getChildren().remove(imp22);
				OrderPane.this.getChildren().remove(imp23);
				OrderPane.this.getChildren().remove(imp24);
				OrderPane.this.getChildren().remove(imp25);
				OrderPane.this.getChildren().remove(imp26);
				OrderPane.this.getChildren().remove(imp27);
				OrderPane.this.getChildren().remove(imp28);
				OrderPane.this.getChildren().remove(imp29);
				OrderPane.this.getChildren().remove(imp30);
				OrderPane.this.getChildren().remove(imp31);
				OrderPane.this.getChildren().remove(imp32);
			
				timeline2.setOnFinished(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(imp8);
						OrderPane.this.getChildren().add(imp8);
						OrderPane.this.setTopAnchor(imp8, 70.0);
						OrderPane.this.setLeftAnchor(imp8, 240.0);
						
						imp8.label3.setText("" + imp8.food.now());
						imp8.label4.setText("" + imp8.food.getNumber());
					}
				});
				
				imp8.rec11.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp8);
					}
				});
				
				imp8.rec12.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp8);
					}
				});
			}
		});
		
		cp.im9.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				OrderPane.this.getChildren().remove(rec23);
				OrderPane.this.getChildren().remove(rec24);
				OrderPane.this.getChildren().addAll(rec23,rec24);
				
				rec23.setHeight(0.01);
				rec24.setHeight(0.01);
				
				KeyValue kv1 = new KeyValue(rec24.heightProperty(), 50);
				KeyValue kv3 = new KeyValue(rec23.heightProperty(), 50);
				KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1,kv3);
				
				KeyValue kv2 = new KeyValue(rec24.heightProperty(), 450);
				KeyValue kv4 = new KeyValue(rec23.heightProperty(), 450);
				KeyFrame kf2 = new KeyFrame(Duration.seconds(0.1), kv2,kv4);
				
				Timeline timeline2 = new Timeline(144);
				timeline2.getKeyFrames().addAll(kf1,kf2);
				timeline2.setDelay(Duration.seconds(0.2));
				timeline2.play();
				
				OrderPane.this.getChildren().remove(imp1);
				OrderPane.this.getChildren().remove(imp2);
				OrderPane.this.getChildren().remove(imp3);
				OrderPane.this.getChildren().remove(imp4);
				OrderPane.this.getChildren().remove(imp5);
				OrderPane.this.getChildren().remove(imp6);
				OrderPane.this.getChildren().remove(imp7);
				OrderPane.this.getChildren().remove(imp8);
				OrderPane.this.getChildren().remove(imp9);
				OrderPane.this.getChildren().remove(imp10);
				OrderPane.this.getChildren().remove(imp11);
				OrderPane.this.getChildren().remove(imp12);
				OrderPane.this.getChildren().remove(imp13);
				OrderPane.this.getChildren().remove(imp14);
				OrderPane.this.getChildren().remove(imp15);
				OrderPane.this.getChildren().remove(imp16);
				OrderPane.this.getChildren().remove(imp17);
				OrderPane.this.getChildren().remove(imp18);
				OrderPane.this.getChildren().remove(imp19);
				OrderPane.this.getChildren().remove(imp20);
				OrderPane.this.getChildren().remove(imp21);
				OrderPane.this.getChildren().remove(imp22);
				OrderPane.this.getChildren().remove(imp23);
				OrderPane.this.getChildren().remove(imp24);
				OrderPane.this.getChildren().remove(imp25);
				OrderPane.this.getChildren().remove(imp26);
				OrderPane.this.getChildren().remove(imp27);
				OrderPane.this.getChildren().remove(imp28);
				OrderPane.this.getChildren().remove(imp29);
				OrderPane.this.getChildren().remove(imp30);
				OrderPane.this.getChildren().remove(imp31);
				OrderPane.this.getChildren().remove(imp32);
			
				
				timeline2.setOnFinished(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(imp9);
						OrderPane.this.getChildren().add(imp9);
						OrderPane.this.setTopAnchor(imp9, 70.0);
						OrderPane.this.setLeftAnchor(imp9, 240.0);
						
						imp9.label3.setText("" + imp9.food.now());
						imp9.label4.setText("" + imp9.food.getNumber());
					}
				});
				
				imp9.rec11.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp9);
					}
				});
				
				imp9.rec12.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp9);
					}
				});
			}
		});
		
		cp.im10.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				OrderPane.this.getChildren().remove(rec23);
				OrderPane.this.getChildren().remove(rec24);
				OrderPane.this.getChildren().addAll(rec23,rec24);
				
				rec23.setHeight(0.01);
				rec24.setHeight(0.01);
				
				KeyValue kv1 = new KeyValue(rec24.heightProperty(), 50);
				KeyValue kv3 = new KeyValue(rec23.heightProperty(), 50);
				KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1,kv3);
				
				KeyValue kv2 = new KeyValue(rec24.heightProperty(), 450);
				KeyValue kv4 = new KeyValue(rec23.heightProperty(), 450);
				KeyFrame kf2 = new KeyFrame(Duration.seconds(0.1), kv2,kv4);
				
				Timeline timeline2 = new Timeline(144);
				timeline2.getKeyFrames().addAll(kf1,kf2);
				timeline2.setDelay(Duration.seconds(0.2));
				timeline2.play();
				
				OrderPane.this.getChildren().remove(imp1);
				OrderPane.this.getChildren().remove(imp2);
				OrderPane.this.getChildren().remove(imp3);
				OrderPane.this.getChildren().remove(imp4);
				OrderPane.this.getChildren().remove(imp5);
				OrderPane.this.getChildren().remove(imp6);
				OrderPane.this.getChildren().remove(imp7);
				OrderPane.this.getChildren().remove(imp8);
				OrderPane.this.getChildren().remove(imp9);
				OrderPane.this.getChildren().remove(imp10);
				OrderPane.this.getChildren().remove(imp11);
				OrderPane.this.getChildren().remove(imp12);
				OrderPane.this.getChildren().remove(imp13);
				OrderPane.this.getChildren().remove(imp14);
				OrderPane.this.getChildren().remove(imp15);
				OrderPane.this.getChildren().remove(imp16);
				OrderPane.this.getChildren().remove(imp17);
				OrderPane.this.getChildren().remove(imp18);
				OrderPane.this.getChildren().remove(imp19);
				OrderPane.this.getChildren().remove(imp20);
				OrderPane.this.getChildren().remove(imp21);
				OrderPane.this.getChildren().remove(imp22);
				OrderPane.this.getChildren().remove(imp23);
				OrderPane.this.getChildren().remove(imp24);
				OrderPane.this.getChildren().remove(imp25);
				OrderPane.this.getChildren().remove(imp26);
				OrderPane.this.getChildren().remove(imp27);
				OrderPane.this.getChildren().remove(imp28);
				OrderPane.this.getChildren().remove(imp29);
				OrderPane.this.getChildren().remove(imp30);
				OrderPane.this.getChildren().remove(imp31);
				OrderPane.this.getChildren().remove(imp32);
			
				timeline2.setOnFinished(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(imp10);
						OrderPane.this.getChildren().add(imp10);
						OrderPane.this.setTopAnchor(imp10, 70.0);
						OrderPane.this.setLeftAnchor(imp10, 240.0);
						
						imp10.label3.setText("" + imp10.food.now());
						imp10.label4.setText("" + imp10.food.getNumber());
					}
				});
				
				imp10.rec11.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp10);
					}
				});
				
				imp10.rec12.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp10);
					}
				});
			}
		});
		
		cp.im11.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				OrderPane.this.getChildren().remove(rec23);
				OrderPane.this.getChildren().remove(rec24);
				OrderPane.this.getChildren().addAll(rec23,rec24);
				
				rec23.setHeight(0.01);
				rec24.setHeight(0.01);
				
				KeyValue kv1 = new KeyValue(rec24.heightProperty(), 50);
				KeyValue kv3 = new KeyValue(rec23.heightProperty(), 50);
				KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1,kv3);
				
				KeyValue kv2 = new KeyValue(rec24.heightProperty(), 450);
				KeyValue kv4 = new KeyValue(rec23.heightProperty(), 450);
				KeyFrame kf2 = new KeyFrame(Duration.seconds(0.1), kv2,kv4);
				
				Timeline timeline2 = new Timeline(144);
				timeline2.getKeyFrames().addAll(kf1,kf2);
				timeline2.setDelay(Duration.seconds(0.2));
				timeline2.play();
				
				OrderPane.this.getChildren().remove(imp1);
				OrderPane.this.getChildren().remove(imp2);
				OrderPane.this.getChildren().remove(imp3);
				OrderPane.this.getChildren().remove(imp4);
				OrderPane.this.getChildren().remove(imp5);
				OrderPane.this.getChildren().remove(imp6);
				OrderPane.this.getChildren().remove(imp7);
				OrderPane.this.getChildren().remove(imp8);
				OrderPane.this.getChildren().remove(imp9);
				OrderPane.this.getChildren().remove(imp10);
				OrderPane.this.getChildren().remove(imp11);
				OrderPane.this.getChildren().remove(imp12);
				OrderPane.this.getChildren().remove(imp13);
				OrderPane.this.getChildren().remove(imp14);
				OrderPane.this.getChildren().remove(imp15);
				OrderPane.this.getChildren().remove(imp16);
				OrderPane.this.getChildren().remove(imp17);
				OrderPane.this.getChildren().remove(imp18);
				OrderPane.this.getChildren().remove(imp19);
				OrderPane.this.getChildren().remove(imp20);
				OrderPane.this.getChildren().remove(imp21);
				OrderPane.this.getChildren().remove(imp22);
				OrderPane.this.getChildren().remove(imp23);
				OrderPane.this.getChildren().remove(imp24);
				OrderPane.this.getChildren().remove(imp25);
				OrderPane.this.getChildren().remove(imp26);
				OrderPane.this.getChildren().remove(imp27);
				OrderPane.this.getChildren().remove(imp28);
				OrderPane.this.getChildren().remove(imp29);
				OrderPane.this.getChildren().remove(imp30);
				OrderPane.this.getChildren().remove(imp31);
				OrderPane.this.getChildren().remove(imp32);
				
				timeline2.setOnFinished(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(imp11);
						OrderPane.this.getChildren().add(imp11);
						OrderPane.this.setTopAnchor(imp11, 70.0);
						OrderPane.this.setLeftAnchor(imp11, 240.0);
						
						imp11.label3.setText("" + imp11.food.now());
						imp11.label4.setText("" + imp11.food.getNumber());
					}
				});
				
				imp11.rec11.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp11);
					}
				});
				
				imp11.rec12.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp11);
					}
				});
			}
		});
		
		cp.im12.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				OrderPane.this.getChildren().remove(rec23);
				OrderPane.this.getChildren().remove(rec24);
				OrderPane.this.getChildren().addAll(rec23,rec24);
				
				rec23.setHeight(0.01);
				rec24.setHeight(0.01);
				
				KeyValue kv1 = new KeyValue(rec24.heightProperty(), 50);
				KeyValue kv3 = new KeyValue(rec23.heightProperty(), 50);
				KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1,kv3);
				
				KeyValue kv2 = new KeyValue(rec24.heightProperty(), 450);
				KeyValue kv4 = new KeyValue(rec23.heightProperty(), 450);
				KeyFrame kf2 = new KeyFrame(Duration.seconds(0.1), kv2,kv4);
				
				Timeline timeline2 = new Timeline(144);
				timeline2.getKeyFrames().addAll(kf1,kf2);
				timeline2.setDelay(Duration.seconds(0.2));
				timeline2.play();
				
				OrderPane.this.getChildren().remove(imp1);
				OrderPane.this.getChildren().remove(imp2);
				OrderPane.this.getChildren().remove(imp3);
				OrderPane.this.getChildren().remove(imp4);
				OrderPane.this.getChildren().remove(imp5);
				OrderPane.this.getChildren().remove(imp6);
				OrderPane.this.getChildren().remove(imp7);
				OrderPane.this.getChildren().remove(imp8);
				OrderPane.this.getChildren().remove(imp9);
				OrderPane.this.getChildren().remove(imp10);
				OrderPane.this.getChildren().remove(imp11);
				OrderPane.this.getChildren().remove(imp12);
				OrderPane.this.getChildren().remove(imp13);
				OrderPane.this.getChildren().remove(imp14);
				OrderPane.this.getChildren().remove(imp15);
				OrderPane.this.getChildren().remove(imp16);
				OrderPane.this.getChildren().remove(imp17);
				OrderPane.this.getChildren().remove(imp18);
				OrderPane.this.getChildren().remove(imp19);
				OrderPane.this.getChildren().remove(imp20);
				OrderPane.this.getChildren().remove(imp21);
				OrderPane.this.getChildren().remove(imp22);
				OrderPane.this.getChildren().remove(imp23);
				OrderPane.this.getChildren().remove(imp24);
				OrderPane.this.getChildren().remove(imp25);
				OrderPane.this.getChildren().remove(imp26);
				OrderPane.this.getChildren().remove(imp27);
				OrderPane.this.getChildren().remove(imp28);
				OrderPane.this.getChildren().remove(imp29);
				OrderPane.this.getChildren().remove(imp30);
				OrderPane.this.getChildren().remove(imp31);
				OrderPane.this.getChildren().remove(imp32);
				
				timeline2.setOnFinished(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(imp12);
						OrderPane.this.getChildren().add(imp12);
						OrderPane.this.setTopAnchor(imp12, 70.0);
						OrderPane.this.setLeftAnchor(imp12, 240.0);
						
						imp12.label3.setText("" + imp12.food.now());
						imp12.label4.setText("" + imp12.food.getNumber());
					}
				});
				
				imp12.rec11.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp12);
					}
				});
				
				imp12.rec12.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp12);
					}
				});
			}
		});
		
		stp.im1.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				OrderPane.this.getChildren().remove(rec23);
				OrderPane.this.getChildren().remove(rec24);
				OrderPane.this.getChildren().addAll(rec23,rec24);
				
				rec23.setHeight(0.01);
				rec24.setHeight(0.01);
				
				KeyValue kv1 = new KeyValue(rec24.heightProperty(), 50);
				KeyValue kv3 = new KeyValue(rec23.heightProperty(), 50);
				KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1,kv3);
				
				KeyValue kv2 = new KeyValue(rec24.heightProperty(), 450);
				KeyValue kv4 = new KeyValue(rec23.heightProperty(), 450);
				KeyFrame kf2 = new KeyFrame(Duration.seconds(0.1), kv2,kv4);
				
				Timeline timeline2 = new Timeline(144);
				timeline2.getKeyFrames().addAll(kf1,kf2);
				timeline2.setDelay(Duration.seconds(0.2));
				timeline2.play();
				
				OrderPane.this.getChildren().remove(imp1);
				OrderPane.this.getChildren().remove(imp2);
				OrderPane.this.getChildren().remove(imp3);
				OrderPane.this.getChildren().remove(imp4);
				OrderPane.this.getChildren().remove(imp5);
				OrderPane.this.getChildren().remove(imp6);
				OrderPane.this.getChildren().remove(imp7);
				OrderPane.this.getChildren().remove(imp8);
				OrderPane.this.getChildren().remove(imp9);
				OrderPane.this.getChildren().remove(imp10);
				OrderPane.this.getChildren().remove(imp11);
				OrderPane.this.getChildren().remove(imp12);
				OrderPane.this.getChildren().remove(imp13);
				OrderPane.this.getChildren().remove(imp14);
				OrderPane.this.getChildren().remove(imp15);
				OrderPane.this.getChildren().remove(imp16);
				OrderPane.this.getChildren().remove(imp17);
				OrderPane.this.getChildren().remove(imp18);
				OrderPane.this.getChildren().remove(imp19);
				OrderPane.this.getChildren().remove(imp20);
				OrderPane.this.getChildren().remove(imp21);
				OrderPane.this.getChildren().remove(imp22);
				OrderPane.this.getChildren().remove(imp23);
				OrderPane.this.getChildren().remove(imp24);
				OrderPane.this.getChildren().remove(imp25);
				OrderPane.this.getChildren().remove(imp26);
				OrderPane.this.getChildren().remove(imp27);
				OrderPane.this.getChildren().remove(imp28);
				OrderPane.this.getChildren().remove(imp29);
				OrderPane.this.getChildren().remove(imp30);
				OrderPane.this.getChildren().remove(imp31);
				OrderPane.this.getChildren().remove(imp32);
				
				timeline2.setOnFinished(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(imp13);
						OrderPane.this.getChildren().add(imp13);
						OrderPane.this.setTopAnchor(imp13, 70.0);
						OrderPane.this.setLeftAnchor(imp13, 240.0);
						
						imp13.label3.setText("" + imp13.food.now());
						imp13.label4.setText("" + imp13.food.getNumber());
					}
				});
				
				imp13.rec11.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp13);
					}
				});
				
				imp13.rec12.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp13);
					}
				});
			}
		});
		
		stp.im2.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				OrderPane.this.getChildren().remove(rec23);
				OrderPane.this.getChildren().remove(rec24);
				OrderPane.this.getChildren().addAll(rec23,rec24);
				
				rec23.setHeight(0.01);
				rec24.setHeight(0.01);
				
				KeyValue kv1 = new KeyValue(rec24.heightProperty(), 50);
				KeyValue kv3 = new KeyValue(rec23.heightProperty(), 50);
				KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1,kv3);
				
				KeyValue kv2 = new KeyValue(rec24.heightProperty(), 450);
				KeyValue kv4 = new KeyValue(rec23.heightProperty(), 450);
				KeyFrame kf2 = new KeyFrame(Duration.seconds(0.1), kv2,kv4);
				
				Timeline timeline2 = new Timeline(144);
				timeline2.getKeyFrames().addAll(kf1,kf2);
				timeline2.setDelay(Duration.seconds(0.2));
				timeline2.play();
				
				OrderPane.this.getChildren().remove(imp1);
				OrderPane.this.getChildren().remove(imp2);
				OrderPane.this.getChildren().remove(imp3);
				OrderPane.this.getChildren().remove(imp4);
				OrderPane.this.getChildren().remove(imp5);
				OrderPane.this.getChildren().remove(imp6);
				OrderPane.this.getChildren().remove(imp7);
				OrderPane.this.getChildren().remove(imp8);
				OrderPane.this.getChildren().remove(imp9);
				OrderPane.this.getChildren().remove(imp10);
				OrderPane.this.getChildren().remove(imp11);
				OrderPane.this.getChildren().remove(imp12);
				OrderPane.this.getChildren().remove(imp13);
				OrderPane.this.getChildren().remove(imp14);
				OrderPane.this.getChildren().remove(imp15);
				OrderPane.this.getChildren().remove(imp16);
				OrderPane.this.getChildren().remove(imp17);
				OrderPane.this.getChildren().remove(imp18);
				OrderPane.this.getChildren().remove(imp19);
				OrderPane.this.getChildren().remove(imp20);
				OrderPane.this.getChildren().remove(imp21);
				OrderPane.this.getChildren().remove(imp22);
				OrderPane.this.getChildren().remove(imp23);
				OrderPane.this.getChildren().remove(imp24);
				OrderPane.this.getChildren().remove(imp25);
				OrderPane.this.getChildren().remove(imp26);
				OrderPane.this.getChildren().remove(imp27);
				OrderPane.this.getChildren().remove(imp28);
				OrderPane.this.getChildren().remove(imp29);
				OrderPane.this.getChildren().remove(imp30);
				OrderPane.this.getChildren().remove(imp31);
				OrderPane.this.getChildren().remove(imp32);
				
				timeline2.setOnFinished(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(imp14);
						OrderPane.this.getChildren().add(imp14);
						OrderPane.this.setTopAnchor(imp14, 70.0);
						OrderPane.this.setLeftAnchor(imp14, 240.0);
						
						imp14.label3.setText("" + imp14.food.now());
						imp14.label4.setText("" + imp14.food.getNumber());
					}
				});
				
				imp14.rec11.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp14);
					}
				});
				
				imp14.rec12.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp14);
					}
				});
			}
		});
		
		stp.im3.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				OrderPane.this.getChildren().remove(rec23);
				OrderPane.this.getChildren().remove(rec24);
				OrderPane.this.getChildren().addAll(rec23,rec24);
				
				rec23.setHeight(0.01);
				rec24.setHeight(0.01);
				
				KeyValue kv1 = new KeyValue(rec24.heightProperty(), 50);
				KeyValue kv3 = new KeyValue(rec23.heightProperty(), 50);
				KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1,kv3);
				
				KeyValue kv2 = new KeyValue(rec24.heightProperty(), 450);
				KeyValue kv4 = new KeyValue(rec23.heightProperty(), 450);
				KeyFrame kf2 = new KeyFrame(Duration.seconds(0.1), kv2,kv4);
				
				Timeline timeline2 = new Timeline(144);
				timeline2.getKeyFrames().addAll(kf1,kf2);
				timeline2.setDelay(Duration.seconds(0.2));
				timeline2.play();
				
				OrderPane.this.getChildren().remove(imp1);
				OrderPane.this.getChildren().remove(imp2);
				OrderPane.this.getChildren().remove(imp3);
				OrderPane.this.getChildren().remove(imp4);
				OrderPane.this.getChildren().remove(imp5);
				OrderPane.this.getChildren().remove(imp6);
				OrderPane.this.getChildren().remove(imp7);
				OrderPane.this.getChildren().remove(imp8);
				OrderPane.this.getChildren().remove(imp9);
				OrderPane.this.getChildren().remove(imp10);
				OrderPane.this.getChildren().remove(imp11);
				OrderPane.this.getChildren().remove(imp12);
				OrderPane.this.getChildren().remove(imp13);
				OrderPane.this.getChildren().remove(imp14);
				OrderPane.this.getChildren().remove(imp15);
				OrderPane.this.getChildren().remove(imp16);
				OrderPane.this.getChildren().remove(imp17);
				OrderPane.this.getChildren().remove(imp18);
				OrderPane.this.getChildren().remove(imp19);
				OrderPane.this.getChildren().remove(imp20);
				OrderPane.this.getChildren().remove(imp21);
				OrderPane.this.getChildren().remove(imp22);
				OrderPane.this.getChildren().remove(imp23);
				OrderPane.this.getChildren().remove(imp24);
				OrderPane.this.getChildren().remove(imp25);
				OrderPane.this.getChildren().remove(imp26);
				OrderPane.this.getChildren().remove(imp27);
				OrderPane.this.getChildren().remove(imp28);
				OrderPane.this.getChildren().remove(imp29);
				OrderPane.this.getChildren().remove(imp30);
				OrderPane.this.getChildren().remove(imp31);
				OrderPane.this.getChildren().remove(imp32);
				
				timeline2.setOnFinished(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(imp15);
						OrderPane.this.getChildren().add(imp15);
						OrderPane.this.setTopAnchor(imp15, 70.0);
						OrderPane.this.setLeftAnchor(imp15, 240.0);
						
						imp15.label3.setText("" + imp15.food.now());
						imp15.label4.setText("" + imp15.food.getNumber());
					}
				});
				
				imp15.rec11.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp15);
					}
				});
				
				imp15.rec12.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp15);
					}
				});
			}
		});
		
		stp.im4.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				OrderPane.this.getChildren().remove(rec23);
				OrderPane.this.getChildren().remove(rec24);
				OrderPane.this.getChildren().addAll(rec23,rec24);
				
				rec23.setHeight(0.01);
				rec24.setHeight(0.01);
				
				KeyValue kv1 = new KeyValue(rec24.heightProperty(), 50);
				KeyValue kv3 = new KeyValue(rec23.heightProperty(), 50);
				KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1,kv3);
				
				KeyValue kv2 = new KeyValue(rec24.heightProperty(), 450);
				KeyValue kv4 = new KeyValue(rec23.heightProperty(), 450);
				KeyFrame kf2 = new KeyFrame(Duration.seconds(0.1), kv2,kv4);
				
				Timeline timeline2 = new Timeline(144);
				timeline2.getKeyFrames().addAll(kf1,kf2);
				timeline2.setDelay(Duration.seconds(0.2));
				timeline2.play();
				
				OrderPane.this.getChildren().remove(imp1);
				OrderPane.this.getChildren().remove(imp2);
				OrderPane.this.getChildren().remove(imp3);
				OrderPane.this.getChildren().remove(imp4);
				OrderPane.this.getChildren().remove(imp5);
				OrderPane.this.getChildren().remove(imp6);
				OrderPane.this.getChildren().remove(imp7);
				OrderPane.this.getChildren().remove(imp8);
				OrderPane.this.getChildren().remove(imp9);
				OrderPane.this.getChildren().remove(imp10);
				OrderPane.this.getChildren().remove(imp11);
				OrderPane.this.getChildren().remove(imp12);
				OrderPane.this.getChildren().remove(imp13);
				OrderPane.this.getChildren().remove(imp14);
				OrderPane.this.getChildren().remove(imp15);
				OrderPane.this.getChildren().remove(imp16);
				OrderPane.this.getChildren().remove(imp17);
				OrderPane.this.getChildren().remove(imp18);
				OrderPane.this.getChildren().remove(imp19);
				OrderPane.this.getChildren().remove(imp20);
				OrderPane.this.getChildren().remove(imp21);
				OrderPane.this.getChildren().remove(imp22);
				OrderPane.this.getChildren().remove(imp23);
				OrderPane.this.getChildren().remove(imp24);
				OrderPane.this.getChildren().remove(imp25);
				OrderPane.this.getChildren().remove(imp26);
				OrderPane.this.getChildren().remove(imp27);
				OrderPane.this.getChildren().remove(imp28);
				OrderPane.this.getChildren().remove(imp29);
				OrderPane.this.getChildren().remove(imp30);
				OrderPane.this.getChildren().remove(imp31);
				OrderPane.this.getChildren().remove(imp32);
				
				timeline2.setOnFinished(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(imp16);
						OrderPane.this.getChildren().add(imp16);
						OrderPane.this.setTopAnchor(imp16, 70.0);
						OrderPane.this.setLeftAnchor(imp16, 240.0);
						
						imp16.label3.setText("" + imp16.food.now());
						imp16.label4.setText("" + imp16.food.getNumber());
					}
				});
				
				imp16.rec11.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp16);
					}
				});
				
				imp16.rec12.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp16);
					}
				});
			}
		});
		
		stp.im5.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				OrderPane.this.getChildren().remove(rec23);
				OrderPane.this.getChildren().remove(rec24);
				OrderPane.this.getChildren().addAll(rec23,rec24);
				
				rec23.setHeight(0.01);
				rec24.setHeight(0.01);
				
				KeyValue kv1 = new KeyValue(rec24.heightProperty(), 50);
				KeyValue kv3 = new KeyValue(rec23.heightProperty(), 50);
				KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1,kv3);
				
				KeyValue kv2 = new KeyValue(rec24.heightProperty(), 450);
				KeyValue kv4 = new KeyValue(rec23.heightProperty(), 450);
				KeyFrame kf2 = new KeyFrame(Duration.seconds(0.1), kv2,kv4);
				
				Timeline timeline2 = new Timeline(144);
				timeline2.getKeyFrames().addAll(kf1,kf2);
				timeline2.setDelay(Duration.seconds(0.2));
				timeline2.play();
				
				OrderPane.this.getChildren().remove(imp1);
				OrderPane.this.getChildren().remove(imp2);
				OrderPane.this.getChildren().remove(imp3);
				OrderPane.this.getChildren().remove(imp4);
				OrderPane.this.getChildren().remove(imp5);
				OrderPane.this.getChildren().remove(imp6);
				OrderPane.this.getChildren().remove(imp7);
				OrderPane.this.getChildren().remove(imp8);
				OrderPane.this.getChildren().remove(imp9);
				OrderPane.this.getChildren().remove(imp10);
				OrderPane.this.getChildren().remove(imp11);
				OrderPane.this.getChildren().remove(imp12);
				OrderPane.this.getChildren().remove(imp13);
				OrderPane.this.getChildren().remove(imp14);
				OrderPane.this.getChildren().remove(imp15);
				OrderPane.this.getChildren().remove(imp16);
				OrderPane.this.getChildren().remove(imp17);
				OrderPane.this.getChildren().remove(imp18);
				OrderPane.this.getChildren().remove(imp19);
				OrderPane.this.getChildren().remove(imp20);
				OrderPane.this.getChildren().remove(imp21);
				OrderPane.this.getChildren().remove(imp22);
				OrderPane.this.getChildren().remove(imp23);
				OrderPane.this.getChildren().remove(imp24);
				OrderPane.this.getChildren().remove(imp25);
				OrderPane.this.getChildren().remove(imp26);
				OrderPane.this.getChildren().remove(imp27);
				OrderPane.this.getChildren().remove(imp28);
				OrderPane.this.getChildren().remove(imp29);
				OrderPane.this.getChildren().remove(imp30);
				OrderPane.this.getChildren().remove(imp31);
				OrderPane.this.getChildren().remove(imp32);
			
				timeline2.setOnFinished(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(imp17);
						OrderPane.this.getChildren().add(imp17);
						OrderPane.this.setTopAnchor(imp17, 70.0);
						OrderPane.this.setLeftAnchor(imp17, 240.0);
						
						imp17.label3.setText("" + imp17.food.now());
						imp17.label4.setText("" + imp17.food.getNumber());
					}
				});
				
				imp17.rec11.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp17);
					}
				});
				
				imp17.rec12.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp17);
					}
				});
			}
		});
		
		sop.im1.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				OrderPane.this.getChildren().remove(rec23);
				OrderPane.this.getChildren().remove(rec24);
				OrderPane.this.getChildren().addAll(rec23,rec24);
				
				rec23.setHeight(0.01);
				rec24.setHeight(0.01);
				
				KeyValue kv1 = new KeyValue(rec24.heightProperty(), 50);
				KeyValue kv3 = new KeyValue(rec23.heightProperty(), 50);
				KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1,kv3);
				
				KeyValue kv2 = new KeyValue(rec24.heightProperty(), 450);
				KeyValue kv4 = new KeyValue(rec23.heightProperty(), 450);
				KeyFrame kf2 = new KeyFrame(Duration.seconds(0.1), kv2,kv4);
				
				Timeline timeline2 = new Timeline(144);
				timeline2.getKeyFrames().addAll(kf1,kf2);
				timeline2.setDelay(Duration.seconds(0.2));
				timeline2.play();
				
				OrderPane.this.getChildren().remove(imp1);
				OrderPane.this.getChildren().remove(imp2);
				OrderPane.this.getChildren().remove(imp3);
				OrderPane.this.getChildren().remove(imp4);
				OrderPane.this.getChildren().remove(imp5);
				OrderPane.this.getChildren().remove(imp6);
				OrderPane.this.getChildren().remove(imp7);
				OrderPane.this.getChildren().remove(imp8);
				OrderPane.this.getChildren().remove(imp9);
				OrderPane.this.getChildren().remove(imp10);
				OrderPane.this.getChildren().remove(imp11);
				OrderPane.this.getChildren().remove(imp12);
				OrderPane.this.getChildren().remove(imp13);
				OrderPane.this.getChildren().remove(imp14);
				OrderPane.this.getChildren().remove(imp15);
				OrderPane.this.getChildren().remove(imp16);
				OrderPane.this.getChildren().remove(imp17);
				OrderPane.this.getChildren().remove(imp18);
				OrderPane.this.getChildren().remove(imp19);
				OrderPane.this.getChildren().remove(imp20);
				OrderPane.this.getChildren().remove(imp21);
				OrderPane.this.getChildren().remove(imp22);
				OrderPane.this.getChildren().remove(imp23);
				OrderPane.this.getChildren().remove(imp24);
				OrderPane.this.getChildren().remove(imp25);
				OrderPane.this.getChildren().remove(imp26);
				OrderPane.this.getChildren().remove(imp27);
				OrderPane.this.getChildren().remove(imp28);
				OrderPane.this.getChildren().remove(imp29);
				OrderPane.this.getChildren().remove(imp30);
				OrderPane.this.getChildren().remove(imp31);
				OrderPane.this.getChildren().remove(imp32);
				
				timeline2.setOnFinished(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(imp18);
						OrderPane.this.getChildren().add(imp18);
						OrderPane.this.setTopAnchor(imp18, 70.0);
						OrderPane.this.setLeftAnchor(imp18, 240.0);
						
						imp18.label3.setText("" + imp18.food.now());
						imp18.label4.setText("" + imp18.food.getNumber());
					}
				});
				
				imp18.rec11.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp18);
					}
				});
				
				imp18.rec12.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp18);
					}
				});
			}
		});
		
		sop.im2.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				OrderPane.this.getChildren().remove(rec23);
				OrderPane.this.getChildren().remove(rec24);
				OrderPane.this.getChildren().addAll(rec23,rec24);
				
				rec23.setHeight(0.01);
				rec24.setHeight(0.01);
				
				KeyValue kv1 = new KeyValue(rec24.heightProperty(), 50);
				KeyValue kv3 = new KeyValue(rec23.heightProperty(), 50);
				KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1,kv3);
				
				KeyValue kv2 = new KeyValue(rec24.heightProperty(), 450);
				KeyValue kv4 = new KeyValue(rec23.heightProperty(), 450);
				KeyFrame kf2 = new KeyFrame(Duration.seconds(0.1), kv2,kv4);
				
				Timeline timeline2 = new Timeline(144);
				timeline2.getKeyFrames().addAll(kf1,kf2);
				timeline2.setDelay(Duration.seconds(0.2));
				timeline2.play();
				
				OrderPane.this.getChildren().remove(imp1);
				OrderPane.this.getChildren().remove(imp2);
				OrderPane.this.getChildren().remove(imp3);
				OrderPane.this.getChildren().remove(imp4);
				OrderPane.this.getChildren().remove(imp5);
				OrderPane.this.getChildren().remove(imp6);
				OrderPane.this.getChildren().remove(imp7);
				OrderPane.this.getChildren().remove(imp8);
				OrderPane.this.getChildren().remove(imp9);
				OrderPane.this.getChildren().remove(imp10);
				OrderPane.this.getChildren().remove(imp11);
				OrderPane.this.getChildren().remove(imp12);
				OrderPane.this.getChildren().remove(imp13);
				OrderPane.this.getChildren().remove(imp14);
				OrderPane.this.getChildren().remove(imp15);
				OrderPane.this.getChildren().remove(imp16);
				OrderPane.this.getChildren().remove(imp17);
				OrderPane.this.getChildren().remove(imp18);
				OrderPane.this.getChildren().remove(imp19);
				OrderPane.this.getChildren().remove(imp20);
				OrderPane.this.getChildren().remove(imp21);
				OrderPane.this.getChildren().remove(imp22);
				OrderPane.this.getChildren().remove(imp23);
				OrderPane.this.getChildren().remove(imp24);
				OrderPane.this.getChildren().remove(imp25);
				OrderPane.this.getChildren().remove(imp26);
				OrderPane.this.getChildren().remove(imp27);
				OrderPane.this.getChildren().remove(imp28);
				OrderPane.this.getChildren().remove(imp29);
				OrderPane.this.getChildren().remove(imp30);
				OrderPane.this.getChildren().remove(imp31);
				OrderPane.this.getChildren().remove(imp32);
			
				timeline2.setOnFinished(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(imp19);
						OrderPane.this.getChildren().add(imp19);
						OrderPane.this.setTopAnchor(imp19, 70.0);
						OrderPane.this.setLeftAnchor(imp19, 240.0);
						
						imp19.label3.setText("" + imp19.food.now());
						imp19.label4.setText("" + imp19.food.getNumber());
					}
				});
				
				imp19.rec11.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp19);
					}
				});
				
				imp19.rec12.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp19);
					}
				});
			}
		});
		
		sop.im3.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				OrderPane.this.getChildren().remove(rec23);
				OrderPane.this.getChildren().remove(rec24);
				OrderPane.this.getChildren().addAll(rec23,rec24);
				
				rec23.setHeight(0.01);
				rec24.setHeight(0.01);
				
				KeyValue kv1 = new KeyValue(rec24.heightProperty(), 50);
				KeyValue kv3 = new KeyValue(rec23.heightProperty(), 50);
				KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1,kv3);
				
				KeyValue kv2 = new KeyValue(rec24.heightProperty(), 450);
				KeyValue kv4 = new KeyValue(rec23.heightProperty(), 450);
				KeyFrame kf2 = new KeyFrame(Duration.seconds(0.1), kv2,kv4);
				
				Timeline timeline2 = new Timeline(144);
				timeline2.getKeyFrames().addAll(kf1,kf2);
				timeline2.setDelay(Duration.seconds(0.2));
				timeline2.play();
				
				OrderPane.this.getChildren().remove(imp1);
				OrderPane.this.getChildren().remove(imp2);
				OrderPane.this.getChildren().remove(imp3);
				OrderPane.this.getChildren().remove(imp4);
				OrderPane.this.getChildren().remove(imp5);
				OrderPane.this.getChildren().remove(imp6);
				OrderPane.this.getChildren().remove(imp7);
				OrderPane.this.getChildren().remove(imp8);
				OrderPane.this.getChildren().remove(imp9);
				OrderPane.this.getChildren().remove(imp10);
				OrderPane.this.getChildren().remove(imp11);
				OrderPane.this.getChildren().remove(imp12);
				OrderPane.this.getChildren().remove(imp13);
				OrderPane.this.getChildren().remove(imp14);
				OrderPane.this.getChildren().remove(imp15);
				OrderPane.this.getChildren().remove(imp16);
				OrderPane.this.getChildren().remove(imp17);
				OrderPane.this.getChildren().remove(imp18);
				OrderPane.this.getChildren().remove(imp19);
				OrderPane.this.getChildren().remove(imp20);
				OrderPane.this.getChildren().remove(imp21);
				OrderPane.this.getChildren().remove(imp22);
				OrderPane.this.getChildren().remove(imp23);
				OrderPane.this.getChildren().remove(imp24);
				OrderPane.this.getChildren().remove(imp25);
				OrderPane.this.getChildren().remove(imp26);
				OrderPane.this.getChildren().remove(imp27);
				OrderPane.this.getChildren().remove(imp28);
				OrderPane.this.getChildren().remove(imp29);
				OrderPane.this.getChildren().remove(imp30);
				OrderPane.this.getChildren().remove(imp31);
				OrderPane.this.getChildren().remove(imp32);
				
				timeline2.setOnFinished(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(imp20);
						OrderPane.this.getChildren().add(imp20);
						OrderPane.this.setTopAnchor(imp20, 70.0);
						OrderPane.this.setLeftAnchor(imp20, 240.0);
						
						imp20.label3.setText("" + imp20.food.now());
						imp20.label4.setText("" + imp20.food.getNumber());
					}
				});
				
				imp20.rec11.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp20);
					}
				});
				
				imp20.rec12.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp20);
					}
				});
			}
		});
		
		sop.im4.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				OrderPane.this.getChildren().remove(rec23);
				OrderPane.this.getChildren().remove(rec24);
				OrderPane.this.getChildren().addAll(rec23,rec24);
				
				rec23.setHeight(0.01);
				rec24.setHeight(0.01);
				
				KeyValue kv1 = new KeyValue(rec24.heightProperty(), 50);
				KeyValue kv3 = new KeyValue(rec23.heightProperty(), 50);
				KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1,kv3);
				
				KeyValue kv2 = new KeyValue(rec24.heightProperty(), 450);
				KeyValue kv4 = new KeyValue(rec23.heightProperty(), 450);
				KeyFrame kf2 = new KeyFrame(Duration.seconds(0.1), kv2,kv4);
				
				Timeline timeline2 = new Timeline(144);
				timeline2.getKeyFrames().addAll(kf1,kf2);
				timeline2.setDelay(Duration.seconds(0.2));
				timeline2.play();
				
				OrderPane.this.getChildren().remove(imp1);
				OrderPane.this.getChildren().remove(imp2);
				OrderPane.this.getChildren().remove(imp3);
				OrderPane.this.getChildren().remove(imp4);
				OrderPane.this.getChildren().remove(imp5);
				OrderPane.this.getChildren().remove(imp6);
				OrderPane.this.getChildren().remove(imp7);
				OrderPane.this.getChildren().remove(imp8);
				OrderPane.this.getChildren().remove(imp9);
				OrderPane.this.getChildren().remove(imp10);
				OrderPane.this.getChildren().remove(imp11);
				OrderPane.this.getChildren().remove(imp12);
				OrderPane.this.getChildren().remove(imp13);
				OrderPane.this.getChildren().remove(imp14);
				OrderPane.this.getChildren().remove(imp15);
				OrderPane.this.getChildren().remove(imp16);
				OrderPane.this.getChildren().remove(imp17);
				OrderPane.this.getChildren().remove(imp18);
				OrderPane.this.getChildren().remove(imp19);
				OrderPane.this.getChildren().remove(imp20);
				OrderPane.this.getChildren().remove(imp21);
				OrderPane.this.getChildren().remove(imp22);
				OrderPane.this.getChildren().remove(imp23);
				OrderPane.this.getChildren().remove(imp24);
				OrderPane.this.getChildren().remove(imp25);
				OrderPane.this.getChildren().remove(imp26);
				OrderPane.this.getChildren().remove(imp27);
				OrderPane.this.getChildren().remove(imp28);
				OrderPane.this.getChildren().remove(imp29);
				OrderPane.this.getChildren().remove(imp30);
				OrderPane.this.getChildren().remove(imp31);
				OrderPane.this.getChildren().remove(imp32);
				
				timeline2.setOnFinished(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(imp21);
						OrderPane.this.getChildren().add(imp21);
						OrderPane.this.setTopAnchor(imp21, 70.0);
						OrderPane.this.setLeftAnchor(imp21, 240.0);
						
						imp21.label3.setText("" + imp21.food.now());
						imp21.label4.setText("" + imp21.food.getNumber());
					}
				});
				
				
				imp21.rec11.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp21);
					}
				});
				
				imp21.rec12.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp21);
					}
				});
			}
		});
		
		sop.im5.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				OrderPane.this.getChildren().remove(rec23);
				OrderPane.this.getChildren().remove(rec24);
				OrderPane.this.getChildren().addAll(rec23,rec24);
				
				rec23.setHeight(0.01);
				rec24.setHeight(0.01);
				
				KeyValue kv1 = new KeyValue(rec24.heightProperty(), 50);
				KeyValue kv3 = new KeyValue(rec23.heightProperty(), 50);
				KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1,kv3);
				
				KeyValue kv2 = new KeyValue(rec24.heightProperty(), 450);
				KeyValue kv4 = new KeyValue(rec23.heightProperty(), 450);
				KeyFrame kf2 = new KeyFrame(Duration.seconds(0.1), kv2,kv4);
				
				Timeline timeline2 = new Timeline(144);
				timeline2.getKeyFrames().addAll(kf1,kf2);
				timeline2.setDelay(Duration.seconds(0.2));
				timeline2.play();
				
				OrderPane.this.getChildren().remove(imp1);
				OrderPane.this.getChildren().remove(imp2);
				OrderPane.this.getChildren().remove(imp3);
				OrderPane.this.getChildren().remove(imp4);
				OrderPane.this.getChildren().remove(imp5);
				OrderPane.this.getChildren().remove(imp6);
				OrderPane.this.getChildren().remove(imp7);
				OrderPane.this.getChildren().remove(imp8);
				OrderPane.this.getChildren().remove(imp9);
				OrderPane.this.getChildren().remove(imp10);
				OrderPane.this.getChildren().remove(imp11);
				OrderPane.this.getChildren().remove(imp12);
				OrderPane.this.getChildren().remove(imp13);
				OrderPane.this.getChildren().remove(imp14);
				OrderPane.this.getChildren().remove(imp15);
				OrderPane.this.getChildren().remove(imp16);
				OrderPane.this.getChildren().remove(imp17);
				OrderPane.this.getChildren().remove(imp18);
				OrderPane.this.getChildren().remove(imp19);
				OrderPane.this.getChildren().remove(imp20);
				OrderPane.this.getChildren().remove(imp21);
				OrderPane.this.getChildren().remove(imp22);
				OrderPane.this.getChildren().remove(imp23);
				OrderPane.this.getChildren().remove(imp24);
				OrderPane.this.getChildren().remove(imp25);
				OrderPane.this.getChildren().remove(imp26);
				OrderPane.this.getChildren().remove(imp27);
				OrderPane.this.getChildren().remove(imp28);
				OrderPane.this.getChildren().remove(imp29);
				OrderPane.this.getChildren().remove(imp30);
				OrderPane.this.getChildren().remove(imp31);
				OrderPane.this.getChildren().remove(imp32);
			
				timeline2.setOnFinished(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(imp22);
						OrderPane.this.getChildren().add(imp22);
						OrderPane.this.setTopAnchor(imp22, 70.0);
						OrderPane.this.setLeftAnchor(imp22, 240.0);
						
						imp22.label3.setText("" + imp22.food.now());
						imp22.label4.setText("" + imp22.food.getNumber());
					}
				});
				
				
				imp22.rec11.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp22);
					}
				});
				
				imp22.rec12.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp22);
					}
				});
			}
		});
		
		dp.im1.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				OrderPane.this.getChildren().remove(rec23);
				OrderPane.this.getChildren().remove(rec24);
				OrderPane.this.getChildren().addAll(rec23,rec24);
				
				rec23.setHeight(0.01);
				rec24.setHeight(0.01);
				
				KeyValue kv1 = new KeyValue(rec24.heightProperty(), 50);
				KeyValue kv3 = new KeyValue(rec23.heightProperty(), 50);
				KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1,kv3);
				
				KeyValue kv2 = new KeyValue(rec24.heightProperty(), 450);
				KeyValue kv4 = new KeyValue(rec23.heightProperty(), 450);
				KeyFrame kf2 = new KeyFrame(Duration.seconds(0.1), kv2,kv4);
				
				Timeline timeline2 = new Timeline(144);
				timeline2.getKeyFrames().addAll(kf1,kf2);
				timeline2.setDelay(Duration.seconds(0.2));
				timeline2.play();
				
				OrderPane.this.getChildren().remove(imp1);
				OrderPane.this.getChildren().remove(imp2);
				OrderPane.this.getChildren().remove(imp3);
				OrderPane.this.getChildren().remove(imp4);
				OrderPane.this.getChildren().remove(imp5);
				OrderPane.this.getChildren().remove(imp6);
				OrderPane.this.getChildren().remove(imp7);
				OrderPane.this.getChildren().remove(imp8);
				OrderPane.this.getChildren().remove(imp9);
				OrderPane.this.getChildren().remove(imp10);
				OrderPane.this.getChildren().remove(imp11);
				OrderPane.this.getChildren().remove(imp12);
				OrderPane.this.getChildren().remove(imp13);
				OrderPane.this.getChildren().remove(imp14);
				OrderPane.this.getChildren().remove(imp15);
				OrderPane.this.getChildren().remove(imp16);
				OrderPane.this.getChildren().remove(imp17);
				OrderPane.this.getChildren().remove(imp18);
				OrderPane.this.getChildren().remove(imp19);
				OrderPane.this.getChildren().remove(imp20);
				OrderPane.this.getChildren().remove(imp21);
				OrderPane.this.getChildren().remove(imp22);
				OrderPane.this.getChildren().remove(imp23);
				OrderPane.this.getChildren().remove(imp24);
				OrderPane.this.getChildren().remove(imp25);
				OrderPane.this.getChildren().remove(imp26);
				OrderPane.this.getChildren().remove(imp27);
				OrderPane.this.getChildren().remove(imp28);
				OrderPane.this.getChildren().remove(imp29);
				OrderPane.this.getChildren().remove(imp30);
				OrderPane.this.getChildren().remove(imp31);
				OrderPane.this.getChildren().remove(imp32);
				
				timeline2.setOnFinished(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(imp23);
						OrderPane.this.getChildren().add(imp23);
						OrderPane.this.setTopAnchor(imp23, 70.0);
						OrderPane.this.setLeftAnchor(imp23, 240.0);
						
						imp23.label3.setText("" + imp23.food.now());
						imp23.label4.setText("" + imp23.food.getNumber());
					}
				});
				
				
				imp23.rec11.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp23);
					}
				});
				
				imp23.rec12.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp23);
					}
				});
			}
		});
		
		dp.im2.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				OrderPane.this.getChildren().remove(rec23);
				OrderPane.this.getChildren().remove(rec24);
				OrderPane.this.getChildren().addAll(rec23,rec24);
				
				rec23.setHeight(0.01);
				rec24.setHeight(0.01);
				
				KeyValue kv1 = new KeyValue(rec24.heightProperty(), 50);
				KeyValue kv3 = new KeyValue(rec23.heightProperty(), 50);
				KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1,kv3);
				
				KeyValue kv2 = new KeyValue(rec24.heightProperty(), 450);
				KeyValue kv4 = new KeyValue(rec23.heightProperty(), 450);
				KeyFrame kf2 = new KeyFrame(Duration.seconds(0.1), kv2,kv4);
				
				Timeline timeline2 = new Timeline(144);
				timeline2.getKeyFrames().addAll(kf1,kf2);
				timeline2.setDelay(Duration.seconds(0.2));
				timeline2.play();
				
				OrderPane.this.getChildren().remove(imp1);
				OrderPane.this.getChildren().remove(imp2);
				OrderPane.this.getChildren().remove(imp3);
				OrderPane.this.getChildren().remove(imp4);
				OrderPane.this.getChildren().remove(imp5);
				OrderPane.this.getChildren().remove(imp6);
				OrderPane.this.getChildren().remove(imp7);
				OrderPane.this.getChildren().remove(imp8);
				OrderPane.this.getChildren().remove(imp9);
				OrderPane.this.getChildren().remove(imp10);
				OrderPane.this.getChildren().remove(imp11);
				OrderPane.this.getChildren().remove(imp12);
				OrderPane.this.getChildren().remove(imp13);
				OrderPane.this.getChildren().remove(imp14);
				OrderPane.this.getChildren().remove(imp15);
				OrderPane.this.getChildren().remove(imp16);
				OrderPane.this.getChildren().remove(imp17);
				OrderPane.this.getChildren().remove(imp18);
				OrderPane.this.getChildren().remove(imp19);
				OrderPane.this.getChildren().remove(imp20);
				OrderPane.this.getChildren().remove(imp21);
				OrderPane.this.getChildren().remove(imp22);
				OrderPane.this.getChildren().remove(imp23);
				OrderPane.this.getChildren().remove(imp24);
				OrderPane.this.getChildren().remove(imp25);
				OrderPane.this.getChildren().remove(imp26);
				OrderPane.this.getChildren().remove(imp27);
				OrderPane.this.getChildren().remove(imp28);
				OrderPane.this.getChildren().remove(imp29);
				OrderPane.this.getChildren().remove(imp30);
				OrderPane.this.getChildren().remove(imp31);
				OrderPane.this.getChildren().remove(imp32);
				
				timeline2.setOnFinished(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(imp24);
						OrderPane.this.getChildren().add(imp24);
						OrderPane.this.setTopAnchor(imp24, 70.0);
						OrderPane.this.setLeftAnchor(imp24, 240.0);
						
						imp24.label3.setText("" + imp24.food.now());
						imp24.label4.setText("" + imp24.food.getNumber());
					}
				});
				
				
				imp24.rec11.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp24);
					}
				});
				
				imp24.rec12.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp24);
					}
				});
			}
		});
		
		dp.im3.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				OrderPane.this.getChildren().remove(rec23);
				OrderPane.this.getChildren().remove(rec24);
				OrderPane.this.getChildren().addAll(rec23,rec24);
				
				rec23.setHeight(0.01);
				rec24.setHeight(0.01);
				
				KeyValue kv1 = new KeyValue(rec24.heightProperty(), 50);
				KeyValue kv3 = new KeyValue(rec23.heightProperty(), 50);
				KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1,kv3);
				
				KeyValue kv2 = new KeyValue(rec24.heightProperty(), 450);
				KeyValue kv4 = new KeyValue(rec23.heightProperty(), 450);
				KeyFrame kf2 = new KeyFrame(Duration.seconds(0.1), kv2,kv4);
				
				Timeline timeline2 = new Timeline(144);
				timeline2.getKeyFrames().addAll(kf1,kf2);
				timeline2.setDelay(Duration.seconds(0.2));
				timeline2.play();
				
				OrderPane.this.getChildren().remove(imp1);
				OrderPane.this.getChildren().remove(imp2);
				OrderPane.this.getChildren().remove(imp3);
				OrderPane.this.getChildren().remove(imp4);
				OrderPane.this.getChildren().remove(imp5);
				OrderPane.this.getChildren().remove(imp6);
				OrderPane.this.getChildren().remove(imp7);
				OrderPane.this.getChildren().remove(imp8);
				OrderPane.this.getChildren().remove(imp9);
				OrderPane.this.getChildren().remove(imp10);
				OrderPane.this.getChildren().remove(imp11);
				OrderPane.this.getChildren().remove(imp12);
				OrderPane.this.getChildren().remove(imp13);
				OrderPane.this.getChildren().remove(imp14);
				OrderPane.this.getChildren().remove(imp15);
				OrderPane.this.getChildren().remove(imp16);
				OrderPane.this.getChildren().remove(imp17);
				OrderPane.this.getChildren().remove(imp18);
				OrderPane.this.getChildren().remove(imp19);
				OrderPane.this.getChildren().remove(imp20);
				OrderPane.this.getChildren().remove(imp21);
				OrderPane.this.getChildren().remove(imp22);
				OrderPane.this.getChildren().remove(imp23);
				OrderPane.this.getChildren().remove(imp24);
				OrderPane.this.getChildren().remove(imp25);
				OrderPane.this.getChildren().remove(imp26);
				OrderPane.this.getChildren().remove(imp27);
				OrderPane.this.getChildren().remove(imp28);
				OrderPane.this.getChildren().remove(imp29);
				OrderPane.this.getChildren().remove(imp30);
				OrderPane.this.getChildren().remove(imp31);
				OrderPane.this.getChildren().remove(imp32);
				
				timeline2.setOnFinished(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(imp25);
						OrderPane.this.getChildren().add(imp25);
						OrderPane.this.setTopAnchor(imp25, 70.0);
						OrderPane.this.setLeftAnchor(imp25, 240.0);
						
						imp25.label3.setText("" + imp25.food.now());
						imp25.label4.setText("" + imp25.food.getNumber());
					}
				});
				
				
				imp25.rec11.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp25);
					}
				});
				
				imp25.rec12.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp25);
					}
				});
			}
		});
		
		dp.im4.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				OrderPane.this.getChildren().remove(rec23);
				OrderPane.this.getChildren().remove(rec24);
				OrderPane.this.getChildren().addAll(rec23,rec24);
				
				rec23.setHeight(0.01);
				rec24.setHeight(0.01);
				
				KeyValue kv1 = new KeyValue(rec24.heightProperty(), 50);
				KeyValue kv3 = new KeyValue(rec23.heightProperty(), 50);
				KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1,kv3);
				
				KeyValue kv2 = new KeyValue(rec24.heightProperty(), 450);
				KeyValue kv4 = new KeyValue(rec23.heightProperty(), 450);
				KeyFrame kf2 = new KeyFrame(Duration.seconds(0.1), kv2,kv4);
				
				Timeline timeline2 = new Timeline(144);
				timeline2.getKeyFrames().addAll(kf1,kf2);
				timeline2.setDelay(Duration.seconds(0.2));
				timeline2.play();
				
				OrderPane.this.getChildren().remove(imp1);
				OrderPane.this.getChildren().remove(imp2);
				OrderPane.this.getChildren().remove(imp3);
				OrderPane.this.getChildren().remove(imp4);
				OrderPane.this.getChildren().remove(imp5);
				OrderPane.this.getChildren().remove(imp6);
				OrderPane.this.getChildren().remove(imp7);
				OrderPane.this.getChildren().remove(imp8);
				OrderPane.this.getChildren().remove(imp9);
				OrderPane.this.getChildren().remove(imp10);
				OrderPane.this.getChildren().remove(imp11);
				OrderPane.this.getChildren().remove(imp12);
				OrderPane.this.getChildren().remove(imp13);
				OrderPane.this.getChildren().remove(imp14);
				OrderPane.this.getChildren().remove(imp15);
				OrderPane.this.getChildren().remove(imp16);
				OrderPane.this.getChildren().remove(imp17);
				OrderPane.this.getChildren().remove(imp18);
				OrderPane.this.getChildren().remove(imp19);
				OrderPane.this.getChildren().remove(imp20);
				OrderPane.this.getChildren().remove(imp21);
				OrderPane.this.getChildren().remove(imp22);
				OrderPane.this.getChildren().remove(imp23);
				OrderPane.this.getChildren().remove(imp24);
				OrderPane.this.getChildren().remove(imp25);
				OrderPane.this.getChildren().remove(imp26);
				OrderPane.this.getChildren().remove(imp27);
				OrderPane.this.getChildren().remove(imp28);
				OrderPane.this.getChildren().remove(imp29);
				OrderPane.this.getChildren().remove(imp30);
				OrderPane.this.getChildren().remove(imp31);
				OrderPane.this.getChildren().remove(imp32);
				
				timeline2.setOnFinished(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(imp26);
						OrderPane.this.getChildren().add(imp26);
						OrderPane.this.setTopAnchor(imp26, 70.0);
						OrderPane.this.setLeftAnchor(imp26, 240.0);
						
						imp26.label3.setText("" + imp26.food.now());
						imp26.label4.setText("" + imp26.food.getNumber());
					}
				});
				
				
				imp26.rec11.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp26);
					}
				});
				
				imp26.rec12.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp26);
					}
				});
			}
		});
		
		dp.im5.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				OrderPane.this.getChildren().remove(rec23);
				OrderPane.this.getChildren().remove(rec24);
				OrderPane.this.getChildren().addAll(rec23,rec24);
				
				rec23.setHeight(0.01);
				rec24.setHeight(0.01);
				
				KeyValue kv1 = new KeyValue(rec24.heightProperty(), 50);
				KeyValue kv3 = new KeyValue(rec23.heightProperty(), 50);
				KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1,kv3);
				
				KeyValue kv2 = new KeyValue(rec24.heightProperty(), 450);
				KeyValue kv4 = new KeyValue(rec23.heightProperty(), 450);
				KeyFrame kf2 = new KeyFrame(Duration.seconds(0.1), kv2,kv4);
				
				Timeline timeline2 = new Timeline(144);
				timeline2.getKeyFrames().addAll(kf1,kf2);
				timeline2.setDelay(Duration.seconds(0.2));
				timeline2.play();
				
				OrderPane.this.getChildren().remove(imp1);
				OrderPane.this.getChildren().remove(imp2);
				OrderPane.this.getChildren().remove(imp3);
				OrderPane.this.getChildren().remove(imp4);
				OrderPane.this.getChildren().remove(imp5);
				OrderPane.this.getChildren().remove(imp6);
				OrderPane.this.getChildren().remove(imp7);
				OrderPane.this.getChildren().remove(imp8);
				OrderPane.this.getChildren().remove(imp9);
				OrderPane.this.getChildren().remove(imp10);
				OrderPane.this.getChildren().remove(imp11);
				OrderPane.this.getChildren().remove(imp12);
				OrderPane.this.getChildren().remove(imp13);
				OrderPane.this.getChildren().remove(imp14);
				OrderPane.this.getChildren().remove(imp15);
				OrderPane.this.getChildren().remove(imp16);
				OrderPane.this.getChildren().remove(imp17);
				OrderPane.this.getChildren().remove(imp18);
				OrderPane.this.getChildren().remove(imp19);
				OrderPane.this.getChildren().remove(imp20);
				OrderPane.this.getChildren().remove(imp21);
				OrderPane.this.getChildren().remove(imp22);
				OrderPane.this.getChildren().remove(imp23);
				OrderPane.this.getChildren().remove(imp24);
				OrderPane.this.getChildren().remove(imp25);
				OrderPane.this.getChildren().remove(imp26);
				OrderPane.this.getChildren().remove(imp27);
				OrderPane.this.getChildren().remove(imp28);
				OrderPane.this.getChildren().remove(imp29);
				OrderPane.this.getChildren().remove(imp30);
				OrderPane.this.getChildren().remove(imp31);
				OrderPane.this.getChildren().remove(imp32);
				
				timeline2.setOnFinished(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(imp27);
						OrderPane.this.getChildren().add(imp27);
						OrderPane.this.setTopAnchor(imp27, 70.0);
						OrderPane.this.setLeftAnchor(imp27, 240.0);
						
						imp27.label3.setText("" + imp27.food.now());
						imp27.label4.setText("" + imp27.food.getNumber());
					}
				});
				
				imp27.rec11.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp27);
					}
				});
				
				imp27.rec12.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp27);
					}
				});
			}
		});
		
		ep.im1.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				OrderPane.this.getChildren().remove(rec23);
				OrderPane.this.getChildren().remove(rec24);
				OrderPane.this.getChildren().addAll(rec23,rec24);
				
				rec23.setHeight(0.01);
				rec24.setHeight(0.01);
				
				KeyValue kv1 = new KeyValue(rec24.heightProperty(), 50);
				KeyValue kv3 = new KeyValue(rec23.heightProperty(), 50);
				KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1,kv3);
				
				KeyValue kv2 = new KeyValue(rec24.heightProperty(), 450);
				KeyValue kv4 = new KeyValue(rec23.heightProperty(), 450);
				KeyFrame kf2 = new KeyFrame(Duration.seconds(0.1), kv2,kv4);
				
				Timeline timeline2 = new Timeline(144);
				timeline2.getKeyFrames().addAll(kf1,kf2);
				timeline2.setDelay(Duration.seconds(0.2));
				timeline2.play();
				
				OrderPane.this.getChildren().remove(imp1);
				OrderPane.this.getChildren().remove(imp2);
				OrderPane.this.getChildren().remove(imp3);
				OrderPane.this.getChildren().remove(imp4);
				OrderPane.this.getChildren().remove(imp5);
				OrderPane.this.getChildren().remove(imp6);
				OrderPane.this.getChildren().remove(imp7);
				OrderPane.this.getChildren().remove(imp8);
				OrderPane.this.getChildren().remove(imp9);
				OrderPane.this.getChildren().remove(imp10);
				OrderPane.this.getChildren().remove(imp11);
				OrderPane.this.getChildren().remove(imp12);
				OrderPane.this.getChildren().remove(imp13);
				OrderPane.this.getChildren().remove(imp14);
				OrderPane.this.getChildren().remove(imp15);
				OrderPane.this.getChildren().remove(imp16);
				OrderPane.this.getChildren().remove(imp17);
				OrderPane.this.getChildren().remove(imp18);
				OrderPane.this.getChildren().remove(imp19);
				OrderPane.this.getChildren().remove(imp20);
				OrderPane.this.getChildren().remove(imp21);
				OrderPane.this.getChildren().remove(imp22);
				OrderPane.this.getChildren().remove(imp23);
				OrderPane.this.getChildren().remove(imp24);
				OrderPane.this.getChildren().remove(imp25);
				OrderPane.this.getChildren().remove(imp26);
				OrderPane.this.getChildren().remove(imp27);
				OrderPane.this.getChildren().remove(imp28);
				OrderPane.this.getChildren().remove(imp29);
				OrderPane.this.getChildren().remove(imp30);
				OrderPane.this.getChildren().remove(imp31);
				OrderPane.this.getChildren().remove(imp32);
				
				timeline2.setOnFinished(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(imp28);
						OrderPane.this.getChildren().add(imp28);
						OrderPane.this.setTopAnchor(imp28, 70.0);
						OrderPane.this.setLeftAnchor(imp28, 240.0);
						
						imp28.label3.setText("" + imp28.food.now());
						imp28.label4.setText("" + imp28.food.getNumber());
					}
				});
				
				
				imp28.rec11.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp28);
					}
				});
				
				imp28.rec12.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp28);
					}
				});
			}
		});
		
		ep.im2.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				OrderPane.this.getChildren().remove(rec23);
				OrderPane.this.getChildren().remove(rec24);
				OrderPane.this.getChildren().addAll(rec23,rec24);
				
				rec23.setHeight(0.01);
				rec24.setHeight(0.01);
				
				KeyValue kv1 = new KeyValue(rec24.heightProperty(), 50);
				KeyValue kv3 = new KeyValue(rec23.heightProperty(), 50);
				KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1,kv3);
				
				KeyValue kv2 = new KeyValue(rec24.heightProperty(), 450);
				KeyValue kv4 = new KeyValue(rec23.heightProperty(), 450);
				KeyFrame kf2 = new KeyFrame(Duration.seconds(0.1), kv2,kv4);
				
				Timeline timeline2 = new Timeline(144);
				timeline2.getKeyFrames().addAll(kf1,kf2);
				timeline2.setDelay(Duration.seconds(0.2));
				timeline2.play();
				
				OrderPane.this.getChildren().remove(imp1);
				OrderPane.this.getChildren().remove(imp2);
				OrderPane.this.getChildren().remove(imp3);
				OrderPane.this.getChildren().remove(imp4);
				OrderPane.this.getChildren().remove(imp5);
				OrderPane.this.getChildren().remove(imp6);
				OrderPane.this.getChildren().remove(imp7);
				OrderPane.this.getChildren().remove(imp8);
				OrderPane.this.getChildren().remove(imp9);
				OrderPane.this.getChildren().remove(imp10);
				OrderPane.this.getChildren().remove(imp11);
				OrderPane.this.getChildren().remove(imp12);
				OrderPane.this.getChildren().remove(imp13);
				OrderPane.this.getChildren().remove(imp14);
				OrderPane.this.getChildren().remove(imp15);
				OrderPane.this.getChildren().remove(imp16);
				OrderPane.this.getChildren().remove(imp17);
				OrderPane.this.getChildren().remove(imp18);
				OrderPane.this.getChildren().remove(imp19);
				OrderPane.this.getChildren().remove(imp20);
				OrderPane.this.getChildren().remove(imp21);
				OrderPane.this.getChildren().remove(imp22);
				OrderPane.this.getChildren().remove(imp23);
				OrderPane.this.getChildren().remove(imp24);
				OrderPane.this.getChildren().remove(imp25);
				OrderPane.this.getChildren().remove(imp26);
				OrderPane.this.getChildren().remove(imp27);
				OrderPane.this.getChildren().remove(imp28);
				OrderPane.this.getChildren().remove(imp29);
				OrderPane.this.getChildren().remove(imp30);
				OrderPane.this.getChildren().remove(imp31);
				OrderPane.this.getChildren().remove(imp32);
				
				timeline2.setOnFinished(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(imp29);
						OrderPane.this.getChildren().add(imp29);
						OrderPane.this.setTopAnchor(imp29, 70.0);
						OrderPane.this.setLeftAnchor(imp29, 240.0);
						
						imp29.label3.setText("" + imp29.food.now());
						imp29.label4.setText("" + imp29.food.getNumber());
					}
				});
				
				imp29.rec11.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp29);
					}
				});
				
				imp29.rec12.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp29);
					}
				});
			}
		});
		
		ep.im3.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				OrderPane.this.getChildren().remove(rec23);
				OrderPane.this.getChildren().remove(rec24);
				OrderPane.this.getChildren().addAll(rec23,rec24);
				
				rec23.setHeight(0.01);
				rec24.setHeight(0.01);
				
				KeyValue kv1 = new KeyValue(rec24.heightProperty(), 50);
				KeyValue kv3 = new KeyValue(rec23.heightProperty(), 50);
				KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1,kv3);
				
				KeyValue kv2 = new KeyValue(rec24.heightProperty(), 450);
				KeyValue kv4 = new KeyValue(rec23.heightProperty(), 450);
				KeyFrame kf2 = new KeyFrame(Duration.seconds(0.1), kv2,kv4);
				
				Timeline timeline2 = new Timeline(144);
				timeline2.getKeyFrames().addAll(kf1,kf2);
				timeline2.setDelay(Duration.seconds(0.2));
				timeline2.play();
				
				OrderPane.this.getChildren().remove(imp1);
				OrderPane.this.getChildren().remove(imp2);
				OrderPane.this.getChildren().remove(imp3);
				OrderPane.this.getChildren().remove(imp4);
				OrderPane.this.getChildren().remove(imp5);
				OrderPane.this.getChildren().remove(imp6);
				OrderPane.this.getChildren().remove(imp7);
				OrderPane.this.getChildren().remove(imp8);
				OrderPane.this.getChildren().remove(imp9);
				OrderPane.this.getChildren().remove(imp10);
				OrderPane.this.getChildren().remove(imp11);
				OrderPane.this.getChildren().remove(imp12);
				OrderPane.this.getChildren().remove(imp13);
				OrderPane.this.getChildren().remove(imp14);
				OrderPane.this.getChildren().remove(imp15);
				OrderPane.this.getChildren().remove(imp16);
				OrderPane.this.getChildren().remove(imp17);
				OrderPane.this.getChildren().remove(imp18);
				OrderPane.this.getChildren().remove(imp19);
				OrderPane.this.getChildren().remove(imp20);
				OrderPane.this.getChildren().remove(imp21);
				OrderPane.this.getChildren().remove(imp22);
				OrderPane.this.getChildren().remove(imp23);
				OrderPane.this.getChildren().remove(imp24);
				OrderPane.this.getChildren().remove(imp25);
				OrderPane.this.getChildren().remove(imp26);
				OrderPane.this.getChildren().remove(imp27);
				OrderPane.this.getChildren().remove(imp28);
				OrderPane.this.getChildren().remove(imp29);
				OrderPane.this.getChildren().remove(imp30);
				OrderPane.this.getChildren().remove(imp31);
				OrderPane.this.getChildren().remove(imp32);
				
				timeline2.setOnFinished(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(imp30);
						OrderPane.this.getChildren().add(imp30);
						OrderPane.this.setTopAnchor(imp30, 70.0);
						OrderPane.this.setLeftAnchor(imp30, 240.0);
						
						imp30.label3.setText("" + imp30.food.now());
						imp30.label4.setText("" + imp30.food.getNumber());
					}
				});
				
				imp30.rec11.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp30);
					}
				});
				
				imp30.rec12.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp30);
					}
				});
			}
		});
		
		imp31.label1.setFont(Font.font(17));
		
		ep.im4.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				OrderPane.this.getChildren().remove(rec23);
				OrderPane.this.getChildren().remove(rec24);
				OrderPane.this.getChildren().addAll(rec23,rec24);
				
				rec23.setHeight(0.01);
				rec24.setHeight(0.01);
				
				KeyValue kv1 = new KeyValue(rec24.heightProperty(), 50);
				KeyValue kv3 = new KeyValue(rec23.heightProperty(), 50);
				KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1,kv3);
				
				KeyValue kv2 = new KeyValue(rec24.heightProperty(), 450);
				KeyValue kv4 = new KeyValue(rec23.heightProperty(), 450);
				KeyFrame kf2 = new KeyFrame(Duration.seconds(0.1), kv2,kv4);
				
				Timeline timeline2 = new Timeline(144);
				timeline2.getKeyFrames().addAll(kf1,kf2);
				timeline2.setDelay(Duration.seconds(0.2));
				timeline2.play();
				
				OrderPane.this.getChildren().remove(imp1);
				OrderPane.this.getChildren().remove(imp2);
				OrderPane.this.getChildren().remove(imp3);
				OrderPane.this.getChildren().remove(imp4);
				OrderPane.this.getChildren().remove(imp5);
				OrderPane.this.getChildren().remove(imp6);
				OrderPane.this.getChildren().remove(imp7);
				OrderPane.this.getChildren().remove(imp8);
				OrderPane.this.getChildren().remove(imp9);
				OrderPane.this.getChildren().remove(imp10);
				OrderPane.this.getChildren().remove(imp11);
				OrderPane.this.getChildren().remove(imp12);
				OrderPane.this.getChildren().remove(imp13);
				OrderPane.this.getChildren().remove(imp14);
				OrderPane.this.getChildren().remove(imp15);
				OrderPane.this.getChildren().remove(imp16);
				OrderPane.this.getChildren().remove(imp17);
				OrderPane.this.getChildren().remove(imp18);
				OrderPane.this.getChildren().remove(imp19);
				OrderPane.this.getChildren().remove(imp20);
				OrderPane.this.getChildren().remove(imp21);
				OrderPane.this.getChildren().remove(imp22);
				OrderPane.this.getChildren().remove(imp23);
				OrderPane.this.getChildren().remove(imp24);
				OrderPane.this.getChildren().remove(imp25);
				OrderPane.this.getChildren().remove(imp26);
				OrderPane.this.getChildren().remove(imp27);
				OrderPane.this.getChildren().remove(imp28);
				OrderPane.this.getChildren().remove(imp29);
				OrderPane.this.getChildren().remove(imp30);
				OrderPane.this.getChildren().remove(imp31);
				OrderPane.this.getChildren().remove(imp32);
				
				timeline2.setOnFinished(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(imp31);
						OrderPane.this.getChildren().add(imp31);
						OrderPane.this.setTopAnchor(imp31, 70.0);
						OrderPane.this.setLeftAnchor(imp31, 240.0);
						
						imp31.label3.setText("" + imp31.food.now());
						imp31.label4.setText("" + imp31.food.getNumber());
					}
				});
				
				imp31.rec11.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp31);
					}
				});
				
				imp31.rec12.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp31);
					}
				});
			}
		});
		
		imp32.label1.setFont(Font.font(19));
		
		ep.im5.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				OrderPane.this.getChildren().remove(rec23);
				OrderPane.this.getChildren().remove(rec24);
				OrderPane.this.getChildren().addAll(rec23,rec24);
				
				rec23.setHeight(0.01);
				rec24.setHeight(0.01);
				
				KeyValue kv1 = new KeyValue(rec24.heightProperty(), 50);
				KeyValue kv3 = new KeyValue(rec23.heightProperty(), 50);
				KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1,kv3);
				
				KeyValue kv2 = new KeyValue(rec24.heightProperty(), 450);
				KeyValue kv4 = new KeyValue(rec23.heightProperty(), 450);
				KeyFrame kf2 = new KeyFrame(Duration.seconds(0.1), kv2,kv4);
				
				Timeline timeline2 = new Timeline(144);
				timeline2.getKeyFrames().addAll(kf1,kf2);
				timeline2.setDelay(Duration.seconds(0.2));
				timeline2.play();
				
				OrderPane.this.getChildren().remove(imp1);
				OrderPane.this.getChildren().remove(imp2);
				OrderPane.this.getChildren().remove(imp3);
				OrderPane.this.getChildren().remove(imp4);
				OrderPane.this.getChildren().remove(imp5);
				OrderPane.this.getChildren().remove(imp6);
				OrderPane.this.getChildren().remove(imp7);
				OrderPane.this.getChildren().remove(imp8);
				OrderPane.this.getChildren().remove(imp9);
				OrderPane.this.getChildren().remove(imp10);
				OrderPane.this.getChildren().remove(imp11);
				OrderPane.this.getChildren().remove(imp12);
				OrderPane.this.getChildren().remove(imp13);
				OrderPane.this.getChildren().remove(imp14);
				OrderPane.this.getChildren().remove(imp15);
				OrderPane.this.getChildren().remove(imp16);
				OrderPane.this.getChildren().remove(imp17);
				OrderPane.this.getChildren().remove(imp18);
				OrderPane.this.getChildren().remove(imp19);
				OrderPane.this.getChildren().remove(imp20);
				OrderPane.this.getChildren().remove(imp21);
				OrderPane.this.getChildren().remove(imp22);
				OrderPane.this.getChildren().remove(imp23);
				OrderPane.this.getChildren().remove(imp24);
				OrderPane.this.getChildren().remove(imp25);
				OrderPane.this.getChildren().remove(imp26);
				OrderPane.this.getChildren().remove(imp27);
				OrderPane.this.getChildren().remove(imp28);
				OrderPane.this.getChildren().remove(imp29);
				OrderPane.this.getChildren().remove(imp30);
				OrderPane.this.getChildren().remove(imp31);
				OrderPane.this.getChildren().remove(imp32);
				
				timeline2.setOnFinished(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(imp32);
						OrderPane.this.getChildren().add(imp32);
						OrderPane.this.setTopAnchor(imp32, 70.0);
						OrderPane.this.setLeftAnchor(imp32, 240.0);
						
						imp32.label3.setText("" + imp32.food.now());
						imp32.label4.setText("" + imp32.food.getNumber());
					}
				});
				
				imp32.rec11.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp32);
					}
				});
				
				imp32.rec12.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						OrderPane.this.getChildren().remove(rec23);
						OrderPane.this.getChildren().remove(rec24);
						OrderPane.this.getChildren().remove(imp32);
					}
				});
			}
		});
		
//------------------------------------------------------------------------------------------------------------------------------------------------------		
		
		
//--------------------------------------------------------------------------------------------------------------------------------------------------------		
		this.setPrefHeight(728);
		this.setPrefWidth(1396);
	}
	
	public Effect geteffect() {
		DropShadow ds = new DropShadow();
		
		return ds;
	}

}



