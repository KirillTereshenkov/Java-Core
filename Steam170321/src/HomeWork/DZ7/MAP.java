package HomeWork.DZ7;

import javax.swing.*;
import java.awt.*;

public class MAP extends JPanel {
    public static final int GAME_MODE_HVH = 0;
    public static final int GAME_MODE_HVA = 1;

    MAP() {
        setBackground(Color.BLACK);
    }

    void startGame(int modeGame, int mapSizeX, int mapSizeY, int winLength) {
        System.out.println("Режим =  " + modeGame +
                "\nmapSizeX = " + mapSizeX +
                "\nmapSizeY = " + mapSizeY +
                "\nwinLength = " + winLength);
    }
}
