import java.lang.*;
import java.util.Scanner;

public class CalculateAreaOfTriangle_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Base Of a Triangle: ");
        float base = in.nextFloat();
        System.out.print("Enter Height Of a Triangle: ");
        float height = in.nextFloat();

        float result = (float) 1/2*(base*height);
        System.out.println("Area : " + result);
    }    
}
