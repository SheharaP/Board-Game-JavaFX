package com.mspan.guigame;

import java.util.ArrayList;
import java.util.HashMap;

public class Board {

    public static HashMap<Integer, ArrayList<Integer>> board = new HashMap<>();

    Tile tile = new Tile(43, 572, 50,50);

    public Board() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(tile.getTileStart());
        arr.add(tile.getTileEnd());
        System.out.println(arr);
        board.put(0, arr);

        for (int i = 1; i <= 10; i++) {
            ArrayList<Integer> x = new ArrayList<>();
            x.add(tile.getTileStart() + ((i - 1) * tile.getNextTileX()));
            if(i == 1){
                tile.setTileEnd(tile.getTileEnd() - tile.getNextTileY());
            }
            x.add(tile.getTileEnd());
            board.put(i, x);
        }

        for (int i = 1; i <= 10; i++) {
            ArrayList<Integer> x = new ArrayList<>();
            x.add(tile.getTileStart() + ((i - 1) * tile.getNextTileX()));
            if(i == 1){
                tile.setTileEnd(tile.getTileEnd() - tile.getNextTileY());
            }
            x.add(tile.getTileEnd());
            board.put(21 - i, x);
        }

        for (int i = 1; i <= 10; i++) {
            ArrayList<Integer> x = new ArrayList<>();
            x.add(tile.getTileStart() + ((i - 1) * tile.getNextTileX()));
            if(i == 1){
                tile.setTileEnd(tile.getTileEnd() - tile.getNextTileY());
            }
            x.add(tile.getTileEnd());
            board.put(20 + i, x);
        }

        for (int i = 1; i <= 10; i++) {
            ArrayList<Integer> x = new ArrayList<>();
            x.add(tile.getTileStart() + ((i - 1) * tile.getNextTileX()));
            if(i == 1){
                tile.setTileEnd(tile.getTileEnd() - tile.getNextTileY());
            }
            x.add(tile.getTileEnd());
            board.put(41 - i, x);
        }

        for (int i = 1; i <= 10; i++) {
            ArrayList<Integer> x = new ArrayList<>();
            x.add(tile.getTileStart() + ((i - 1) * tile.getNextTileX()));
            if(i == 1){
                tile.setTileEnd(tile.getTileEnd() - tile.getNextTileY());
            }
            x.add(tile.getTileEnd());
            board.put(40 + i, x);
        }

        for (int i = 1; i <= 10; i++) {
            ArrayList<Integer> x = new ArrayList<>();
            x.add(tile.getTileStart() + ((i - 1) * tile.getNextTileX()));
            if(i == 1){
                tile.setTileEnd(tile.getTileEnd() - tile.getNextTileY());
            }
            x.add(tile.getTileEnd());
            board.put(61 - i, x);
        }

        for (int i = 1; i <= 10; i++) {
            ArrayList<Integer> x = new ArrayList<>();
            x.add(tile.getTileStart() + ((i - 1) * tile.getNextTileX()));
            if(i == 1){
                tile.setTileEnd(tile.getTileEnd() - tile.getNextTileY());
            }
            x.add(tile.getTileEnd());
            board.put(60 + i, x);
        }

        for (int i = 1; i <= 10; i++) {
            ArrayList<Integer> x = new ArrayList<>();
            x.add(tile.getTileStart() + ((i - 1) * tile.getNextTileX()));
            if(i == 1){
                tile.setTileEnd(tile.getTileEnd() - tile.getNextTileY());
            }
            x.add(tile.getTileEnd());
            board.put(81 - i, x);
        }

        for (int i = 1; i <= 10; i++) {
            ArrayList<Integer> x = new ArrayList<>();
            x.add(tile.getTileStart() + ((i - 1) * tile.getNextTileX()));
            if(i == 1){
                tile.setTileEnd(tile.getTileEnd() - tile.getNextTileY());
            }
            x.add(tile.getTileEnd());
            board.put(80 + i, x);
        }

        for (int i = 1; i <= 10; i++) {
            ArrayList<Integer> x = new ArrayList<>();
            x.add(tile.getTileStart() + ((i - 1) * tile.getNextTileX()));
            if(i == 1){
                tile.setTileEnd(tile.getTileEnd() - tile.getNextTileY());
            }
            x.add(tile.getTileEnd());
            board.put(101 - i, x);
        }
    }

}
