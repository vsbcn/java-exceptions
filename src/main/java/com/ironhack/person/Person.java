package com.ironhack.person;
public class Person {
    private int id;
    private int age;
    private String name;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String lastName;
    private String occupation;

    public int getId() {
        return id;
    }

    public Person(int id, int age, String name, String lastName, String occupation) {
       setId(id);
       setAge(age);
       setName(name);
       setLastName(lastName);
       setOccupation(occupation);
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws RuntimeException {
        if(age <= 0){
            throw new RuntimeException("The age should be more than 0");
        } else {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

}
