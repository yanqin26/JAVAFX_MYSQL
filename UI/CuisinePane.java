package UI;



import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Cursor;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Effect;
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
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class CuisinePane extends AnchorPane{
	
		Image i1 = new Image("Image/o1.jpg");
		Image i2 = new Image("Image/o2.jpg");
		Image i3 = new Image("Image/o3.jpg");
		Image i4 = new Image("Image/o4.jpg");
		Image i5 = new Image("Image/o5.jpg");
		Image i6 = new Image("Image/o6.jpg");
		Image i7 = new Image("Image/o7.jpg");
		Image i8 = new Image("Image/o8.jpg");
		Image i9 = new Image("Image/o9.jpg");
		Image i10 = new Image("Image/o10.jpg");
		Image i11 = new Image("Image/o11.jpg");
		Image i12 = new Image("Image/o12.jpg");
		
		ImageView im1 = new ImageView(i1);
		ImageView im2 = new ImageView(i2);
		ImageView im3 = new ImageView(i3);
		ImageView im4 = new ImageView(i4);
		ImageView im5 = new ImageView(i5);
		ImageView im6 = new ImageView(i6);
		ImageView im7 = new ImageView(i7);
		ImageView im8 = new ImageView(i8);
		ImageView im9 = new ImageView(i9);
		ImageView im10 = new ImageView(i10);
		ImageView im11 = new ImageView(i11);
		ImageView im12 = new ImageView(i12);
		
		
		

	public CuisinePane() {
		// TODO Auto-generated constructor stub

		
		
		im1.setFitWidth(116);
		im1.setFitHeight(116);
		
		im2.setFitWidth(116);
		im2.setFitHeight(116);
		
		im3.setFitWidth(116);
		im3.setFitHeight(116);
		
		im4.setFitWidth(116);
		im4.setFitHeight(116);
		
		im5.setFitWidth(116);
		im5.setFitHeight(116);
		
		im6.setFitWidth(116);
		im6.setFitHeight(116);
		
		im7.setFitWidth(116);
		im7.setFitHeight(116);
		
		im8.setFitWidth(116);
		im8.setFitHeight(116);
		
		im9.setFitWidth(116);
		im9.setFitHeight(116);
		
		im10.setFitWidth(116);
		im10.setFitHeight(116);
		
		im11.setFitWidth(116);
		im11.setFitHeight(116);
		
		im12.setFitWidth(116);
		im12.setFitHeight(116);
		
		Rectangle rec1 = new Rectangle(120,120);
		Rectangle rec2 = new Rectangle(120,120);
		Rectangle rec3 = new Rectangle(120,120);
		Rectangle rec4 = new Rectangle(120,120);
		Rectangle rec5 = new Rectangle(120,120);
		Rectangle rec6 = new Rectangle(120,120);
		Rectangle rec7 = new Rectangle(120,120);
		Rectangle rec8 = new Rectangle(120,120);
		Rectangle rec9 = new Rectangle(120,120);
		Rectangle rec10 = new Rectangle(120,120);
		Rectangle rec11 = new Rectangle(120,120);
		Rectangle rec12 = new Rectangle(120,120);
		
		rec1.setFill(Color.valueOf("#36363680"));
		rec2.setFill(Color.valueOf("#36363680"));
		rec3.setFill(Color.valueOf("#36363680"));
		rec4.setFill(Color.valueOf("#36363680"));
		rec5.setFill(Color.valueOf("#36363680"));
		rec6.setFill(Color.valueOf("#36363680"));
		rec7.setFill(Color.valueOf("#36363680"));
		rec8.setFill(Color.valueOf("#36363680"));
		rec9.setFill(Color.valueOf("#36363680"));
		rec10.setFill(Color.valueOf("#36363680"));
		rec11.setFill(Color.valueOf("#36363680"));
		rec12.setFill(Color.valueOf("#36363680"));
		
		rec1.setEffect(geteffect());
		rec2.setEffect(geteffect());
		rec3.setEffect(geteffect());
		rec4.setEffect(geteffect());
		rec5.setEffect(geteffect());
		rec6.setEffect(geteffect());
		rec7.setEffect(geteffect());
		rec8.setEffect(geteffect());
		rec9.setEffect(geteffect());
		rec10.setEffect(geteffect());
		rec11.setEffect(geteffect());
		rec12.setEffect(geteffect());
		
		this.getChildren().addAll(rec1,rec2,rec3,rec4);
		this.getChildren().addAll(rec5,rec6,rec7,rec8);
		this.getChildren().addAll(rec9,rec10,rec11,rec12);
		
		this.getChildren().addAll(im1,im2,im3,im4);
		this.getChildren().addAll(im5,im6,im7,im8);
		this.getChildren().addAll(im9,im10,im11,im12);
		
		this.setTopAnchor(rec1, 40.0);
		this.setLeftAnchor(rec1, 100.0);
		this.setTopAnchor(rec2, 40.0);
		this.setLeftAnchor(rec2, 270.0);
		this.setTopAnchor(rec3, 40.0);
		this.setLeftAnchor(rec3, 440.0);
		this.setTopAnchor(rec4, 40.0);
		this.setLeftAnchor(rec4, 610.0);
		
		this.setTopAnchor(rec5, 210.0);
		this.setLeftAnchor(rec5, 100.0);
		this.setTopAnchor(rec6, 210.0);
		this.setLeftAnchor(rec6, 270.0);
		this.setTopAnchor(rec7, 210.0);
		this.setLeftAnchor(rec7, 440.0);
		this.setTopAnchor(rec8, 210.0);
		this.setLeftAnchor(rec8, 610.0);
		
		this.setTopAnchor(rec9, 380.0);
		this.setLeftAnchor(rec9, 100.0);
		this.setTopAnchor(rec10, 380.0);
		this.setLeftAnchor(rec10, 270.0);
		this.setTopAnchor(rec11, 380.0);
		this.setLeftAnchor(rec11, 440.0);
		this.setTopAnchor(rec12, 380.0);
		this.setLeftAnchor(rec12, 610.0);

		this.setTopAnchor(im1, 42.0);
		this.setLeftAnchor(im1, 102.0);
		this.setTopAnchor(im2, 42.0);
		this.setLeftAnchor(im2, 272.0);
		this.setTopAnchor(im3, 42.0);
		this.setLeftAnchor(im3, 442.0);
		this.setTopAnchor(im4, 42.0);
		this.setLeftAnchor(im4, 612.0);
		
		this.setTopAnchor(im5, 212.0);
		this.setLeftAnchor(im5, 102.0);
		this.setTopAnchor(im6, 212.0);
		this.setLeftAnchor(im6, 272.0);
		this.setTopAnchor(im7, 212.0);
		this.setLeftAnchor(im7, 442.0);
		this.setTopAnchor(im8, 212.0);
		this.setLeftAnchor(im8, 612.0);
		
		this.setTopAnchor(im9, 382.0);
		this.setLeftAnchor(im9, 102.0);
		this.setTopAnchor(im10, 382.0);
		this.setLeftAnchor(im10, 272.0);
		this.setTopAnchor(im11, 382.0);
		this.setLeftAnchor(im11, 442.0);
		this.setTopAnchor(im12, 382.0);
		this.setLeftAnchor(im12, 612.0);
		
		Rectangle rec13 = new Rectangle(120,3.5);
		Rectangle rec14 = new Rectangle(120,3.5);
		Rectangle rec15 = new Rectangle(3.5,120);
		Rectangle rec16 = new Rectangle(3.5,120);
		Circle c1 = new Circle(2);
		Circle c2 = new Circle(2);
		Circle c3 = new Circle(2);
		Circle c4 = new Circle(2);
		
		im1.setOnMouseEntered(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.HAND);
				
				CuisinePane.this.getChildren().remove(rec13);
				CuisinePane.this.getChildren().remove(rec14);
				CuisinePane.this.getChildren().remove(rec15);
				CuisinePane.this.getChildren().remove(rec16);
				CuisinePane.this.getChildren().remove(c1);
				CuisinePane.this.getChildren().remove(c2);
				CuisinePane.this.getChildren().remove(c3);
				CuisinePane.this.getChildren().remove(c4);
				
				CuisinePane.this.getChildren().addAll(rec13,rec14,rec15,rec16);
				CuisinePane.this.getChildren().addAll(c1,c2,c3,c4);
				
				CuisinePane.this.setTopAnchor(rec13, 40.0 - 6);
				CuisinePane.this.setLeftAnchor(rec13, 100.0);
				CuisinePane.this.setTopAnchor(rec14, 160.0 + 3);
				CuisinePane.this.setLeftAnchor(rec14, 100.0);
				CuisinePane.this.setTopAnchor(rec15, 40.0);
				CuisinePane.this.setLeftAnchor(rec15, 100.0 - 6);
				CuisinePane.this.setTopAnchor(rec16, 40.0);
				CuisinePane.this.setLeftAnchor(rec16, 220.0 + 3);
				
				CuisinePane.this.setTopAnchor(c1, 40.0 - 6);
				CuisinePane.this.setLeftAnchor(c1, 100.0 - 6);
				CuisinePane.this.setTopAnchor(c2, 160.0 + 2);
				CuisinePane.this.setLeftAnchor(c2, 100.0 - 6);
				CuisinePane.this.setTopAnchor(c3, 40.0 - 6);
				CuisinePane.this.setLeftAnchor(c3, 220.0 + 2);
				CuisinePane.this.setTopAnchor(c4, 160.0 + 2);
				CuisinePane.this.setLeftAnchor(c4, 220.0 + 2);
				
			}
		});
		
		im2.setOnMouseEntered(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.HAND);
				
				CuisinePane.this.getChildren().remove(rec13);
				CuisinePane.this.getChildren().remove(rec14);
				CuisinePane.this.getChildren().remove(rec15);
				CuisinePane.this.getChildren().remove(rec16);
				CuisinePane.this.getChildren().remove(c1);
				CuisinePane.this.getChildren().remove(c2);
				CuisinePane.this.getChildren().remove(c3);
				CuisinePane.this.getChildren().remove(c4);
				
				CuisinePane.this.getChildren().addAll(rec13,rec14,rec15,rec16);
				CuisinePane.this.getChildren().addAll(c1,c2,c3,c4);
				
				CuisinePane.this.setTopAnchor(rec13, 40.0 - 6);
				CuisinePane.this.setLeftAnchor(rec13, 270.0);
				CuisinePane.this.setTopAnchor(rec14, 160.0 + 3);
				CuisinePane.this.setLeftAnchor(rec14, 270.0);
				CuisinePane.this.setTopAnchor(rec15, 40.0);
				CuisinePane.this.setLeftAnchor(rec15, 270.0 - 6);
				CuisinePane.this.setTopAnchor(rec16, 40.0);
				CuisinePane.this.setLeftAnchor(rec16, 270.0 + 3 + 120);
				
				CuisinePane.this.setTopAnchor(c1, 40.0 - 6);
				CuisinePane.this.setLeftAnchor(c1, 270.0 - 6);
				CuisinePane.this.setTopAnchor(c2, 160.0 + 2);
				CuisinePane.this.setLeftAnchor(c2, 270.0 - 6);
				CuisinePane.this.setTopAnchor(c3, 40.0 - 6);
				CuisinePane.this.setLeftAnchor(c3, 270.0 + 2 + 120);
				CuisinePane.this.setTopAnchor(c4, 160.0 + 2);
				CuisinePane.this.setLeftAnchor(c4, 270.0 + 2 + 120);
			}
		});
		
		im3.setOnMouseEntered(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.HAND);
				
				CuisinePane.this.getChildren().remove(rec13);
				CuisinePane.this.getChildren().remove(rec14);
				CuisinePane.this.getChildren().remove(rec15);
				CuisinePane.this.getChildren().remove(rec16);
				CuisinePane.this.getChildren().remove(c1);
				CuisinePane.this.getChildren().remove(c2);
				CuisinePane.this.getChildren().remove(c3);
				CuisinePane.this.getChildren().remove(c4);
				
				CuisinePane.this.getChildren().addAll(rec13,rec14,rec15,rec16);
				CuisinePane.this.getChildren().addAll(c1,c2,c3,c4);
				
				CuisinePane.this.setTopAnchor(rec13, 40.0 - 6);
				CuisinePane.this.setLeftAnchor(rec13, 440.0);
				CuisinePane.this.setTopAnchor(rec14, 160.0 + 3);
				CuisinePane.this.setLeftAnchor(rec14, 440.0);
				CuisinePane.this.setTopAnchor(rec15, 40.0);
				CuisinePane.this.setLeftAnchor(rec15, 440.0 - 6);
				CuisinePane.this.setTopAnchor(rec16, 40.0);
				CuisinePane.this.setLeftAnchor(rec16, 440.0 + 3 + 120);
				
				CuisinePane.this.setTopAnchor(c1, 40.0 - 6);
				CuisinePane.this.setLeftAnchor(c1, 440.0 - 6);
				CuisinePane.this.setTopAnchor(c2, 160.0 + 2);
				CuisinePane.this.setLeftAnchor(c2, 440.0 - 6);
				CuisinePane.this.setTopAnchor(c3, 40.0 - 6);
				CuisinePane.this.setLeftAnchor(c3, 440.0 + 2 + 120);
				CuisinePane.this.setTopAnchor(c4, 160.0 + 2);
				CuisinePane.this.setLeftAnchor(c4, 440.0 + 2 + 120);
			}
		});
		
		im4.setOnMouseEntered(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.HAND);
				
				CuisinePane.this.getChildren().remove(rec13);
				CuisinePane.this.getChildren().remove(rec14);
				CuisinePane.this.getChildren().remove(rec15);
				CuisinePane.this.getChildren().remove(rec16);
				CuisinePane.this.getChildren().remove(c1);
				CuisinePane.this.getChildren().remove(c2);
				CuisinePane.this.getChildren().remove(c3);
				CuisinePane.this.getChildren().remove(c4);
				
				CuisinePane.this.getChildren().addAll(rec13,rec14,rec15,rec16);
				CuisinePane.this.getChildren().addAll(c1,c2,c3,c4);
				
				CuisinePane.this.setTopAnchor(rec13, 40.0 - 6);
				CuisinePane.this.setLeftAnchor(rec13, 610.0);
				CuisinePane.this.setTopAnchor(rec14, 160.0 + 3);
				CuisinePane.this.setLeftAnchor(rec14, 610.0);
				CuisinePane.this.setTopAnchor(rec15, 40.0);
				CuisinePane.this.setLeftAnchor(rec15, 610.0 - 6);
				CuisinePane.this.setTopAnchor(rec16, 40.0);
				CuisinePane.this.setLeftAnchor(rec16, 610.0 + 3 + 120);
				
				CuisinePane.this.setTopAnchor(c1, 40.0 - 6);
				CuisinePane.this.setLeftAnchor(c1, 610.0 - 6);
				CuisinePane.this.setTopAnchor(c2, 160.0 + 2);
				CuisinePane.this.setLeftAnchor(c2, 610.0 - 6);
				CuisinePane.this.setTopAnchor(c3, 40.0 - 6);
				CuisinePane.this.setLeftAnchor(c3, 610.0 + 2 + 120);
				CuisinePane.this.setTopAnchor(c4, 160.0 + 2);
				CuisinePane.this.setLeftAnchor(c4, 610.0 + 2 + 120);
			}
		});
		
		im5.setOnMouseEntered(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.HAND);
				
				CuisinePane.this.getChildren().remove(rec13);
				CuisinePane.this.getChildren().remove(rec14);
				CuisinePane.this.getChildren().remove(rec15);
				CuisinePane.this.getChildren().remove(rec16);
				CuisinePane.this.getChildren().remove(c1);
				CuisinePane.this.getChildren().remove(c2);
				CuisinePane.this.getChildren().remove(c3);
				CuisinePane.this.getChildren().remove(c4);
				
				CuisinePane.this.getChildren().addAll(rec13,rec14,rec15,rec16);
				CuisinePane.this.getChildren().addAll(c1,c2,c3,c4);
				
				CuisinePane.this.setTopAnchor(rec13, 210.0 - 6);
				CuisinePane.this.setLeftAnchor(rec13, 100.0);
				CuisinePane.this.setTopAnchor(rec14, 210.0 + 3 + 120);
				CuisinePane.this.setLeftAnchor(rec14, 100.0);
				CuisinePane.this.setTopAnchor(rec15, 210.0);
				CuisinePane.this.setLeftAnchor(rec15, 100.0 - 6);
				CuisinePane.this.setTopAnchor(rec16, 210.0);
				CuisinePane.this.setLeftAnchor(rec16, 100.0 + 3 + 120);
				
				CuisinePane.this.setTopAnchor(c1, 210.0 - 6);
				CuisinePane.this.setLeftAnchor(c1, 100.0 - 6);
				CuisinePane.this.setTopAnchor(c2, 210.0 + 2 + 120);
				CuisinePane.this.setLeftAnchor(c2, 100.0 - 6);
				CuisinePane.this.setTopAnchor(c3, 210.0 - 6);
				CuisinePane.this.setLeftAnchor(c3, 100.0 + 2 + 120);
				CuisinePane.this.setTopAnchor(c4, 210.0 + 2 + 120);
				CuisinePane.this.setLeftAnchor(c4, 100.0 + 2 + 120);
			}
		});
		
		im6.setOnMouseEntered(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.HAND);
				
				CuisinePane.this.getChildren().remove(rec13);
				CuisinePane.this.getChildren().remove(rec14);
				CuisinePane.this.getChildren().remove(rec15);
				CuisinePane.this.getChildren().remove(rec16);
				CuisinePane.this.getChildren().remove(c1);
				CuisinePane.this.getChildren().remove(c2);
				CuisinePane.this.getChildren().remove(c3);
				CuisinePane.this.getChildren().remove(c4);
				
				CuisinePane.this.getChildren().addAll(rec13,rec14,rec15,rec16);
				CuisinePane.this.getChildren().addAll(c1,c2,c3,c4);
				
				CuisinePane.this.setTopAnchor(rec13, 210.0 - 6);
				CuisinePane.this.setLeftAnchor(rec13, 270.0);
				CuisinePane.this.setTopAnchor(rec14, 210.0 + 3 + 120);
				CuisinePane.this.setLeftAnchor(rec14, 270.0);
				CuisinePane.this.setTopAnchor(rec15, 210.0);
				CuisinePane.this.setLeftAnchor(rec15, 270.0 - 6);
				CuisinePane.this.setTopAnchor(rec16, 210.0);
				CuisinePane.this.setLeftAnchor(rec16, 270.0 + 3 + 120);
				
				CuisinePane.this.setTopAnchor(c1, 210.0 - 6);
				CuisinePane.this.setLeftAnchor(c1, 270.0 - 6);
				CuisinePane.this.setTopAnchor(c2, 210.0 + 2 + 120);
				CuisinePane.this.setLeftAnchor(c2, 270.0 - 6);
				CuisinePane.this.setTopAnchor(c3, 210.0 - 6);
				CuisinePane.this.setLeftAnchor(c3, 270.0 + 2 + 120);
				CuisinePane.this.setTopAnchor(c4, 210.0 + 2 + 120);
				CuisinePane.this.setLeftAnchor(c4, 270.0 + 2 + 120);
			}
		});
		
		im7.setOnMouseEntered(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.HAND);
				
				CuisinePane.this.getChildren().remove(rec13);
				CuisinePane.this.getChildren().remove(rec14);
				CuisinePane.this.getChildren().remove(rec15);
				CuisinePane.this.getChildren().remove(rec16);
				CuisinePane.this.getChildren().remove(c1);
				CuisinePane.this.getChildren().remove(c2);
				CuisinePane.this.getChildren().remove(c3);
				CuisinePane.this.getChildren().remove(c4);
				
				CuisinePane.this.getChildren().addAll(rec13,rec14,rec15,rec16);
				CuisinePane.this.getChildren().addAll(c1,c2,c3,c4);
				
				CuisinePane.this.setTopAnchor(rec13, 210.0 - 6);
				CuisinePane.this.setLeftAnchor(rec13, 440.0);
				CuisinePane.this.setTopAnchor(rec14, 210.0 + 3 + 120);
				CuisinePane.this.setLeftAnchor(rec14, 440.0);
				CuisinePane.this.setTopAnchor(rec15, 210.0);
				CuisinePane.this.setLeftAnchor(rec15, 440.0 - 6);
				CuisinePane.this.setTopAnchor(rec16, 210.0);
				CuisinePane.this.setLeftAnchor(rec16, 440.0 + 3 + 120);
				
				CuisinePane.this.setTopAnchor(c1, 210.0 - 6);
				CuisinePane.this.setLeftAnchor(c1, 440.0 - 6);
				CuisinePane.this.setTopAnchor(c2, 210.0 + 2 + 120);
				CuisinePane.this.setLeftAnchor(c2, 440.0 - 6);
				CuisinePane.this.setTopAnchor(c3, 210.0 - 6);
				CuisinePane.this.setLeftAnchor(c3, 440.0 + 2 + 120);
				CuisinePane.this.setTopAnchor(c4, 210.0 + 2 + 120);
				CuisinePane.this.setLeftAnchor(c4, 440.0 + 2 + 120);
			}
		});
		
		im8.setOnMouseEntered(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.HAND);
				
				CuisinePane.this.getChildren().remove(rec13);
				CuisinePane.this.getChildren().remove(rec14);
				CuisinePane.this.getChildren().remove(rec15);
				CuisinePane.this.getChildren().remove(rec16);
				CuisinePane.this.getChildren().remove(c1);
				CuisinePane.this.getChildren().remove(c2);
				CuisinePane.this.getChildren().remove(c3);
				CuisinePane.this.getChildren().remove(c4);
				
				CuisinePane.this.getChildren().addAll(rec13,rec14,rec15,rec16);
				CuisinePane.this.getChildren().addAll(c1,c2,c3,c4);
				
				CuisinePane.this.setTopAnchor(rec13, 210.0 - 6);
				CuisinePane.this.setLeftAnchor(rec13, 610.0);
				CuisinePane.this.setTopAnchor(rec14, 210.0 + 3 + 120);
				CuisinePane.this.setLeftAnchor(rec14, 610.0);
				CuisinePane.this.setTopAnchor(rec15, 210.0);
				CuisinePane.this.setLeftAnchor(rec15, 610.0 - 6);
				CuisinePane.this.setTopAnchor(rec16, 210.0);
				CuisinePane.this.setLeftAnchor(rec16, 610.0 + 3 + 120);
				
				CuisinePane.this.setTopAnchor(c1, 210.0 - 6);
				CuisinePane.this.setLeftAnchor(c1, 610.0 - 6);
				CuisinePane.this.setTopAnchor(c2, 210.0 + 2 + 120);
				CuisinePane.this.setLeftAnchor(c2, 610.0 - 6);
				CuisinePane.this.setTopAnchor(c3, 210.0 - 6);
				CuisinePane.this.setLeftAnchor(c3, 610.0 + 2 + 120);
				CuisinePane.this.setTopAnchor(c4, 210.0 + 2 + 120);
				CuisinePane.this.setLeftAnchor(c4, 610.0 + 2 + 120);
			}
		});
		
		im9.setOnMouseEntered(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.HAND);
				
				CuisinePane.this.getChildren().remove(rec13);
				CuisinePane.this.getChildren().remove(rec14);
				CuisinePane.this.getChildren().remove(rec15);
				CuisinePane.this.getChildren().remove(rec16);
				CuisinePane.this.getChildren().remove(c1);
				CuisinePane.this.getChildren().remove(c2);
				CuisinePane.this.getChildren().remove(c3);
				CuisinePane.this.getChildren().remove(c4);
				
				CuisinePane.this.getChildren().addAll(rec13,rec14,rec15,rec16);
				CuisinePane.this.getChildren().addAll(c1,c2,c3,c4);
				
				CuisinePane.this.setTopAnchor(rec13, 380.0 - 6);
				CuisinePane.this.setLeftAnchor(rec13, 100.0);
				CuisinePane.this.setTopAnchor(rec14, 380.0 + 3 + 120);
				CuisinePane.this.setLeftAnchor(rec14, 100.0);
				CuisinePane.this.setTopAnchor(rec15, 380.0);
				CuisinePane.this.setLeftAnchor(rec15, 100.0 - 6);
				CuisinePane.this.setTopAnchor(rec16, 380.0);
				CuisinePane.this.setLeftAnchor(rec16, 100.0 + 3 + 120);
				
				CuisinePane.this.setTopAnchor(c1, 380.0 - 6);
				CuisinePane.this.setLeftAnchor(c1, 100.0 - 6);
				CuisinePane.this.setTopAnchor(c2, 380.0 + 2 + 120);
				CuisinePane.this.setLeftAnchor(c2, 100.0 - 6);
				CuisinePane.this.setTopAnchor(c3, 380.0 - 6);
				CuisinePane.this.setLeftAnchor(c3, 100.0 + 2 + 120);
				CuisinePane.this.setTopAnchor(c4, 380.0 + 2 + 120);
				CuisinePane.this.setLeftAnchor(c4, 100.0 + 2 + 120);
			}
		});
		
		im10.setOnMouseEntered(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.HAND);
				
				CuisinePane.this.getChildren().remove(rec13);
				CuisinePane.this.getChildren().remove(rec14);
				CuisinePane.this.getChildren().remove(rec15);
				CuisinePane.this.getChildren().remove(rec16);
				CuisinePane.this.getChildren().remove(c1);
				CuisinePane.this.getChildren().remove(c2);
				CuisinePane.this.getChildren().remove(c3);
				CuisinePane.this.getChildren().remove(c4);
				
				CuisinePane.this.getChildren().addAll(rec13,rec14,rec15,rec16);
				CuisinePane.this.getChildren().addAll(c1,c2,c3,c4);
				
				CuisinePane.this.setTopAnchor(rec13, 380.0 - 6);
				CuisinePane.this.setLeftAnchor(rec13, 270.0);
				CuisinePane.this.setTopAnchor(rec14, 380.0 + 3 + 120);
				CuisinePane.this.setLeftAnchor(rec14, 270.0);
				CuisinePane.this.setTopAnchor(rec15, 380.0);
				CuisinePane.this.setLeftAnchor(rec15, 270.0 - 6);
				CuisinePane.this.setTopAnchor(rec16, 380.0);
				CuisinePane.this.setLeftAnchor(rec16, 270.0 + 3 + 120);
				
				CuisinePane.this.setTopAnchor(c1, 380.0 - 6);
				CuisinePane.this.setLeftAnchor(c1, 270.0 - 6);
				CuisinePane.this.setTopAnchor(c2, 380.0 + 2 + 120);
				CuisinePane.this.setLeftAnchor(c2, 270.0 - 6);
				CuisinePane.this.setTopAnchor(c3, 380.0 - 6);
				CuisinePane.this.setLeftAnchor(c3, 270.0 + 2 + 120);
				CuisinePane.this.setTopAnchor(c4, 380.0 + 2 + 120);
				CuisinePane.this.setLeftAnchor(c4, 270.0 + 2 + 120);
			}
		});
		
		im11.setOnMouseEntered(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.HAND);
				
				CuisinePane.this.getChildren().remove(rec13);
				CuisinePane.this.getChildren().remove(rec14);
				CuisinePane.this.getChildren().remove(rec15);
				CuisinePane.this.getChildren().remove(rec16);
				CuisinePane.this.getChildren().remove(c1);
				CuisinePane.this.getChildren().remove(c2);
				CuisinePane.this.getChildren().remove(c3);
				CuisinePane.this.getChildren().remove(c4);
				
				CuisinePane.this.getChildren().addAll(rec13,rec14,rec15,rec16);
				CuisinePane.this.getChildren().addAll(c1,c2,c3,c4);
				
				CuisinePane.this.setTopAnchor(rec13, 380.0 - 6);
				CuisinePane.this.setLeftAnchor(rec13, 440.0);
				CuisinePane.this.setTopAnchor(rec14, 380.0 + 3 + 120);
				CuisinePane.this.setLeftAnchor(rec14, 440.0);
				CuisinePane.this.setTopAnchor(rec15, 380.0);
				CuisinePane.this.setLeftAnchor(rec15, 440.0 - 6);
				CuisinePane.this.setTopAnchor(rec16, 380.0);
				CuisinePane.this.setLeftAnchor(rec16, 440.0 + 3 + 120);
				
				CuisinePane.this.setTopAnchor(c1, 380.0 - 6);
				CuisinePane.this.setLeftAnchor(c1, 440.0 - 6);
				CuisinePane.this.setTopAnchor(c2, 380.0 + 2 + 120);
				CuisinePane.this.setLeftAnchor(c2, 440.0 - 6);
				CuisinePane.this.setTopAnchor(c3, 380.0 - 6);
				CuisinePane.this.setLeftAnchor(c3, 440.0 + 2 + 120);
				CuisinePane.this.setTopAnchor(c4, 380.0 + 2 + 120);
				CuisinePane.this.setLeftAnchor(c4, 440.0 + 2 + 120);
			}
		});
		
		im12.setOnMouseEntered(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.HAND);
				
				CuisinePane.this.getChildren().remove(rec13);
				CuisinePane.this.getChildren().remove(rec14);
				CuisinePane.this.getChildren().remove(rec15);
				CuisinePane.this.getChildren().remove(rec16);
				CuisinePane.this.getChildren().remove(c1);
				CuisinePane.this.getChildren().remove(c2);
				CuisinePane.this.getChildren().remove(c3);
				CuisinePane.this.getChildren().remove(c4);
				
				CuisinePane.this.getChildren().addAll(rec13,rec14,rec15,rec16);
				CuisinePane.this.getChildren().addAll(c1,c2,c3,c4);
				
				CuisinePane.this.setTopAnchor(rec13, 380.0 - 6);
				CuisinePane.this.setLeftAnchor(rec13, 610.0);
				CuisinePane.this.setTopAnchor(rec14, 380.0 + 3 + 120);
				CuisinePane.this.setLeftAnchor(rec14, 610.0);
				CuisinePane.this.setTopAnchor(rec15, 380.0);
				CuisinePane.this.setLeftAnchor(rec15, 610.0 - 6);
				CuisinePane.this.setTopAnchor(rec16, 380.0);
				CuisinePane.this.setLeftAnchor(rec16, 610.0 + 3 + 120);
				
				CuisinePane.this.setTopAnchor(c1, 380.0 - 6);
				CuisinePane.this.setLeftAnchor(c1, 610.0 - 6);
				CuisinePane.this.setTopAnchor(c2, 380.0 + 2 + 120);
				CuisinePane.this.setLeftAnchor(c2, 610.0 - 6);
				CuisinePane.this.setTopAnchor(c3, 380.0 - 6);
				CuisinePane.this.setLeftAnchor(c3, 610.0 + 2 + 120);
				CuisinePane.this.setTopAnchor(c4, 380.0 + 2 + 120);
				CuisinePane.this.setLeftAnchor(c4, 610.0 + 2 + 120);
			}
		});
		
//--------------------------------------------------------------------------------------------------------------------------------------------------------		
		
		im1.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.DEFAULT);
			}
		});
		
		im2.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.DEFAULT);
			}
		});
		
		im3.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.DEFAULT);
			}
		});
		
		im4.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.DEFAULT);
			}
		});
		
		im5.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.DEFAULT);
			}
		});
		
		im6.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.DEFAULT);
			}
		});
		
		im7.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.DEFAULT);
			}
		});
		
		im8.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.DEFAULT);
			}
		});
		
		im9.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.DEFAULT);
			}
		});
		
		im10.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.DEFAULT);
			}
		});
		
		im11.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.DEFAULT);
			}
		});
		
		im12.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setCursor(Cursor.DEFAULT);
			}
		});
//--------------------------------------------------------------------------------------------------------------------------------------------------------

		
		
		
		
		
		
		
		
		
//--------------------------------------------------------------------------------------------------------------------------------------------------------	
		this.setBackground(new Background(new BackgroundFill(Paint.valueOf("#8B897090"), new CornerRadii(0), new Insets(0))));
		this.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, new CornerRadii(0), new BorderWidths(2))));
		
		this.setPrefHeight(550);
		this.setPrefWidth(840);
	}

	public Effect geteffect() {
		DropShadow ds = new DropShadow();
		
		return ds;
	}
	
}
