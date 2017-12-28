package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();

        String num1 = reader.readLine();
        int num2 = Integer.parseInt(num1);

        String num3 = reader.readLine();
        int num4 = Integer.parseInt(num3);

        System.out.println(name + " получает " + num2 + " через " + num4 + " лет.");

        //напишите тут ваш код

    }
}
