package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExceptionTest {
    static Exception exception;
    /* This methods runs, before running any one of the test case .
       It is used to initialize the required variables
     */
    @Before
    public void setup()
    {
//        arrange
        exception=  new Exception("exceptionThrow");
    }

    /* This methods runs, before running any one of the test case .
           It is used to initialize the required variables
         */
    @After
    public void teardown()
    {
        exception=null;
    }

    @Test
    public void testExceptionThrow()
    {
//        act
        String actualResult= exception.throwException();
        String expectedResult="Exception is caught";
//        assert
        assertEquals(expectedResult,actualResult);
    }
}