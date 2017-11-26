import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneLayout extends Application{

    public static void main (String[] args) {

        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {


        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(8, 8, 8, 8));

        gridPane.setVgap(10); // vertical gap
        gridPane.setHgap(10); // Horizontal gap

        Label nameLabel = new Label("Name");
        GridPane.setConstraints(nameLabel, 0, 0);

        TextField nameText = new TextField("Enter name here!");
        GridPane.setConstraints(nameText, 1, 0);

        Label passwordLabel = new Label("Password");
        GridPane.setConstraints(passwordLabel, 0, 1);

        TextField passwordText = new TextField("Enter Password!");
        GridPane.setConstraints(passwordText, 1, 1);

        Button button = new Button("Login");
        GridPane.setConstraints(button, 1, 2);
        button.setOnAction(e-> validadePassword(passwordText));




        gridPane.getChildren().addAll(nameLabel, nameText, passwordLabel, passwordText, button);

        Scene scene = new Scene(gridPane, 250, 250);

        primaryStage.setScene(scene);
        primaryStage.show();

    }

    private void validadePassword (TextField password) {
        String newPassword = password.getText(); // Extract the text from the text field

        if( newPassword.equals("admin123")) {
            System.out.println("Valid User");
        }
        else {
            System.out.println("Not a valid user");
        }

    }
}
