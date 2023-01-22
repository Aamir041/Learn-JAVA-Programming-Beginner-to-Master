import java.lang.*;
import java.util.*;

public class RootsOfQuadraticEqn {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Coefficient a, b, c : ");

        int a,b,c;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        double root1 = ( (-1*b) + Math.sqrt( ( (b*b) - (4*a*c) ) )  ) / (2*a);
        
        double root2 = ( (b) - Math.sqrt( ( (b*b) - (4*a*c) ) ) ) / (2*a); 
        System.out.println("Roots Are : " + root1 + " ," + root2);
    }
}
