package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/


import java.util.Calendar;
import java.util.Date;


public class Solution {
    public static void main(String[] args) {
        int Date;
        int Month;
        int Year;
        Calendar calendar = Calendar.getInstance();
        Date = calendar.get(Calendar.DAY_OF_MONTH);
        Month = Integer.parseInt(String.valueOf(calendar.get(Calendar.MONTH)));
        Month++;
        Year = calendar.get(Calendar.YEAR);
        System.out.println(Date+" "+Month+" "+Year);

    }
}
