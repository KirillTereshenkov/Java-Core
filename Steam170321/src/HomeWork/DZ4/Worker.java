package HomeWork.DZ4;

     // Задание 1;

public class Worker {
    private static final int CURRENT_YEAR = 2021;

    private String surname;
    private String secondName;
    private String name;
    private String position;
    private String phone;
    private float salary;
    boolean isSalaryChanged;
    private int age;
    private int uid;

    private static int id = 0;

    // Задание 2;

    Worker(String name,
             String secondName,
             String surname,
             String phone,
             String position,
             float salary,
             int age) {
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.secondName = secondName;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.uid = ++id;
    }

    // Задание 3;

    int getAge() {
        return CURRENT_YEAR - age;
    }

    int getSalary() {
        return (int) salary;
    }


    String getSecondName() {
        return secondName;
    }

    String getName() {
        return name;
    }

    String getSurname() {
        return surname;
    }

    String getPosition() {
        return position;
    }


    String getFullInfo() {
        return this.uid + " " + this.name + " " +
                this.secondName + " " +
                this.surname + ", " +
                this.getAge() + " Возраст, " +
                this.position + ". Телефон: " +
                this.phone + ". Зарплата " +
                this.getSalary() + " Руб";
    }
}
