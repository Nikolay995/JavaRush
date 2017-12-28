package com.javarush.task.task08.task0817;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String,String > map = new HashMap<String, String>();
        map.put("a","b");
        map.put("b","b");
        map.put("c","b");
        map.put("d","e");
        map.put("f","g");
        map.put("e","g");
        map.put("h","i");
        map.put("j","k");
        map.put("l","m");
        map.put("n","m");
    return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        HashMap<String, String> tmp = new HashMap<>(map);

        for(Map.Entry<String, String> pair : tmp.entrySet()) {
            if (Collections.frequency(map.values(), pair.getValue()) != 1) {
                removeItemFromMapByValue(map, pair.getValue());
            }
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
