import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CheckBoxTest extends Application {

    public static void main (String [] args) {


        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {

        CheckBox checkBox1 = new CheckBox("Red");
        CheckBox checkBox2 = new CheckBox("Green");

        Button button = new Button("Click");
        button.setOnAction(e-> checkAction(checkBox1, checkBox2));



        VBox vBox = new VBox(10);
        vBox.setPadding(new Insets(10, 10 ,10, 10));
        vBox.getChildren();
        vBox.getChildren().addAll(checkBox1, checkBox2, button);

        Scene scene = new Scene(vBox, 200, 200);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    private void checkAction(CheckBox checkBox1, CheckBox checkBox2){

        String message = "";

        if (checkBox1.isSelected()) {
            message += " Red";
        }

       if (checkBox2.isSelected()) {
            message += " Green";
        }

        System.out.println(message);

    }

}




