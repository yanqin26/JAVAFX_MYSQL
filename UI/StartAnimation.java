package UI;



import UI.StartAnimationPane1.MyScheduledService;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.concurrent.ScheduledService;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Effect;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.util.Duration;

public class StartAnimation extends BackgroundPane {

	BackgroundPane bgp1 = new BackgroundPane();
	BackgroundPane bgp2 = new BackgroundPane();
	
	
	public StartAnimation() {

		Element1 e1 = new Element1();

		this.getChildren().add(e1);
		this.setTopAnchor(e1, 350.0);
		this.setLeftAnchor(e1, 560.0);

		KeyValue kv1 = new KeyValue(e1.translateXProperty(), 0);
		KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1);

		KeyValue kv2 = new KeyValue(e1.translateXProperty(), -130);
		KeyFrame kf2 = new KeyFrame(Duration.seconds(0.8), kv2);

		Timeline timeline1 = new Timeline(90);
		timeline1.getKeyFrames().addAll(kf1, kf2);
		timeline1.setDelay(Duration.seconds(4.2));
		timeline1.play();

		Circle c1 = new Circle();
		c1.setRadius(5);

		KeyValue kv3 = new KeyValue(c1.fillProperty(), Color.valueOf("#363636"));
		KeyFrame kf3 = new KeyFrame(Duration.seconds(0), kv3);

		KeyValue kv4 = new KeyValue(c1.fillProperty(), Color.valueOf("#363636"));
		KeyFrame kf4 = new KeyFrame(Duration.seconds(2.5), kv4);

		Timeline timeline2 = new Timeline(90);
		timeline2.getKeyFrames().addAll(kf3, kf4);
		timeline2.setDelay(Duration.seconds(0));
		timeline2.setCycleCount(0);
		timeline2.setAutoReverse(true);
		

		timeline1.setOnFinished(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				StartAnimation.this.getChildren().add(c1);
				StartAnimation.this.setTopAnchor(c1, 384.0);
				StartAnimation.this.setLeftAnchor(c1, 680.0);

				Label label1 = new Label("");
				label1.setFont(Font.font(20));
				StartAnimation.this.getChildren().add(label1);
				StartAnimation.this.setTopAnchor(label1, 374.0);
				StartAnimation.this.setLeftAnchor(label1, 700.0);

				MyScheduledService my = new MyScheduledService(label1);

				my.setDelay(Duration.millis(0));

				my.setPeriod(Duration.millis(25));

				my.start();
				
				timeline2.play();
			}
		});
		
		timeline2.setOnFinished(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				StartAnimation.this.getChildren().clear();
				StartAnimation.this.getChildren().add(bgp1);
			}
		});
//----------------------------------------------------------------------------------------------------------------------------------
	Rectangle rec = new Rectangle(0.1, 2, Color.valueOf("#363636"));	
		
		bgp1.getChildren().add(rec);
		bgp1.setTopAnchor(rec, 330.0);
		bgp1.setLeftAnchor(rec, 0.0);
		
		KeyValue kv11 = new KeyValue(rec.widthProperty(), 500);
		KeyFrame kf11 = new KeyFrame(Duration.seconds(0), kv11);
		
		KeyValue kv21 = new KeyValue(rec.widthProperty(), 1400);
		KeyFrame kf21 = new KeyFrame(Duration.seconds(1), kv21);
		
		Timeline timeline11 = new Timeline(144);
		timeline11.getKeyFrames().addAll(kf11,kf21);
		timeline11.setRate(3);
		timeline11.setDelay(Duration.seconds(7.5));
		timeline11.play();
		
		KeyValue kv31 = new KeyValue(rec.heightProperty(), 0);
		KeyFrame kf31 = new KeyFrame(Duration.seconds(0), kv31);
		
		KeyValue kv41 = new KeyValue(rec.heightProperty(), 60);
		KeyFrame kf41 = new KeyFrame(Duration.seconds(0.1), kv41);
		
		Timeline timeline21 = new Timeline(144);
		timeline21.getKeyFrames().addAll(kf31,kf41);
		timeline21.setRate(4);
		timeline21.setDelay(Duration.seconds(0.2));
		
		
		KeyValue kv51 = new KeyValue(rec.fillProperty(), Color.BLACK);
		KeyFrame kf51 = new KeyFrame(Duration.seconds(0), kv51);

		KeyValue kv61 = new KeyValue(rec.fillProperty(), Color.WHITE);
		KeyFrame kf61 = new KeyFrame(Duration.seconds(0.05), kv61);

		Timeline timeline31 = new Timeline(90);
		timeline31.getKeyFrames().addAll(kf51, kf61);
		timeline31.setDelay(Duration.seconds(0.4));
		timeline31.setCycleCount(6);
		timeline31.setAutoReverse(true);
		
		Rectangle recc = new Rectangle(10,10);
		
		KeyValue kv71 = new KeyValue(recc.fillProperty(), Color.BLACK);
		KeyFrame kf71 = new KeyFrame(Duration.seconds(0), kv71);

		KeyValue kv81 = new KeyValue(recc.fillProperty(), Color.BLACK);
		KeyFrame kf81 = new KeyFrame(Duration.seconds(0.05), kv81);

		Timeline timeline41 = new Timeline(90);
		timeline41.getKeyFrames().addAll(kf51, kf61);
		timeline41.setDelay(Duration.seconds(1));
		timeline41.setCycleCount(4);
		timeline41.setAutoReverse(true);
		
		
		timeline11.setOnFinished(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				timeline21.play();	
				timeline31.play();
			}
		});
		
				
		Label label = new Label("CONNECTION IS SUCCESSFUL");
		label.setEffect(geteffect());
		
		timeline21.setOnFinished(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {			
				label.setFont(Font.font("", FontWeight.NORMAL, FontPosture.REGULAR, 50));
				label.setTextFill(Color.WHITE);
				bgp1.getChildren().add(label);
				bgp1.setTopAnchor(label, 330.0);
				bgp1.setLeftAnchor(label, 347.0);
				timeline41.play();
			}
		});
		
		timeline41.setOnFinished(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				StartAnimation.this.getChildren().clear();
				StartAnimation.this.getChildren().add(new StartAnimationPane2());
			}
		});
//-----------------------------------------------------------------------------------------------------------------------------------------
		
		KeyValue kv701 = new KeyValue(recc.fillProperty(), Color.valueOf("#363636"));
		KeyFrame kf701 = new KeyFrame(Duration.seconds(0), kv701);

		KeyValue kv801 = new KeyValue(recc.fillProperty(), Color.valueOf("#363636"));
		KeyFrame kf801 = new KeyFrame(Duration.seconds(0.05), kv801);

		Timeline timeline401 = new Timeline(90);
		timeline401.getKeyFrames().addAll(kf701, kf801);
		timeline401.setDelay(Duration.seconds(13.5));
		timeline401.setCycleCount(4);
		timeline401.setRate(6);
		timeline401.setAutoReverse(true);
		timeline401.play();	
		
		timeline401.setOnFinished(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				StartAnimation.this.getChildren().clear();
//				StartAnimation.this.getChildren().add(new Dialog1());
			}
		});
//-----------------------------------------------------------------------------------------------------------------------------------------		
		Rectangle rec501 = new Rectangle();
		
		KeyValue kv901 = new KeyValue(rec501.fillProperty(), Color.valueOf("#363636"));
		KeyFrame kf901 = new KeyFrame(Duration.seconds(0), kv701);

		KeyValue kv1001 = new KeyValue(rec501.fillProperty(), Color.valueOf("#363636"));
		KeyFrame kf1001 = new KeyFrame(Duration.seconds(0.05), kv801);
		
		Timeline timeline601 = new Timeline(90);
		timeline601.getKeyFrames().addAll(kf701, kf801);
		timeline601.setDelay(Duration.seconds(13.5));
		timeline601.setCycleCount(4);
		timeline601.setRate(6);
		timeline601.setAutoReverse(true);
		timeline601.play();	
		timeline601.setOnFinished(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				StartAnimation.this.getChildren().clear();
				PreparePane pp = new PreparePane();
				StartAnimation.this.getChildren().add(pp);
				pp.getChildren().addAll(pp.lp);
				pp.setTopAnchor(pp.lp, 140.0);
				pp.setLeftAnchor(pp.lp, 700.0);
				
				pp.t2.play();
				pp.t4.play();
			}
		});
		
		
//------------------------------------------------------------------------------------------------------------------------------------------
	}
	
	public Effect geteffect() {
		DropShadow ds = new DropShadow();
		
		return ds;
	}

	class MyScheduledService extends ScheduledService<Integer> {

		int i = 0;

		DialogPane di = null;
		Stage stage = null;
		Label label = null;

		public MyScheduledService(DialogPane di, Stage stage) {
			this.di = di;
			this.stage = stage;
		}

		public MyScheduledService(Label label) {
			this.label = label;
		}

		@Override
		protected Task<Integer> createTask() {
			return new Task<Integer>() {
				// 此方法用于复杂的多任务计算
				// 返回的值被传入到updateValue方法中的value值中
				@Override
				protected Integer call() throws Exception {
					// TODO Auto-generated method stub
					// System.out.println("call" + Thread.currentThread().getName());
					return i = i + 1;
				}

				// 此方法位于FX线程中，所以说可以进行界面更新
				@Override
				protected void updateValue(Integer value) {
					String[] array = { "C:\\Users\\CYQ>", "mysql -uroot -p", "Welcome to the MySQL monitor.",
							" Commands end with ; or \\g.", "Your MySQL connection id is 1", "Server version: 5.5.36",
							"MySQL Community Server (GPL)", "SCHEMATA", "SCHEMA_PRIVILEGES", "SESSION_STATUS",
							"SESSION_STATUS", "Other names may be", "trademarks of their respective",
							"Type 'help;' or '\\h' for help.", "Type '\\c' to clear the current input statement.",
							"show databases;", "information_schema", "listing", "order_backstage", "performance_schema",
							"sakila", "user_tel_13398182161", "information_schema", "Database changed",
							"Copyright (c) 2000, 2014", " Oracle and/or its affiliates.", "Corporation and/or its",
							"show tables;", "CHARACTER_SETS", "COLLATIONS", "COLLATION_CHARACTER_SET_APPLICABILITY",
							"COLUMNS", "COLUMN_PRIVILEGES", "ENGINES", "GLOBAL_STATUS", "GLOBAL_VARIABLES",
							"KEY_COLUMN_USAGE", "PARAMETERS", "REFERENTIAL_CONSTRAINTS", "ROUTINES",
							"INNODB_BUFFER_POOL_STATS", "INNODB_TRX", "INNODB_BUFFER_POOL_STATS", "INNODB_LOCK_WAITS",
							"INNODB_CMPMEM", "INNODB_CMP", "INNODB_CMPMEM_RESET", "INNODB_CMP_RESET",
							"INNODB_BUFFER_PAGE_LRU", "DATABASE CONNECTED", "order_backstage", "performance_schema",
							"sakila", "user_tel_13398182161", "information_schema", "Database changed",
							"Copyright (c) 2000, 2014", " Oracle and/or its affiliates.", "Corporation and/or its",
							"show tables;", "CHARACTER_SETS", "COLLATIONS", "COLLATION_CHARACTER_SET_APPLICABILITY",
							"COLUMNS", "COLUMN_PRIVILEGES", "ENGINES", "GLOBAL_STATUS", "GLOBAL_VARIABLES", "DATABASE CONNECTED"};
					super.updateValue(value);

					if (value < array.length) {
						label.setText(array[i]);
					}

				}

			};
		}

	}
}
