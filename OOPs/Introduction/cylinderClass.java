class cylinder{
	public int radius;
	public int height;

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
		cylinder cyl1 = new cylinder();
		
		cyl1.radius = 5;
		cyl1.height = 10;
		
		System.out.println("Base Area: "+ cyl1.baseArea());
		System.out.println("Total Area: "+ cyl1.totalArea()) ;
		System.out.println("Volume: "+ cyl1.volume());

	}
}