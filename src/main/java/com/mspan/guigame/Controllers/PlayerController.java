package com.mspan.guigame.Controllers;

import com.mspan.guigame.BoardSetting.Board;
import com.mspan.guigame.BoardEntities.Ladder;
import com.mspan.guigame.BoardEntities.Snake;
import com.mspan.guigame.BoardSetting.Dice;
import com.mspan.guigame.BoardEntities.Player;
import javafx.animation.SequentialTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
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
    Board gameBoard = new Board();
    public void animatePlayer(Player p, int newPlayerPosition, SequentialTransition st){

        TranslateTransition translate = new TranslateTransition(Duration.seconds(0.25), piece);

        int xc = gameBoard.getBoard().get(p.getPlayerPosition()).get(0);
        int yc = gameBoard.getBoard().get(p.getPlayerPosition()).get(1);
        p.setChangedPosition(newPlayerPosition);
        int x0 = gameBoard.getBoard().get(newPlayerPosition).get(0);
        int y0 = gameBoard.getBoard().get(newPlayerPosition).get(1);


        translate.setByY(y0 - yc);
        translate.setByX(x0 - xc);

        st.getChildren().add(translate);
    }

    public void movePlayer(Player p) throws InterruptedException {

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

            int xc = gameBoard.getBoard().get(i - 1).get(0);
            int yc = gameBoard.getBoard().get(i - 1).get(1);

            int x0 = gameBoard.getBoard().get(i).get(0);
            int y0 = gameBoard.getBoard().get(i).get(1);

            translate.setByX(x0 - xc);
            translate.setByY(y0 - yc);
            st.getChildren().add(translate);
        }

        if (gameBoard.getLadders().containsKey(p.getPlayerPosition())) {
            Ladder gameLadder = gameBoard.getLadders().get(p.getPlayerPosition());
            int newPlayerPosition = gameLadder.getEnd();
            System.out.println("Ladder ends at " + newPlayerPosition);

            //TODO: Following lines appear to be duplicated. Read about DRY?
            animatePlayer(p, newPlayerPosition, st);
        }

        if (gameBoard.getSnakes().containsKey(p.getPlayerPosition())) {
            Snake snake = gameBoard.getSnakes().get(p.getPlayerPosition());
            int newPosition = snake.getEnd();
            System.out.println("Snake ends at " + newPosition);

            animatePlayer(p, newPosition, st);
        }

        st.play();
    }

    @FXML
    public void diceThrow(ActionEvent event) {
        diceValue = dice.rollDice();
        throwDice.setText(Integer.toString(diceValue));
        System.out.println("Dice value = " + diceValue);
    }
    public int getDiceValue() {
        return diceValue;
    }

    public void resetDiceValue() {
        this.diceValue = 0;
    }

    @FXML
    public void getWinScreen(Player winner) throws InterruptedException, IOException {
        sleep(500);
        if (winner.getColor().equals("blue")) {
            blueWin.setLayoutX(80);
            blueWin.setLayoutY(142);
        } else {
            greenWin.setLayoutX(80);
            greenWin.setLayoutY(142);
        }
        sleep(3000);
    }

}
