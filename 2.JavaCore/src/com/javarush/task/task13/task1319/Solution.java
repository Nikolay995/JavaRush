package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufWriter = new BufferedWriter(new FileWriter(reader.readLine()));
        while (true) {
            String data = reader.readLine();
            if (("exit").equals(data)) {
                bufWriter.write(data + "\r\n");
                break;
            }
            bufWriter.write(data + "\r\n");
        }

        bufWriter.close();
    }
}


