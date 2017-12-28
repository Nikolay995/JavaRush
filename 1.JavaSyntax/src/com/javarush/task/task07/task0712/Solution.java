package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int min, max = 0;
        for (int i = 0; i <10 ; i++) {
            list.add(reader.readLine());
        }
        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i).length()>max){}

        }
    }
}
