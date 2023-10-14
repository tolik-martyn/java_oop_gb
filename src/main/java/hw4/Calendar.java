package hw4;

import java.util.ArrayList;
import java.util.List;

public class Calendar<T extends Tasks> {

    private List<T> tasks = new ArrayList<>();

    public Calendar(List<T> tasks) {
        this.tasks = tasks;
    }

    public void addTask(T someTask) {
        tasks.add(someTask);
    }

    public void removeTask(String theme) {
        for (T item : tasks) {
            if (item.getTheme().equals(theme)) {
                tasks.remove(item);
            }
        }
    }

    public List<T> getTasks() {
        return tasks;
    }
}
