package HomeWork.DZ4;

public class DZ4 {

    public static void main(String[] args) {

        // Задание 1;
        Worker mainWorker = new Worker("Кирилл", "Сергеевич",
                "Терещенков", "8(967)142 77 77",
                "Продавец", 75000, 1990);

        // Задание 4;
        System.out.println(mainWorker.getPosition() + ", " +
                mainWorker.getName() + " " + mainWorker.getSecondName() + " " + mainWorker.getSurname() + ".");

        // Задание 5;

        Worker[] employees = {
                mainWorker,
                new Worker("Леонид", "Иванович",
                        "Скопцов", "8(495)111 11 11",
                        "Управляющий", 92000, 1980),
                new Worker("Иван", "Александрович",
                        "Зундюк", "8(495)222 22 22",
                        "Продавец", 40000, 1988),
                new Worker("Ярослав", "Сергеевич",
                        "Коновалов", "8(495)333 33 33",
                        "Продавец", 40000, 1993),
                new Worker("Илья", "Александрович",
                        "Ларинов", "8(495)444 44 44",
                        "Продавец", 40000, 1996)
        };

        System.out.println(" ");

        for (int i = 0; i < employees.length; i++)
            if (employees[i].getAge() > 40) {
                System.out.println(employees[i].getFullInfo());
            }

        System.out.println(" ");

        for (int i = 0; i < employees.length; i++)
            System.out.println(employees[i].getFullInfo());


        System.out.println(" ");

        for (int i = 0; i < employees.length; i++)
            if (employees[i].isSalaryChanged)
                System.out.println(employees[i].getFullInfo());

    }

}
