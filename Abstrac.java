abstract class A{
    void meth(){
        System.out.println("Meth 1");
    }
    abstract void meth2();
}

class B extends A{
    void meth2(){
        System.out.println("Meth 2");
    }
}

public class Abstrac{
    public static void main(String[] args) {
        B obj = new B();
        obj.meth();
        obj.meth2();
    }
}