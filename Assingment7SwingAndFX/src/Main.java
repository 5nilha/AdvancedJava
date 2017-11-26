import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		Button button = new Button("Click me");

		Label label = new Label("Enter your name:");
		TextField nameField = new TextField();

		ToggleGroup group = new ToggleGroup();
		RadioButton button1 = new RadioButton("Select First");

		button1.setToggleGroup(group);
		button1.setSelected(true);
		RadioButton button2 = new RadioButton("Select Second");
		button2.setToggleGroup(group);

		FlowPane pane = new FlowPane();
		pane.getChildren().addAll(button, label, nameField, button1, button2);

		Scene scene = new Scene(pane, 400, 400);

		primaryStage.setScene(scene);
		primaryStage.setTitle("All the world's a stage");
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}
