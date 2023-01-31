class rectangle{
	private int length;
	private int breadth;

	public int area(){
		return length*breadth;
	}

	public int perimeter(){
		return ((2*length)+(2*breadth));
	} 

	public boolean isSquare(){
		return length == breadth;
	}

	public int getLength(){
		return length;
	}

	public void setLength(int l){
		if(l > 0){
			length = l;
		}
		else{
			length = 0;
		}
	}

	public int getBreadth(){
		return breadth;
	}

	public void setBreadth(int b){
		if(b > 0){
			breadth = b;
		}
		else{
			breadth = 0;
		}
	}
}

public class rectangleClass{
	public static void main(String[] args){
		rectangle r1 = new rectangle();
		r1.setLength(5);
		r1.setBreadth(7);
		System.out.println("Length: "+r1.getLength()+" Breadth: "+r1.getBreadth());
		System.out.println("Area: "+r1.area());
		System.out.println("Perimeter: "+r1.perimeter());
		System.out.println("Is it a square: "+r1.isSquare());

		System.out.println();
		
        rectangle r2 = new rectangle();
		r2.setLength(-9);
		r2.setBreadth(8);
		System.out.println("Length: "+r2.getLength()+" Breadth: "+r2.getBreadth());
		System.out.println("Area: "+r2.area());
		System.out.println("Perimeter: "+r2.perimeter());
		System.out.println("Is it a square: "+r2.isSquare());

	}
}