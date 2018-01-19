package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       ArrayList<String> strings = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <5 ; i++) {
            strings.add(sc.nextLine());
        }
        for (int j = 0; j <13 ; j++) {
            String last = strings.get(4);
            strings.remove(strings.size()-1);
            strings.add(0, last);
        }
        for (String a : strings){
            System.out.println(a);
        }

        
        
    }
}
