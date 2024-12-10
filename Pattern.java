
import java.util.Scanner;

public class Pattern{
    public static void main(String[] args) {
        int i, j, k, n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of N : ");
        n = sc.nextInt();

        for(i = 1; i <= n; i++){
            for(j = 1; j < n - i; j++){
                System.out.print(" ");
            }
            for(k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}