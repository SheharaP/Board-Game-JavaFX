package com.mspan.guigame.BoardSetting;

import java.util.Random;

public class Dice {

    int diceValue;

    public int rollDice(){
        Random random = new Random(); //TODO: This can be reused
        this.diceValue = random.nextInt(6 - 1 + 1) + 1;
        return this.diceValue;
    }
}
