package se.lexicon;

import java.time.LocalDate;

public class TodoItem {



    //----------------------------------------------- Fields --------------------------------------------------
    private int id;
    private String title;
    private String xtraInfo;
    private LocalDate deadLine;
    private boolean doneOrNot;
    private String whoisDoing;

    //------------------------------------------ Fields End -----------------------------------------------------
    //||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    //--------------------------- Constructors -------------------------------------------------------------------


    public TodoItem(String title, String xtraInfo, LocalDate deadLine, boolean doneOrNot, String whoisDoing, int id) {
        setTitle(title);
        this.setXtraInfo(xtraInfo);
        this.setDeadLine(deadLine);
        this.setDoneOrNot(doneOrNot);
        this.setWhoisDoing("Anders");
        this.id = id;

    }
    public String summary(){
        return "ID:"+id + "Current date: " + LocalDate.now();
    }




    //---------------------------- Constructors End --------------------------------------------------------------
    //||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    //--------------------------------------- Setters ------------------------------------------------------------


    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Field cant be null or empty");
        }
        this.title = title;
    }

    public void setXtraInfo(String xtraInfo) {
        System.out.println("Enter valuable information");
    }

    public boolean setDeadLine(LocalDate deadLine) {

        LocalDate deadLineDate = LocalDate.parse("2025-08-02");

        LocalDate dateOfToday = LocalDate.now();
        if (dateOfToday.isAfter(deadLineDate)){
           throw new IllegalStateException("Workorder is overdue! Punishment is at hand");
        }
        return getDeadLine().isAfter(LocalDate.now());
    }




    public void setDoneOrNot(boolean doneOrNot) {
        int done = 1;
        if(done > 0) {
            System.out.println("Workorder is done");

        } else {
            System.out.println("Workoder isnt done, step up the pace!");

        }



    }

    public void setWhoisDoing(String whoisDoing) {
        setWhoisDoing("Anders");
    }

    //--------------------------------------- Setters End --------------------------------------------------------
    //||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    //--------------------------------------- Getters --------------------------------------------------------


    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getXtraInfo() {
        return xtraInfo;
    }

    public LocalDate getDeadLine() {
        LocalDate dateOfToday = LocalDate.now();
        if (dateOfToday.isAfter(deadLine)){
        }
        return deadLine;
    }



    public String getWhoisDoing() {
        return whoisDoing;
    }

    public String getSummary(){
        return ("ID: " + id + "Order: " + title + "Additional infromation: " + xtraInfo + "Due date: " + deadLine + "Is it done: " + doneOrNot + "Who did this: " + whoisDoing);
    }
}
























