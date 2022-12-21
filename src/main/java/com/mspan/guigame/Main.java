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

        try {
            Parent root = FXMLLoader.load(getClass().getResource("startScreen.fxml")); //root node of scene
            Scene scene = new Scene(root, 560, 750);
            stage.setTitle("Snakes and Ladder Board Game");
            stage.setScene(scene);
            stage.show();

            Board game = new Board();
            p1 = new Player(pc, "blue");
            p2 = new Player(pc, "green");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void startNewGame() {

        Thread thread = new Thread() {
            @Override
            public void run() {
                pc.resetDice();
                p1.playerReset();
                p2.playerReset();

                while (p1.getPlayerPosition() != 100 && p2.getPlayerPosition() != 100) {
                    try {
                        while (pc.getDiceValue() == 0) {
                            sleep(500);
                        }
                        System.out.println("Player 1 position");
                        pc.movePlayer(p1);
                        pc.resetDice();
                        System.out.println(p1.getPlayerPosition());
                        sleep(1500);

                        if(p1.getPlayerPosition() == 100 || p2.getPlayerPosition() == 100) {
                            Player winner = p1.getPlayerPosition() == 100 ? p1 : p2;
                            try {
                                pc.getWinScreen(winner);
                            } catch (InterruptedException | IOException e) {
                                e.printStackTrace();
                            }

                            break;
                        }
                        while (pc.getDiceValue() == 0) {
                            sleep(500);
                        }

                        System.out.println("Player 2 position");
                        pc.movePlayer(p2);
                        pc.resetDice();
                        System.out.println(p2.getPlayerPosition());
                        sleep(1500);


                        if(p1.getPlayerPosition() == 100 || p2.getPlayerPosition() == 100) {
                            Player winner = p1.getPlayerPosition() == 100 ? p1 : p2;
                            try {
                                pc.getWinScreen(winner);
                            } catch (InterruptedException | IOException e) {
                                e.printStackTrace();
                            }

                            break;
                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }

            }
        };
        thread.start();

    }

    public static void main(String[] args) {
        launch();
    }
}