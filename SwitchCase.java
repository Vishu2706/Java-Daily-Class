
import java.util.Scanner;

public class SwitchCase{
    public static void main(String[] args) {
        int a, b, c, d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of A : ");
        a = sc.nextInt();
        System.out.println("Enter value of B : ");
        b = sc.nextInt();

        System.out.println("1. Addition ");
        System.out.println("2. Subtraction ");
        System.out.println("3. Multiplication ");
        System.out.println("4. Division ");

        System.out.println("Enter your Choice : ");
        d = sc.nextInt();

        switch(d) {
            case 1 -> {
                c = a + b;
                System.out.println("Addition : "+c);
            }
            case 2 -> {
                c = a - b;
                System.out.println("Subtraction : "+c);
            }
            case 3 -> {
                c = a * b;
                System.out.println("Multiplication : " + c);
            }
            case 4 -> {
                c = a / b;
                System.out.println("Division : " + c);
            }
            default -> System.out.println("Invalid choice");
        }
    }
}