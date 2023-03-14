interface compute{
	public int calc(int x, int y);
}


class calculator{

/*
	public void showAdd(compute a1){
		System.out.println(a1.calc(10,10));
	}

	public void showSub(compute s1){
		System.out.println(s1.calc(40,10));
	}

	public void showMul(compute m1){
		System.out.println(m1.calc(10,10));
	}

	public void showDiv(compute d1){
		System.out.println(d1.calc(100,10));
	}
*/
	public void showOp(compute op,int x, int y){
		System.out.println(op.calc(x,y));
	}

}

public class PassingLambdaExp{
	
	public static void main(String[] args) {
		calculator c1 = new calculator();
	/*	
		c1.showAdd((x,y)->x+y);
		c1.showSub((x,y)->x-y);
		c1.showMul((x,y)->x*y);
		c1.showDiv((x,y)->x/y);
	*/

		c1.showOp((x,y)->x+y,100,50);
		c1.showOp((x,y)->x-y,100,50);
		c1.showOp((x,y)->x*y,100,50);
		c1.showOp((x,y)->x/y,100,50);
		
	}

}