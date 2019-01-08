package com.example.demo.Configs;

import com.example.demo.Classroom;
import com.example.demo.Instructors;
import com.example.demo.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig {

    @Bean(name = "currentCohort")
    @DependsOn({"instructors", "students"})
    public Classroom currentCohort(Instructors instructors, Students students){
        return new Classroom(instructors, students);
    }

    @Bean(name = "previousCohort")
    @DependsOn({"instructors", "students"})
    public Classroom previousCohort(Instructors instructors, Students students){
        return new Classroom(instructors, students);
    }

}
