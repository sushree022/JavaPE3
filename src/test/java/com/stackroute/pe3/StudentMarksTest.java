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
    public void givenInputShouldReturnAString()
{
//    act
    int noOfStudents= 3;
    int [] grades={87, 90, 65};
    String actualresult= this.studentMarks.detailsOfStudents(noOfStudents, grades);
//    assert
    assertEquals("students grades saved", actualresult);
}

    @Test
    public void givenInputShouldReturnAnErrorMessage()
    {
//    act
        int [] grades={87, 90, 59, 70, 65};
        int noOfStudents=3;
        String actualresult= this.studentMarks.detailsOfStudents(noOfStudents, grades);
//    assert
        assertEquals("invalid input", actualresult);
    }

    @Test
    public void givenInputGradesShouldReturnAStringMessage()
    {
//    act
        int noOfStudents=5;
        int [] grades={87, -90, 59, -70, 165};
        String actualresult= this.studentMarks.detailsOfStudents(noOfStudents, grades);
//    assert
        assertEquals("Grades should be in range of 0-100", actualresult);
    }
    @Test
    public void givenNegativeNoOfStudentsShouldReturnAStringMessage()
    {
//    act
        int noOfStudents=-7;
        int [] grades={87, 90, 59, 70, 65};
        String actualresult= this.studentMarks.detailsOfStudents(noOfStudents, grades);
//    assert
        assertEquals("Number Of students can not be negative", actualresult);
    }
}