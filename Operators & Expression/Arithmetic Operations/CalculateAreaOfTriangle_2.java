import java.lang.*;
import java.util.Scanner;

public class CalculateAreaOfTriangle_2 {
    public static void main(String[] args) {
        float sideA, sideB, sideC;
        System.out.println("Enter size of side a,b,c");
        Scanner in = new Scanner(System.in);
        sideA = in.nextFloat();
        sideB = in.nextFloat();
        sideC = in.nextFloat();

        float S = (float) 1/2 * (sideA + sideB + sideC);
        float exp = (float) S * (S - sideA) * (S - sideB) * (S - sideC);
        float result = (float) Math.sqrt(exp);
        System.out.println("Area : " + result);

    }    
}
