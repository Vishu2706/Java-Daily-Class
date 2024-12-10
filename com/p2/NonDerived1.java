package com.p2;

import com.p1.Protection;

public class NonDerived {

    public NonDerived() {
        Protection p1 = new Protection();
        System.out.println("Non-derived's Constructor");
        System.out.println("n =" + p1.n);
        System.out.println("n pub =" + p1.n_pub);
        System.out.println("n pro =" + p1.n_pro);
        // System.out.println("n pro =" + p1.n_pri);
    }
}
