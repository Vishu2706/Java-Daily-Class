// interface f1 {
//     static void math1(){
//         System.out.println("f1");
//     }
// }

// interface f2 extends f1{
//     void math2();
// }

// class InterFace implements f2 {
//     public void math2() {
//         System.out.println("f2");
//     }
// }

// public class Inter {

//     public static void main(String[] args) {
//         InterFace obj = new InterFace();
//         f1.math1();
//         obj.math2();
//     }
// }


//  DIFFERENT PART IN INTERFACE


// interface f1{
//     void math1();   
// }

// interface f2{
//     void math2();
// }

// class InterFace implements f1,f2{
//     public void math1(){
//         System.out.println("f1");
//     }
//     public void math2(){
//         System.out.println("f2");
//     }
// }
// public class Inter{
//     public static void main(String[] args) {
//       InterFace obj = new InterFace();
//       obj.math1();
//       obj.math2();        
//     }
// }