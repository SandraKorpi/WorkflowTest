package se.dsve;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.verify;

public class PersonCrudTests {


    private PersonCrud mockService;

    @BeforeEach
    public void setUp() {
        //skapar en mock av personcrud.
        mockService = Mockito.mock(PersonCrud.class);
    }

    @Test
    public void testAddPerson() {
        //Skapar en person att testa med.
        Person testPerson = new Person("Sandra", 31);

        //Lägger till personen, testar metoden
        mockService.addPerson(testPerson);

        // Verifierar att metoden fungerade.
        verify(mockService).addPerson(testPerson);
    }

    @Test
    public void testGetPersonByName() {
        //
        Person testPerson = new Person("Sandra", 31);
        // Vad jag önskar mock ska göra.
        Mockito.when(mockService.getPersonByName("Sandra")).thenReturn(testPerson);
        // Anropa metoden
        Person result = mockService.getPersonByName("Sandra");
        // Kontrollera att det fungerar
        Mockito.verify(mockService).getPersonByName("Sandra");
        assertEquals(testPerson, result);
    }


    @Test
    public void testGetAllPersons() {
        // Skapa en lista med mockade Person-objekt.
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Sandra", 31));
        persons.add(new Person("Sari", 54));
        //Det vi vill ska hända.
        Mockito.when(mockService.getAllPersons()).thenReturn(persons);
        //Anropa metoden.
        List<Person> result = mockService.getAllPersons();
        //Kontrollera resultatet.
        Mockito.verify(mockService).getAllPersons();
        assertEquals(persons, result);
    }

    @Test
    public void testUpdatePerson() {
        // Skapa en riktig person att testa med.
        Person testPerson = new Person("Sandra", 31);

        // Anropa metoden som ska testas
        mockService.updatePerson("Sari", testPerson);

        // Verifiera att metoden anropades med rätt argument
        Mockito.verify(mockService).updatePerson("Sari", testPerson);
    }

    @Test
    public void testDeletePerson() {
        // Skapa en lista med personer
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Sandra",31));
        persons.add(new Person("Sari", 53));
        persons.add(new Person("Sylvia", 32));

        // Mocka service-metoden för att returnera din lista
        Mockito.when(mockService.getAllPersons()).thenReturn(persons);

        // Anropa metoden som ska testas
        mockService.deletePerson("Sandra");

        // Verifiera att metoden anropades med rätt argument
        Mockito.verify(mockService).deletePerson("Sandra");

        // Kontrollera att "Sandra" inte längre finns i listan
        assertFalse(persons.contains("Sandra"));
    }
}

