class Buggati{
	private final String color = "Brick Orange";
	private static Buggati my = null; 
	
	private Buggati(){
		System.out.println("My Buggati Color is " + color + " so whats color of your buggati ?");
	}

	//  this static methods return Buggati object if my == null
	static Buggati getBuggati(){
		if(my == null){
			my = new Buggati();
			return my;
		}
		return null;
	}
	String getColor(){
		return color;
	}
}

public class andrewTateBuggati{
	public static void main(String[] args) {
		Buggati onlyOneTopG = Buggati.getBuggati();
		Buggati uPussy = Buggati.getBuggati();
		System.out.println(uPussy);
		System.out.println(onlyOneTopG.getColor());
		// System.out.println(uPussy.getColor()); // --> gives Null pointer Exception

	}
}