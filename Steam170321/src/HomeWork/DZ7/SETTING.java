package HomeWork.DZ7;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SETTING extends JFrame {

    private final int WIN_WIDTH = 350;
    private final int WIN_HEIGHT = 250;

    private WINDOW mainWindow;

    private JRadioButton playWithHuman;
    private JRadioButton playWithAI;

    private JSlider sliderMapSizeSetup;
    private JSlider sliderWinLengthSetup;

    private JButton confirmUserSettings;

    private final int MIN_MAP_SIZE = 3;
    private final int MAX_MAP_SIZE = 10;

    private final int MIN_WIN_LENGTH = 3;

    private final String MAP_SIZE_PREFIX = "Размер карты";
    private final String WIN_LENGTH_PREFIX = "Длина выигрыша";

    SETTING(WINDOW mainWindow) {
        this.mainWindow = mainWindow;
        setupWindow(mainWindow);
        modeGameControllers();
        mapSetupControllers();
        confirmUserSetting();


    }

    private void modeGameControllers() {
        add(new JLabel("Режим игры"));
        playWithHuman = new JRadioButton("Человек vs. Человек", true);
        playWithAI = new JRadioButton("Человек vs. Компьютер");

        ButtonGroup gameModeButtonGroup = new ButtonGroup();
        gameModeButtonGroup.add(playWithHuman);
        gameModeButtonGroup.add(playWithAI);

        add(playWithHuman);
        add(playWithAI);

    }

    private void mapSetupControllers() {
        JLabel labelMapSize = new JLabel(MAP_SIZE_PREFIX + MIN_MAP_SIZE);
        JLabel labelWinLength = new JLabel(WIN_LENGTH_PREFIX + MIN_WIN_LENGTH);

        sliderMapSizeSetup = new JSlider(MIN_MAP_SIZE, MAX_MAP_SIZE, MIN_MAP_SIZE);
        sliderMapSizeSetup.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int currentMapSize = sliderMapSizeSetup.getValue();
                labelMapSize.setText(MAP_SIZE_PREFIX + currentMapSize);
                sliderWinLengthSetup.setMaximum(currentMapSize);
            }
        });

        sliderWinLengthSetup = new JSlider(MIN_WIN_LENGTH, MIN_MAP_SIZE, MIN_MAP_SIZE);
        sliderWinLengthSetup.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                labelWinLength.setText(WIN_LENGTH_PREFIX + sliderWinLengthSetup.getValue());
            }
        });

        add(new JLabel("Выбор размера карты"));
        add(labelMapSize);
        add(sliderMapSizeSetup);
        add(new JLabel("Выбор длинны выйгрыша"));
        add(labelWinLength);
        add(sliderWinLengthSetup);

    }

    private void confirmUserSetting() {
        confirmUserSettings = new JButton("Страт с текущими настройками");
        confirmUserSettings.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                collectUserSettings();
            }
        });

        add(confirmUserSettings);
    }


    private void setupWindow(WINDOW mainWindow) {
        setSize(WIN_WIDTH,WIN_HEIGHT);
        Rectangle mainWindowParams = mainWindow.getBounds();
        int posWindowX = (int) mainWindowParams.getCenterX() - WIN_WIDTH / 2;
        int posWindowY = (int) mainWindowParams.getCenterY() - WIN_HEIGHT / 2;

        setLocation(posWindowX, posWindowY);

        setTitle("Настройки");
        setResizable(false);
        setLayout(new GridLayout(10,1));
    }

    private void collectUserSettings() {
        int gameMode;

        if (playWithHuman.isSelected()) {
            gameMode = MAP.GAME_MODE_HVH;
        } else if (playWithAI.isSelected()) {
            gameMode = MAP.GAME_MODE_HVA;
        } else {
            throw new RuntimeException("Error");
        }

        int mapSize = sliderMapSizeSetup.getValue();
        int winLen = sliderWinLengthSetup.getValue();

        mainWindow.startGameWithUserSetting(gameMode, mapSize, mapSize, winLen);
        setVisible(false);
    }

}
