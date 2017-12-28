package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
            int a = new Scanner(System.in).nextInt();
            int b = new Scanner(System.in).nextInt();
            int c = new Scanner(System.in).nextInt();

        if (a==b && b==c ) System.out.println(a);
        else if  (a==b || b==c || c==a ) System.out.println(a);
        else {

        int min = getMin(a,b,c);
        int max = getMax(a,b,c);
        int sum = a+b+c;
        int mid = sum - min - max;
        System.out.println(mid);

        }}
        private static int getMin(int a, int b, int c){
            return (a<b) ? ((a<c) ? a : c) : ((b<c) ? b : c); //тут просто гениально нах
    }
        private static int getMax(int a, int b, int c){
            return (a>b) ? ((a>c) ? a : c) : ((b>c) ? b : c);
    }

}

