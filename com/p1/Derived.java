package com.p1;

public class Derived extends Protection {

    public Derived() {
        System.out.println("Derived's Constructor");
        System.out.println("n =" + n);
        System.out.println("n pub =" + n_pub);
        System.out.println("n pro =" + n_pro);
        // System.out.println("n pro =" + n_pri);
    }
}
