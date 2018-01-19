package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int size = 0;
        for (int i = 0; i <10 ; i++) {
            list.add(scan.nextLine());
            if (scan.nextLine().length() > size) {size = scan.nextLine().length();}
        }
        System.out.println(size);

    }
}
