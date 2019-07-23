package com.stackroute.pe3;

public class Exception extends Throwable{
    public Exception(String exceptionThrow)
    {
    }
    public String throwException()
    {
        String result="";
        try {
            throw new Exception("Exception throw");
        }
        catch (Exception e)
        {
            result= result+"Exception is caught";
        }
        return result;
    }

}
