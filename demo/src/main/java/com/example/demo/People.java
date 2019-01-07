package com.example.demo;

import java.util.ArrayList;

public abstract class People<PersonType extends Person> implements Iterable<Person>{


    protected ArrayList<Person> personList;

    public People(ArrayList<Person> personList) {
        this.personList = personList;
    }

    public People(Student[] instructors) {
    }

    public People(Instructor[] instructors) {
    }
}
