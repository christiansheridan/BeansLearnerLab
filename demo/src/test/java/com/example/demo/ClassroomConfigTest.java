package com.example.demo;

import com.example.demo.Configs.ClassroomConfig;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClassroomConfigTest {

    private Classroom currentCohort;
    private Classroom previousCohort;
    private Students currentStudents;
    private Students previousStudents;
    private Instructors instructors;

    @Autowired
    ClassroomConfig classroomConfig;

    @Before
    public void before(){
        currentStudents = new Students();
        previousStudents = new Students();
        instructors = new Instructors();
        currentCohort = classroomConfig.currentCohort(instructors, currentStudents);
        previousCohort = classroomConfig.previousCohort(instructors, previousStudents);
    }

    @Test
    public void testCurrentCohort(){
        Assert.assertEquals(currentCohort, classroomConfig.currentCohort(instructors, currentStudents));
    }

    public void testPreviousCohort(){
        Assert.assertEquals(previousCohort, classroomConfig.previousCohort(instructors, previousStudents));
    }

}
