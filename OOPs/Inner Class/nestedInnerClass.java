class outer{
	public int x = 8;

	class inner{
		public int y = 10;
		
		public void innerDisplay(){
			System.out.println(x+" " +y);
		}
	}

	public void outerDisplay(){
		inner i = new inner();
		System.out.println(i.y);
		i.innerDisplay();
	}
}

public class nestedInnerClass{
	public static void main(String[] args) {
		outer o = new outer();
		o.outerDisplay();

		// access inner class outside outer class
		outer.inner I = new outer().new inner();
		I.innerDisplay();
	}
}