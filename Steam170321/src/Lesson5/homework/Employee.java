package Lesson5.homework;

public class Employee {
    private static final int CURRENT_YEAR = 2021;

    private String surname;
    private String secondName;
    private String name;
    private String position;
    private String phone;
    private float salary;
    boolean isSalaryChanged;
    private int birthYear;
    private int uid;

    private static int id = 0;

    // 2.	Конструктор класса должен заполнять эти поля при создании объекта;
    Employee(String name,
             String secondName,
             String surname,
             String phone,
             String position,
             float salary,
             int birthYear) {
        this.birthYear = birthYear;
        this.name = name;
        this.surname = surname;
        this.secondName = secondName;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.uid = ++id;
    }

    // 3.	Внутри класса «Сотрудник» написать методы, которые возвращают
    // значение каждого поля;
    int getAge() {
        return CURRENT_YEAR - birthYear;
    }

    int getSalary() {
        return (int) salary;
    }

    void setSalary(float difference) {
        this.salary = this.salary + difference;
    }

    void setSalary(int salary) {
        this.salary = salary;
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

    String getPhone() {
        return phone;
    }

    String getFullInfo() {
        return this.uid + " " + this.name + " " +
                this.secondName + " " +
                this.surname + ", " +
                this.getAge() + " years old, " +
                this.position + ". Phone number: " +
                this.phone + ". Salary is " +
                this.getSalary() + " RU";
    }
}
