package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter number: ");
       Scanner reader = new Scanner(System.in);
       int number = reader.nextInt();

       if (number>0){
           number = number*2;
           System.out.println(number);
       }else if(number<0){
           number++;
           System.out.println(number);
           
       }else{System.out.println(number);}
    }

}