package com.example.demo4.Controladores;

import com.example.demo4.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Main {

    private Stage stage;
    private Scene scene;
    private FXMLLoader root;


    public void switchScene1(ActionEvent event) throws IOException {
        FXMLLoader root = new FXMLLoader(HelloApplication.class.getResource("SeleccionPersonajes.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root.load());
        stage.setScene(scene);
        stage.show();
    }

}
