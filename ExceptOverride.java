class Ex1{
    void show() throws ArithmeticException
    {
        System.out.println("Show from ex1");
    }
}

class Ex2 extends Ex1{
    void show() throws exception {
        System.out.println("Show from Ex2");
    }
}

public class ExceptOverride{
    public static void main(String[] args) {
        Ex2 obj = new Ex2();
        obj.show();
    }
}