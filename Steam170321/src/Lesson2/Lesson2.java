package Lesson2;

public class Lesson2 {
    public static void main(String[] args) {
        /* //Тернарный оператор
        int a = 20;
        int b =10;
       int result;
         if (a > b) {
            result = a;
        } else {
            result = b;
        }
        result = (a > b) ? a : b;


        System.out.println("Result : " + result);

        String name = "Elena";

        if (name == "Elena") {
            System.out.println("Send letter to Elena");
        } else if (name == "Boris") {
            System.out.println("Send letter to Boris");
        } else if (name == "Alisa") {
            System.out.println("Send letter to Alisa");
        } else {
            System.out.println("Go out office");
        }
        System.out.println("=================================");

        switch (name) {
            case "Elena" :
                System.out.println("Send letter to Elena");
                break;
            case "Boris" :
                System.out.println("Send letter to Boris");
                break;
            case "Alisa" :
                System.out.println("Send letter to Alisa");
                break;
            default:
                System.out.println("Go out office");
                break;
        }*/

        //System.out.println(powerMyMath(2,10));
        //pifagorTable(10,10);

       /* int abc = 0;
        while (abc < 10) {
            abc++;
            if (abc == 4 || abc == 7) continue;
            System.out.print(abc + " | ");
        }
        System.out.println("\n==============================");
        int cde = 0;
        do {
            cde++;
            if (cde == 5) break;
            System.out.print(cde + " | ");
        } while (cde < 10);*/
       /* //Массив
        int[] myArrayInt = new int[10];
        myArrayInt[0] = 5;
        myArrayInt[1] = 10;
        myArrayInt[2] = 15;
        myArrayInt[3] = 20;
        myArrayInt[4] = 25;

        System.out.println(myArrayInt[2]);

        for (int i = 0; i < myArrayInt.length; i++) {
            System.out.print(myArrayInt[i] + " | ");
        }
        System.out.println("                              ");

        String[] myArrayString = {"Alex", "Dev_01", "Kirill"};
        for (int i = 0; i < myArrayString.length; i++) {
            System.out.print(myArrayString[i] + " | ");
        }
        System.out.println();

        int[][] myArray2 = new int[4][3];
        myArray2[1][2] = 15;
        myArray2[3][2] = 20;
        System.out.println(myArray2[1][2]);

        int count = 0;

        for (int i = 0; i < myArray2.length; i++) {
            for (int j = 0; j < myArray2[i].length; j++) {
                myArray2[i][j] = count;
                count++;
            }

        }
        for (int i = 0; i < myArray2.length; i++) {
            for (int j = 0; j < myArray2[i].length; j++) {
                System.out.print(myArray2[i][j] + " | ");
            }
            System.out.println();
        }
         public static void readArray(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray + " | ");
        }
    }*/


      /* //Возведение в степень
    public static int powerMyMath (int base, int signature) {
        int result = 1;
        for (int i = 0; i < signature; i++) {
            result = result * base;
        }
        return result;
    }*/
        /*//Таблица умножения
    public static void pifagorTable(int width, int heigth) {
        for (int y = 1; y <= heigth; y++) {
            for (int x =1; x <= width; x++) {
                System.out.print(x * y + "\t");
            }
            System.out.println();
        }
    }*/
    }

}
