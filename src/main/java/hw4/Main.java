package hw4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Housework cleaning1 = new Housework("cleaning the room", null, null, "Кирилл");
        Housework cleaning2 = new Housework("cleaning the kitchen", null, null, "Михаил");
        Housework cleaning3 = new Housework("cleaning the bathroom", null, null, "Анна");
        Worktasks training1 = new Worktasks("java training", null, null, "Николай");
        Worktasks training2 = new Worktasks("Kamenetsky training", null, null, "Сергей");

        Calendar<Housework> calendar1 = new Calendar<Housework>(new ArrayList<>());

        calendar1.addTask(cleaning1);
        calendar1.addTask(cleaning2);
        calendar1.removeTask("cleaning the room");
        calendar1.addTask(cleaning3);
        // calendar1.addTask(training1); // Error

        cleaning2.setPriority(Priority.low);
        cleaning3.setPriority(Priority.medium);

        System.out.println();
        System.out.println(calendar1.getTasks());
        System.out.println();

        Calendar<Worktasks> calendar2 = new Calendar<Worktasks>(new ArrayList<>());
        calendar2.addTask(training1);
        calendar2.addTask(training2);
        // calendar2.addTask(cleaning1); // Error

        training1.notifyStatus();
        training1.notifyOff();
        training1.notifyOn();
        training1.notifyStatus();
        System.out.println();

        training2.setPriority(Priority.high);

        System.out.println(calendar2.getTasks());
    }
}
