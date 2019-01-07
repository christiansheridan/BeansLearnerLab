package com.example.demo;

import java.util.ArrayList;
import java.util.Iterator;


public class Students extends People {

    public Students(ArrayList<Student> personList) {
        super(personList);
    }

    public Students(Student ... student){
        super(student);
    }


    @Override
    public Iterator<Student> iterator() {
        return this.personList.iterator();
    }

}
