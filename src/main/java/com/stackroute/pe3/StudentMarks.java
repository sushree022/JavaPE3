package com.stackroute.pe3;

public class StudentMarks {
    public String detailsOfStudents(int noOfStudents, int[] studentGrades)
    {
        for(int i=0; i<studentGrades.length; i++)
        {
            if (studentGrades[i]<0)
            {
                return ("Grades can not be negative");
            }
        }
        if(noOfStudents>0) {
            if (noOfStudents == studentGrades.length)
                return ("students grades saved");
            else
                return ("invalid input");
        }
        else
            return ("Number Of students can not be negative");
    }
}
