package se.lexicon;

public class TodoItemTask {

    //----------------------------------------------- Fields --------------------------------------------------

    private int id;
    private boolean assigned;
    private TodoItem todoItem;
    private Person assignee;

    //------------------------------------------ Fields End -----------------------------------------------------
    //||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    //--------------------------- Constructors -------------------------------------------------------------------


    public TodoItemTask(TodoItem todoItem) {
        this.todoItem = todoItem;
    }

    public String summary(){
        return "ID: "+id+" Assigned: "+assigned+"What to do: "+todoItem+"Assigne"+assignee;
    }


    //---------------------------- Constructors End --------------------------------------------------------------
    //||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    //--------------------------------------- Setters ------------------------------------------------------------

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private boolean isAssigned() {
        return assignee != null;

    }

    //--------------------------------------- Setters End --------------------------------------------------------
    //||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    //--------------------------------------- Getters ------------------------------------------------------------

    public TodoItem getTodoItem() {
        return todoItem;
    }

    public void setTodoItem(TodoItem todoItem) {
        this.todoItem = todoItem;
        //System.out.println("U need to finish training to win CL2025");

    }

    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee) {
        this.assignee = assignee;
        assignee = new Person("Anders", "Fredriksson", "anders@gmail.com", 3);
    }

    //----------------------- GETTERS END-------------------------------------------------------------------------
    //||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    //----------------------- OVERRIDES---------------------------------------------------------------------------

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }


    //----------------------- OVERRIDES END --------------------------------------------------------------------



    //------------------------------- EOF ----------------------------------------------------------------------
}


