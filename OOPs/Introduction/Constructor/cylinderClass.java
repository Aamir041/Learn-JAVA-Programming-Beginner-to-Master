class cylinder{
	private double radius;
	private double height;

	public cylinder(){
		setRadius(1);
		setHeight(1);
	}

	public cylinder(double r, double h){
		setRadius(r);
		setHeight(h);
	}

	public double getRadius(){
		return radius;
	}

	public double getHeight(){
		return height;
	}

	public void setRadius(double r){
		if(radius < 0){
			radius = 1;
		}
		else{
		   radius = r;	
		}
	}

	public void setHeight(double h){
		if(height < 0){
			height = 1;
		}
		else{
		   height = h;	
		}
	}

	public double baseArea(){
		return Math.PI*(radius*radius);
	}

	public double totalArea(){
		return (2*((Math.PI*(radius*height)+(Math.PI*(radius*radius)))));
	}

	public double volume(){
		return Math.PI*((radius*radius)*height);
	}

}

public class cylinderClass{
	public static void main(String[] args){
		
		System.out.println();
		cylinder c1 = new cylinder();
		System.out.println("Radius: " + c1.getRadius());
		System.out.println("Height: " + c1.getHeight());
		System.out.println("Base Area: " + c1.baseArea());
		System.out.println("Total Area: " + c1.totalArea());
		System.out.println("Volume: " + c1.volume());

		System.out.println();
		cylinder c2 = new cylinder(5,10);
		System.out.println("Radius: " + c2.getRadius());
		System.out.println("Height: " + c2.getHeight());
		System.out.println("Base Area: " + c2.baseArea());
		System.out.println("Total Area: " + c2.totalArea());
		System.out.println("Volume: " + c2.volume());
		
	}
}