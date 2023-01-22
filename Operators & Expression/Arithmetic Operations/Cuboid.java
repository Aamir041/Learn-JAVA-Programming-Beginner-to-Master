import java.lang.*;
import java.util.*;

public class Cuboid {
    

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        float length, height, breadth;
        System.out.print("Enter length, height, breadth : ");
        length = in.nextFloat();
        height = in.nextFloat();
        breadth = in.nextFloat();

        float front = length * height;
        float sides = height * breadth;
        float top = length * breadth;

        float totalArea = 2 * (front + sides + top) ;
        float volume = length * height * breadth;

        System.out.println("Area : " + totalArea + " " + " Volume : " + volume);

    }
}
