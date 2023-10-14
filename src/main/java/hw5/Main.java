package hw5;

public class Main {
    public static void main(String[] args) {
        Students student1 = new Students("Harry", 999, 15);
        Students student2 = new Students("Hermione", 888, 15);
        Students student3 = new Students("Ron", 777, 15);
        Students student4 = new Students("Voldemort", 666, 45);

        Teachers teacher1 = new Teachers("Dumbledore", 555, 75, "Protection from the Dark Arts", 45);

        Groups<Students> group1 = new Groups<>("Hogwarts");

        group1.addStudentToGroup(student1);
        group1.addStudentToGroup(student2);
        group1.addStudentToGroup(student3);
        group1.addStudentToGroup(student4);
        System.out.println(group1.getGroupStudents() + "\n");
        group1.removeStudentFromGroup(4);
        System.out.println(group1.getGroupStudents() + "\n");
        System.out.println(group1 + "\n");

        Lessons lesson1 = new Lessons("Forbidden spells", teacher1, group1);
        System.out.println(lesson1 + "\n");

    }
}
