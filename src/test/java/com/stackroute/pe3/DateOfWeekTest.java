package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DateOfWeekTest {
    DateOfWeek dateOfWeek;
    /* This methods runs, before running any one of the test case .
          It is used to initialize the required variables
   */
    @Before
    public void setup()
    {
//    arrange
        dateOfWeek= new DateOfWeek();
    }
    /* This method runs, after running all the test cases
           It is used to clear the initialized variables
    */
    @After
    public void teardown()
    {
        dateOfWeek=null;
    }
    @Test
    public void givenStartAndEndDateShouldReturnAString()
    {
//        act
        String[] actualresult= dateOfWeek.calculateDate();
        String[] expectedresult= {"Mon 14/07/2019 Sun 21/07/2019"};
//        assert
        assertArrayEquals(expectedresult,actualresult);
    }
}

