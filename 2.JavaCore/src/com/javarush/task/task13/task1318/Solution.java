package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;


public class Solution {
    public static void main(String[] args) throws IOException {
        try{
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = "d:/my-object-data.txt";
                //reader.readLine();
        //reader.close();
        InputStream inStream = new FileInputStream(fileName);
        while (inStream.available() > 0)
        {
            System.out.print((char)inStream.read());
        }
            System.out.println();
            inStream.close();

        }catch (Exception e){
            System.out.println(e);
        }
    }
}