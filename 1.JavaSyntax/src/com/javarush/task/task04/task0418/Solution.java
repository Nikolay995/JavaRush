package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;
import java.lang.System;
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       // System.out.println("enter a: ");
       // System.out.println("enter b: ");
        int a = Integer.parseInt(reader.readLine()), b = Integer.parseInt(reader.readLine());
        if (a<b) System.out.println(a);
        else if (a>b) System.out.println(b);
        else System.out.println(a);


    }}
