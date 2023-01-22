import java.lang.*;
import java.util.*;

public class postPreDiff {
    public static void main(String[] args){
        int x = 5;
        int y = x++;
        System.out.println("X : " + x + " Y : " + y);

        int z = 2 * x++ + 3 * ++y;
        
        System.out.println("2 * x++ + 3 * ++y : " + z);
        System.out.println("X : " + x);

        int a = 5;
        int b = ++a;
        System.out.println("A : " + a + " B : " + b);
        
    }
}
