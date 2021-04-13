package HomeWork.DZ5;

public class Marathon {

    public static void main(String[] args) {

        String tempWinEvent = " это получилось";
        String tempLossEvent = " это не получилось";
        String eventName;
        String eventResult;

        Horse hors = new Horse("Буцифал", 3, 1500, 100);
        Cat cat = new Cat("Мурка", 2, 200, 0);
        Dog dog = new Dog("Шарик", 0.5f, 500, 10);
        Bird bird = new Bird("Кеша", 0.2f, 5, 0);

        Animal[] arr = {hors, cat, dog};
        float jumpLength = 2.0f;
        float runLength = 300;
        float swimLength = 10;

        for (int i = 0; i < arr.length; i++) {
            String nameString = arr[i].getType() + " " + arr[i].getName() + " может ";

            eventName = "прыгнуть на " + arr[i].getMaxJump() + " м. Пытается прыгнуть на ";
            eventResult = (arr[i].jump(jumpLength)) ? tempWinEvent : tempLossEvent;
            result(nameString, eventName, jumpLength, eventResult);


            eventName = "пробежать на " + arr[i].getMaxRun() + " м. Пытается пробежать на ";
            eventResult = arr[i].run(runLength) ? tempWinEvent : tempLossEvent;
            result(nameString, eventName, runLength, eventResult);

            int swimResult = arr[i].swim(swimLength);
            eventName = "проплыть на " + arr[i].getMaxSwim() + " м. Попытка проплыть на ";
            eventResult = (swimResult == Animal.SWIM_OK) ? tempWinEvent : tempLossEvent;

            if (swimResult == Animal.SWIM_NONE)
                eventResult = " это не получилось, т.к. не умеет плавать";
            result(nameString, eventName, swimLength, eventResult);
        }
    }

    private static void result(String nameAnimal, String event, float eventLength, String resultEvent) {
        System.out.println(nameAnimal + event + eventLength + " м и" + resultEvent);
    }

}
