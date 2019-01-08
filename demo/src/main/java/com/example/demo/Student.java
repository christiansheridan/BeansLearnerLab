package com.example.demo;

public class Student extends Person implements Learner {

    Double totalStudyTime;

    public Student(){
        this(null, null);
    }

    @Override
    public void learn(double numberOfHours){
        totalStudyTime+= numberOfHours;
    }

    public Student(Long id, String name) {
        super(id, name);
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
