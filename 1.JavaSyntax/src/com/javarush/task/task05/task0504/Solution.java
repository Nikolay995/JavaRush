package com.javarush.task.task05.task0504;


/* 
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {
       Cat cat1 = new Cat("vaska", 5,8,68);
       Cat cat2 = new Cat("barsik",4,6,55);
       Cat cat3 = new Cat("Petya",95,450,8800);
        System.out.println(cat3.name);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name1, int age, int weight, int strength) {
            this.name = name1;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}