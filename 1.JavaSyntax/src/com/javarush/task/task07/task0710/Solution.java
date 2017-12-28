package com.javarush.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
В начало списка
*/
public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> stringsArray = new ArrayList<String>();

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            stringsArray.add(0, scan.nextLine());
        }
        for(int i = 0; i < stringsArray.size(); i++) {
            System.out.println(stringsArray.get(i));
        }
    }
}