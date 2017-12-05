package com.javarush.task.task08.task0815;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("A","B");
        map.put("b","c");
        map.put("c","d");
        map.put("e","f");
        map.put("g","h");
        map.put("i","j");
        map.put("k","l");
        map.put("m","n");
        map.put("o","p");
        map.put("q","r");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        return Collections.frequency(map.values(), name);
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        return map.containsKey(lastName) ? 1 : 0;
    }

    public static void main(String[] args) {

    }
}
