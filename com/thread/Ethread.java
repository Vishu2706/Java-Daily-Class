// package com.thread;

public class Ethread {

    public static void main(String[] args) {
        new NewThread("One");
        new NewThread("Two");
        new NewThread("Three");
        Thread t = Thread.currentThread();
        System.out.println(t);
        t.setName("My thread");
        System.out.println(t);
        t.setPriority(8);
    }
}

class NewThread implements Runnable {

    Thread t;
    String tname;

    public NewThread(String tname) {
        this.tname = tname;
        t = new Thread(this, tname);
        t.start();
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(t + " : " + i);
                Thread.sleep(500);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Child Thread Exiting");
    }
}
