package com.mspan.guigame.BoardEntities;

import com.mspan.guigame.Controllers.PlayerController;

//TODO: Format the source code. Keep things neat and tidy
public class Player {

    private final String color;
    private boolean joinedGame;
    private int position;
    private final PlayerController pc;

    public Player(PlayerController pc, String playerColor) {
        this.position = 0;
        this.pc = pc;
        this.color = playerColor;
        this.joinedGame = false;
    }

    public void playerReset() {
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
