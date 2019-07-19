package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {
    StudentMarks studentMarks;

    /* This methods runs, before running any one of the test case .
          It is used to initialize the required variables
   */
@Before
    public void setup()
{
//    arrange
    studentMarks= new StudentMarks();
}
    /* This method runs, after running all the test cases
           It is used to clear the initialized variables
    */
@After
    public void teardown()
{
    studentMarks=null;
}

@Test
    public void givenInputShouldReturnAnInteger()
{
//    act
    int actualresult= this.studentMarks.detailsOfStudents(3);
//    assert
    assertEquals(3, actualresult);
}
@Test
    public void givenInputShouldReturnAIntArray()
{
//    act
    int [] grades={87, 90, 65};
    int [] actualresult= this.studentMarks.detailsOfStudents(grades);
}
}