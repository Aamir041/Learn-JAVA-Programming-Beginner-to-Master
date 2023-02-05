abstract class Shape{
	abstract public double perimeter();
	abstract public double area(); 
}

class Circle extends Shape{
	private double radius;

	public Circle(double radius){
		setRadius(radius);
	}

	// getter
	public double getRadius(){
		return radius;
	}

	// setter
	public void setRadius(double radius){
		if(radius > 0){
			this.radius = radius;
		}
		else{
			this.radius = 1;
		}
	}

	@Override
	public double perimeter(){
		return 2*Math.PI*radius;
	}

	@Override
	public double area(){
		return Math.PI*radius*radius;
	}
}

class Rectangle extends Shape{

	private double length;
	private double breadth;

	public Rectangle(double length, double breadth){
		setLength(length);
		setBreadth(breadth);
	}
	
	// getter
	public double getLength(){
		return length;
	}
	public double getBreadth(){
		return breadth;
	}

	// setter
	public void setLength(double length){
		if(length > 0){
			this.length = length;
		}
		else{
			this.length = 1;
		}
	}
	public void setBreadth(double breadth){
		if(breadth > 0){
			this.breadth = breadth;
		}
		else{
			this.breadth = 1;
		}
	}

	@Override
	public double perimeter(){
		return (2*(length+breadth));
	}

	@Override
	public double area(){
		return (length*breadth);
	}
} 

public class ShapeEx{
	public static void main(String[] args){
		Shape s1 = new Circle(3.7);
		System.out.println("Perimeter: " + s1.perimeter());
		System.out.println("Area: " + s1.area());

		Shape s2 = new Rectangle(4,7);
		System.out.println("Perimeter: " + s2.perimeter());
		System.out.println("Area: " + s2.area());
	}
}