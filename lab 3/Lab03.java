package lab03;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.text.*;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Lab03 extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a HBox
            HBox hBox = new HBox(10);
            hBox.setPadding(new Insets(10, 10, 10, 10));
            hBox.setAlignment(Pos.CENTER);
             
		// Create text and Set a random color and opacity and degree of rotation
                for (int i = 0; i < 8; i++) { 
                    Text text = new Text(); 
                    text.setText("hello java");
                    text.setRotate(Math.random() * 91);
                    text.setFill(new Color(Math.random(), Math.random(), Math.random(), 1.0));

                    hBox.getChildren().add(text);	
            }
                  
                


                    // Create a scene and place it in the stage
                Scene scene = new Scene(hBox, 300, 100);
                primaryStage.setTitle("Lab03"); // Set the stage title
                primaryStage.setScene(scene); // Place the scene in the stage
                primaryStage.show(); // Display the stage
            
	}


         public static void main(String args[]){ 
            launch(args); 
   } 
}
