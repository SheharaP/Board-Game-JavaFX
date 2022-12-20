package com.mspan.guigame;

import java.util.ArrayList;
import java.util.HashMap;

public class Board {

    public static HashMap<Integer, ArrayList<Integer>> board = new HashMap<>();

    public Board() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(43);
        arr.add(572);
        System.out.println(arr);
        board.put(0, arr);

        for (int i = 1; i <= 10; i++) {
            ArrayList<Integer> x = new ArrayList<>();
            x.add(43 + ((i - 1) * 50));
            x.add(522);
            board.put(i, x);
        }

        for (int i = 1; i <= 10; i++) {
            ArrayList<Integer> x = new ArrayList<>();
            x.add(43 + ((i - 1) * 50));
            x.add(472);
            board.put(21 - i, x);
        }

        for (int i = 1; i <= 10; i++) {
            ArrayList<Integer> x = new ArrayList<>();
            x.add(43 + ((i - 1) * 50));
            x.add(422);
            board.put(20 + i, x);
        }

        for (int i = 1; i <= 10; i++) {
            ArrayList<Integer> x = new ArrayList<>();
            x.add(43 + ((i - 1) * 50));
            x.add(372);
            board.put(41 - i, x);
        }

        for (int i = 1; i <= 10; i++) {
            ArrayList<Integer> x = new ArrayList<>();
            x.add(43 + ((i - 1) * 50));
            x.add(322);
            board.put(40 + i, x);
        }

        for (int i = 1; i <= 10; i++) {
            ArrayList<Integer> x = new ArrayList<>();
            x.add(43 + ((i - 1) * 50));
            x.add(272);
            board.put(61 - i, x);
        }

        for (int i = 1; i <= 10; i++) {
            ArrayList<Integer> x = new ArrayList<>();
            x.add(43 + ((i - 1) * 50));
            x.add(222);
            board.put(60 + i, x);
        }

        for (int i = 1; i <= 10; i++) {
            ArrayList<Integer> x = new ArrayList<>();
            x.add(43 + ((i - 1) * 50));
            x.add(172);
            board.put(81 - i, x);
        }

        for (int i = 1; i <= 10; i++) {
            ArrayList<Integer> x = new ArrayList<>();
            x.add(43 + ((i - 1) * 50));
            x.add(122);
            board.put(80 + i, x);
        }

        for (int i = 1; i <= 10; i++) {
            ArrayList<Integer> x = new ArrayList<>();
            x.add(43 + ((i - 1) * 50));
            x.add(72);
            board.put(101 - i, x);
        }
    }

}
