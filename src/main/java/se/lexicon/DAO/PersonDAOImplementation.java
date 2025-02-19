package se.lexicon.DAO;

import se.lexicon.Todo.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonDAOImplementation implements PersonDAO{

    private List<Person> personList = new ArrayList<>();

    @Override
    public Person persist(Person person) {
        personList.add(person);
        return person;
    }

    @Override
    public int findById(int id) {
        if (!personList.contains(findById(id))){
            throw new IllegalArgumentException("No reistration with that ID");
        }
        return id;
    }

    @Override
    public String findByEmail(String email) {
        if (!findByEmail(email).contains(email)) {
            throw new IllegalArgumentException("No registration with that e-mail");
        }
        return email;
    }

    @Override
    public List<Person> findAll() {
        return personList;
    }

    @Override
    public void remove(int id) {
        personList.remove(id);

    }
}
