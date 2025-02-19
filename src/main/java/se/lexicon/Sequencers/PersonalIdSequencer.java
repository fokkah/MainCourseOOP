package se.lexicon.Sequencers;

import org.w3c.dom.css.Counter;
import se.lexicon.Todo.Person;

public class PersonalIdSequencer {

      private static int currentId;


    public static int nextId(){
        currentId = currentId++;
        return currentId;
    }


    public static void setCurrentId(int currentId) {
        currentId = nextId();
    }

    public static int getCurrentId() {
        System.out.println("Id is " + currentId);
        return currentId;
    }































}
