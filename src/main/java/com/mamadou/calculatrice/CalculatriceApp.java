package com.mamadou.calculatrice;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CalculatriceApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CalculatriceApp.class.getResource("calculatriceView.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
//        URL url = HelloApplication.class.getResource("/css/style.css");
//        scene.getStylesheets().add(url.getPath());
        stage.setTitle("Calculatrice");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}