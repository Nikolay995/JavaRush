package com.javarush.task.task04.task0422;

/* 
18+
*/
import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //System.out.println("Введите имя");
        String name = reader.readLine();
        //System.out.println("Введите возраст");
        String age = reader.readLine();
        int Age = Integer.parseInt(age);
        if (Age < 18)
            System.out.println("Подрасти еще");
    }
}
