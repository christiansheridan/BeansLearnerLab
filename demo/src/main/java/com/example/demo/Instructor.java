package com.example.demo;
import org.assertj.core.util.Lists;

import java.lang.reflect.Array;
import java.util.*;

public class Instructor extends Person implements Teacher {


    public Instructor(long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }


    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        List list = Lists.newArrayList(learners);
        int count = list.size();
        for(Learner l: learners){
            l.learn(numberOfHours/count);
        }
    }
}
