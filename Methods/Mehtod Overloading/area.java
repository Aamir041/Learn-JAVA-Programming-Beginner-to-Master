public class area{

	static int area(int l, int b){
		return l*b;
	} 

	static double area(int r){
		return (Math.PI*(r*r));
	}

	public static void main(String[] args){
		System.out.println("Area of rectangle where l=5, b=7: " + area(5,7));
		System.out.println("Area of circle where r=4: " + area(4));
	}
}