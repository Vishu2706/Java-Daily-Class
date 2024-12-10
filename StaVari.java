
import java.util.Scanner;

public class StaVari{
    static int a;

    void setA() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A value");
        a = sc.nextInt();
    }

    void putA() {
        System.out.println("A =" + a);
    }
    public static void main(String[] args) {
        StaVari obj1 = new StaVari();
        StaVari obj2 = new StaVari();
        obj1.setA();
        obj2.setA();
        obj1.putA();   
        obj2.putA();
    }
}