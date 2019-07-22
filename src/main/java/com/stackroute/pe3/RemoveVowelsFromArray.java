package com.stackroute.pe3;

public class RemoveVowelsFromArray {
    public String[] vowelRemove(String[] names)
    {
        String[] result= null;
        for(int i=0; i<names.length; i++)
        {
            result[i]= names[i].replaceAll("[aeiou]","");
        }
        return result;
    }
}
