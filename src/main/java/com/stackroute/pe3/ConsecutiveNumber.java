package com.stackroute.pe3;

public class ConsecutiveNumber {
    public String consecutiveNumberTest(String input) {
//        String is splited
        String[] splitNumbers = input.split(",");
        int i=0;
        if (splitNumbers != null) {
            for (i = 0; i < splitNumbers.length; i++) {
//            current value is subtracted from next value
                if (Math.abs(splitNumbers[i].charAt(0) - splitNumbers[i + 1].charAt(0)) == 1) {
                    continue;
                } else break;
            }
            if (i == splitNumbers.length - 1)
                return "Numbers are consecutive";
            else
                return "Numbers are not consecutive";
        }
        else
            return "invlid input";
    }
}