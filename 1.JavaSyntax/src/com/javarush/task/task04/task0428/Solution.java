package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
       int a = new Scanner(System.in).nextInt();
       int b = new Scanner(System.in).nextInt();
       int c = new Scanner(System.in).nextInt();
       int i=0;                                                 //positive counter
        if (a>0)i++;
        if (b>0)i++;                                            //если поставить else то цикл не зайдёт в след.
        if (c>0)i++;                                            // условия, когда а будет положительное
        System.out.println(i);

    }
}
