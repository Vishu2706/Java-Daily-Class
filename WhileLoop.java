
import java.util.Scanner;

public class WhileLoop{
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N :");
        n = sc.nextInt();

        while(n > 0){
            System.out.print("Tops Technology"); 
        // it will go infinite loop because condition will be always true. There is no increment option.
        }
    }
}