package hw6;

public class Main {
    public static void main(String[] args) {
        Students student1 = new Students("Harry", 999, 15);
        Students student2 = new Students("Hermione", 888, 15);
        Students student3 = new Students("Ron", 777, 15);
        Students student4 = new Students("Voldemort", 666, 45);

        Teachers teacher1 = new Teachers("Albus Dumbledore", 555, 75, "Protection from the Dark Arts", 45);
        Teachers teacher2 = new Teachers("Severus Snape", 111, 40, "Potions", 20);

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
        Lessons lesson2 = new Lessons("Potions", teacher2, group1);

        student1.giveGrade(5, lesson1);
        student1.giveGrade(4, lesson1);
        student1.giveGrade(3, lesson1);
        student1.getGrade();
        System.out.println();

        student1.changeGrade(3, 4);
        student1.changeGradeLesson(2, lesson2);
        student1.getGrade();
        System.out.println();

        student1.removGrade(3);
        student1.getGrade();
    }
}
