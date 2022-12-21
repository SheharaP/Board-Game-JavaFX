package com.mspan.guigame;

import java.util.ArrayList;
import java.util.HashMap;

public class Board {

    public static HashMap<Integer, ArrayList<Integer>> board = new HashMap<>();

    public static HashMap<Integer, Ladder> ladders = new HashMap<>();
    public static HashMap<Integer, Snake> snakes = new HashMap<>();

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
