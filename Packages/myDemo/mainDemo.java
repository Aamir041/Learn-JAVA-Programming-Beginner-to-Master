import myPack.demo;
import myPack.demo2;
import myPack.inner.demo3;
import myPack.inner.deep.demo4;

public class mainDemo{
	public static void main(String[] args) {
		demo d = new demo();
		d.display();

		demo2 d2 = new demo2();
		d2.display();

		demo3 d3 = new demo3();
		d3.display();

		demo4 d4 = new demo4();
		d4.display();
	}
}