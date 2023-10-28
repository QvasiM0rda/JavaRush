package com.javarush.games.minigames.mini05;

import com.javarush.engine.cell.Game;
import com.javarush.engine.cell.Color;

import java.util.HashMap;

/* 
Цвета радуги
*/

public class RainbowGame extends Game {

    @Override
    public void initialize() {
        setScreenSize(10, 7);
        HashMap<Integer, Color> colors = new HashMap<>();
        colors.put(0, Color.RED);
        colors.put(1, Color.ORANGE);
        colors.put(2, Color.YELLOW);
        colors.put(3, Color.GREEN);
        colors.put(4, Color.BLUE);
        colors.put(5, Color.INDIGO);
        colors.put(6, Color.VIOLET);

        for (int x = 0; x < getScreenWidth(); x++) {
            for (int y = 0; y < getScreenHeight(); y++) {
                setCellColor(x, y, colors.get(y));
            }

        }
    }
}
