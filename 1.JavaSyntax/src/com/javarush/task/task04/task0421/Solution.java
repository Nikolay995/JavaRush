package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      //  System.out.println("Name1:");   // из-за 2-х sout'ов в начале не проходит валидацию на сервере
        String name1 = reader.readLine();
      //  System.out.println("Name2:");
        String name2 = reader.readLine();
                if (name1.equals(name2)){
                    System.out.println("Имена идентичны");}
         else   if (name1.length()==name2.length()){
                    System.out.println("Длины имен равны");
    }
}}