package com.javarush.task.task04.task0420;

/*
Сортировка трех чисел
*/

        import java.io.*;
        import java.util.Arrays;        //не забыть
        import java.util.Collections;   //подключить

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer[] num = new Integer[3];                 // числа будут записыватся в этот массив
        for(int i=0;i<num.length;i++)                   // цикл для записи
        {num[i] = Integer.parseInt(reader.readLine());}
        Arrays.sort(num, Collections.reverseOrder());   //что и как сортировать
        for(int i=0;i<num.length;i++) {System.out.println(num[i]);}
    }}