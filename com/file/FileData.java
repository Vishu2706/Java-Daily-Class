// package com.file;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileData {

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("Student.txt");
        String s = "This is my new file which created by code.";
        fw.write(s);
        fw.flush();
        fw.close();
        System.out.println("data added.");

        FileReader fr = new FileReader("Student.txt");
        int i;
        while ((i = fr.read()) != -1) {
            System.out.println((char) i);
        }
        fr.close();
    }
}
