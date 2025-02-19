package se.lexicon.DAO;

import se.lexicon.Todo.Person;

import java.util.List;

public interface PersonDAO {

    Person persist(Person person);
    int findById(int id);
    String findByEmail(String email);
    List<Person> findAll();
    void remove(int id);



}
