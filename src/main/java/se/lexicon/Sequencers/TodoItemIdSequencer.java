package se.lexicon.Sequencers;

public class TodoItemIdSequencer {

    private static int currentId;

    public int nextId(){
        this.currentId = currentId++;
        return currentId;
    }

    public int getCurrentId() {
        System.out.println("Id is" + currentId);
        return currentId;
    }

    public void setCurrentId(int currentId) {
        this.currentId = currentId;
    }
}
