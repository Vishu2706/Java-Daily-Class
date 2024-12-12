package com.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

public class Comperatordemo implements Comparator<Emp> {

    public int compare(Emp e1, Emp e2) {
        int value = 0;
        if (e1.getEsalary() > e2.getEsalary()) {
            value = -1;
        } else if (e1.getEsalary() < e2.getEsalary()) {
            value = 1;
        } else if (e1.getEsalary() == e2.getEsalary()) {
            value = 0;
        }
        return value;
    }

    public static void main(String[] args) {
        ArrayList<Emp> list = new ArrayList<Emp>();

        Emp e1 = new Emp();
        e1.setEid(1);
        e1.setEname("Jaimin");
        e1.getEsalary(30000);

        Emp e2 = new Emp();
        e2.setEid(2);
        e2.setEname("Vatsal");
        e2.getEsalary(25000);

        Emp e3 = new Emp();
        e3.setEid(3);
        e3.setEname("Rutwik");
        e3.getEsalary(27000);

        Emp e4 = new Emp();
        e4.setEid(1);
        e4.setEname("Ajay");
        e4.getEsalary(22000);

        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);

        Collection.sort(list, new Comperatordemo());
        for (Emp e : list) {
            System.out.println("EID : " + e.getEid() + " EName: " + e.getEname() + " Salary = " + e.getEsalary());
        }
    }
}
