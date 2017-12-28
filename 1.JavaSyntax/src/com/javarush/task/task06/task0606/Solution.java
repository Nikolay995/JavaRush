package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();                             // ввод в строку
        int a = input.length();                                       // определили длину строки
        int num[] = new int[a];
        for (int i = 0; i <a ; i++) {
            num[i]=Integer.parseInt(String.valueOf(input.charAt(i))); // каждый элемент в число
            if (num[i]%2==0) even++;
            else odd++;
        }
        System.out.println("Even: " + even + " Odd: "+odd);

    }
}
