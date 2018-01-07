package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            if (country == "Ukraine"){
                hen = new UkrainianHen();
            }else if (country == "Russia"){
                hen = new RussianHen();
            }else if (country == "Belarus"){
                hen = new BelarusianHen();
            }else hen = new MoldovanHen();
            return hen;
        }
    }




}
