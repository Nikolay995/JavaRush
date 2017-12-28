package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        float t = Float.parseFloat(reader.readLine());
        // Находим текущее значение времени в 5-минутном цыкле
        float OneCicle = ((t % 60) % 5);
        // создаем переменную типа стринг (null), в последующем передадим переменной текст
        String text;
        // находим зону 5-минутного цыкла куда попадает остача нашего вещественного числа
        if ( 0.0 <= OneCicle && OneCicle < 3.0){
            text = "зелёный"; // передаем текстовый объект переменной text
        } else if (3.0 <= OneCicle && OneCicle < 4.0) {
            text = "желтый";
        } else text = "красный";
        // выводим текст
        System.out.println(text);



       /* System.out.println("Введи минуты: ");
        float time = Float.parseFloat(reader.readLine());

        float t = ((time)%60)%5;

       if (t<3 && t>=0){
           System.out.println("зелёный");
       } else if (t<4 && t>=3){
           System.out.println("жёлтый");
       }else { System.out.println("красный");}
        */
    }
}