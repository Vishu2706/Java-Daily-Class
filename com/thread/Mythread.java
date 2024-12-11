// package com.thread;

// public class Mythread {
//     public static void main(String[] args) {
//         Thread t = Thread.currentThread();
//         System.out.println(t);
//         t.setName("My Thread");
//         System.out.println(t);
//         t.setPriority(9);
//         System.out.println(t);
//     }
// }
// THREAD SLEEP
// public class Mythread {
//     public static void main(String[] args) {
//         Thread t = Thread.currentThread();
//         System.out.println(t);
//         t.setName("My Thread");
//         System.out.println(t);
//         t.setPriority(9);
//         System.out.println(t);
//         try {
//             for (int i = 0; i < 5; i++) {
//                 System.out.println(t + " : " + i);
//                 Thread.sleep(5000);
//             }
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }
// }
//  THREAD CLASS EXTEND
class NewThread extends Thread {

    public NewThread() {
        super("child thread");
        start();
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(this + " : " + i);
                Thread.sleep(500);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Child Thread Exiting");
    }
}

public class Mythread {

    public static void main(String[] args) {
        NewThread n = new NewThread();
        n.run();
    }
}
