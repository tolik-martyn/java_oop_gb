package hw6;

import java.util.ArrayList;

public class Groups<T extends Students> {

    private static int defaultIndex;
    static {
        defaultIndex = 1;
    }

    private int groupId;

    private String groupName;
    private ArrayList<T> groupStudents;

    public Groups(String groupName) {
        this.groupId = defaultIndex++;
        this.groupName = groupName;
        this.groupStudents = new ArrayList<>();
    }

    public int getGroupId() {
        return groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public ArrayList<T> getGroupStudents() {
        return groupStudents;
    }

    public void addStudentToGroup(T student) {
        this.groupStudents.add(student);
    }

    public void removeStudentFromGroup(int id) {
        for (T student : this.groupStudents) {
            if (student.getPersonId() == id) {
                this.groupStudents.remove(student);
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "id=" + groupId + ", name=" + groupName + "\nStudents:\n" + groupStudents;
    }
}
