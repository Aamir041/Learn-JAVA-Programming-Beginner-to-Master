import java.util.*;

class Circle{
	public int radius;
	
	public double area() {
		return Math.PI*radius*radius;
	}

	public double perimeter() {
		return 2*Math.PI*radius;
	}
}

public class circleClass{

	public static void main(String[] args){
		Circle c1 = new Circle();
		c1.radius = 5;
		System.out.printf("Area : %.2f\n",c1.area());
	    System.out.printf("Perimeter : %.2f",c1.perimeter());
	}

}