
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.animation.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;


public class JFXq extends Application {
		int Inputr = 0;
		int Inputc = 0;
		int r = 0;
		int c = 0;

		int[][] enemynum = {
			{0, 0 ,0 , 0} , //1
			{0, 0 ,0 , 0} , //2
			{0, 0 ,0 , 0} , //3
			{0, 0 ,0 , 0} , //4
			{0, 0 ,0 , 0} , //5
			{0, 0 ,0 , 0} , //6
			{0, 0 ,0 , 0} , //7 lose line
		};
		
		String[][] array2 = {
			{"M", "M" ,"M" , "M"} , //1
			{"M", "M" ,"M" , "M"} , //2
			{"M", "M" ,"M" , "M"} , //3
			{"M", "M" ,"M" , "M"} , //4
			{"M", "M" ,"M" , "M"} , //5
			{"M", "M" ,"M" , "M"} , //6
			{"M", "M" ,"M" , "M"} , //7
			{"M", "M" ,"M" , "M"} , //8
		};
		
		int[][] enemynum2 = {
			{0, 0 ,0 , 0} , //1
			{0, 0 ,0 , 0} , //2
			{0, 0 ,0 , 0} , //3
			{0, 0 ,0 , 0} , //4
			{0, 0 ,0 , 0} , //5
			{0, 0 ,0 , 0} , //6
			{0, 0 ,0 , 0} , //7
			{0, 0 ,0 , 0} , //8
			{0, 0 ,0 , 0} , //9 lose line
		};
		
		//fire arrow
		int fAR = 5;
	public static void main(String[] args) {
		
		
		launch(args);
	}
//			   1   2   3   4
//           +---+---+---+---+
//           |MMM|MMM|MMM|MMM| 1
//           +---+---+---+---+
//           |MMM|MMM|MMM|MMM| 2
//           +---+---+---+---+
//           |MMM|MMM|MMM|MMM| 3
//           +---+---+---+---+
//           |MMM|MMM|MMM|MMM| 4
//           +---+---+---+---+
//           |MMM|MMM|MMM|MMM| 5
//           +---+---+---+---+
//           |MMM|MMM|MMM|MMM| 6
//           +---+---+---+---+
//		  	 |__    ___    __|
//			 |  |__|   |__|  |
//           |               |
//			 |_______________|
//
//			   +array 1 line
//         MwM hidden enemy
		/*
		System.out.println("\t  1   2   3   4  ");
		System.out.println("\t+---+---+---+---+");
		System.out.println("\t|M"+ array[0][0] + "M|M"+ array[0][1] + "M|M"+ array[0][2] + "M|M"+ array[0][3] + "M| 1");
		System.out.println("\t+---+---+---+---+");
		System.out.println("\t|M"+ array[1][0] + "M|M"+ array[1][1] + "M|M"+ array[1][2] + "M|M"+ array[1][3] + "M| 2");
		System.out.println("\t+---+---+---+---+");
		System.out.println("\t|M"+ array[2][0] + "M|M"+ array[2][1] + "M|M"+ array[2][2] + "M|M"+ array[2][3] + "M| 3");
		System.out.println("\t+---+---+---+---+");
		System.out.println("\t|M"+ array[3][0] + "M|M"+ array[3][1] + "M|M"+ array[3][2] + "M|M"+ array[3][3] + "M| 4");
		System.out.println("\t+---+---+---+---+");
		System.out.println("\t|M"+ array[4][0] + "M|M"+ array[4][1] + "M|M"+ array[4][2] + "M|M"+ array[4][3] + "M| 5");
		System.out.println("\t+---+---+---+---+");
		System.out.println("\t|M"+ array[5][0] + "M|M"+ array[5][1] + "M|M"+ array[5][2] + "M|M"+ array[5][3] + "M| 6");
		System.out.println("\t+---+---+---+---+");
		System.out.println("\t|__    ___    __|");
		System.out.println("\t|  |__|   |__|  |");
		System.out.println("\t|               |");
		System.out.println("\t|_______________|");
		System.out.println("");
		
			
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("\t  1   2   3   4  ");
			System.out.println("\t+---+---+---+---+");
			int r = 0;
			while (r < 6) {
				int c = 0;
				System.out.print((r+1) + "\t|");
				while (c < 4) {
					System.out.print(GREEN + "M" + RESET);
					if (array[r][c] == "M") {
						System.out.print(GREEN + "M" + RESET);
					}else if (array[r][c] == "+") {
						System.out.print(RED + "+" + RESET);
					}else if (array[r][c] == "w") {
						System.out.print(GREEN + "w" + RESET);
					}else if (array[r][c] == "wF") {
						System.out.print(RED + "x" + RESET);
					}else if (array[r][c] == "O") {
						System.out.print(RED + "O" + RESET);
					}
					System.out.print(GREEN + "M" + RESET);
					System.out.print("|");
					c++;
				}
				r++;
				System.out.println(" ");
				System.out.println("\t+---+---+---+---+");
			}
			System.out.println("\t|__    ___    __|");
			System.out.println("\t|  |__|   |__|  |");
			System.out.println("\t|               |");
			System.out.println("\t|_______________|");
			System.out.println("");
			*/
			
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Archer Defense");
		StackPane pane = new StackPane();
		int[][] enemynum = {
			{0, 0 ,0 , 0} , //1
			{0, 0 ,0 , 0} , //2
			{0, 0 ,0 , 0} , //3
			{0, 0 ,0 , 0} , //4
			{0, 0 ,0 , 0} , //5
			{0, 0 ,0 , 0} , //6
			{0, 0 ,0 , 0} , //7 lose line
		};
		
		Text begin = new Text(0,0,
			"Objective: Defend the Castle\n" + //
			"\n" + //
			"Your lord's castle is being attacked.\n" + //
			"It is night and you are the only stationed guard on\n" + 
			"the Southern Wall. Spot the enemies in the grass\n" + //
			"and take them out before they reach the castle.");
		begin.setFont(Font.font("Arial", 20));
	
			
		Button Tbtn = new Button("Tutorial");
        //Button Hbtn = new Button("---");
        //Button Rbtn = new Button("---");

        HBox hBox = new HBox();
        hBox.setSpacing(50);
        hBox.setAlignment(Pos.BOTTOM_CENTER);
        hBox.setTranslateY(-20);



        
        pane.getChildren().add(begin);
        hBox.getChildren().add(Tbtn);
        //hBox.getChildren().add(Hbtn);
        //hBox.getChildren().add(Rbtn);

        pane.getChildren().add(hBox);
        StackPane.setAlignment(hBox, Pos.CENTER);
        

        primaryStage.setScene(new Scene(pane, 500, 1000));
        primaryStage.show();


        Tbtn.setOnAction(e -> {
            pane.setVisible(false);
            tutorial(primaryStage);
        });
	}
	
	
	
	public static void wait(int ms)
	{
		try
		{
			Thread.sleep(ms);
		}
		catch(InterruptedException ex)
		{
			Thread.currentThread().interrupt();
		}
	}
	
	
	
	//TUTORIAL 1
	public void tutorial(Stage primaryStage) {
		primaryStage.setTitle("Tutorial");
        StackPane tpane = new StackPane();
		primaryStage.setScene(new Scene(tpane, 500, 1000));
		int win = 0;
		int lose = 0;
		int end = 0;
		int first1message = 0;
		int Shootr = 0;
		int Shootc = 0;
		int winning = 0;
		//Image Soldier = new Image(getClass().getResourceAsStream("sold.png"));
		//Image Soldier = new Image(getClass().getClassLoader().getResource("sold.png").toString(), true);
		Image Soldier = new Image("sold.png");
		//Image MercenaryHid = new Image(getClass().getResourceAsStream("mercH.png"));
		//Image Mercenary = new Image(getClass().getResourceAsStream("merc.png"));
		//Image Knight = new Image(getClass().getResourceAsStream("knight.png"));
		Button grass = new Button();
		grass.setPrefWidth(125);
		grass.setPrefHeight(125);
		
		grass.setGraphic(new ImageView(Soldier));
		tpane.getChildren().add(grass);
		grass.setStyle("-fx-background-color: Green");
		
		}
	
}