import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertBoxTest extends Application {

    Button button = new Button("Button1");

    public static void main (String[] args) {

        launch(args);

    }

    public void start(Stage primaryStage) throws Exception{

        button.setOnAction(e-> Alert.display("My Title Message", "Hello World"));
        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 200 , 200);
        primaryStage.setScene(scene);
        primaryStage.show();


    }


}

class Alert {

    public static void display(String title, String message){
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);

        stage.setTitle("Alert Box");
        stage.setMinWidth(300);

        Label label = new Label();
        label.setText(message);

        Button button = new Button("Ok");
        button.setOnAction(e-> stage.close());

        VBox vBox = new VBox();
        vBox.getChildren().addAll(label, button);

        vBox.setAlignment(Pos.CENTER);

        Scene scene = new Scene(vBox);
        stage.setScene(scene);
        stage.showAndWait();


    }

}
