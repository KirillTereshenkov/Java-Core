package Lesson1;

public class FirstClass {
    public static void main(String[] args) {
        System.out.println("Hello_all! This is Java! Hello from WinConsole");
        System.out.print("Hello_World!");

        //целочисленные
        byte myByte = 25; //-128..+127 (1b)
        short myShort = 250; //-32768..+32767 (2b)
        int myInt = 50000; //-2.1*10^9 (4b)
        long myLong = 3000000000L; // -2^63 .. + 2^63 (8b)

        //числа с плавающей точкой
        Float myFloat = 15.8f; // (4b)
        double myDouble = 15.8; // (8b)

        //символы
        char myChar = 'q'; // (2b)

        boolean myBoolean = false; //true

        //Math operators: +, -, *, /, ^, %

        int x = 15;
        int y = 4;
        int result1 = x % y;
        System.out.println(result1);
        int myAge = 17;
        if (myAge < 18) {
            System.out.println("Sorry!!! You can't buy");
        } else if (myAge > 65) {
            System.out.println("You old man - go home");
        } else {
            System.out.println("You OK!!!!");
        }

        if (myAge < 30) {
            System.out.println("im OK");
        }
        if (myAge > 30) {
            System.out.println("Im Old");
        }
        if (myAge == 30) {
            System.out.println("Im 30 years old");
        }

        float cloc = 9.01f;
        if (cloc < 10.00f) {
            System.out.print("Можно спать ");
        } else if (cloc > 10.00f) {
            System.out.println("Ты проспал ");
        } else {
            System.out.println("Пора вставать ");
        }
        System.out.println(wakeUp(cloc));

        test();

        int a = 150;
        int b = 37;
        int result;

        result = myCalculate(a, b);
        a++; //a = a + 1 -> a++ ||||||  a = a + 5 -> a += 5
        result = myCalculate(a, b);
        b++;
        result = myCalculate(a, b);
        a++;
        result = myCalculate(a, b);

        System.out.println(result);

        doSomething();
        check(5,10);
        humanStep();
    }

    public static int myCalculate(int inputDec, int javaValue) {
        return inputDec + javaValue;
    }

    public static float wakeUp(float cloc) {
        return cloc;
    }

    public static void test() {
        int a = 20;
        int b = 30;
        int c = 10;
        System.out.println(a * b / c);
    }

    public static void doSomething() {
        float valueA = 250.987f;
        float valueB = 1002.445f;
        System.out.println(valueA * valueB);
    }
    public static void check(int a, int b) {
        System.out.println(a + b);
    }

    public static void humanStep() {
        System.out.println("Human must go");
    }

}

