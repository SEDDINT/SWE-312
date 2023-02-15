import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Lab4 extends Application  {


    @Override
    public void start(Stage primaryStage) throws Exception {
        
        
        primaryStage.setTitle("Lab 4.1");

        Button button1 = new Button("Start");
        Button button2 = new Button("Stop");
        Button button3 = new Button("Reset");

        FlowPane flowpane = new FlowPane();
        flowpane.setHgap(10);

        flowpane.getChildren().add(button1);
        flowpane.getChildren().add(button2);
        flowpane.getChildren().add(button3);

        Scene scene = new Scene(flowpane, 200, 100);
        primaryStage.setScene(scene);
        primaryStage.show();
        // =====================================================================
        
        Stage stage2 = new Stage();
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER); // Set center alignment
        gridPane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        gridPane.setHgap(5.5);
        gridPane.setVgap(5.5); // Set vGap to 5.5px

        TextField textField1 = new TextField();
        textField1.setPrefColumnCount(15);
        TextField textField2 = new TextField();
        textField2.setPrefColumnCount(15);
        TextField textField3 = new TextField();
        textField3.setPrefColumnCount(15);
                
        // Place nodes in the pane
        gridPane.add(new Label("Hight:"), 0, 0);
        gridPane.add(textField1, 1, 0);
        gridPane.add(new Label("Weight:"), 0, 1); 
        gridPane.add(textField2, 1, 1);
        gridPane.add(new Label("IBM:"), 0, 2);
        gridPane.add(textField3, 1, 2);
        
        Button calculate = new Button("calculate");
        Button clear = new Button("clear");
        Button exit = new Button("exit");
        
        gridPane.add(calculate, 1, 3);
        gridPane.add(clear, 1, 3);
        gridPane.add(exit, 1, 3);
        GridPane.setHalignment(calculate, HPos.LEFT);
        GridPane.setHalignment(clear, HPos.CENTER);
        GridPane.setHalignment(exit, HPos.RIGHT);

        // Create a scene and place it in the stage
        Scene scene2 = new Scene(gridPane);
        stage2.setTitle("Lab 4.2"); // Set the stage title
        stage2.setScene(scene2); // Place the scene in the stage
        stage2.show(); // Display the stage
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}