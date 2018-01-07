package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.IllegalFormatException;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = 0;
        int num2 = 0;
        num1 = Integer.parseInt(reader.readLine());
        num2 = Integer.parseInt(reader.readLine());
        if (num1 <=0 || num2<=0){throw new IllegalArgumentException("asd");}
            while (num1 != 0 && num2 != 0) {
                if (num1 > num2) {
                    num1 %= num2;
                } else {
                    num2 %= num1;
                }
            }

            System.out.println( num1 + num2);





    }
}
