package hw6;

import java.util.ArrayList;

public class Students extends Persons implements Assessment {

    private ArrayList<Grades> studentGrades;

    enum StudentStatus {
        notInstalled, enrolled, graduated, expelled
    }

    enum AcademicPerformance {
        notInstalled, A, В, C, D, U
    }

    private StudentStatus studentStatus;
    private AcademicPerformance academicPerformance;

    public Students(String personName, int personPhone, int personAge) {
        super(personName, personPhone, personAge);
        this.studentStatus = StudentStatus.notInstalled;
        this.academicPerformance = AcademicPerformance.notInstalled;
        this.studentGrades = new ArrayList<>();
    }

    public StudentStatus getStudentStatus() {
        return studentStatus;
    }

    public void setStudentStatus(StudentStatus studentStatus) {
        this.studentStatus = studentStatus;
    }

    public AcademicPerformance getAcademicPerformance() {
        return academicPerformance;
    }

    public void setAcademicPerformance(AcademicPerformance academicPerformance) {
        this.academicPerformance = academicPerformance;
    }

    @Override
    public String toString() {
        return super.toString() + ", status=" + studentStatus + ", academic_performance=" + academicPerformance;
    }

    @Override
    public void giveGrade(int gr, Lessons less) {
        Grades grade = new Grades(gr, less);
        this.studentGrades.add(grade);
    }

    @Override
    public void changeGrade(int grId, int grNew) {
        for (Grades grade : studentGrades) {
            if (grade.getGradeId() == grId) {
                grade.setGrade(grNew);
                break;
            }
        }
    }

    @Override
    public void removGrade(int grId) {
        for (Grades grade : studentGrades) {
            if (grade.getGradeId() == grId) {
                studentGrades.remove(grade);
                break;
            }
        }
    }

    @Override
    public void getGrade() {
        for (Grades grade : studentGrades) {
            System.out.println(grade);
        }
    }

    @Override
    public void changeGradeLesson(int grId, Lessons lessNew) {
        for (Grades grade : studentGrades) {
            if (grade.getGradeId() == grId) {
                grade.setLesson(lessNew);
                break;
            }
        }
    }
}
