class outer{
	static int x = 10;
	int y = 9;

	static class inner{
		public void innerDisplay(){
			System.out.println("I can access X from outer class: " + x);
			// System.out.println(y); //this is can not be accessed
		}
	}

	public void outerDisplay(){
		System.out.println("Hello");
	}
}

public class staticInnerClass{
	public static void main(String[] args){
		// access inner class without creating object of outer class
		outer.inner i = new outer.inner();
		i.innerDisplay();
	}
}