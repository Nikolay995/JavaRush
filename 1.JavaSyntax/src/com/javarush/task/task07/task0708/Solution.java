package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        strings = new ArrayList<>();
        int max = 0;
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++)
            strings.add(r.readLine());

        for (int i = 0; i < 5; i++)
            if (max <= strings.get(i).length())
                max = strings.get(i).length();

        for (int i = 0; i < 5; i++) {
            if (strings.get(i).length() == max)
                System.out.println(strings.get(i));
        }
    }
}
