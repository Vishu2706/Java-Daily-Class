
// import java.util.InputMismatchException;
// import java.util.Scanner;

// public class Except{
//     public static void main(String[] args) {
//         System.out.println("Start Code");
//         int a, b, c;
//         Scanner sc = new Scanner(System.in);
        
//         try{
//             System.out.println("Enter A :");
//             a = sc.nextInt();
//             System.out.println("Enter B :");
//             b = sc.nextInt();
//             c = a / b;
//             System.out.println("Division =" + c);
//         } catch (ArithmeticException e){
//             System.err.println(e);
//         } catch (InputMismatchException e){
//             System.err.println(e);
//         }
//         System.out.println("Code Finish");
//     }
// }


// SECOND EXCEPTION HANDLING

import java.util.Scanner;

public class Except {

    public static void main(String[] args) throws IndexOutOfBoundsException {
        System.out.println("Start Code");
        int a, b, c;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter A :");
            a = sc.nextInt();
            System.out.println("Enter B :");
            b = sc.nextInt();
            c = a / b;
            System.out.println("Division =" + c);

            int arr[] = {1,2,3,4,5};
            System.out.println("Print array element of the index");
            int id = sc.nextInt();
            System.out.println("Element index is "+ id +" and value is " + arr[id] );
        } catch (Exception e) {
            System.err.println(e);
        }
        System.out.println("Code Finish");
    }
}
