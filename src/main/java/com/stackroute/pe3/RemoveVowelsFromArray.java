package com.stackroute.pe3;
/* From a array of strings vowels are removed and
    array of strings without vowels is returned.
 */

public class RemoveVowelsFromArray {
    public String[] vowelRemove(String[] names)
    {
        String[] result= new String[2];
//        logic for removal of vowels from array
        for(int i=0; i<names.length; i++)
        {
            String namePart= names[i];
//            checking of presence of vowels both in lower and uppercase
            if(namePart.charAt(i)=='a'|| namePart.charAt(i)=='e'||namePart.charAt(i)=='i'||namePart.charAt(i)=='o'
                ||namePart.charAt(i)=='u'||namePart.charAt(i)=='A'||namePart.charAt(i)=='E'||namePart.charAt(i)=='I'
                ||namePart.charAt(i)=='O'||namePart.charAt(i)=='U') {
                result[i] = names[i].replaceAll("a|e|i|o|u|A|E|I|O|U", "");
            }
        }
        return result;
    }
}
