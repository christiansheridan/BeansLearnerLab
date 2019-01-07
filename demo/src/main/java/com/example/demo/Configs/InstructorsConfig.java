package com.example.demo.Configs;

import com.example.demo.Instructors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class InstructorsConfig {

    @Bean(name = "tcUSAInstructors")
    public Instructors tcUSAInstructors(){
        return new Instructors();
    }

    @Bean(name = "tcUKInstructors")
    public Instructors tcUKInstructors(){
        return new Instructors();
    }

    @Primary
    @Bean
    public Instructors instructors(){
        return new Instructors();
    }
}
