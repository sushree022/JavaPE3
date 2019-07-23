package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleExceptionTest {
    public  static MultipleException multipleException;

    /* This methods runs, before running any one of the test case .
          It is used to initialize the required variables
        */
    @Before
    public void setUp()
    {
        multipleException= new MultipleException();
    }

    /* This methods runs, before running any one of the test case .
               It is used to initialize the required variables
             */
    @After
    public void tearDown()
    {
        multipleException = null;
    }

    @Test
    public void testForMultipleCatchSuccess()
    {
        assertEquals("Null pointer Exception", multipleException.catchException(null));

        assertEquals("Index out of bound exception", multipleException.catchException("hel@lo"));

        assertEquals("Negative Array Size Exception", multipleException.catchException("hello"));

    }

    @Test
    public void testForMultipleCatchFailure()
    {
        assertEquals(null, multipleException.catchException("hello"));

    }

}