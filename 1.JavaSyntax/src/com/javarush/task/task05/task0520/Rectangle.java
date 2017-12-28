package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    int top, left, width, height;
    public Rectangle(int top){
        this.top = top;
    }
    public Rectangle(int left, int width){
        this.left=left;
        this.width=width;
    }
    public Rectangle(int width, int top,int left){
        this.width=width;
        this.top=top;
        this.left=left;
    }
    public Rectangle(int width, int top,int left, int height){
        this.width=width;
        this.top=top;
        this.left=left;
        this.height=height;
    }


    public static void main(String[] args) {

    }
}
