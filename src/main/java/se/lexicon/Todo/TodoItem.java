package se.lexicon.Todo;

import javax.xml.validation.Validator;
import java.time.LocalDate;

public class TodoItem {


    //----------------------------------------------- Fields --------------------------------------------------
    private final int id;
    private String title;
    private String xtraInfo;
    private LocalDate deadLine;
    private Person creator;
    private boolean done;

    //------------------------------------------ Fields End -----------------------------------------------------
    //||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    //--------------------------- Constructors -------------------------------------------------------------------


    public TodoItem(String title, String xtraInfo, LocalDate deadLine, String whoisDoing, int id, boolean done) {
        setTitle(title);
        this.setXtraInfo(xtraInfo);
        this.setDeadLine(deadLine);
        this.setCreator(creator);
        this.id = id;
        this.done = done;

    }

    public String summary() {
        return "ID:" + id + "Current date: " + LocalDate.now();
    }


//---------------------------- Constructors End --------------------------------------------------------------
    //||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    //--------------------------------------- Setters ------------------------------------------------------------

    public void setDeadLine(LocalDate deadLine) {
        if (deadLine == null) {
            throw new IllegalArgumentException("Shouldnt be null");

        }
        this.deadLine = deadLine;
    }
    public boolean isOverdue(){
        return LocalDate.now().isAfter(deadLine);
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Field cant be null or empty");
        }
        this.title = title;
    }

    public boolean setDone(boolean done) {
        this.done = done;
        if (done == true) {

        }return true;
    }
    public void setXtraInfo(String xtraInfo) {
        System.out.println("Enter valuable information");
        this.xtraInfo = xtraInfo;
    }

    public void setCreator(Person creator) {
        if (creator == null){
            throw new IllegalArgumentException("Field cannot be null or empty");
        }
        this.creator = creator;
    }

    //--------------------------------------- Setters End --------------------------------------------------------
    //||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    //--------------------------------------- Getters --------------------------------------------------------

    public String getXtraInfo() {
        return xtraInfo;
    }


    public LocalDate getDeadLine() {

        return deadLine;
    }

    public Person creator() {
        return creator();
    }


    //public String getSummary() {
    //    return ("ID: " + id + "\nOrder: " + title + "\nAdditional infromation: " + xtraInfo +
    //            "\nDue date: " + deadLine + "\nWho did this: " + whoisDoing);
    //
    //}

    public boolean isDone() {
        return done;
    }

    @Override
    public String toString() {
        return "TodoItem{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", xtraInfo='" + xtraInfo + '\'' +
                ", deadLine=" + deadLine +
                ", whoisDoing='" + creator + '\'' +
                ", done=" + done +
                '}';
    }
//----------------------- GETTERS END---------------------------------------------------------------------
//||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
//----------------------- OVERRIDES---------------------------------------------------------------------


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

}













