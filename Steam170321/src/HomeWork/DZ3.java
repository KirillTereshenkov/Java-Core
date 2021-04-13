package HomeWork;

import java.util.Random;
import java.util.Scanner;

public class DZ3 {

    public static char[][] map;
    public static int sizeMapX;
    public static int sizeMapY;

    public static char human = 'X';
    public static char ai = 'O';
    public static char empty = ' ';

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void createMap( int sizeX, int sizeY) {
        sizeMapX = sizeX;
        sizeMapY = sizeY;
        map = new char[sizeX][sizeY];
        for (int y = 0; y < sizeMapY; y++) {
            for (int x = 0; x < sizeMapX; x++) {
                map[y][x] = empty;
            }
        }
    }
    public  static void printMap() {
        System.out.println("------------");
        for (int y = 0; y < sizeMapY; y++) {
            for (int x = 0; x < sizeMapX; x++) {
                System.out.print(map[y][x] + " | ");
            }
            System.out.println();
        }
        System.out.println("------------");
    }
    public static void turnHuman() {
        int x;
        int y;
        do {
            System.out.print("Введите координату X : ");
            x = scanner.nextInt() - 1;
            System.out.print("Введите координату Y : ");
            y = scanner.nextInt() - 1;
        } while (!validCell(y,x) || (!emptyCell(y,x)));
        map[y][x] = human;
    }
    public static boolean validCell(int y, int x){
        return x >= 0 && x < sizeMapX && y >= 0 && y < sizeMapY;
    }
    public static boolean emptyCell(int y, int x) {
        return map[y][x] == empty;
    }
    public static void turnAi() {
        int x;
        int y;
        do {
            x = random.nextInt(sizeMapX);
            y = random.nextInt(sizeMapY);
        } while (!emptyCell(y,x));
        map[y][x] = ai;

    }
    public static boolean win(char player) {
        if (map[0][0] == player && map[0][1] == player && map[0][2] == player) return true;
        if (map[1][0] == player && map[1][1] == player && map[1][2] == player) return true;
        if (map[2][0] == player && map[2][1] == player && map[2][2] == player) return true;

        if (map[0][0] == player && map[1][0] == player && map[2][0] == player) return true;
        if (map[0][1] == player && map[1][1] == player && map[2][1] == player) return true;
        if (map[0][2] == player && map[1][2] == player && map[2][2] == player) return true;

        if (map[0][0] == player && map[1][1] == player && map[2][2] == player) return true;
        if (map[0][2] == player && map[1][1] == player && map[2][0] == player) return true;
        return false;
    }
    public static boolean draw() {
        for (int y = 0; y < sizeMapY; y++) {
            for (int x = 0; x < sizeMapX; x++) {
                if (map[y][x] == empty) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        createMap(3,3);
        printMap();

        while (true) {
            turnHuman();
            printMap();
            if (win(human)) {
                System.out.println("Human Win !");
                break;
            }
            if (draw()) {
                System.out.println("Draw !");
                break;
            }
            turnAi();
            printMap();
            if (win(ai)) {
                System.out.println("Ai Win !");
                break;
            }
            if (draw()) {
                System.out.println("Draw !");
                break;
            }
        }
    }
}
