package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] a = new int[10];
        int[] b = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i <a.length ; i++) {
            a[i] = Integer.parseInt(reader.readLine());
        }
        for (int j = 0; j <b.length ; j++) {
            b[9-j] = a[j];
        }
        for (int k = 0; k <b.length ; k++) {
            System.out.println(b[k]);

        }
    }
}

