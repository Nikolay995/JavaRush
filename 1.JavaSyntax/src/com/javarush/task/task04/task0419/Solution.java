package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int maxABC = getMax(a,b,c);                  //немного упрощаем
        if (maxABC>d) System.out.println(maxABC);    //тут гениально, сука!
        else System.out.println(d);                  //и тут тоже!!
    }

    static int getMax(int a, int b, int c){
             if (a>=b && a>=c) return a;
        else if (b>=a && b>=c) return b;
        else if (c>=a && c>=b) return c;
        else return a;
    }
}
