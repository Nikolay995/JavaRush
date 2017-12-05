package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
      if (isLess(2,1)) System.out.println("robit");
      else System.out.println("ne robit");

       /*
       int a = new Scanner(System.in).nextInt();
       int b = new Scanner(System.in).nextInt();
            if (a>0 && b>0) System.out.println(1);
       else if (a<0 && b>0) System.out.println(2);
       else if (a<0 && b<0) System.out.println(3);
       else if (a>0 && b<0) System.out.println(4); */

    }
    public static boolean isLess(int a,int b){
        return a<b;
    }
}
