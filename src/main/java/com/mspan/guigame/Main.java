package com.mspan.guigame;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    static PlayerController pc;
    static Player p1;
    static Player p2;

    @Override
    public void start(Stage stage) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("startScreen.fxml")); //root node of scene
        Scene scene = new Scene(root, 560, 750);
        stage.setTitle("Snakes and Ladder Board Game");
        stage.setScene(scene);
        stage.show();

        Game game = new Game();
        p1 = new Player(pc, "blue");
        p2 = new Player(pc, "green");
    }

    public static void startNewGame(boolean start) {
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    pc.movePlayer(p1);

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        };
        thread.start();
    }
    public static void main(String[] args) {
        launch();
    }
}