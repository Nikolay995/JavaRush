package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int num[] = new int[20];
        int a[] = new int[10];
        int b[] = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i <num.length ; i++) {
            num[i] = Integer.parseInt(reader.readLine()); // читаем в массив (20шт.)
        }

        for (int j = 0; j <a.length ; j++) {
            a[j] = num[j];                                 // заполнили 1й
        }
        for (int m = 10; m < 20 ; m++){
             b[m-10]=num[m];                                // и 2й
            System.out.println(b[m-10]);
        }

}
}
