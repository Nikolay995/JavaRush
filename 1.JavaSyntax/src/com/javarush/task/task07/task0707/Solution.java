package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList();
        for (int i = 0; i < 5; i++) {
            list.add("test");
        }
        System.out.println(list.size());

        for (int j = 0; j <list.size() ; j++) {
            System.out.println(list.get(j));
        }

    }
}
