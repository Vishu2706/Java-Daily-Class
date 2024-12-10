// class A{
//     A(){
//         System.out.println("A's Default Constructor");
//     }
// }

// class B extends A{
//     B(){
//         System.out.println("B's Default Constructor");
//     }
// }

// class C extends B{
//     C(){
//         System.out.println("C's Default Constructor");
//     }
// }

// public class ConstChain{
//     public static void main(String[] args) {
//         C obj = new C();
//     }
// }


//  DIFFERENT PART IN CONSTRUCTOR CHAINING AND METHOD OVERRIDING


// class A {
//     A() {
//         System.out.println("A's Default Constructor");
//     }
//     void show(){
//         System.out.println("Class A");
//     }
// }

// class B extends A {

//     B() {
//         System.out.println("B's Default Constructor");
//     }
//     void show(){
//         System.out.println("Class B");
//     }
// }

// class C extends B {

//     C() {
//         System.out.println("C's Default Constructor");
//     }

//     void show(){
//         // super.show();
//         System.out.println("Class C");
//     }
// }

// public class ConstChain {

//     public static void main(String[] args) {
//         C obj = new C();
//         obj.show();
//     }
// }
