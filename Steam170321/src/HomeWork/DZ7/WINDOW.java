package HomeWork.DZ7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WINDOW extends JFrame {

    private final int WIN_WIDTH = 500;
    private final int WIN_HEIGHT = 555;
    private final int WIN_POS_X = 600;
    private final int WIN_POS_Y = 250;

    private SETTING settingsWindow;
    private MAP gameMap;

    WINDOW() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(WIN_WIDTH, WIN_HEIGHT);
        setLocation(WIN_POS_X, WIN_POS_Y);
        setTitle("Игра");
        setResizable(false);

        settingsWindow = new SETTING(this);
        gameMap = new MAP();

        JButton btnStartGame = new JButton("Старт");
        btnStartGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settingsWindow.setVisible(true);
            }
        });

        JButton btnExitGame = new JButton("Выход");
        btnExitGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        JPanel containerForButton = new JPanel();
        containerForButton.setLayout(new GridLayout(1, 2));
        containerForButton.add(btnStartGame);
        containerForButton.add(btnExitGame);

        add(containerForButton, BorderLayout.SOUTH);

        add(gameMap);

        setVisible(true);
    }

    void startGameWithUserSetting(int modeGame, int mapSizeX, int mapSizeY, int winLength) {
        gameMap.startGame(modeGame, mapSizeX, mapSizeY, winLength);
    }
}
