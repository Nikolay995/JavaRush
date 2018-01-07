package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen implements Country{
    @Override
    int getCountOfEggsPerMonth() {
        return 50;
    }
    String getDescription(){
        return super.getDescription() +
                " Моя страна - " + Country.BELARUS +
                ". Я несу " + getCountOfEggsPerMonth() +
                " яиц в месяц.";
    }
}
