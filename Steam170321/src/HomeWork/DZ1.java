package HomeWork;

public class DZ1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        System.out.println("Результат задания 1 " + calculate(a, b, c, d));

        System.out.println("Результат задания 2 " + numbers(9, 7));

        if (positiveOrNegative( 1)) {
            System.out.println("Результат задания 3 positive");
        } else {
            System.out.println("Результат задания 3 negative");
        }
        System.out.println("Результат задания 4: " + hello("Кирилл !"));
        System.out.println("Результат задания 5: Год высокосный? " + howYear(2020));

    }
    /*1) Написать метод вычисляющий выражение a * (b + (c / d))
        и возвращающий результат с плавающей точкой,
         где a, b, c, d – целочисленные входные параметры этого метода;
         */
    public static float calculate(int a, int b, int c, int d){

        return a * (b + (1.0f*c / d));
    }
/*2) Написать метод, принимающий на вход два целых числа,
 и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
  если да – вернуть true, в противном случае – false;
 */
 public static boolean numbers(int first,int second) {
     int sum = first + second;
     return (sum >=10) &&(sum <= 20);
 }
 /*3) Написать метод, которому в качестве параметра передается целое число,
  метод должен проверить положительное ли число передали, или отрицательное.
 Замечание: ноль считаем положительным числом.
 Результат работы метода вывести в консоль
  */
    public static boolean positiveOrNegative(int number) {

        return number >= 0;
    }
/*4) Написать метод, которому в качестве параметра передается строка,
 обозначающая имя, метод должен вернуть приветственное сообщение
 «Привет, переданное_имя!»; Вывести приветствие в консоль.
 */
    public static String hello( String name){

        return "Привет, " + name;
    }
    /*5)*Написать метод, который определяет является ли год високосным.
     Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
     Для проверки работы вывести результаты работы метода в консоль
     */
    public static boolean howYear(int year) {

        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 ==0);
    }
}

