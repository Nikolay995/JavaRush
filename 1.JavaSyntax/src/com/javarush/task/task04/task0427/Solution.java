package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) throws Exception {
        String a = new Scanner(System.in).nextLine();
        int aInt = Integer.parseInt(a);
        //System.out.println(a+" "+aInt);
        int len = a.length();
        if (aInt>0 && aInt<1000){
                 if (len==1 && aInt%2==0) System.out.println("четное однозначное число");
            else if (len==1 && aInt%2!=0) System.out.println("нечетное однозначное число");
            else if (len==2 && aInt%2==0) System.out.println("четное двузначное число");
            else if (len==2 && aInt%2!=0) System.out.println("нечетное двузначное число");
            else if (len==3 && aInt%2==0) System.out.println("четное трехзначное число");
            else if (len==3 && aInt%2!=0) System.out.println("нечетное трехзначное число");
        }

    }
}
