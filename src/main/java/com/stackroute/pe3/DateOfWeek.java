package com.stackroute.pe3;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateOfWeek {
    public String [] calculateDate(){
//        calender is set to current date and time
        Calendar calendar=Calendar.getInstance();
//        Calender is set to Monday of current week
        calendar.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);
        DateFormat dateFormat= new SimpleDateFormat("EEE dd/mm/yyyy");
        String date1= dateFormat.format(calendar.getTime());
        for(int i=0; i<6; i++)
        {
            calendar.add(Calendar.DATE, 1);
        }
        String date2= dateFormat.format(calendar.getTime());
        String[] result= {date1, date2};
        return result;
    }

}
