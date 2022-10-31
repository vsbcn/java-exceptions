package com.ironhack.personslist;

import com.ironhack.person.Person;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class PersonsList {
    private static ArrayList<Person> personArrayList;

    public PersonsList(ArrayList<Person> personArrayList) {
        setPersonArrayList(personArrayList);
    }

    public ArrayList<Person> getPersonArrayList() {
        return personArrayList;
    }

    public void setPersonArrayList(ArrayList<Person> personArrayList) {
        this.personArrayList = personArrayList;
    }

    public static String findByName(ArrayList<Person> personArrayList, String name) throws IllegalArgumentException {

        String firstName = null;
        String lastName = null;
        String result;
        for (int i = 0; i < personArrayList.size(); i++) {
            if (personArrayList.get(i).getName().equals(name)) {
                firstName = personArrayList.get(i).getName();
                lastName = personArrayList.get(i).getLastName();
            }
        }

        result = firstName + " " + lastName;
        if (result.contains(firstName + " " + lastName)) {
            return result;
        } else {
            throw new IllegalArgumentException("String does not match the desired structure.");
        }
    }

    public static Person clone(Person equalPerson) {
        Person clonedPerson = new Person(
                equalPerson.getId() + 1, equalPerson.getAge(), equalPerson.getName(),
                equalPerson.getLastName(), equalPerson.getOccupation()
        );
        return clonedPerson;
    }

    public static boolean equalPerson(Person firstPerson, Person secondPerson) {
        boolean result =
                firstPerson.getAge() == (secondPerson.getAge()) &&
                        firstPerson.getName().equals(secondPerson.getName()) &&
                        firstPerson.getLastName().equals(secondPerson.getLastName()) &&
                        firstPerson.getOccupation().equals(secondPerson.getOccupation());
        return result;
    }

    public static void printPerson(Person printPerson) throws IOException {

        FileWriter fileWriter = new FileWriter("person.txt", false);

        fileWriter.write(" ID: " + printPerson.getId() + "\n");
        fileWriter.write(" Age: " + printPerson.getAge() + "\n");
        fileWriter.write(" Name: " + printPerson.getName() + "\n");
        fileWriter.write(" Last Name: " + printPerson.getLastName() + "\n");
        fileWriter.write(" Occupation: " + printPerson.getOccupation() + "\n");

        fileWriter.close();
    }

}