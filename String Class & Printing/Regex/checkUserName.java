import java.util.*;

public class checkUserName{
	public static void main(String[] args) {
		// question link : https://www.hackerrank.com/challenges/valid-username-checker/problem?isFullScreen=true
		Scanner sc = new Scanner(System.in);
		String userName = sc.next();
		System.out.println(userName.matches("[a-zA-Z][a-zA-Z0-9_]{7,29}") ? "Valid" : "Invalid");
	}
}