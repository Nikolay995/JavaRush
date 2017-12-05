package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Date date = sdf.parse(reader.readLine());
        SimpleDateFormat sdf1 = new SimpleDateFormat("MMM dd, YYYY");
        System.out.println(sdf1.format(date).toUpperCase());
    }
}
