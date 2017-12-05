package com.javarush.task.task08.task0816;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Stallone2", new Date("JUNE 1 1980"));
        map.put("Stallone3", new Date("JUNE 1 1980"));
        map.put("Stallone4", new Date("JUNE 1 1980"));
        map.put("Stallone5", new Date("JUNE 1 1980"));
        map.put("Stallone6", new Date("JUNE 1 1980"));
        map.put("Stallone7", new Date("JUNE 1 1980"));
        map.put("Stallone8", new Date("JUNE 1 1980"));
        map.put("Stallone9", new Date("JUNE 1 1980"));
        map.put("Stallone10", new Date("JUNE 1 1980"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        ArrayList<String> month = new ArrayList<>();

        for (Map.Entry<String, Date> pair : map.entrySet()) {
            int m = pair.getValue().getMonth();
            if ((m > 4) & (m < 8)) {
                System.out.println(pair.getKey());
                month.add(pair.getKey());
            }
        }
        for (int i = 0; i < month.size(); i++)
            map.remove(month.get(i));
    }

    public static void main(String[] args) {

    }
}
