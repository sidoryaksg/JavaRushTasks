package com.javarush.games.minigames.mini08;

import com.javarush.engine.cell.*;

/* 
Работа с клавиатурой
*/

public class KeyboardGame extends Game {

    @Override
    public void initialize() {
        setScreenSize(3, 3);

        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                setCellColor(x, y, Color.WHITE);
            }
        }
    }

    //напишите тут ваш код

    @Override
    public void onKeyPress(Key key) {
        if (key = Key.LEFT) {
            for (int i = 0; i < getScreenHeight(); i++) {
                for (int j = 0; j < getScreenWidth(); j++) {
                    if (i == 0) {
                        setCellColor(i, j, Color.GREEN);
                    }

                }

            }
        }
    }
}
