package com.javarush.task.task05.task0508;

/* 
Геттеры и сеттеры для класса Person
*/
import java.lang.*;
public class Person {
    String name;
    int age;
    char sex;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setAge(int vozrast){
        this.age = vozrast;
    }

    public int getAge(){
        return age;
    }
    public void setSex(char pihlo){
        this.sex = pihlo;
    }
    public char getSex(){
        return sex;
    }
    public Person(String name, int age, char sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }


    public static void main(String[] args) {
    Person vova = new Person("Vovka",40,'m');
    vova.setName("Vladimir");
        System.out.println(vova.name);
    }
}
