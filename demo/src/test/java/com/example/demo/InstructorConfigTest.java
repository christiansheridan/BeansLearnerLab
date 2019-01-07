package com.example.demo;

import com.example.demo.Configs.InstructorsConfig;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InstructorConfigTest {

    private Instructors instructors;
    private Instructors tcUKInstructors;
    private Instructors tcUsaInstructors;


    @Autowired
    InstructorsConfig instructorsConfig;

    @Before
    public void before(){
        instructors = instructorsConfig.instructors();
        tcUKInstructors = instructorsConfig.tcUKInstructors();
        tcUsaInstructors = instructorsConfig.tcUSAInstructors();
    }

    @Test
    public void testUSAInstructors(){
        Assert.assertEquals(tcUsaInstructors, instructorsConfig.tcUSAInstructors());
    }


}
