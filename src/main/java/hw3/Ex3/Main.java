package hw3.Ex3;

public class Main {
    public static void main(String[] args) {

        Children child1 = new Children("Василий", Persons.Gender.man, 10);
        Children child2 = new Children("Анна", Persons.Gender.woman, 11);

        Parents parent1 = new Parents("Кирилл", Persons.Gender.man, 40);
        Parents parent2 = new Parents("Василиса", Persons.Gender.woman, 35);

        child1.addParent(parent1);
        child1.addParent(parent2);

        child2.addParent(parent1);
        child2.addParent(parent2);

        parent1.addChild(child1);
        parent1.addChild(child2);

        parent2.addChild(child1);
        parent2.addChild(child2);

        System.out.println("Дети Кирилла: " + parent1.getChildren());
        System.out.println("Дети Василисы: " + parent2.getChildren());

        System.out.println("Родители Василия: " + child1.getParents());
        System.out.println("Родители Анны: " + child2.getParents());

        System.out.println("Возраст Василия: " + child1.getAge());
        child1.setAge(12);
        System.out.println("Возраст Василия: " + child1.getAge());
        System.out.println("Дети Кирилла: " + parent1.getChildren());
    }
}
