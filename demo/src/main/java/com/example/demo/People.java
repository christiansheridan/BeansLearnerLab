package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

abstract public class People<PersonType extends Person> implements Iterable<PersonType>{

    private final List<PersonType> list;

    public People(List<PersonType> list) {
        this.list = list;
    }

    public People(PersonType... persons){
        this(new ArrayList<>(Arrays.asList(persons)));
    }

    public void addAll(Iterable<? extends PersonType> iterable){ iterable.forEach(person -> list.add(person));}

    void add (PersonType person){
        list.add(person);
    }

    void remove(PersonType person) {
        list.remove(person);
    }

    int size() {
        return list.size();
    }

    void clear() {
        list.clear();
    }

    PersonType findById(Long id){
        return list
                .stream()
                .filter(person -> person.getId().equals(id))
                .findFirst()
                .get();
    }

    @Override
    public Iterator<PersonType> iterator() {return this.iterator();}
}
