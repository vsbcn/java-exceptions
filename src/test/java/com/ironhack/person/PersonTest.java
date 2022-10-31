package com.ironhack.person;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @BeforeEach
    void setUp(){
        Person testPerson = new Person(01,21,"Jack","Wolf","accauntant");
    }

//    @Test
//    public void setAge_ageShouldBePositive_ThrowsNegativeNumberException() {
//        //Change setAge to static, return in and age public to pass the test since
//        assertThrows(RuntimeException.class, () -> {Person.setAge(-1);});
//    }
}