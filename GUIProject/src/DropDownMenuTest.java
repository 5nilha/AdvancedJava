import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DropDownMenuTest extends Application {

    public static void main (String [] args) {

        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        //DropDown menu
        ChoiceBox<String> choiceBox = new ChoiceBox();
        choiceBox.getItems().addAll("Red", "Blue", "Pink", "Green");

        choiceBox.setValue("Blue");

        Button button = new Button("Click here");
        button.setOnAction(e-> buttonClicked(choiceBox));




        VBox vBox = new VBox(10);
        vBox.setPadding(new Insets(20, 20, 20, 20));
        vBox.getChildren().addAll(choiceBox, button);

        //Add the choiceBox/ DrooDown menu to the scene
        Scene scene = new Scene(vBox, 200, 200);

        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public void buttonClicked(ChoiceBox<String> choiceBox) {

        String message = choiceBox.getValue();
        System.out.println(message);

    }
}
