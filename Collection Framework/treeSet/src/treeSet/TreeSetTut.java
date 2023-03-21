package treeSet;
import java.util.*;

class Point implements Comparable{
	public int x;
	public int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "(x="+x+", y="+y+")";
	}
	
	public int compareTo(Object p1) {
		Point p = (Point) p1;
		if(this.x > p.x) {
			return 1;
		}
		else if(this.x < p.x) {
			return -1;
		}
		else {
			if(this.y > p.y) {
				return 1;
			}
			else if(this.y < p.y) {
				return -1;
			}
		}
		return 0;
	}
}

public class TreeSetTut {

	public static void main(String[] args) {
		
		TreeSet<Point> ts = new TreeSet<>();
		ts.add(new Point(1,1));
		ts.add(new Point(2,5));
		ts.add(new Point(2,4));
		ts.add(new Point(3,2));
		ts.add(new Point(4,7));
		ts.add(new Point(2,4));
		
		System.out.println(ts);
	}

}
