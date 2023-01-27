import java.util.*;

public class multiplicationTable{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = in.nextInt();

        System.out.println("\nUsing While loop");
        int i = 1;
        while(i<=10){
            System.out.println(number + " X " + i + " = " + (i*number));
            i++;
        }

        System.out.println("\nUsing For loop");
        for(int j = 1; j<=10; j++){
            System.out.println(number + " X " + j + " = " + (j*number));
        }

    }
}