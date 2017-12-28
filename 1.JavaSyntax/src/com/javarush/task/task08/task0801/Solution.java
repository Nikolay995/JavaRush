package com.javarush.task.task08.task0801;

/* 
HashSet из растений
*/

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashSet<String> fruits = new HashSet<String>();
        fruits.add("арбуз");
        fruits.add("банан");
        fruits.add("вишня");
        fruits.add("груша");
        fruits.add("дыня");
        fruits.add("ежевика");
        fruits.add("жень-шень");
        fruits.add("земляника");
        fruits.add("ирис");
        fruits.add("картофель");
        for (String a:fruits) System.out.println(a);
    }

}
