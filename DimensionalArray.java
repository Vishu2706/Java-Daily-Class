import java.util.Scanner;

public class DimensionalArray{
    public static void main(String[] args) {
        int n[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter value of array");
        
        for(int i = 0; i < n.length; i++){
            for(int j = 0; j < n.length; j++){
                System.out.print("n[" + i + "]" + "[" + j + "]" + "=");
                n[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length; j++) {
                System.out.print("n["+i+"]"+"["+j+"]"+" = "+ (n[i][j]));
            }
            System.out.println();
        }
    }
}