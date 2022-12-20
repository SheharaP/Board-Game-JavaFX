package com.mspan.game;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneController {

    @FXML
    private ImageView credits;

    @FXML
    private ImageView exit;

    @FXML
    private ImageView multi;

    @FXML
    private ImageView rules;

    @FXML
    private ImageView single;

    @FXML
    void mouseOffStart(MouseEvent event) {
        multi.setLayoutY(428);
        multi.setLayoutX(180);
        multi.setFitHeight(48);
        multi.setFitWidth(200);
    }

    @FXML
    void mouseOnStart(MouseEvent event) {
        multi.setLayoutY(424);
        multi.setLayoutX(180);
        multi.setFitHeight(52.8);
        multi.setFitWidth(220);
    }

    @FXML
    void switchToStart(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("gameScreen.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        Main.startNewGame(false);
        Main.pc = (PlayerController) loader.getController();
    }
}
