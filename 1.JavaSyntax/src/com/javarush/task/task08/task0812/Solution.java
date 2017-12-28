package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer>list =new ArrayList<>();
        int q=0;
        for(int i=0;i<10;i++){
            list.add(Integer.parseInt(reader.readLine()));
        }
        for(int i=0,j=0;i<list.size()-1;i++){
            if(list.get(i)==list.get(i+1))j++;
            else j=0;
            if(i==0)q=j;
            if(j>q)q=j;
        }

        System.out.println((q+1));


    }
}
