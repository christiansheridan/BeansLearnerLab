package com.example.demo.Configs;

import com.example.demo.Classroom;
import com.example.demo.Instructors;
import com.example.demo.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClassroomConfig {

    @Bean(name = "currentCohort")
    public Classroom currentCohort(Instructors instructors, Students students){
        return new Classroom(instructors, students);
    }

    @Bean(name = "previousCohort")
    public Classroom previousCohort(Instructors instructors, Students previousStudents){
        return new Classroom(instructors, previousStudents);
    }

}
