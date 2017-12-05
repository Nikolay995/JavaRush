package com.javarush.task.task05.task0507;
import java.io.*;
import  java.util.Scanner;
/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double a = 0;
        double x;
        for (int i = 1;; i++) {
            int n = Integer.parseInt(reader.readLine());
            a = a + n;
            if (n == -1) {
                x = (a + 1) / (i - 1);
                System.out.println(x);
                return;
            }
        }
    }}
