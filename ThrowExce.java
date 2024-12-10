
// import java.util.InputMismatchException;
// import java.util.Scanner;

// public class ThrowExce{

//     public static void demo() throws InputMismatchException{
//         int x;
//         Scanner sc = new Scanner(System.in);
//         x = sc.nextInt();
//         if(x > 0){
//             System.out.println("Value of X = " + x + "Is" + (x*x));
//         }else{
//             throw new ArithmeticException();
//         }
//     }
//     public static void main(String[] args) {
//         try{
//             demo();
//         }catch (Exception e){
//             System.out.println("Please Enter Positive Value Only");
//         }finally{
//             System.out.println("Finally check");
//         }
//     }
// }