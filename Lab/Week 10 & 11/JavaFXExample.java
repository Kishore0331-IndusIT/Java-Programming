import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFXExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a label
        Label label = new Label("Enter your name:");

        // Create a text field for user input
        TextField textField = new TextField();

        // Create a button that, when clicked, updates the label with text from the text field
        Button button = new Button("Greet Me");

        // Action handler for the button
        button.setOnAction(e -> {
            String name = textField.getText();
            label.setText("Hello, " + name + "!");
        });

        // Layout the components using VBox (Vertical Box)
        VBox layout = new VBox(10); // 10px vertical spacing between elements
        layout.setPadding(new Insets(20)); // Add padding around the edges
        layout.getChildren().addAll(label, textField, button);

        // Create a scene and add it to the stage
        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setTitle("JavaFX Example");
        primaryStage.setScene(scene);
        primaryStage.show(); // Display the stage
    }

    public static void main(String[] args) {
        // Launch the JavaFX application
        launch(args);
    }
}
