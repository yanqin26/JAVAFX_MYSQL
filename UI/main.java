package UI;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class main extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		StartAnimation sap = new StartAnimation();
		StartAnimationPane2 sap2 = new StartAnimationPane2();
		Dialog1 d1 = new Dialog1();
		Element1 e1 = new Element1();
		PreparePane pp = new PreparePane();
		SystemPane sp = new SystemPane();
		ListPane lp = new ListPane();

		Scene scene = new Scene(sap);
	
		//将scene设置为白色透明
		scene.setFill(Paint.valueOf("#ffffff00"));
		primaryStage.setScene(scene);
		//指定stage样式
		primaryStage.initStyle(StageStyle.TRANSPARENT);
		primaryStage.show();
		
		//设置stage的长宽
		primaryStage.setWidth(1400);
		primaryStage.setHeight(880);
		
		//设置stage的坐标
		primaryStage.setX(100);
		primaryStage.setY(40);
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
