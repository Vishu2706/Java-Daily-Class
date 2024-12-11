// package com.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {

    int rno;
    String sname;
    double per;

    public Student(int rno, String sname, double per) {
        this.rno = rno;
        this.sname = sname;
        this.per = per;
    }

    public String toString() {
        return "Student [rno = " + rno + ", name = " + sname + " per = " + per + " ]";
    }
}

public class SerializeFile {

    public static void main(String[] args) throws ClassNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream("ser");
        ObjectOutputStream os = new ObjectOutputStream(fos);
        Student s1 = new Student(1, "Eren", 1.8);
        os.writeObject(s1);
        os.flush();
        os.close();
        System.out.println("Object written successfully");

        FileInputStream fin = new FileInputStream("ser");
        ObjectInputStream ois = new ObjectInputStream(fin);
        Student s2 = (Student) ois.readObject();
        System.out.println(s2);
        fin.close();
    }
}
