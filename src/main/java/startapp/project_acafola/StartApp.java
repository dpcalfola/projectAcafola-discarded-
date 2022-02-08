package startapp.project_acafola;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class StartApp extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader root = new FXMLLoader(StartApp.class.getResource("login-view.fxml"));
        Scene scene = new Scene(root.load(), 1280, 720);
        primaryStage.setTitle("AcaFola");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}