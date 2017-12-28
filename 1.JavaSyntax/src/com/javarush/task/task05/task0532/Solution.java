package com.javarush.task.task05.task0532;

import java.io.*;
import java.util.Arrays;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int num[] = new int[n];
        int maximum = 0 ;
        for (int i = 0; i <num.length; i++) {
            num[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(num);
        int last = num.length-1;
        maximum = num[last];



        System.out.println(maximum);
    }
}
