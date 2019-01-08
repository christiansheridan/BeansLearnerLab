package com.example.demo.Configs;

import com.example.demo.Instructor;
import com.example.demo.Instructors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class InstructorsConfig {

    @Bean(name = "tcUSAInstructors")
    public Instructors tcUSAInstructors(){
        return new Instructors(
                new Instructor(0L, "Wilhelm"),
                new Instructor(4L, "Nhu"),
                new Instructor(5L, "Kris")
        );
    }

    @Bean(name = "tcUKInstructors")
    public Instructors tcUKInstructors(){
        return new Instructors(
                new Instructor(1L, "Leon"),
                new Instructor(2L, "Dolio"),
                new Instructor(3L, "Froilan")
        );
    }

    @Primary
    @Bean
    public Instructors instructors(){
        Instructors instructors = tcUKInstructors();
        instructors.addAll(tcUSAInstructors());
        return instructors;
    }
}
