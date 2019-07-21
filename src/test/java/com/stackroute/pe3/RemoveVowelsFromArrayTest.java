//package com.stackroute.pe3;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class RemoveVowelsFromArrayTest {
//    RemoveVowelsFromArray removeVowelsFromArray;
//    /* This methods runs, before running any one of the test case .
//              It is used to initialize the required variables
//       */
//    @Before
//    public void setup()
//    {
////        arrange
//        removeVowelsFromArray= new RemoveVowelsFromArray();
//    }
//    /* This method runs, after running all the test cases
//          It is used to clear the initialized variables
//   */
//    @After
//    public void teardown()
//    {
//        removeVowelsFromArray= null;
//    }
//    @Test
//    public void givenArrayOfStringsShouldReturnArrayOfStringsWithoutVowel()
//    {
////      act
//        String[] result= {"india","japan"};
//        String [] actualresult= removeVowelsFromArray.vowelRemove(result);
//        String[] expectedresult= {"0 nd","1 jpn"};
////        assert
//        assertArrayEquals(expectedresult,actualresult);
//    }
//    @Test
//    public void givenArrayOfStringsHavingUppercaseShouldReturnArrayOfStringsWithoutVowel()
//    {
////      act
//        String[] result= {"India","Japan"};
//        String [] actualresult= removeVowelsFromArray.vowelRemove(result);
//        String[] expectedresult= {"0 nd","1 jpn"};
////        assert
//        assertArrayEquals(expectedresult,actualresult);
//    }
//}