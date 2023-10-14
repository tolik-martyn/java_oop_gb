package hw4;

import java.util.Date;

public abstract class Tasks {

    private static int defaultIndex;
    static {
        defaultIndex = 1;
    }

    private int id;
    private String theme;
    private Date startDate;
    private Date finishtDate;
    private String comment;
    private String responsible;
    private Priority priority;

    public Tasks(String theme, Date startDate, Date finishtDate, String responsible) {
        this.id = defaultIndex++;
        this.theme = theme;
        this.startDate = startDate;
        this.finishtDate = finishtDate;
        this.comment = null;
        this.responsible = responsible;
        this.priority = Priority.notSet;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getFinishtDate() {
        return finishtDate;
    }

    public void setFinishtDate(Date finishtDate) {
        this.finishtDate = finishtDate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getResponsible() {
        return responsible;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "[id=" + id + ", theme=" + theme + ", startDate=" + startDate + ", finishtDate=" + finishtDate
                + ", comment=" + comment + ", responsible=" + responsible + ", priority=" + priority + "] ";
    }
}
