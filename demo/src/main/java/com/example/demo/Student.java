package com.example.demo;

public class Student extends Person implements Learner {

    double totalStudyTime;

    public void learn(double numberOfHours){
        totalStudyTime+= numberOfHours;
    }

    public Student(long id, String name) {
        super(id, name);
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
