package com.javarush.task.task05.task0511;
import java.util.Scanner;
/* 
Создать класс Dog
*/

public class Dog {
   String name;
   int height;
   String color;

   public void initialize(String name){
       this.name = name;
       this.height = 60;
       this.color = "brown";
   }

   public void initialize(String name, int height){
       this.name = name;
       this.height = height;
       this.color = "brown";
   }
    public void initialize(String name, int height, String color){
       this.name = name;
       this.height = height;
       this.color=color;
    }





    public static void main(String[] args) {

    }
}
