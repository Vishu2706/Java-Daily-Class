// public class Method{
//     public Method() {
//         System.out.println("Default Constructor");
//     }

//     static int a = 10;
//     static int b;

//     {
//         System.out.println("Block 1");
//     }
//     static void math(int x){
//         System.out.println("X : "+ x);
//         System.out.println("a : "+ a);
//         System.out.println("b : "+ b);
//     }
//     static {
//         System.out.println("Static block initialized");
//         b = a * 4;
//     }

//     {
//         System.out.println("Block 2");
//     }
//     public static void main(String[] args) {
//         math(2);
//         Method m1 = new Method();
//     }
// }