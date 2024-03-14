package UI;


import javafx.application.ConditionalFeature;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Effect;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;


public class BackgroundPane extends AnchorPane{
	
	StackPane sp = new StackPane();

	AnchorPane an = new AnchorPane();
	//窗口的长宽度为1400，880
	//设置布局的背景颜色，弧度
	BackgroundFill bf = new BackgroundFill(Paint.valueOf("#CDC8B1"), new CornerRadii(0), new Insets(0));
	Background bg = new Background(bf);
	//#CDC8B1
	
	Rectangle rec1 = new Rectangle(10,5,Color.BLACK);
	
	//直线间距
	int padding = 80;
	
	//初始化设置背景
	
	Label label = new Label("Labmen No.004");
	Rectangle rec = new Rectangle(18,8);
	
	public BackgroundPane() {
		
		
		//背景垂直直线
		Line hLine1 = new Line(14,3 , 14,877 - 300);
		Line hLine2 = new Line(14 + padding,3 , 14 + padding,877-400);
		Line hLine3 = new Line(14 + 2 * padding,3 , 14 + 2 * padding,877-500);
		Line hLine4 = new Line(14 + 3 * padding,3 , 14 + 3 * padding,877-600);
		Line hLine5 = new Line(14 + 4 * padding,3 , 14 + 4 * padding,877-700);
		Line hLine6 = new Line(14 + 5 * padding,3 , 14 + 5 * padding,877-800);
		Line hLine13 = new Line(14 + 12 * padding,3 +800, 14 + 12 * padding,877);
		Line hLine14 = new Line(14 + 13 * padding,3 +700, 14 + 13 * padding,877);
		Line hLine15 = new Line(14 + 14 * padding,3 +600, 14 + 14 * padding,877);
		Line hLine16 = new Line(14 + 15 * padding,3 +500, 14 + 15 * padding,877);
		Line hLine17 = new Line(14 + 16 * padding,3 +400, 14 + 16 * padding,877);
		Line hLine18 = new Line(14 + 17 * padding,3 +300, 14 + 17 * padding,877);
		//背景水平直线
		Line vLine1 = new Line(4,14 , 1400- 800,14);
		Line vLine2 = new Line(4,14 +padding, 1400 - 900,14 + padding);
		Line vLine3 = new Line(4,14 + 2 * padding, 1400 - 1000,14 + 2 * padding);
		Line vLine10 = new Line(4,14 + 3 * padding, 1400- 1100,14 + 3 * padding);
		Line vLine11 = new Line(4,14 + 4 * padding, 1400 - 1200,14 + 4 * padding);
		Line vLine12 = new Line(4,14 + 5 * padding, 1400 - 1300,14 + 5 * padding);
		
		Line vLine4 = new Line(1000,720-14 , 1400-4,720-14);
		Line vLine5 = new Line(900,800-14 , 1400-4,800-14);
		Line vLine6 = new Line(800,880-14 , 1400-4,880-14);
		Line vLine7 = new Line(1100,640-14 , 1400-4,640-14);
		Line vLine8 = new Line(1200,560-14 , 1400-4,560-14);
		Line vLine9 = new Line(1300,480-14 , 1400-4,480-14);
		
		//添加直线
		an.getChildren().addAll(hLine1,hLine2,hLine3,hLine4,hLine5,hLine6,hLine13,hLine14,hLine15,hLine16,hLine17,hLine18);
		an.getChildren().addAll(vLine1, vLine2,vLine3,vLine4,vLine5,vLine6,vLine7,vLine8,vLine9,vLine10,vLine11,vLine12);
		
		//设置颜色
		hLine1.setStroke(Color.valueOf("ffffff"));
		hLine2.setStroke(Color.valueOf("ffffff"));
		hLine3.setStroke(Color.valueOf("ffffff"));
		hLine4.setStroke(Color.valueOf("ffffff"));
		hLine5.setStroke(Color.valueOf("ffffff"));
		hLine6.setStroke(Color.valueOf("ffffff"));
		hLine13.setStroke(Color.valueOf("ffffff"));
		hLine14.setStroke(Color.valueOf("ffffff"));
		hLine15.setStroke(Color.valueOf("ffffff"));
		hLine16.setStroke(Color.valueOf("ffffff"));
		hLine17.setStroke(Color.valueOf("ffffff"));
		hLine18.setStroke(Color.valueOf("ffffff"));
		
		vLine1.setStroke(Color.valueOf("ffffff"));
		vLine2.setStroke(Color.valueOf("ffffff"));
		vLine3.setStroke(Color.valueOf("ffffff"));
		vLine10.setStroke(Color.valueOf("ffffff"));
		vLine11.setStroke(Color.valueOf("ffffff"));
		vLine12.setStroke(Color.valueOf("ffffff"));
		
		vLine4.setStroke(Color.valueOf("ffffff"));
		vLine5.setStroke(Color.valueOf("ffffff"));
		vLine6.setStroke(Color.valueOf("ffffff"));
		vLine7.setStroke(Color.valueOf("ffffff"));
		vLine8.setStroke(Color.valueOf("ffffff"));
		vLine9.setStroke(Color.valueOf("ffffff"));
		
		
		
		//设置宽度
		hLine1.setStrokeWidth(4.5);	
		hLine2.setStrokeWidth(4.5);
		hLine3.setStrokeWidth(4.5);	
		hLine4.setStrokeWidth(4.5);
		hLine5.setStrokeWidth(4.5);	
		hLine6.setStrokeWidth(4.5);
		hLine13.setStrokeWidth(4.5);	
		hLine14.setStrokeWidth(4.5);
		hLine15.setStrokeWidth(4.5);	
		hLine16.setStrokeWidth(4.5);
		hLine17.setStrokeWidth(4.5);	
		hLine18.setStrokeWidth(4.5);
		
		vLine1.setStrokeWidth(4.5);	
		vLine2.setStrokeWidth(4.5);
		vLine3.setStrokeWidth(4.5);	
		vLine10.setStrokeWidth(4.5);	
		vLine11.setStrokeWidth(4.5);
		vLine12.setStrokeWidth(4.5);	
		
		vLine4.setStrokeWidth(4.5);
		vLine5.setStrokeWidth(4.5);	
		vLine6.setStrokeWidth(4.5);
		vLine7.setStrokeWidth(4.5);
		vLine8.setStrokeWidth(4.5);	
		vLine9.setStrokeWidth(4.5);
		
		an.setEffect(new GaussianBlur(10));
		//设置边框样式，圆角，颜色，弧度
		//an.setBorder(new Border(new BorderStroke(Color.valueOf("#828282"), BorderStrokeStyle.SOLID, new CornerRadii(0), new BorderWidths(2))));
		//将背景添加
		an.setBackground(bg);	
		
		//覆盖一层半透明膜在上面
		AnchorPane ap = new AnchorPane();
		ap.setPrefWidth(1400);
		ap.setPrefHeight(880);
		//设置布局的背景颜色，弧度
		Background bg = new Background(new BackgroundFill(Paint.valueOf("#ffffff99"), new CornerRadii(0), new Insets(0)));
		ap.setBackground(bg);
		ap.setBorder(new Border(new BorderStroke(Color.valueOf("#363636"), BorderStrokeStyle.SOLID, new CornerRadii(0), new BorderWidths(2))));
		
		sp.getChildren().addAll(an,ap);
		
		this.getChildren().add(sp);
		this.setBorder(new Border(new BorderStroke(Color.valueOf("#363636"), BorderStrokeStyle.SOLID, new CornerRadii(0), new BorderWidths(2))));
		
		
		this.getChildren().add(rec);
		this.setTopAnchor(rec, 800.0);
		this.setLeftAnchor(rec, 50.0);
		
		
		label.setFont(Font.font(12));
		this.getChildren().add(label);
		this.setTopAnchor(label, 796.2);
		this.setLeftAnchor(label, 78.0);		
	}
	 public Effect geteffect() {
		DropShadow ds = new DropShadow();
		
		return ds;
	 }
	

}







