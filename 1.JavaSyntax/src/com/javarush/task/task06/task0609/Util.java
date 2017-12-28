package com.javarush.task.task06.task0609;

/* 
Расстояние между двумя точками
*/
import java.lang.*;
public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        double res = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        return res;

    }

    public static void main(String[] args) {
    }
}
