package hw4;

import java.util.Date;

public class Worktasks extends Tasks implements Notifiable {

    enum Notify {
        on, off
    }

    private Notify notify;

    public Worktasks(String theme, Date startDate, Date finishtDate, String responsible) {
        super(theme, startDate, finishtDate, responsible);
        this.notify = Notify.off;
    }

    public void notifyOn() {
        if (this.notify == Notify.off) {
            this.notify = Notify.on;
            System.out.println("Нотификация включена");
        } else {
            System.out.println("Нотификация включена ранее");
        }
    }

    @Override
    public void notifyOff() {
        if (this.notify == Notify.on) {
            this.notify = Notify.off;
            System.out.println("Нотификация выключена");
        } else {
            System.out.println("Нотификация выключена ранее");
        }
    }

    @Override
    public void notifyStatus() {
        if (this.notify == Notify.on) {
            System.out.println("Нотификация включена");
        } else {
            System.out.println("Нотификация выключена");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "[notify=" + notify + "] ";
    }
}
