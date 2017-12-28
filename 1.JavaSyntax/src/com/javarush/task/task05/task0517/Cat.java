package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    String name, address, color;
    int age, weight;
    public Cat(String name) {
        this.name = name;
        this.address = null;
        this.color = "red";
        this.age = 996;
        this.weight=101;
    }


    public Cat(String name, int weight, int age) {
        this.name = name;
        this.address = null;
        this.color = "red";
        this.age = age;
        this.weight=weight;

    }
    public Cat(String name,int age){
        this.name = name;
        this.age = age;
        this.color = "red";
        this.weight=101;
        this.address = null;
    }
    public Cat(int weight, String color){
        this.weight=weight;
        this.color = color;
        this.age = 9;
        this.name = null;
        this.address = null;
    }

    public Cat(int weight, String color, String address){
        this.weight=weight;
        this.color=color;
        this.address=address;
        this.age=90;
        this.name=null;

    }



    public static void main(String[] args) {

    }
}
