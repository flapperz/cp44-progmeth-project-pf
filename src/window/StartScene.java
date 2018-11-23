package window;

import javafx.animation.Timeline;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.BoxBlur;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;

public class StartScene extends Scene {
	
	private Pane root;
	private Canvas canvas;
	private Button startBtn;
	private Label pressLa;
	private Label startLa;
	private Timeline screenloop;
	
	public StartScene() {
		super(new Pane(), 1200, 700);
		root = (Pane) getRoot();
		
		canvas = new Canvas(1200, 700);
		GraphicsContext gc = canvas.getGraphicsContext2D();
		Image bg = new Image("bg.jpg");
		gc.setEffect(new BoxBlur(2 * 2, 2 * 2, 3));
		gc.drawImage(bg, 0, 0,1200,750);
		
		
		/*startBtn = new Button("Start");
		startBtn.setStyle(
			"-fx-background-color: #ffffff;");
		startBtn.setLayoutX(570);
		startBtn.setLayoutY(300);*/
		
		startLa = new Label("GangRocket");
		startLa.setLayoutX(450);
		startLa.setLayoutY(250);
		startLa.setStyle("-fx-font-size: 50px;" + "-fx-alignment:center;" +
				"-fx-text-fill: #ffffff;");
		
		pressLa = new Label("press any key to start");
		pressLa.setLayoutX(450);
		pressLa.setLayoutY(350);
		pressLa.setStyle("-fx-font-size: 30px;" + "-fx-alignment:center;" +
				"-fx-text-fill: #ffffff;");
		
		//gc.fillRect(0, 0,100, 100);
		screenloop = new Timeline();
		screenloop.setCycleCount(30);
		
		root.getChildren().addAll(canvas,startLa,pressLa);
	}

}
