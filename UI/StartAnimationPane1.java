package UI;

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
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

public class StartAnimationPane1 extends BackgroundPane{
	
	Rectangle rec = new Rectangle(10,10);
	Timeline timeline2 = new Timeline(90);
	
	public StartAnimationPane1() {
		
		Element1 e1 = new Element1();
		
		this.getChildren().add(e1);
		this.setTopAnchor(e1, 350.0);
		this.setLeftAnchor(e1, 560.0);
		
		KeyValue kv1 = new KeyValue(e1.translateXProperty(), 0);
		KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1);
		
		KeyValue kv2 = new KeyValue(e1.translateXProperty(), -130);
		KeyFrame kf2 = new KeyFrame(Duration.seconds(0.7), kv2);
		
		Timeline timeline1 = new Timeline(90);
		timeline1.getKeyFrames().addAll(kf1,kf2);
		timeline1.setDelay(Duration.seconds(1.3));
		timeline1.play();
		
		Circle c1 = new Circle();
		c1.setRadius(5);
		
		KeyValue kv3 = new KeyValue(c1.fillProperty(), Color.BLACK);
		KeyFrame kf3 = new KeyFrame(Duration.seconds(0), kv3);
		
		KeyValue kv4 = new KeyValue(c1.fillProperty(), Color.WHITE);
		KeyFrame kf4 = new KeyFrame(Duration.seconds(0.05), kv4);
		
		timeline2.getKeyFrames().addAll(kf3,kf4);
		timeline2.setDelay(Duration.seconds(0));
		timeline2.setCycleCount(6);
		timeline2.setAutoReverse(true);
		timeline2.play();
		
		timeline1.setOnFinished(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				StartAnimationPane1.this.getChildren().add(c1);
				StartAnimationPane1.this.setTopAnchor(c1, 384.0);
				StartAnimationPane1.this.setLeftAnchor(c1, 680.0);
				
				timeline2.play();
				
				Label label1 = new Label("");
				label1.setFont(Font.font(20));
				StartAnimationPane1.this.getChildren().add(label1);
				StartAnimationPane1.this.setTopAnchor(label1, 374.0);
				StartAnimationPane1.this.setLeftAnchor(label1, 700.0);
				
				MyScheduledService my = new MyScheduledService(label1);
				
				my.setDelay(Duration.millis(0));
				
				my.setPeriod(Duration.millis(30));
				
				my.start();
				
				
			}
		});
		
	
	

}
class MyScheduledService extends ScheduledService<Integer>{
	
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
			//此方法用于复杂的多任务计算
			//返回的值被传入到updateValue方法中的value值中
			@Override
			protected Integer call() throws Exception {
				// TODO Auto-generated method stub
//				System.out.println("call" + Thread.currentThread().getName());
				return i = i + 1;
			}
			
			//此方法位于FX线程中，所以说可以进行界面更新
			@Override
			protected void updateValue(Integer value) {		
				String[] array = {"C:\\Users\\CYQ>","mysql -uroot -p","Welcome to the MySQL monitor."," Commands end with ; or \\g."
						,"Your MySQL connection id is 1","Server version: 5.5.36","MySQL Community Server (GPL)",
						"SCHEMATA","SCHEMA_PRIVILEGES","SESSION_STATUS","SESSION_STATUS",
						"Other names may be","trademarks of their respective","Type 'help;' or '\\h' for help.",
						"Type '\\c' to clear the current input statement.","show databases;","information_schema"
						,"listing","order_backstage","performance_schema","sakila","user_tel_13398182161",
						"information_schema","Database changed","Copyright (c) 2000, 2014"," Oracle and/or its affiliates.",
						"Corporation and/or its","show tables;","CHARACTER_SETS","COLLATIONS",
						"COLLATION_CHARACTER_SET_APPLICABILITY","COLUMNS","COLUMN_PRIVILEGES","ENGINES","GLOBAL_STATUS",
						"GLOBAL_VARIABLES","KEY_COLUMN_USAGE","PARAMETERS","REFERENTIAL_CONSTRAINTS",
						"ROUTINES","INNODB_BUFFER_POOL_STATS",
						"INNODB_TRX","INNODB_BUFFER_POOL_STATS","INNODB_LOCK_WAITS","INNODB_CMPMEM",
						"INNODB_CMP","INNODB_CMPMEM_RESET","INNODB_CMP_RESET","INNODB_BUFFER_PAGE_LRU"
						,"DATABASE CONNECTED"};
				super.updateValue(value);
				
				if(value < array.length) {
					label.setText(array[i]);
				}
				
			}
			
		};
	}
	
}
}
