import java.util.Scanner;

public class regexSplit{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String[] res = s.split("[\\W]+");
        System.out.println(res.length);
        for(String str: res){
            System.out.println(str);
        }
        scan.close();
	}
}