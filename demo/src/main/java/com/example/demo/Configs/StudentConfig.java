package com.example.demo.Configs;

import com.example.demo.Student;
import com.example.demo.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {


    @Bean(name = "students")
    public Students currentStudents(){
        return new Students(
                new Student(0L, "Christian"),
                new Student(1L, "Nick"),
                new Student(2L, "X")
        );

    }


    @Bean(name = "previousStudents")
    public Students previousStudents() {
        return new Students(
                new Student(0L, "Tommy"),
                new Student(1L, "Eric"),
                new Student(2L, "Keith")
        );
    }
}
