package UI;




import Backend.Login;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Effect;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.util.Duration;

public class PreparePane extends BackgroundPane{
	
	String name = "";
	String password = "";
	
	LoginPane lp = new LoginPane();
	SignUpPane sup = new SignUpPane();
	AboutUsPane aup = new AboutUsPane();
	ExitPane ep = new ExitPane();
	
	Timeline t2 = new Timeline();
	Timeline t4 = new Timeline();
	
	PreparePane(){
		Rectangle rec1 = new Rectangle(0.01, 45);
		Rectangle rec2 = new Rectangle(0.01, 45);
		Rectangle rec3 = new Rectangle(0.01, 45);
		Rectangle rec4 = new Rectangle(0.01, 45);
		
		Rectangle rec5 = new Rectangle(20, 20);
		Rectangle rec6 = new Rectangle(20, 20);
		Rectangle rec7 = new Rectangle(20, 20);
		Rectangle rec8 = new Rectangle(20, 20);
		
		Rectangle rec11 = new Rectangle(4, 45);
		rec11.setEffect(geteffect());
		Rectangle rec12 = new Rectangle(4, 45);
		rec12.setEffect(geteffect());
		Rectangle rec13 = new Rectangle(4, 45);
		rec13.setEffect(geteffect());
		Rectangle rec14 = new Rectangle(4, 45);
		rec14.setEffect(geteffect());
		
		Rectangle rec15 = new Rectangle(4, 45,Color.WHITE);
		rec15.setEffect(geteffect());
		Rectangle rec16 = new Rectangle(4, 45,Color.WHITE);
		rec16.setEffect(geteffect());
		Rectangle rec17 = new Rectangle(4, 45,Color.WHITE);
		rec17.setEffect(geteffect());
		Rectangle rec18 = new Rectangle(4, 45,Color.WHITE);
		rec18.setEffect(geteffect());
		
		Rectangle rec19 = new Rectangle(20, 20,Color.WHITE);
		Rectangle rec20 = new Rectangle(20, 20,Color.WHITE);
		Rectangle rec21 = new Rectangle(20, 20,Color.WHITE);
		Rectangle rec22 = new Rectangle(20, 20,Color.WHITE);
		
		Rectangle rec23 = new Rectangle(4, 45);
		Rectangle rec24 = new Rectangle(4, 45);
		Rectangle rec25 = new Rectangle(4, 45);
		Rectangle rec26 = new Rectangle(4, 45);
		
		Rectangle rec27 = new Rectangle(0.01, 20);
		Rectangle rec28 = new Rectangle(0.01, 2.5);
		
		Rectangle rec29 = new Rectangle(10, 10,Color.WHITE);
		rec29.setEffect(geteffect());
		
		Rectangle rec30 = new Rectangle(600, 0.01,Color.valueOf("#CDC8B1"));
		Rectangle rec31 = new Rectangle(2.5, 0.01,Color.valueOf("#363636"));
		Rectangle rec32 = new Rectangle(600.5, 2.5,Color.valueOf("#363636"));
		Rectangle rec33 = new Rectangle(2.5, 0.01,Color.valueOf("#363636"));
		Rectangle rec34 = new Rectangle(600.5 + 4.5, 2.5,Color.valueOf("#363636"));
		
		
		Label l1 = new Label("信息認證");
		l1.setFont(Font.font(22));
		Label l2 = new Label("信息註冊");
		l2.setFont(Font.font(22));
		Label l3 = new Label("關於我們");
		l3.setFont(Font.font(22));
		Label l4 = new Label("離開");
		l4.setFont(Font.font(22));
		
		Label l5 = new Label("信息認證");
		l5.setFont(Font.font(22));
		l5.setTextFill(Color.WHITE);
		Label l6 = new Label("信息註冊");
		l6.setFont(Font.font(22));
		l6.setTextFill(Color.WHITE);
		Label l7 = new Label("關於我們");
		l7.setFont(Font.font(22));
		l7.setTextFill(Color.WHITE);
		Label l8 = new Label("離開");
		l8.setFont(Font.font(22));
		l8.setTextFill(Color.WHITE);
		

		Rectangle rec9 = new Rectangle(8, 0.01,Color.BLACK);
		Rectangle rec10 = new Rectangle(3, 0.01,Color.BLACK);
		rec10.setEffect(geteffect());
		
		this.getChildren().addAll(rec1,rec2,rec3,rec4);	
		this.getChildren().addAll(rec5,rec6,rec7,rec8);	
		this.getChildren().addAll(rec9,rec10);
		this.getChildren().addAll(rec23,rec24,rec25,rec26);
		this.getChildren().addAll(l1,l2,l3,l4);
		this.getChildren().addAll(rec27,rec28,rec30,rec31,rec33);	
		
		this.setTopAnchor(rec1, 300.0);
		this.setLeftAnchor(rec1, 180.0);
		this.setTopAnchor(rec5, 313.0);
		this.setLeftAnchor(rec5, 190.0);
		this.setTopAnchor(rec11, 300.0);
		this.setLeftAnchor(rec11, 180.0);
		this.setTopAnchor(rec23, 300.0);
		this.setLeftAnchor(rec23, 180.0);
		rec1.setFill(Color.valueOf("#36363620"));
		this.setTopAnchor(rec15, 300.0);
		this.setLeftAnchor(rec15, 180.0);
		this.setTopAnchor(l1, 307.0);
		this.setLeftAnchor(l1, 230.0);
		
		this.setTopAnchor(rec2, 370.0);
		this.setLeftAnchor(rec2, 180.0);
		this.setTopAnchor(rec6, 383.0);
		this.setLeftAnchor(rec6, 190.0);
		this.setTopAnchor(rec12, 370.0);
		this.setLeftAnchor(rec12, 180.0);
		this.setTopAnchor(rec24, 370.0);
		this.setLeftAnchor(rec24, 180.0);
		rec2.setFill(Color.valueOf("#36363620"));
		this.setTopAnchor(rec16, 370.0);
		this.setLeftAnchor(rec16, 180.0);
		this.setTopAnchor(l2, 377.0);
		this.setLeftAnchor(l2, 230.0);
		
		this.setTopAnchor(rec3, 440.0);
		this.setLeftAnchor(rec3, 180.0);
		this.setTopAnchor(rec7, 453.0);
		this.setLeftAnchor(rec7, 190.0);
		this.setTopAnchor(rec13, 440.0);
		this.setLeftAnchor(rec13, 180.0);
		this.setTopAnchor(rec25, 440.0);
		this.setLeftAnchor(rec25, 180.0);
		rec3.setFill(Color.valueOf("#36363620"));
		this.setTopAnchor(rec17, 440.0);
		this.setLeftAnchor(rec17, 180.0);
		this.setTopAnchor(l3, 447.0);
		this.setLeftAnchor(l3, 230.0);
		
		this.setTopAnchor(rec4, 510.0);
		this.setLeftAnchor(rec4, 180.0);
		this.setTopAnchor(rec8, 523.0);
		this.setLeftAnchor(rec8, 190.0);
		this.setTopAnchor(rec14, 510.0);
		this.setLeftAnchor(rec14, 180.0);
		this.setTopAnchor(rec26, 510.0);
		this.setLeftAnchor(rec26, 180.0);
		rec4.setFill(Color.valueOf("#36363620"));
		this.setTopAnchor(rec18, 510.0);
		this.setLeftAnchor(rec18, 180.0);
		this.setTopAnchor(l4, 517.0);
		this.setLeftAnchor(l4, 230.0);
		
		this.setTopAnchor(rec9, 300.0);
		this.setLeftAnchor(rec9, 140.0);
		this.setTopAnchor(rec10, 300.0);
		this.setLeftAnchor(rec10, 155.0);
		
		this.setTopAnchor(rec27, 100.0+10);
		this.setLeftAnchor(rec27, 700.0-2.5);
		this.setTopAnchor(rec28, 90.0+15);
		this.setLeftAnchor(rec28, 700.0-2.5);
		this.setTopAnchor(rec30, 140.0);
		this.setLeftAnchor(rec30, 700.0);
		this.setTopAnchor(rec31, 140.0);
		this.setLeftAnchor(rec31, 1300.0);
		this.setTopAnchor(rec32, 788.0);
		this.setLeftAnchor(rec32, 700.0);
		this.setTopAnchor(rec33, 140.0);
		this.setLeftAnchor(rec33, 1300.0-602.5);
		this.setTopAnchor(rec34, 788.0-650);
		this.setLeftAnchor(rec34, 700.0-2.5);
		
		
		Timeline t1 = new Timeline();
		
		KeyValue kv11 = new KeyValue(rec9.heightProperty(), 50);
		KeyValue kv13 = new KeyValue(rec10.heightProperty(), 50);
		KeyValue kv15 = new KeyValue(rec1.widthProperty(), 30);
		KeyValue kv17 = new KeyValue(rec2.widthProperty(), 30);	
		KeyValue kv19 = new KeyValue(rec3.widthProperty(), 30);
		KeyValue kv21 = new KeyValue(rec4.widthProperty(), 30);
		KeyFrame kf11 = new KeyFrame(Duration.seconds(0), kv11,kv13,kv15,kv17,kv19,kv21);
		
		KeyValue kv12 = new KeyValue(rec9.heightProperty(), 255);
		KeyValue kv14 = new KeyValue(rec10.heightProperty(), 255);
		KeyValue kv16 = new KeyValue(rec1.widthProperty(), 450);
		KeyValue kv18 = new KeyValue(rec2.widthProperty(), 450);
		KeyValue kv20 = new KeyValue(rec3.widthProperty(), 450);
		KeyValue kv22 = new KeyValue(rec4.widthProperty(), 450);
		KeyFrame kf13 = new KeyFrame(Duration.seconds(0.5), kv12,kv14,kv16,kv18,kv20,kv22);
		
		t1.getKeyFrames().addAll(kf11,kf13);
		t1.setDelay(Duration.seconds(0.3));
		t1.play();
		
		KeyValue kv23 = new KeyValue(rec27.widthProperty(), 20);
		KeyValue kv25 = new KeyValue(rec28.widthProperty(), 20);
		KeyFrame kf12 = new KeyFrame(Duration.seconds(0), kv23,kv25);
		
		KeyValue kv24 = new KeyValue(rec27.widthProperty(), 600+4.5);
		KeyValue kv26 = new KeyValue(rec28.widthProperty(), 600+4.5);
		KeyFrame kf14 = new KeyFrame(Duration.seconds(0.3), kv24,kv26);
		
		
		
		t2.getKeyFrames().addAll(kf12,kf14);
		t2.setDelay(Duration.seconds(0));
		
		
		KeyValue kv27 = new KeyValue(rec29.fillProperty(), Color.WHITE);
		KeyFrame kf15 = new KeyFrame(Duration.seconds(1), kv27);
		
		KeyValue kv28 = new KeyValue(rec29.fillProperty(), Color.BLACK);
		KeyFrame kf17 = new KeyFrame(Duration.seconds(1.3), kv28);
		
		
		Timeline t3 = new Timeline(40);
		t3.getKeyFrames().addAll(kf15,kf17);
		t3.setDelay(Duration.seconds(0));
		t3.setCycleCount(Timeline.INDEFINITE);
		
		KeyValue kv29 = new KeyValue(rec30.heightProperty(),50);
		KeyValue kv30 = new KeyValue(rec31.heightProperty(),50);
		KeyValue kv33 = new KeyValue(rec33.heightProperty(),50);
		KeyFrame kf18 = new KeyFrame(Duration.seconds(0), kv29,kv30,kv33);
		
		KeyValue kv31 = new KeyValue(rec30.heightProperty(),650);
		KeyValue kv32 = new KeyValue(rec31.heightProperty(),650.5);
		KeyValue kv34 = new KeyValue(rec33.heightProperty(),650.5);
		KeyFrame kf19 = new KeyFrame(Duration.seconds(0.1), kv31,kv32,kv34);
		
		
		t4.getKeyFrames().addAll(kf18,kf19);
		t4.setDelay(Duration.seconds(0));
		
		
		t2.setOnFinished(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				t3.play();
			}
		});
		
		t4.setOnFinished(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				PreparePane.this.getChildren().remove(rec32);
				PreparePane.this.getChildren().remove(rec34);
				
				PreparePane.this.getChildren().add(rec32);
				PreparePane.this.getChildren().add(rec34);
			}
		});
		
		rec1.setOnMouseEntered(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.HAND);
				PreparePane.this.getChildren().remove(rec19);
				PreparePane.this.getChildren().remove(rec20);
				PreparePane.this.getChildren().remove(rec21);
				PreparePane.this.getChildren().remove(rec22);
				PreparePane.this.getChildren().remove(rec11);
				PreparePane.this.getChildren().remove(rec12);	
				PreparePane.this.getChildren().remove(rec13);
				PreparePane.this.getChildren().remove(rec14);
				PreparePane.this.getChildren().remove(rec15);
				PreparePane.this.getChildren().remove(rec16);	
				PreparePane.this.getChildren().remove(rec17);
				PreparePane.this.getChildren().remove(rec18);
				PreparePane.this.getChildren().remove(l5);
				PreparePane.this.getChildren().remove(l6);	
				PreparePane.this.getChildren().remove(l7);
				PreparePane.this.getChildren().remove(l8);
				
				PreparePane.this.getChildren().addAll(rec11);
				PreparePane.this.getChildren().addAll(rec18);
				PreparePane.this.getChildren().addAll(rec19);	
				PreparePane.this.getChildren().addAll(l5);	
				
				PreparePane.this.setTopAnchor(rec19, 313.0);
				PreparePane.this.setLeftAnchor(rec19, 190.0);
				
				PreparePane.this.setTopAnchor(rec18, 300.0);
				PreparePane.this.setLeftAnchor(rec18, 180.0);
				
				PreparePane.this.setTopAnchor(l5, 307.0);
				PreparePane.this.setLeftAnchor(l5, 230.0);
				
				
				Timeline t1 = new Timeline();
				
				KeyValue kv1 = new KeyValue(rec11.widthProperty(), 200);
				KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1);
				
				KeyValue kv2 = new KeyValue(rec11.widthProperty(), 450);
				KeyFrame kf2 = new KeyFrame(Duration.seconds(0.1), kv2);
				
				t1.getKeyFrames().addAll(kf1,kf2);
				t1.setDelay(Duration.seconds(0));
				t1.setRate(1);
				t1.play();

			}
		});
		
		
		rec2.setOnMouseEntered(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.HAND);
				PreparePane.this.getChildren().remove(rec19);
				PreparePane.this.getChildren().remove(rec20);
				PreparePane.this.getChildren().remove(rec21);
				PreparePane.this.getChildren().remove(rec22);
				PreparePane.this.getChildren().remove(rec11);
				PreparePane.this.getChildren().remove(rec12);	
				PreparePane.this.getChildren().remove(rec13);
				PreparePane.this.getChildren().remove(rec14);
				PreparePane.this.getChildren().remove(rec15);
				PreparePane.this.getChildren().remove(rec16);	
				PreparePane.this.getChildren().remove(rec17);
				PreparePane.this.getChildren().remove(rec18);
				PreparePane.this.getChildren().remove(l5);
				PreparePane.this.getChildren().remove(l6);	
				PreparePane.this.getChildren().remove(l7);
				PreparePane.this.getChildren().remove(l8);
				
				
				PreparePane.this.getChildren().addAll(rec12);	
				PreparePane.this.getChildren().addAll(rec17);
				PreparePane.this.getChildren().addAll(rec20);
				PreparePane.this.getChildren().addAll(l6);	
				
				PreparePane.this.setTopAnchor(rec20, 383.0);
				PreparePane.this.setLeftAnchor(rec20, 190.0);
				
				PreparePane.this.setTopAnchor(rec17, 370.0);
				PreparePane.this.setLeftAnchor(rec17, 180.0);
				
				PreparePane.this.setTopAnchor(l6, 377.0);
				PreparePane.this.setLeftAnchor(l6, 230.0);
						
				Timeline t1 = new Timeline();
				
				KeyValue kv1 = new KeyValue(rec12.widthProperty(), 200);
				KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1);
				
				KeyValue kv2 = new KeyValue(rec12.widthProperty(), 450);
				KeyFrame kf2 = new KeyFrame(Duration.seconds(0.1), kv2);
				
				t1.getKeyFrames().addAll(kf1,kf2);
				t1.setDelay(Duration.seconds(0));
				t1.setRate(1);
				t1.play();

			}
		});
		
		rec3.setOnMouseEntered(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.HAND);
				PreparePane.this.getChildren().remove(rec19);
				PreparePane.this.getChildren().remove(rec20);
				PreparePane.this.getChildren().remove(rec21);
				PreparePane.this.getChildren().remove(rec22);
				PreparePane.this.getChildren().remove(rec11);
				PreparePane.this.getChildren().remove(rec12);	
				PreparePane.this.getChildren().remove(rec13);
				PreparePane.this.getChildren().remove(rec14);
				PreparePane.this.getChildren().remove(rec15);
				PreparePane.this.getChildren().remove(rec16);	
				PreparePane.this.getChildren().remove(rec17);
				PreparePane.this.getChildren().remove(rec18);
				PreparePane.this.getChildren().remove(l5);
				PreparePane.this.getChildren().remove(l6);	
				PreparePane.this.getChildren().remove(l7);
				PreparePane.this.getChildren().remove(l8);
				
				PreparePane.this.getChildren().addAll(rec13);	
				PreparePane.this.getChildren().addAll(rec21);	
				PreparePane.this.getChildren().addAll(rec16);
				PreparePane.this.getChildren().addAll(l7);	
				
				PreparePane.this.setTopAnchor(rec21, 453.0);
				PreparePane.this.setLeftAnchor(rec21, 190.0);
				
				PreparePane.this.setTopAnchor(rec16, 440.0);
				PreparePane.this.setLeftAnchor(rec16, 180.0);
				
				PreparePane.this.setTopAnchor(l7, 447.0);
				PreparePane.this.setLeftAnchor(l7, 230.0);
						
				Timeline t1 = new Timeline();
				
				KeyValue kv1 = new KeyValue(rec13.widthProperty(), 200);
				KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1);
				
				KeyValue kv2 = new KeyValue(rec13.widthProperty(), 450);
				KeyFrame kf2 = new KeyFrame(Duration.seconds(0.1), kv2);
				
				t1.getKeyFrames().addAll(kf1,kf2);
				t1.setDelay(Duration.seconds(0));
				t1.setRate(1);
				t1.play();

			}
		});
		
		rec4.setOnMouseEntered(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.HAND);
				PreparePane.this.getChildren().remove(rec19);
				PreparePane.this.getChildren().remove(rec20);
				PreparePane.this.getChildren().remove(rec21);
				PreparePane.this.getChildren().remove(rec22);
				PreparePane.this.getChildren().remove(rec11);
				PreparePane.this.getChildren().remove(rec12);	
				PreparePane.this.getChildren().remove(rec13);
				PreparePane.this.getChildren().remove(rec14);
				PreparePane.this.getChildren().remove(rec15);
				PreparePane.this.getChildren().remove(rec16);	
				PreparePane.this.getChildren().remove(rec17);
				PreparePane.this.getChildren().remove(rec18);
				PreparePane.this.getChildren().remove(l5);
				PreparePane.this.getChildren().remove(l6);	
				PreparePane.this.getChildren().remove(l7);
				PreparePane.this.getChildren().remove(l8);
				
				PreparePane.this.getChildren().addAll(rec14);	
				PreparePane.this.getChildren().addAll(rec22);	
				PreparePane.this.getChildren().addAll(rec15);
				PreparePane.this.getChildren().addAll(l8);	
				
				PreparePane.this.setTopAnchor(rec22, 523.0);
				PreparePane.this.setLeftAnchor(rec22, 190.0);
				
				PreparePane.this.setTopAnchor(rec15, 510.0);
				PreparePane.this.setLeftAnchor(rec15, 180.0);
				
				PreparePane.this.setTopAnchor(l8, 517.0);
				PreparePane.this.setLeftAnchor(l8, 230.0);
						
				Timeline t1 = new Timeline();
				
				KeyValue kv1 = new KeyValue(rec14.widthProperty(), 200);
				KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1);
				
				KeyValue kv2 = new KeyValue(rec14.widthProperty(), 450);
				KeyFrame kf2 = new KeyFrame(Duration.seconds(0.1), kv2);
				
				t1.getKeyFrames().addAll(kf1,kf2);
				t1.setDelay(Duration.seconds(0));
				t1.setRate(1);
				t1.play();

			}
		});
		
		rec11.setOnMouseClicked(new EventHandler<MouseEvent>() {

			
			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				PreparePane.this.getChildren().remove(rec29);
				PreparePane.this.getChildren().remove(rec32);
				PreparePane.this.getChildren().remove(lp);
				PreparePane.this.getChildren().remove(sup);
				PreparePane.this.getChildren().remove(aup);
				PreparePane.this.getChildren().remove(ep);
				
				//PreparePane.this.getChildren().addAll(rec29);
				
				PreparePane.this.setTopAnchor(rec29, 105.0);
				PreparePane.this.setLeftAnchor(rec29, 705.0);
				
				KeyValue kv1 = new KeyValue(rec11.fillProperty(), Color.BLACK);
				KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1);
				
				KeyValue kv2 = new KeyValue(rec11.fillProperty(), Color.WHITE);
				KeyFrame kf2 = new KeyFrame(Duration.seconds(0.07), kv2);
				
				Timeline timeline1 = new Timeline(90);
				timeline1.getKeyFrames().addAll(kf1,kf2);
				timeline1.setDelay(Duration.seconds(0));
				timeline1.setCycleCount(4);
				timeline1.setAutoReverse(true);
				timeline1.play();
				
				t2.play();
				t4.play();
				
				PreparePane.this.getChildren().addAll(lp);
				PreparePane.this.setTopAnchor(lp, 140.0);
				PreparePane.this.setLeftAnchor(lp, 700.0);
				
				Rectangle recc = new Rectangle();
				
				KeyValue kv701 = new KeyValue(recc.fillProperty(), Color.valueOf("#363636"));
				KeyFrame kf701 = new KeyFrame(Duration.seconds(0), kv701);

				KeyValue kv801 = new KeyValue(recc.fillProperty(), Color.valueOf("#363636"));
				KeyFrame kf801 = new KeyFrame(Duration.millis(1), kv801);

				Timeline timeline401 = new Timeline(90);
				timeline401.getKeyFrames().addAll(kf701, kf801);
				timeline401.setDelay(Duration.seconds(0));
				timeline401.setCycleCount(4);
				timeline401.setRate(6);
				timeline401.setAutoReverse(true);
				
				Rectangle recc1 = new Rectangle();
				
				KeyValue kv901 = new KeyValue(recc1.fillProperty(), Color.valueOf("#363636"));
				KeyFrame kf901 = new KeyFrame(Duration.seconds(0), kv901);

				KeyValue kv1001 = new KeyValue(recc1.fillProperty(), Color.valueOf("#363636"));
				KeyFrame kf1001 = new KeyFrame(Duration.seconds(1), kv1001);

				Timeline timeline501 = new Timeline(90);
				timeline501.getKeyFrames().addAll(kf901, kf1001);
				timeline501.setDelay(Duration.seconds(0.5));
				timeline501.setCycleCount(4);
				timeline501.setRate(6);
				timeline501.setAutoReverse(true);
				
				Rectangle recc2 = new Rectangle();
				
				KeyValue kv1101 = new KeyValue(recc2.fillProperty(), Color.valueOf("#363636"));
				KeyFrame kf1101 = new KeyFrame(Duration.seconds(0), kv1101);

				KeyValue kv1201 = new KeyValue(recc2.fillProperty(), Color.valueOf("#363636"));
				KeyFrame kf1201 = new KeyFrame(Duration.seconds(1), kv1201);

				Timeline timeline601 = new Timeline(90);
				timeline601.getKeyFrames().addAll(kf1101, kf1201);
				timeline601.setDelay(Duration.seconds(1));
				timeline601.setCycleCount(4);
				timeline601.setRate(6);
				timeline601.setAutoReverse(true);
					
				
				
				timeline401.setOnFinished(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
						PreparePane.this.getChildren().clear();
						Dialog1 d1 = new Dialog1();
						d1.sp.name = PreparePane.this.name;
						d1.sp.password = PreparePane.this.password;
						PreparePane.this.getChildren().add(d1);
					}
				});
				
				timeline501.setOnFinished(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
						//PreparePane.this.getChildren().clear();
						Dialog2 d2 = new Dialog2();
						PreparePane.this.getChildren().add(d2);
						timeline601.play();
						lp.tf1.setText("");
						lp.tf2.setText("");
						
						timeline601.setOnFinished(new EventHandler<ActionEvent>() {

							@Override
							public void handle(ActionEvent arg0) {
								// TODO Auto-generated method stub
								PreparePane.this.getChildren().remove(d2);
							}
						});
					}
				});
				
				
				
				lp.rec10.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						String t1 = lp.tf1.getText();
						String t2	= lp.tf2.getText();
						
						lp.isLogin = Login.login(t1, t2);
						
						
						KeyValue kv1 = new KeyValue(lp.rec10.fillProperty(), Color.BLACK);
						KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1);
						
						KeyValue kv2 = new KeyValue(lp.rec10.fillProperty(), Color.WHITE);
						KeyFrame kf2 = new KeyFrame(Duration.seconds(0.05), kv2);
						
						Timeline timeline1 = new Timeline(90);
						timeline1.getKeyFrames().addAll(kf1,kf2);
						timeline1.setDelay(Duration.seconds(0));
						timeline1.setCycleCount(4);
						timeline1.setAutoReverse(true);
						timeline1.play();
						
						timeline1.setOnFinished(new EventHandler<ActionEvent>() {

							@Override
							public void handle(ActionEvent arg0) {
								// TODO Auto-generated method stub
								if(lp.isLogin) {
									
									name = t1;
									password = t2;
									
									

									timeline401.play();	
								}else {
									timeline501.play();	
								}
							}
						});
						
					
						
					}
					
				});
				
				
				
			}	
				
		});
		
		rec12.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
				PreparePane.this.getChildren().remove(rec29);				
				PreparePane.this.getChildren().remove(rec32);
				PreparePane.this.getChildren().remove(lp);
				PreparePane.this.getChildren().remove(sup);
				PreparePane.this.getChildren().remove(aup);
				PreparePane.this.getChildren().remove(ep);
				
				//PreparePane.this.getChildren().addAll(rec29);
				
				PreparePane.this.setTopAnchor(rec29, 105.0);
				PreparePane.this.setLeftAnchor(rec29, 705.0);
				
				KeyValue kv1 = new KeyValue(rec12.fillProperty(), Color.BLACK);
				KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1);
				
				KeyValue kv2 = new KeyValue(rec12.fillProperty(), Color.WHITE);
				KeyFrame kf2 = new KeyFrame(Duration.seconds(0.07), kv2);
				
				Timeline timeline1 = new Timeline(90);
				timeline1.getKeyFrames().addAll(kf1,kf2);
				timeline1.setDelay(Duration.seconds(0));
				timeline1.setCycleCount(4);
				timeline1.setAutoReverse(true);
				timeline1.play();
				
				t2.play();
				t4.play();
				
				PreparePane.this.getChildren().addAll(sup);
				PreparePane.this.setTopAnchor(sup, 140.0);
				PreparePane.this.setLeftAnchor(sup, 700.0);
			}
		});
		
		rec13.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
				PreparePane.this.getChildren().remove(rec29);
				PreparePane.this.getChildren().remove(rec32);	
				PreparePane.this.getChildren().remove(lp);
				PreparePane.this.getChildren().remove(sup);
				PreparePane.this.getChildren().remove(aup);
				PreparePane.this.getChildren().remove(ep);
				
				//PreparePane.this.getChildren().addAll(rec29);
				
				PreparePane.this.setTopAnchor(rec29, 105.0);
				PreparePane.this.setLeftAnchor(rec29, 705.0);
				
				KeyValue kv1 = new KeyValue(rec13.fillProperty(), Color.BLACK);
				KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1);
				
				KeyValue kv2 = new KeyValue(rec13.fillProperty(), Color.WHITE);
				KeyFrame kf2 = new KeyFrame(Duration.seconds(0.07), kv2);
				
				Timeline timeline1 = new Timeline(90);
				timeline1.getKeyFrames().addAll(kf1,kf2);
				timeline1.setDelay(Duration.seconds(0));
				timeline1.setCycleCount(4);
				timeline1.setAutoReverse(true);
				timeline1.play();
				
				t2.play();
				t4.play();
				
				PreparePane.this.getChildren().addAll(aup);
				PreparePane.this.setTopAnchor(aup, 140.0);
				PreparePane.this.setLeftAnchor(aup, 700.0);
				
			}
		});
		
		rec14.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
				PreparePane.this.getChildren().remove(rec29);
				PreparePane.this.getChildren().remove(rec32);			
				PreparePane.this.getChildren().remove(lp);
				PreparePane.this.getChildren().remove(sup);
				PreparePane.this.getChildren().remove(aup);
				PreparePane.this.getChildren().remove(ep);
				
//				PreparePane.this.getChildren().addAll(rec29);
				
				PreparePane.this.setTopAnchor(rec29, 105.0);
				PreparePane.this.setLeftAnchor(rec29, 705.0);	
				
//				PreparePane.this.getChildren().addAll(ep);
				PreparePane.this.setTopAnchor(ep, 140.0);
				PreparePane.this.setLeftAnchor(ep, 700.0);
				
				KeyValue kv1 = new KeyValue(rec14.fillProperty(), Color.BLACK);
				KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1);
				
				KeyValue kv2 = new KeyValue(rec14.fillProperty(), Color.WHITE);
				KeyFrame kf2 = new KeyFrame(Duration.seconds(0.07), kv2);
				
				Timeline timeline1 = new Timeline(90);
				timeline1.getKeyFrames().addAll(kf1,kf2);
				timeline1.setDelay(Duration.seconds(0));
				timeline1.setCycleCount(4);
				timeline1.setAutoReverse(true);
				timeline1.play();
				
//				t2.play();
//				t4.play();
				
				timeline1.setOnFinished(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
						System.exit(1);
					}
				});
				
			}
		});
		
		rec11.setOnMouseEntered(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.HAND);
			}
		});
		
		rec12.setOnMouseEntered(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.HAND);
			}
		});
		
		rec13.setOnMouseEntered(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.HAND);
			}
		});
		
		rec14.setOnMouseEntered(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.HAND);
			}
		});
		
		
		
		rec1.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.DEFAULT);
			}
		});
		
		rec2.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.DEFAULT);
			}
		});
		
		rec3.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.DEFAULT);
			}
		});
		
		rec4.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.DEFAULT);
			}
		});
		
		rec11.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.DEFAULT);
			}
		});
		
		rec12.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.DEFAULT);
			}
		});
		
		rec13.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.DEFAULT);
			}
		});
		
		rec14.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.DEFAULT);
			}
		});
		
		

	}
	public Effect geteffect() {
		DropShadow ds = new DropShadow();
		
		return ds;
	}
	

}


