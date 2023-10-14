package hw5;

public class Lessons {

    private static int defaultIndex;
    static {
        defaultIndex = 1;
    }

    private int lessonId;

    private String lessonName;
    private Teachers lessonTeacher;
    private Groups<Students> lessonGroupStudents;

    public Lessons(String lessonName, Teachers lessonTeacher, Groups<Students> lessonGroupStudents) {
        this.lessonId = defaultIndex++;
        this.lessonName = lessonName;
        this.lessonTeacher = lessonTeacher;
        this.lessonGroupStudents = lessonGroupStudents;
    }

    public int getLessonId() {
        return lessonId;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public Teachers getLessonTeacher() {
        return lessonTeacher;
    }

    public void setLessonTeacher(Teachers lessonTeacher) {
        this.lessonTeacher = lessonTeacher;
    }

    public Groups<Students> getLessonGroupStudents() {
        return lessonGroupStudents;
    }

    public void setLessonGroupStudents(Groups<Students> lessonGroupStudents) {
        this.lessonGroupStudents = lessonGroupStudents;
    }

    @Override
    public String toString() {
        return "Lesson: id=" + lessonId + ", name=" + lessonName + "\nTeacher: " + lessonTeacher
                + "\nGroup_of_students: " + lessonGroupStudents;
    }
}
