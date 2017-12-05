package com.javarush.task.task08.task0802;

/* 
HashMap из 10 пар
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> set = new HashMap<String, String>();
        set.put("арбуз", "ягода");
        set.put("банан", "трава");
        set.put("вишня", "ягода");
        set.put("груша", "фрукт");
        set.put("дыня", "овощ");
        set.put("ежевика", "куст");
        set.put("жень-шень", "корень");
        set.put("земляника", "ягода");
        set.put("ирис", "цветок");
        set.put("картофель", "клубень");

        for(Map.Entry<String, String> para: set.entrySet()){
            String key = para.getKey();                      //ключ
            String value = para.getValue();                  //значение
            System.out.println(key + " - " + value);
        }
    }
}
