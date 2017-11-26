import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MultipleButtonsTest extends Application{


    Button button1 = new Button();
    Button button2 = new Button();

    public static void main (String args[]){

        launch(args);

    }

    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("My Application");
        button1.setText("Button1");
        button2.setText("Button2");

        Pane layout = new Pane();  // Creates the layout
        layout.getChildren().add(button1);  // Add the button1 to the layout
        layout.getChildren().add(button2);  // Add the button2 to the layout

        button1.setLayoutX(150); // Set the coordinates on the X-axis to the button1
        button1.setLayoutY(100); // Set the coordinates on the Y-axis to the button1

        button2.setLayoutX(150);
        button2.setLayoutY(200);

        button1.setOnAction(e-> System.out.println("the button1 was clicked"));
        button2.setOnAction(e-> System.out.println("The button2 was clicked"));

        Scene scene = new Scene(layout, 400, 400);  // Creates the window /scene and pass the layout of the scene and the width and the height
        primaryStage.setScene(scene);  //Set the stage to the scene
        primaryStage.show(); // Shows the window


    }
}
