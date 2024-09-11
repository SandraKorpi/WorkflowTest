package se.dsve;

import java.util.List;

public interface PersonCrud {

    // Skapa en ny person
    void addPerson(Person person);

    // Hämta en person baserat på namn
    Person getPersonByName(String name);

    // Hämta alla personer
    List<Person> getAllPersons();

    // Uppdatera en persons information
    void updatePerson(String name, Person person);

    // Ta bort en person
    void deletePerson(String name);
}
