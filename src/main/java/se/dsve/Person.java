package se.dsve;

import java.util.ArrayList;
import java.util.List;

public class Person implements PersonCrud {
    private String name;
    private int age;
    private List<Person> persons;

    // Standardkonstruktör
    public Person() {
    }

    // Konstruktör med alla egenskaper
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.persons = new ArrayList<>();
    }

    // Getter för namn
    public String getName() {
        return name;
    }

    // Setter för namn
    public void setName(String name) {
        this.name = name;
    }

    // Getter för ålder
    public int getAge() {
        return age;
    }

    // Setter för ålder
    public void setAge(int age) {
        this.age = age;
    }

    // En metod för att returnera en strängrepresentation av objektet
    @Override
    public String toString() {
        return "Person{" +
                "namn='" + name + '\'' +
                ", ålder=" + age +
                '}';
    }

    @Override
    public void addPerson(Person person) {
        //Lägger till person i listan persons.
      this.persons.add(person);
    }

    @Override
    public Person getPersonByName(String name) {
        //går igenom listan och letar efter det angivna namnet.
        for (Person person : persons) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        return null;
    }

    @Override
    public List<Person> getAllPersons() {
        //Returnerar listan persons.
        return persons;

    }

    @Override
    public void updatePerson(String name, Person person) {
        //Letar upp namnet som ska uppdateras i listan och sätter ett nytt namn om det hittas.
        for (Person p : persons) {
            if (p.getName().equals(name)) {
                p.setName(person.getName());
                break;
            }
        }

    }

    @Override
    public void deletePerson(String name) {
        //Går igenom listan Persons och letar efter namnet som ska raderas.
        //Raderar.
        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i).getName().equals(name)) {
                persons.remove(i);
                break;
            }
        }}}
