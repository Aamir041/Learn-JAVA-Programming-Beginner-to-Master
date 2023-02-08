import java.util.*;
public class ipCheck{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ipAddr = sc.next();
		String pattern = "?";
		System.out.println(ipAddr.matches(pattern));
	}
}