package com.example.demo.Configs;

import com.example.demo.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {


    @Bean(name = "students")
    public Students currentStudents(){
        return new Students();

    }


    @Bean(name = "previousStudents")
    public Students previousStudents() {
        return new Students();
    }
}
