package tech.numind.stagesize;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Button button = new Button("Open popup");
        button.setOnAction(e -> {
            Scene scene = new Scene(new Label("Hello, world"));
            Stage child = new Stage();
            child.setScene(scene);
            child.setMinHeight(40);
            child.setMinWidth(40);
            child.setHeight(800);
            child.setWidth(800);
            child.show();

        });
        Scene scene = new Scene(button, 800, 800);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}