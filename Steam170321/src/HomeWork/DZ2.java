package HomeWork;

import java.util.Arrays;

public class DZ2 {
    public static void main(String[] args) {

        /*1 Задать целочисленный массив, состоящий из элементов 0 и 1.
          Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
          Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;
          */
        int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("1)До    :" + Arrays.toString(array1));

        change(array1);
        System.out.println("1)После :" + Arrays.toString(array1));
        System.out.println();

        /*2 Задать пустой целочисленный массив размером 8.
        Написать метод, который c помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;
         */
        int [] array2 = new int[8];
        enter(array2);
        System.out.println("2)Заполненный массив :" + Arrays.toString(array2));
        System.out.println();

        /*3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ],
        написать метод,принимающий на вход массив и умножающий числа меньше 6 на 2;
         */
        int [] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("3)До    :" + Arrays.toString(array3));
        cycle(array3);
        System.out.println("3)После :" + Arrays.toString(array3));
        System.out.println();

        /*4 Задать одномерный массив.
        Написать методы поиска в нём минимального и максимального элемента;
         */
        int [] array4 = {1, 2, 4, 6, 8, 10, 12, 14, 16};
        System.out.println("4)Минимум: " + min(array4));
        System.out.println("4)Максимум: " + max(array4));
        System.out.println();

        /*5* Создать квадратный целочисленный массив (количество строк и столбцов одинаковое),
         заполнить его диагональные элементы единицами, используя цикл(ы);
         */
        System.out.println("5)");
        int box = 3;
        int [][] array5 = new int[box][box];
        diagonal1(array5);
        diagonal2(array5);




    }
    public static void change(int[] array) {
        for (int i = 0; i < array.length; i++)
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        //array[i] = (array[i] == 1) ? 0 : 1;
        }

        public static void enter(int[] array) {
        for (int i = 0; i < array.length; i++)
            array[i] = i * 3 + 1;
        }
        public static void cycle(int[] array) {
        for (int i = 0; i < array.length; i++)
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        public static int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
        }
        public static int max(int[] array) {
            int max = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i] > max)
                    max = array[i];
            }
            return max;
        }

        public static void diagonal1(int[][] array) {
           for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
            array[i][array.length - 1 - i] = 1;
            }
        }
        public static void diagonal2(int [][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]  + "  ");
            }
            System.out.println();
        }
        }

    }


