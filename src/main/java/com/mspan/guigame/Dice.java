package com.mspan.guigame;

import java.util.Random;

public class Dice {

    int diceValue;

    public int rollDice(){
        Random random = new Random();
        this.diceValue = random.nextInt(6 - 1 + 1) + 1;
        return this.diceValue;
    }


}
