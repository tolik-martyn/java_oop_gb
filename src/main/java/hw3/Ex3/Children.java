package hw3.Ex3;

import java.util.ArrayList;
import java.util.List;

public class Children extends Persons {

    List<Parents> parents;

    public Children(String name, Persons.Gender gender, int age) {
        super(name, gender, age);
        this.parents = new ArrayList<>();
    }

    public void addParent(Parents parent) {
        this.parents.add(parent);
    }

    public List<Parents> getParents() {
        return parents;
    }
}
