package com.ironhack;

import com.ironhack.person.Person;
import com.ironhack.personslist.PersonsList;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

//Create a Person class that has properties id, name, age, and occupation.
//Throw an error if someone tries to set age to less than 0. Include all tests.

        Person testPerson = new Person(01, 21, "James", "Warren", "developer");

//Create a PersonsList class that holds a List of Person objects. Create a findByName method.
//The method should take in a String name and return the Person with a name that matches exactly.
//The Person name property and the method name parameter should be formatted as "firstName lastName".
//Throw an exception if the name parameter is not properly formatted. Include all tests.

        ArrayList<Person> projectPerson = new ArrayList<>();

        projectPerson.add(new Person(01, 21, "James", "Warren", "developer"));
        projectPerson.add(new Person(02, 21, "John", "Warren", "developer"));
        projectPerson.add(new Person(03, 21, "Jou", "Warren", "developer"));
        projectPerson.add(new Person(04, 21, "Jaws", "Warren", "developer"));

        System.out.println(PersonsList.findByName(projectPerson,"Jou"));

//Create a clone method. The clone method should take in a Person object and return a nearly identical object with new id.
//Override the equals method in the Person class to test for equivalency excluding id. Include all tests.

        Person clonedPerson = PersonsList.clone(testPerson);
        System.out.println(testPerson.getId());
        System.out.println(clonedPerson.getId());
        boolean checkEquality = PersonsList.equalPerson(testPerson,clonedPerson);
        System.out.println(checkEquality);

//Create a method that takes a Person object as a parameter and used the toString method to write the Person information
//to a file. Handle any errors as necessary.

        PersonsList.printPerson(testPerson);
    }
}
