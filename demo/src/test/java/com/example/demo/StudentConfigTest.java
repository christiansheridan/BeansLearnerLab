package com.example.demo;

import com.example.demo.Configs.StudentConfig;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentConfigTest {

    private  Students currentStudents;
    private  Students previousStudents;

    @Autowired
    StudentConfig studentConfig;

    @Before
    public void before(){
        currentStudents = studentConfig.currentStudents();
        previousStudents = studentConfig.previousStudents();
    }

    @Test
    public void testCurrentStudents(){
        Assert.assertEquals(currentStudents, studentConfig.currentStudents());
    }

    @Test
    public void testPreviousStudents(){
        Assert.assertEquals(previousStudents, studentConfig.previousStudents());
    }

}
