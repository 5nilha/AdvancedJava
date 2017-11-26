import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class SwitchScene extends Application {

    Stage stage;
    Scene mango;
    Scene banana;

    public static void main (String[] args){

        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        stage = new Stage();
        stage = primaryStage;

        Label mangoLabel = new Label("This is a mango scene");
        Button mangoButton = new Button("Switch to banana");
        mangoButton.setOnAction(e-> stage.setScene(banana));   // Redirect to banana scene

        StackPane mangoWindow = new StackPane(); // create mango window view
        mangoWindow.getChildren().addAll(mangoLabel, mangoButton); // add the mangoButton and the MangoLabel to the mango window view
        mango = new Scene(mangoWindow, 200, 200);

        Label bananaLabel = new Label("This is banana scene");

        StackPane bananaWindow = new StackPane();  //Create banana window view
        bananaWindow.getChildren().add(bananaLabel); // add bananaLabel to the banana window view
        banana = new Scene(bananaWindow, 200, 200);

        stage.setScene(mango);  // Set the stage/ main window
        stage.show(); // Show window

    }
}
