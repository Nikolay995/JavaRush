package com.javarush.task.task14.task1419;

import javax.security.auth.login.FailedLoginException;
import java.io.ObjectStreamException;
import java.rmi.server.ExportException;
import java.util.ArrayList;
import java.util.List;
import java.util.MissingFormatArgumentException;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }try {
            throw new IllegalAccessException();
        } catch (Exception e){
            exceptions.add(e);
        }try {
            throw new ArithmeticException();
        }catch (Exception e){
            exceptions.add(e);
        }try {
            throw new ArrayIndexOutOfBoundsException();
        }catch (Exception e){
            exceptions.add(e);
        }try {
            throw new ArrayStoreException();
        }catch (Exception e){
            exceptions.add(e);
        }try {
            throw new IndexOutOfBoundsException();
        }catch (Exception e){
            exceptions.add(e);
        }try {
            throw new SecurityException();
        }catch (Exception e){
            exceptions.add(e);
        }try {
            throw new Exception();
        }catch (Exception e){
            exceptions.add(e);
        }try {
            throw new FailedLoginException();
        }catch (Exception e){
            exceptions.add(e);
        }try {
            throw new NoSuchFieldException();
        }catch (Exception e){
            exceptions.add(e);
        }
}}
