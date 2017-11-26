import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class Demo extends Application {

    Button button = new Button();  //Create a button

    public static void main (String[] args){

        launch(args);


    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("This is a title"); //Set the title of the window
        button.setText("This is a button");  //Set the name of the button
        button.setOnAction(e-> System.out.println("Button is clicked"));

        StackPane stackPane = new StackPane(); // Create a layout

        stackPane.getChildren().add(button); // Add the button to the layout
        Scene scene = new Scene(stackPane, 400, 400); // Create a scene on the stage / window
        primaryStage.setScene(scene); // set the scene on teh window
        primaryStage.show();  // show the window
    }


}
