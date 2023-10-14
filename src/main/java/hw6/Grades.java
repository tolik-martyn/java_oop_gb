package hw6;

public class Grades {

    private static int defaultIndex;

    static {
        defaultIndex = 1;
    }

    private int gradeId;

    private int grade;
    private Lessons lesson;

    public Grades(int grade, Lessons lesson) {
        this.gradeId = defaultIndex++;
        this.grade = grade;
        this.lesson = lesson;
    }

    @Override
    public String toString() {
        return "Оценка: id=" + gradeId + ", балл=" + grade + ", урок: " + lesson.getLessonId() + ", "
                + lesson.getLessonName();
    }

    public int getGradeId() {
        return gradeId;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Lessons getLesson() {
        return lesson;
    }

    public void setLesson(Lessons lesson) {
        this.lesson = lesson;
    }

}
