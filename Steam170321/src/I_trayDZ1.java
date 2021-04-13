public class I_trayDZ1 {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign(10, -20);
        printColor(100);
        compareNumbers(2,1);

    }
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
        System.out.println("=================");
    }
    public static void checkSumSign(int a, int b) {
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная " + sum);
        } else {
            System.out.println("Отрицательная " + sum);
        }
        System.out.println("=================");
    }
    public static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Красный");
        } if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } if (value > 100) {
            System.out.println("Зеленый");
        }
        System.out.println("=================");
    }
    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b: " + a +" "+ b);
        } else {
            System.out.println("a < b: " + a +" "+ b);
        }
        System.out.println("=================");
    }
}
