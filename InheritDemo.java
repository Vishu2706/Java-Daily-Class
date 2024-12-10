
import java.util.Scanner;

class A{
    int a;
    void getA(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A value:");
        a = sc.nextInt();
    }
    void putA(){
        System.out.println("A :"+ a);
    }
}

class B extends A{
    int b;
    void getB(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter B value :");
        b = sc.nextInt();
    }
    void putB(){
        System.out.println("B :"+b);
    }
}


public class InheritDemo{
    public static void main(String[] args) {
        A ob = new A();
        B obj = new B();
        ob.getA();
        ob.putA();
        obj.getB();
        obj.putB();
    }
}