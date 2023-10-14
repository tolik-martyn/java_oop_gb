package hw3.Ex3;

public class Persons {

    enum Gender {
        man, woman
    }

    protected String name;
    protected Gender gender;
    protected int age;

    public Persons(String name, Persons.Gender gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    protected int getAge() {
        return age;
    }

    protected void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name=" + name + ", gender=" + gender + ", age=" + age;
    }
}
