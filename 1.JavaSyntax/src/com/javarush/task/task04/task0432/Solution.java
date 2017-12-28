package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) throws Exception {
        String a = new Scanner(System.in).nextLine();
        int b = new Scanner(System.in).nextInt();
        while (b>0){
            System.out.println(a);
            b--;
        }

    }
}
