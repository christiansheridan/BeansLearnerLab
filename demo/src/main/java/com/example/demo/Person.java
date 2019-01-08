package com.example.demo;

public class Person {

    Long id;
    String name;

    public Person(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id){this.id = id;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
