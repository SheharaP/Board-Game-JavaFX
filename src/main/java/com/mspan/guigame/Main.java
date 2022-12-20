package com.mspan.guigame;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import static java.lang.Thread.sleep;

public class Main extends Application {

    static Player p1;
    static Player p2;

    static PlayerController pc;

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("startScreen.fxml")); //root node of scene
        Scene scene = new Scene(root, 560, 750);
        stage.setTitle("Snakes and Ladder Board Game");
        stage.setScene(scene);
        stage.show();

        Board game = new Board();
        p1 = new Player(pc, "blue");
        p2 = new Player(pc, "green");
    }

    public static void startNewGame() {

        pc.resetDice();
        pc.movePlayer(p1);

    }

    public static void main(String[] args) {
        launch();
    }
}