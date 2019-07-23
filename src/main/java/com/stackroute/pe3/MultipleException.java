package com.stackroute.pe3;

public class MultipleException {
    public String catchException(String input)
    {
        try
        {
//            null input gives null pointer exception
            int index= input.indexOf('a');
//            for index<0, creates negative size array exception
            int [] indexArray= new int[index];
//            to generate index out of bound exception
            for(int i=0; i<index; i++)
            {
                if(input.contains("@"))
                {
                    indexArray[index]=indexArray[index+index];
                }
            }
            return null;
        }
        catch (NullPointerException nullpointerException)
        {
            return "Null pointer Exception";
        }
        catch (IndexOutOfBoundsException indexOutOfBoundException)
        {
            return "Index out of bound exception";
        }
        catch (NegativeArraySizeException negativeArraySizeException)
        {
            return "Negative Array Size Exception";
        }
    }
}
