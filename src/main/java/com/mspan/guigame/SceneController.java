package com.mspan.guigame;

//TODO: Interesting read about unused imports: https://stackoverflow.com/a/979069
import com.mspan.guigame.Main;
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
    private ImageView start;

    @FXML
    void mouseOffStart(MouseEvent event) {
        start.setLayoutY(428);
        start.setLayoutX(180);
        start.setFitHeight(48);
        start.setFitWidth(200);
    }

    @FXML
    void mouseOnStart(MouseEvent event) {
        start.setLayoutY(424);
        start.setLayoutX(180);
        start.setFitHeight(52.8);
        start.setFitWidth(220);
    }

    @FXML
    void switchToStart(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("gameScreen.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        Main.startNewGame();
        Main.pc = loader.getController();
    }
}
