package com.mspan.guigame;

import javafx.animation.SequentialTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;

import java.util.Random;

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
    private Button throwDice;

    private ImageView piece;
    private int diceValue;
    Dice dice = new Dice();

    public void movePlayer(Player p) {

        //
//        if (p.getColor().equals("blue")) {
//            piece = blue;
//        } else {
//            piece = green;
//        }
        //if (!p.joinGame() && diceValue != 0) return;

        //if (p.getPlayerPosition() + diceValue < 100){

        //FIX player moves
        int currentPosition = p.getPlayerPosition();
        p.setPlayerPosition(currentPosition + this.diceValue);


        System.out.println(p.getPlayerPosition());

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

        st.play();

        //}
    }

    @FXML
    public void diceThrow(MouseEvent mouseEvent) {

        this.diceValue = dice.rollDice();
        throwDice.setText(Integer.toString(this.diceValue));
    }

    public int getDiceValue() {
        return this.diceValue;
    }

    public void resetDice() {
        diceValue = 0;
    }
}
