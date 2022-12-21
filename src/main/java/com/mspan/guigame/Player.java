package com.mspan.guigame;

public class Player {

    private final String color;
    private boolean joinedGame;
    private int position;
    private PlayerController pc;

    Player(PlayerController pc, String playerColor) {
        this.position = 0;
        this.pc = pc;
        this.color = playerColor;
        this.joinedGame = false;
    }

    void playerReset() {
        this.position = 0;
        this.joinedGame = false;
    }

    public int getPlayerPosition() {
        return this.position;
    }

    public void setPlayerPosition(int val) {
        this.position += val;
    }

    public void setChangedPosition(int val) {
        this.position = val;
    }

    public String getColor() {
        return this.color;
    }

    public boolean joinGame() {
        return this.joinedGame;
    }

    public void setJoinedGame() {
        this.joinedGame = true;
    }


}
