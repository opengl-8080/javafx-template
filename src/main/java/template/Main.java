package template;

import gl.javafx.FxWindow;
import gl.javafx.Fxml;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(Main.class, args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        final Fxml<?, Parent> fxml = Fxml.load("/fxml/main.fxml");
        FxWindow.newWindow(fxml)
                .title("Template")
                .show();
    }
}