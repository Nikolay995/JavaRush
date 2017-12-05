package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum=0;
        for (boolean isExit = false; !isExit; )
        {
            String i = reader.readLine();
            isExit = i.equals("-1");
            int n = Integer.parseInt(i);
            sum+=n;
        }
        System.out.println(sum);
        /*int[] num = new int[100];
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] = new Scanner(System.in).nextInt();
            sum = sum+num[i];
            if (num[i] == -1) {
                System.out.println(sum);
                break;
            }
    }*/
    }
    }

