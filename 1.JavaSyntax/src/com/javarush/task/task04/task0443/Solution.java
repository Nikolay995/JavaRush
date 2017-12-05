package com.javarush.task.task04.task0443;


/* 
Как назвали, так назвали
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        String name = new Scanner(System.in).nextLine();
        int y = new Scanner(System.in).nextInt();
        int m = new Scanner(System.in).nextInt();
        int d = new Scanner(System.in).nextInt();
        System.out.println("Меня зовут "+name+".");
        System.out.println("Я родился "+d+"."+m+"."+y);

    }
}
