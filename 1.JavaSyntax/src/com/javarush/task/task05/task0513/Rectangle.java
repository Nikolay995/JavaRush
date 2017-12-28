package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    int top, left, width, height;

    public void initialize(int top){
        this.top = top;
        this.left = 1;
        this.width = 5;
        this.height = 15;
    }
    public void initialize(int width, int height){
        this.width = width;
        this.height = height;
        this.top = 14;
        this.left = 10;
    }
    public void initialize(int width, int height, int top){
        this.left = 4;
        this.top = top;
        this.width = width;
        this.height = height;
    }
    public void initialize(int width, int height, int top, int left){
        this.top = top;
        this.width = width;
        this.height = height;
        this.left = left;
    }

    public static void main(String[] args) {

    }
}
