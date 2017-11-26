import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class UsefulGUI extends Application {

	public static void main(String[] args) {
		
		launch(args);
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Pane pane = new Pane();
		pane.setPadding(new Insets(20, 20, 20, 20));
		
		Button button = new Button("Enter your info");
		button.setOnAction(e -> btnClicked());
		
		pane.getChildren().add(button);
		
		Scene scene = new Scene(pane);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public void btnClicked() {
		
		openDialog();

		
	}
	
	public void openDialog() {
		Dialog dialog = new Dialog();
		
		GridPane grid = new GridPane();
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(20, 15, 10, 10));
		
		TextField name = new TextField();
		name.setPromptText("Enter your name");
		TextField email = new TextField();
		email.setPromptText("Enter your email");
		TextField phone = new TextField();
		phone.setPromptText("Enter your phone");
		
		Button buttonOK = new Button("Ok");
		Button buttonCancel = new Button("Cancel");
		
		buttonOK.setOnAction(e -> System.out.println(name.getText().toString() + "          " + email.getText().toString() + "          " + phone.getText().toString()));
		buttonCancel.setOnAction(e -> dialog.hide());
		
		grid.add(new Label("Name"), 0, 0);
		grid.add(name, 1, 0);
		grid.add(new Label("Email"), 0, 1);
		grid.add(email, 1, 1);
		grid.add(new Label("Phone"), 0, 2);
		grid.add(phone, 1, 2);
		grid.add(buttonCancel, 0, 3);
		
		//Closing the dialog button
		dialog.getDialogPane().getButtonTypes().add(ButtonType.CLOSE);
		Node closeButton = dialog.getDialogPane().lookupButton(ButtonType.CLOSE);
		closeButton.managedProperty().bind(closeButton.visibleProperty());
		closeButton.setVisible(false);
		
		dialog.setHeaderText("Insert your information");
		dialog.getDialogPane().setContent(grid);
		dialog.showAndWait();
		
	}
}
