package se.lexicon;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person testObject;

    @Test
    void setValidFirstName() {
        String expextedFN = "TAMAS";
        testObject = new Person("Tamas", "Test", "test@test.se", 1);
        testObject.setFirstName("TAMAS");
        assertEquals(expextedFN, testObject.getFirstName());

    }


    @Test
    void setInValidFirstName() {
        String expextedFN = "Tamas";
        testObject = new Person("Tamas", "Test", "test@test.se", 1);
        testObject.setFirstName("TAMAS");
        assertNotEquals(expextedFN, testObject.getFirstName());
    }

    @Test
    void setLastName() {
    }

    @org.junit.jupiter.api.Test
    void seteMail() {
    }

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testSetFirstName() {
    }

    @Test
    void testSetLastName() {
    }

    @Test
    void testSeteMail() {
    }
}