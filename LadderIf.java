
import java.util.Scanner;

public class LadderIf{
    public static void main(String[] args){
        String sName;
        int rNo, s1, s2, s3, total;
        double per;

        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter Student name");
        sName = sc.next();

        System.out.println("Enter your roll no"); 
        rNo = sc.nextInt();

        System.out.println("Enter your subject 1 marks");
        s1 = sc.nextInt();

        System.out.println("Enter your subject 2 marks");
        s2 = sc.nextInt();

        System.out.println("Enter your subject 3 marks");
        s3 = sc.nextInt();

        total = s1 + s2 + s3;
        per = total/3;

        System.out.println("Student name :"+sName);
        System.out.println("Student roll no :"+rNo);
        System.out.println("Student's total marks : "+total);
        System.out.println("Student's percentage : "+per);

        if(per >= 70){
            System.out.println("Distinction");
        }else if(per >= 60){
            System.out.println("First Class");
        }else if (per >= 50) {
            System.out.println("Two Class");
        }else if (per >= 40) {
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
    }
}