package com.mspan.guigame;

import javafx.animation.SequentialTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

import java.io.IOException;

import static java.lang.Thread.sleep;

public class PlayerController {

    @FXML
    ImageView player1;

    @FXML
    ImageView player2;
    @FXML
    ImageView blue;
    @FXML
    ImageView green;
    @FXML
    ImageView blueWin;

    @FXML
    ImageView greenWin;
    @FXML
    private Button throwDice;

    private ImageView piece;
    private int diceValue;
    Dice dice = new Dice();

    public void movePlayer(Player p) {

        if (p.getColor().equals("blue")) {
            piece = blue;
        } else {
            piece = green;
        }

        if (!p.joinGame() && diceValue != 1) return;

        if (p.getPlayerPosition() + diceValue > 100) return;

        p.setJoinedGame();

        int currentPosition = p.getPlayerPosition();
        p.setPlayerPosition(diceValue);

        System.out.println("player position = " + p.getPlayerPosition());

        SequentialTransition st = new SequentialTransition();

        for (int i = currentPosition + 1; i <= p.getPlayerPosition(); i++) {
            TranslateTransition translate = new TranslateTransition(Duration.seconds(0.25), piece);

            int xc = Board.board.get(i - 1).get(0);
            int yc = Board.board.get(i - 1).get(1);

            int x0 = Board.board.get(i).get(0);
            int y0 = Board.board.get(i).get(1);


            translate.setByX(x0 - xc);
            translate.setByY(y0 - yc);
            st.getChildren().add(translate);

        }

        if (Board.ladders.containsKey(p.getPlayerPosition())) {
            Ladder gameLadder = Board.ladders.get(p.getPlayerPosition());
            int newPlayerPosition = gameLadder.end;
            System.out.println("Ladder ends at " + newPlayerPosition);

            TranslateTransition translate = new TranslateTransition(Duration.seconds(0.25), piece);

            int xc = Board.board.get(p.getPlayerPosition()).get(0);
            int yc = Board.board.get(p.getPlayerPosition()).get(1);
            p.setChangedPosition(newPlayerPosition);
            int x0 = Board.board.get(newPlayerPosition).get(0);
            int y0 = Board.board.get(newPlayerPosition).get(1);


            translate.setByY(y0 - yc);
            translate.setByX(x0 - xc);

            st.getChildren().add(translate);
        }

        if (Board.snakes.containsKey(p.getPlayerPosition())) {
            Snake snake = Board.snakes.get(p.getPlayerPosition());
            int newPosition = snake.end;
            System.out.println("Snake ends at " + newPosition);

            TranslateTransition translate = new TranslateTransition(Duration.seconds(0.25), piece);

            int xc = Board.board.get(p.getPlayerPosition()).get(0);
            int yc = Board.board.get(p.getPlayerPosition()).get(1);
            p.setChangedPosition(newPosition);
            int x0 = Board.board.get(newPosition).get(0);
            int y0 = Board.board.get(newPosition).get(1);


            translate.setByY(y0 - yc);
            translate.setByX(x0 - xc);

            st.getChildren().add(translate);
        }

        st.play();
    }

    @FXML
    public void diceThrow() {
        diceValue = dice.rollDice();
        throwDice.setText(Integer.toString(diceValue));
        System.out.println("Dice value = " + diceValue);
    }

    public int getDiceValue() {
        return diceValue;
    }

    public void resetDice() {
        this.diceValue = 0;
    }

    @FXML
    public void getWinScreen(Player winner) throws InterruptedException, IOException {
        sleep(500);
        if(winner.getColor().equals("blue")) {
            blueWin.setLayoutX(80);
            blueWin.setLayoutY(142);
        } else {
            greenWin.setLayoutX(80);
            greenWin.setLayoutY(142);
        }
        sleep(3000);
    }

}
