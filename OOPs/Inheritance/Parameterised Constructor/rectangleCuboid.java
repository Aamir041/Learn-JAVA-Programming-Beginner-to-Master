class rectangle{

	private double length;

	private double breadth;

	public rectangle(){

	}

	public rectangle(double length, double breadth){
		setLength(length);
		setBreadth(breadth);
	}

	// setter
	public void setLength(double length){
		this.length = length;
	}

	public void setBreadth(double breadth){
		this.breadth = breadth;
	}

	// getter
	public double getLength(){
		return length;
	}

	public double getBreadth(){
		return breadth;
	}

}

class cuboid extends rectangle{
	
	private double height;
	
	public cuboid(double height) {
		setHeight(height);
	} 

	public cuboid(double length, double breadth, double height){
		super(length, breadth);
		setHeight(height);
	}

	public void setHeight(double height){
		this.height = height;
	}

	public double getHeight(){
		return height;
	}

	public double volume(){
		return getLength()*getLength()*height;
	}


}

public class rectangleCuboid{
	public static void main(String[] args){
		cuboid c1 = new cuboid(5.5,5.5,5.5);
		System.out.println(c1.volume());
	}
}