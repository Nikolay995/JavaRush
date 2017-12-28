package com.javarush.task.task08.task0818;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
       HashMap<String,Integer> map = new HashMap<String, Integer>();
       map.put("a",100);
       map.put("b",500);
       map.put("c",600);
       map.put("d",700);
       map.put("e",900);
       map.put("f",1200);
       map.put("g",200);
       map.put("h",2300);
       map.put("i",2100);
       map.put("j",400);
       return map;

    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        HashMap<String, Integer> copy = new HashMap<String, Integer>(map);
        for (Map.Entry<String, Integer> pair : copy.entrySet()) {
            if (pair.getValue() < 500)
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}