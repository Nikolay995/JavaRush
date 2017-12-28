package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println("Ебани число: ");
        
        Scanner reader = new Scanner(System.in);
        int number = reader.nextInt();
        
        if(number==1){
            System.out.println("понедельник");
        }else if (number==2){
            System.out.println("вторник");
        }else if (number==3){
            System.out.println("среда");
        }else if (number==4){
            System.out.println("четверг");
        }else if (number==5){
            System.out.println("пятница");
        }else if (number==6){
            System.out.println("суббота");
        }else if (number==7){
            System.out.println("воскресенье");
        }else{System.out.println("такого дня недели не существует");}
    }
}