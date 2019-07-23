package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumberTest {
    ConsecutiveNumber consecutiveNumber;

    /* This methods runs, before running any one of the test case .
       It is used to initialize the required variables
     */
    @Before
    public void setup()
    {
//        arrange
        consecutiveNumber=  new ConsecutiveNumber();
    }

    /* This methods runs, before running any one of the test case .
           It is used to initialize the required variables
         */
    @After
    public void teardown()
    {
        consecutiveNumber=null;
    }

    @Test
    public  void givenInputStringOfConsecutiveNumbersShouldReturnAStringMessage()
    {
//        act
        String input=("12,13,14,15");
        String actualResult= consecutiveNumber.consecutiveNumberTest(input);
//        assert
        String expectedResult="Numbers are consecutive";
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public  void givenInputStringOfNonConsecutiveNumbersSholdReturnAStringMessage()
    {
//        act
        String input=("12,13,15,98");
        String actualResult= consecutiveNumber.consecutiveNumberTest(input);
//        assert
        String expectedResult="Numbers are not consecutive";
        assertEquals(expectedResult,actualResult);
    }
}