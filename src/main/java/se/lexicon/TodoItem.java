package se.lexicon;

import java.time.LocalDate;

public class TodoItem {


    //----------------------------------------------- Fields --------------------------------------------------
    private final int id;
    private String title;
    private String xtraInfo;
    private LocalDate deadLine;
    private String whoisDoing;

    //------------------------------------------ Fields End -----------------------------------------------------
    //||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    //--------------------------- Constructors -------------------------------------------------------------------


    public TodoItem(String title, String xtraInfo, LocalDate deadLine, String whoisDoing, int id) {
        setTitle(title);
        this.setXtraInfo(xtraInfo);
        this.setDeadLine(deadLine);
        this.setWhoisDoing("Anders");
        this.id = id;
    }

    public String summary() {
        return "ID:" + id + "Current date: " + LocalDate.now();
    }



//---------------------------- Constructors End --------------------------------------------------------------
    //||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    //--------------------------------------- Setters ------------------------------------------------------------

    public boolean setDeadLine(LocalDate deadLine) {
        System.out.println("Today is " + LocalDate.now() + " and deadline is 2025-08-02");
        boolean deadLineDate = LocalDate.parse("2024-08-02").isBefore(LocalDate.now());
        LocalDate.now().isAfter(LocalDate.parse("2025-08-02")); {
            if (deadLineDate == false) {
            System.out.println("U got time to spare");
            }
         else System.out.println("To slow yo!, deadline was " + LocalDate.parse("2024-08-02"));
        }
        return true;
    }

    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Field cant be null or empty");
        }
        this.title = title;
    }

    public void setXtraInfo(String xtraInfo) {
        System.out.println("Enter valuable information");
    }

    public void setWhoisDoing(String whoisDoing) {
        if (whoisDoing == null || whoisDoing.trim().isEmpty()) {
            throw new IllegalArgumentException("Field cannt be null or empty");
        }
        this.whoisDoing = whoisDoing;
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

        return deadLine;
    }

    public String getWhoisDoing() {
        return whoisDoing;
    }


    public String getSummary() {
        return ("ID: " + id + "\nOrder: " + title + "\nAdditional infromation: " + xtraInfo +
                "\nDue date: " + deadLine + "\nWho did this: " + whoisDoing);

    }
}
























