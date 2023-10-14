package hw5;

public class Students extends Persons {

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
}
