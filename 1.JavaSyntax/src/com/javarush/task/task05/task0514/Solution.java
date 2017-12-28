package com.javarush.task.task05.task0514;

/* 
Программист создает человека
*/

public class Solution {
    public static void main(String[] args) {
    Person man1= new Person();
    man1.initialize("Volodya",40);
    }

    static class Person {
        String name;
        int age;
        public void initialize(String imya,int age){
            name = imya;
            this.age = age;
        }
    }
}
