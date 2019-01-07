package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Alumni {

    @Autowired
    private Instructors instructors;

    @Autowired
    private  Students previousStudents;

    @PostConstruct
    public void executeBootCamp(int id){
        Classroom classroom = new Classroom(instructors, previousStudents);
        int hoursTaughtTotal = 1200;
//        int hoursTaughtEach = hoursTaughtTotal/instructors.size();

//        for(Instructor instructor: instructors){
//            classroom.hostLecture(instructor, hoursTaughtEach);
//        }
//
//        public Instructors getInstructors(){
//            return instructors;
//        }
//
//        public Students getStudents(){
//            return previousStudents;
//        }

    }

}
