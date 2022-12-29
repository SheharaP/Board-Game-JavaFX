package com.mspan.guigame.BoardSetting;

import com.mspan.guigame.BoardEntities.Ladder;
import com.mspan.guigame.BoardEntities.Snake;

import java.util.ArrayList;
import java.util.HashMap;

public class Board {

    //TODO: Access modifiers: Make things private and accessible via accessors as necessary
    //TODO: Types: Use types which are at higher ups in inheritance hierarchy.
    //TODO: Static: Don't misuse static keyword
    private HashMap<Integer, ArrayList<Integer>> board = new HashMap<>();

    private HashMap<Integer, Ladder> ladders = new HashMap<>();
    private HashMap<Integer, Snake> snakes = new HashMap<>();

    public HashMap<Integer, ArrayList<Integer>> getBoard() {
        return board;
    }

    public HashMap<Integer, Ladder> getLadders() {
        return ladders;
    }

    public HashMap<Integer, Snake> getSnakes() {
        return snakes;
    }

    //TODO: Why not modifying the access of this?
    Tile tile = new Tile(43, 572, 50, 50);
    private final int rows = 10;
    private final int cols = 10;

    public Board() {
        //TODO: Mark the variables which won't be reassigned, final
        final ArrayList<Integer> arr = new ArrayList<>();
        arr.add(tile.getTileStart());
        arr.add(tile.getTileEnd());
        System.out.println(arr);
        board.put(0, arr);

        int count = 1;
            for(int y = 0; y < cols; y++){

                if(y%2 == 0){
                    for(int x = 1; x <= rows; x++){

                        ArrayList<Integer> tempArray = new ArrayList<>();
                        tempArray.add(tile.getTileStart() + ((x - 1) * tile.getNextTileX()));
                        if(x == 1){
                            tile.setTileEnd(tile.getTileEnd() - tile.getNextTileY());
                        }
                        tempArray.add(tile.getTileEnd());
                        board.put(count, tempArray);
                        System.out.println(board);
                        count++;
                    }
                }
                else{
                    for(int x = rows; x >= 1; x--){

                        ArrayList<Integer> tempArray = new ArrayList<>();
                        tempArray.add(tile.getTileStart() + ((x - 1) * tile.getNextTileX()));
                        if(x == rows){
                            tile.setTileEnd(tile.getTileEnd() - tile.getNextTileY());
                        }
                        tempArray.add(tile.getTileEnd());
                        board.put(count, tempArray);
                        System.out.println(board);
                        count++;
                    }
                }

            }

        //TODO: Enhancement: Think of a way to make this customisable (may be a game with multiple levels?)
        ladders.put(4, new Ladder(4, 25));
        ladders.put(21, new Ladder(21, 39));
        ladders.put(29, new Ladder(29, 74));
        ladders.put(43, new Ladder(43, 76));
        ladders.put(63, new Ladder(63, 80));
        ladders.put(71, new Ladder(71, 89));

        snakes.put(30, new Snake(30, 7));
        snakes.put(47, new Snake(47, 15));
        snakes.put(56, new Snake(56, 19));
        snakes.put(73, new Snake(73, 51));
        snakes.put(82, new Snake(82, 42));
        snakes.put(92, new Snake(92, 75));
        snakes.put(98, new Snake(98, 55));


    }

}
