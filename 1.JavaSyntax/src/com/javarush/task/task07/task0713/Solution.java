package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<Integer> int_3 = new ArrayList<>();
        ArrayList<Integer> int_2 = new ArrayList<>();
        ArrayList<Integer> other = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++)
            integers.add(Integer.parseInt(reader.readLine()));

        for (Integer i:integers) {
            if (i % 3 != 0 && i % 2 != 0) other.add(i);
            else {
                if (i % 3 == 0) int_3.add(i);
                if (i % 2 == 0) int_2.add(i);
            }
        }

        printList(int_3);
        printList(int_2);
        printList(other);
    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (Integer i:list) {
            System.out.println(i);
        }
    }
}
