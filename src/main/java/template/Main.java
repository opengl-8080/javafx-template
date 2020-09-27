package template;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(Main.class, args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        final Parent parent = FXMLLoader.load(Main.class.getResource("/fxml/main.fxml"));
        final Scene scene = new Scene(parent);
        primaryStage.setTitle("Template");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}