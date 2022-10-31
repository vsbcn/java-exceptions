package com.ironhack.personslist;

import com.ironhack.person.Person;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;

class PersonsListTest {

    @BeforeEach
    void setUp() {

    }

    @Test
    public void findByName_FormattingWithNAmeSurname_ThrowsExceptionIllegalArgumentException() {
        ArrayList<Person> projectPerson = new ArrayList<>();
        projectPerson.add(new Person(01, 21, "James", "Warren", "developer"));
        projectPerson.add(new Person(02, 21, "John", "Warren", "developer"));
        projectPerson.add(new Person(03, 21, "Jou", "Warren", "developer"));
        projectPerson.add(new Person(04, 21, "Jaws", "Warren", "developer"));

        String result = PersonsList.findByName(projectPerson, "Jou");
        Assert.assertEquals("Jou Warren", result);
    }

    @Test
    void testClone_AddingOneToId_CheckNewId() {
        Person testPerson = new Person(01, 21, "James", "Warren", "developer");
        Person clonedPerson = PersonsList.clone(testPerson);
        Assertions.assertEquals(2, clonedPerson.getId());
    }

    @Test
    void equalPerson_PersonShouldHaveSameAttribute_CheckAge() {
        Person testPerson = new Person(01, 21, "James", "Warren", "developer");
        Person clonedPerson = PersonsList.clone(testPerson);
        PersonsList.equalPerson(testPerson,clonedPerson);
        Assertions.assertEquals(22, clonedPerson.getAge());
    }

    @Test
    void printPerson_CheckIfFileIsPrinted_ThrowsIOException() {
        Person testPerson = new Person(01, 21, "James", "Warren", "developer");
        Assert.assertThrows(IOException.class, () -> {
            PersonsList.printPerson(testPerson);
        });
    }

}