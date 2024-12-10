
import java.util.Scanner;

public class ArrayDemo{
    public static void main(String[] args) {
        int n[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array elements");
        for(int i = 0; i < n.length; i++){
            System.out.print("Enter "+i+ " Value : ");
            n[i] = sc.nextInt();
            System.out.println();
        }
        // for (i = 0; i < n.length; i++) {
        //     System.out.println("Value of array element "+ i + "is :"+ n[i]);
        // }

        //  It will arrange in Descending order
        for (int i = 0; i < n.length; i++) {
           for (int j = i +1; j < n.length; j++){
            if(n[i] > n[j]){
            int temp;
            temp = n[i];
            n[i] = n[j];
            n[j] = temp;
            }
           }
        }
        for (int i = 0; i < n.length; i++) {
            System.out.println("Value of array element "+ i + "is :"+ n[i]);
        }

        //  It will arrange in Ascending order
        for (int i = 0; i < n.length; i++) {
           for (int j = i +1; j < n.length; j++){
            if(n[i] < n[j]){
            int temp;
            temp = n[i];
            n[i] = n[j];
            n[j] = temp;
            }
           }
        }
        for (int i = 0; i < n.length; i++) {
            System.out.println("Value of array element "+ i + "is :"+ n[i]);
        }
    }
    // 12, 23, 34, 389, 2
    // 2, 12, 23, 34, 389
}