package hw6;

public interface Assessment {

    public void giveGrade(int gr, Lessons less);

    public void changeGrade(int grId, int grNew);

    public void changeGradeLesson(int grId, Lessons lessNew);

    public void removGrade(int grId);

    public void getGrade();

}
