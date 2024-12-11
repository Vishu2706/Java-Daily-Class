package com.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Filedemo {

    public static void main(String[] args) throws IOException {
        FileOutputStream file = new FileOutputStream("Student.txt");
        String s = "This is my new file which created by code.";
        byte b[] = s.getBytes();
        file.write(b);
        file.flush();
        file.close();
        System.out.println("data written successfully");

        FileInputStream fIn = new FileInputStream("Student.txt");
        int i;
        while ((i = fIn.read()) != -1) {
            System.out.println((char) i);
        }
        fIn.close();
    }
}
