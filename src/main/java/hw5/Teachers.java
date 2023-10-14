package hw5;

public class Teachers extends Persons {

    enum TeacherStatus {
        notInstalled, hired, onVacation, dismissed
    }

    private String teacherSpecialization;
    private int teacherExperience;
    private TeacherStatus teacherStatus;

    public Teachers(String personName, int personPhone, int personAge, String teacherSpecialization,
            int teacherExperience) {
        super(personName, personPhone, personAge);
        this.teacherSpecialization = teacherSpecialization;
        this.teacherExperience = teacherExperience;
        this.teacherStatus = TeacherStatus.notInstalled;
    }

    public String getTeacherSpecialization() {
        return teacherSpecialization;
    }

    public void setTeacherSpecialization(String teacherSpecialization) {
        this.teacherSpecialization = teacherSpecialization;
    }

    public int getTeacherExperience() {
        return teacherExperience;
    }

    public void setTeacherExperience(int teacherExperience) {
        this.teacherExperience = teacherExperience;
    }

    public TeacherStatus getTeacherStatus() {
        return teacherStatus;
    }

    public void setTeacherStatus(TeacherStatus teacherStatus) {
        this.teacherStatus = teacherStatus;
    }

    @Override
    public String toString() {
        return super.toString() + ", specialization=" + teacherSpecialization + ", experience=" + teacherExperience
                + ", status=" + teacherStatus;
    }
}
