package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
       HashSet<Integer> intList = new HashSet<Integer>();
        for (int i = 0; i < 20; i++) {
            intList.add(i);
        }
        return intList;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        HashSet<Integer> tmp = new HashSet<>();
        for (int x : set)                               //эт надо запомнить
        {
            if (x <= 10) tmp.add(x);
        }

        return tmp;

    }

    public static void main(String[] args) {

    }
}
