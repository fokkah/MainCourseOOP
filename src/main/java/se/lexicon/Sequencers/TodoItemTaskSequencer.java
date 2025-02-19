package se.lexicon.Sequencers;

public class TodoItemTaskSequencer {

    private static int currentId;

    public static int nextId(){
        currentId = currentId++;
        return currentId;
    }


    public static int getCurrentId() {
        return currentId;
    }

    public static void setCurrentId(int currentId) {
        currentId = currentId;
    }
}
