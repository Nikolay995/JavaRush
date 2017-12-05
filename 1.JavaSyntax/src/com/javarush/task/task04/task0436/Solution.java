package com.javarush.task.task04.task0436;


/* 
Рисуем прямоугольник
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        int n = new Scanner(System.in).nextInt();
        int m = new Scanner(System.in).nextInt();

        for (int i = 1 ;i <=n;i++) {
            for (int j = 1; j<=m; j++) {
                System.out.print(8);
            }
            System.out.println("");
        }




    }
}
