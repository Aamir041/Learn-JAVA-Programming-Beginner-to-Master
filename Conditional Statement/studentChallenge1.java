import java.lang.*;
import java.util.*;

public class studentChallenge1{
    public static void main(String[] args){
        
        // Find a number is even or odd
        Scanner in = new Scanner(System.in);
        
        System.out.printf("Enter Number: ");
        int number = in.nextInt();
        
        if(number%2 == 0){
            System.out.println("Number is Even\n");
        }
        else{
            System.out.printf("Number is Odd\n");   
        }

        // Find if a person if young or not
        System.out.printf("Enter age: ");
        int age = in.nextInt();

        if(age>14 && age<55){
            System.out.printf("Young\n");
        }
        else if(age <=14){
            System.out.printf("Child\n");
        }
        else{
            System.out.printf("Old\n");
        }

        // Find grades
        int m1,m2,m3;
        System.out.printf("Enter m1 marks: ");
        m1 = in.nextInt();

        System.out.printf("Enter m2 marks: ");
        m2 = in.nextInt();

        System.out.printf("Enter m3 marks: ");
        m3 = in.nextInt();

        int TOTAL_MARKS = m1 + m2 + m3 ;
        int AVG_MKS = TOTAL_MARKS/3;

        if (AVG_MKS >= 70 ){
            System.out.printf("A\n");
        }

        else if(AVG_MKS < 70 && AVG_MKS >= 60){
            System.out.printf("B\n");
        }

        else if(AVG_MKS < 60 && AVG_MKS >= 50){
            System.out.printf("C\n");
        }

        else if(AVG_MKS < 50 && AVG_MKS >= 40){
            System.out.printf("D\n");
        }
        else{
            System.out.printf("F\n");
        }

    }
}