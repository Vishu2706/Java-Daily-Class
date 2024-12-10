public class MethOver{
    void test(){
        System.out.println("No args");
    }

    void test(int a){
        System.out.println("a = "+a);
    }

    void test(int a,int b){
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }

    public static void main(String[] args) {
        MethOver m1 = new MethOver();
        m1.test();
        m1.test(1);
        m1.test(1,2);
    }
}