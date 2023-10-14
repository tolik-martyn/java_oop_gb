package hw6;

public abstract class Persons {

    private static int defaultIndex;

    static {
        defaultIndex = 1;
    }

    private int personId;

    private String personName;
    private int personPhone;
    private int personAge;

    public Persons(String personName, int personPhone, int personAge) {
        this.personId = defaultIndex++;
        this.personName = personName;
        this.personPhone = personPhone;
        this.personAge = personAge;
    }

    public int getPersonId() {
        return personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getPersonPhone() {
        return personPhone;
    }

    public void setPersonPhone(int personPhone) {
        this.personPhone = personPhone;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    @Override
    public String toString() {
        return "id=" + personId + ", name=" + personName + ", phone=" + personPhone + ", age=" + personAge;
    }
}
