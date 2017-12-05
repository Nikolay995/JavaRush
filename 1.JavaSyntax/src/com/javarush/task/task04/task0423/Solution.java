package com.javarush.task.task04.task0423;

/* 
Фейс-контроль
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
       // System.out.println("Enter name: ");
        String name = new Scanner(System.in).nextLine();
        //System.out.println("Enter age: ");
        int age = new Scanner(System.in).nextInt();
        if (age > 20) System.out.println("И 18-ти достаточно");
    }
}
