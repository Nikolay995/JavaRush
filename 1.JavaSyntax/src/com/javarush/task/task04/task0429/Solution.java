package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        int c = new Scanner(System.in).nextInt();
        int pos = 0;
        int neg = 0;
        if (a > 0) pos++;
        if (a < 0) neg++;
        if (b > 0) pos++;
        if (b < 0) neg++;
        if (c > 0) pos++;
        if (c <0 ) neg++;
        System.out.println("количество отрицательных чисел: "+neg);
        System.out.println("количество положительных чисел: "+pos);

    }
}
