package com.stackroute.pe3;

public class RemoveVowelsFromArray {
    public String[] vowelRemove(String[] names)
    {
        String[] result= new String[2];
        for(int i=0; i<names.length; i++)
        {
            String namePart= names[i];
            if(namePart.charAt(i)=='a'|| namePart.charAt(i)=='e'||namePart.charAt(i)=='i'||namePart.charAt(i)=='o'
                ||namePart.charAt(i)=='u'||namePart.charAt(i)=='A'||namePart.charAt(i)=='E'||namePart.charAt(i)=='I'
                ||namePart.charAt(i)=='O'||namePart.charAt(i)=='U') {
                result[i] = names[i].replaceAll("a|e|i|o|u|A|E|I|O|U", "");
            }
        }
        return result;
    }
}
