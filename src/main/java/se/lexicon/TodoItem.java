package se.lexicon;

import java.time.LocalDate;

public class TodoItem {
    //----------------------------------------------- Fields --------------------------------------------------
    private int id;
    private String title;
    private String xtraInfo;
    private LocalDate deadLine;
    private boolean doneOrNot;
    private Person whoisDoing;

    //------------------------------------------ Fields End -----------------------------------------------------
    //||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    //--------------------------- Constructors -------------------------------------------------------------------


    public TodoItem(String title, String xtraInfo, LocalDate deadLine, boolean doneOrNot, Person whoisDoing, int id) {
        this.title = setTitle(title);
        this.xtraInfo = setXtraInfo(xtraInfo);
        this.deadLine = setDeadLine(deadLine);
        this.doneOrNot = setDoneOrNot(doneOrNot);
        this.whoisDoing = setWhoisDoing(whoisDoing);
        this.id = id;
    }

    public TodoItem(String title, String xtraInfo) {
        this.title = title;
        this.xtraInfo = xtraInfo;
    }

    public TodoItem(LocalDate deadLine) {
        this.deadLine = deadLine;
    }

    public TodoItem(boolean doneOrNot) {
        this.doneOrNot = doneOrNot;
    }

    public TodoItem(Person whoisDoing) {
        this.whoisDoing = whoisDoing;
    }

    //---------------------------- Constructors End --------------------------------------------------------------
    //||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    //--------------------------------------- Setters ------------------------------------------------------------


    public void setTitle(String title) {
        this.title = title;
    }

    public void setXtraInfo(String xtraInfo) {
        this.xtraInfo = xtraInfo;
    }

    public void setDeadLine(LocalDate deadLine) {
        this.deadLine = deadLine;
    }

    public void setDoneOrNot(boolean doneOrNot) {
        this.doneOrNot = doneOrNot;
    }

    public void setWhoisDoing(Person whoisDoing) {
        this.whoisDoing = whoisDoing;
    }
}


