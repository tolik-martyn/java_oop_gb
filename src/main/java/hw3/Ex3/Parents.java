package hw3.Ex3;

import java.util.ArrayList;
import java.util.List;

public class Parents extends Persons {

    List<Children> children;

    public Parents(String name, Persons.Gender gender, int age) {
        super(name, gender, age);
        this.children = new ArrayList<>();
    }

    public void addChild(Children child) {
        children.add(child);
    }

    public List<Children> getChildren() {
        return children;
    }
}
