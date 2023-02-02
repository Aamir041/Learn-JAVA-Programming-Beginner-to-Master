class circle{
	public double radius;

	public circle(){
		radius = 0.0;
	}

	public double area(){
		return Math.PI*radius*radius;
	}

	public double circumference(){
		return 2*Math.PI*radius;
	}

}

class  cylinder extends circle{
	
	public double height;

	public double volume(){
		return area()*height;
	}
}

public class circleCylinder{
	public static void main(String[] args){
		cylinder c1 = new cylinder();
		c1.radius = 5;
		c1.height = 10;
		System.out.println("Area: " + c1.area());
		System.out.println("Volume: " + c1.volume());
	}
}