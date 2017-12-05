package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    public Circle(double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(){
        this.x = 10;
        this.y=10;
        this.radius=5;
    }
    public Circle(double x){
        this.x=x;
    }
    public Circle(double  x, double y){
        this.x=x;
        this.y=y;
    }

    public static void main(String[] args) {

    }
}