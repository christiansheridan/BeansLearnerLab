package com.example.demo;

import java.util.Iterator;

public class Instructors extends People<Instructor> {



    public Instructors(Instructor... instructors){
        super(instructors);
    }

    @Override
    public Iterator<Person> iterator() {
        return null;
    }

}
