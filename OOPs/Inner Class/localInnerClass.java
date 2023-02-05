class outer{
	public void display(){
		class inner{
			public void innerDisplay(){
				System.out.println("This is from local inner class");
			}
		}
		inner i = new inner();
		i.innerDisplay();
	}
}

public class localInnerClass{
	public static void main(String[] args) {
		outer o = new outer();
		o.display();
	}
}