import java.util.*;

public class studentChallenge3{
	public static void main(String[] args){

		// Display the name of day based on number
		Scanner in = new Scanner(System.in);
		System.out.printf("Enter number: ");
		int dayNum = in.nextInt();
		if(dayNum == 1){
			System.out.printf("Monday\n");
		}
		else if(dayNum == 2){
			System.out.printf("Tuesday\n");
		}
		else if(dayNum == 3){
			System.out.printf("Wednesday\n");
		}
		else if(dayNum == 4){
			System.out.printf("Thursday\n");
		}
		else if(dayNum == 5){
			System.out.printf("Friday\n");
		}
		else if(dayNum == 6){
			System.out.printf("Saturday\n");
		}
		else if(dayNum == 7){
			System.out.printf("Sunday\n");
		}

		// Find type of website and the protocol used
		String url = "ftp://www.archive.org";
		int colonIndex = url.indexOf(':');
		String protocol = url.substring(0,colonIndex);

		int lastDotIndex = url.lastIndexOf(".");
		String webType = url.substring(lastDotIndex+1);

		if(protocol.equals("http")){
			System.out.printf("Protocol is Hyper Text Transfer Protocol\n");
		}
		else if(protocol.equals("https")){
			System.out.printf("Protocol is Hyper Text Transfer Protocol Secure\n");
		}
		else if(protocol.equals("ftp")){
			System.out.printf("Protocol is File Transfer Protocol\n");
		}

		if(webType.equals("com")){
			System.out.printf("Website type is Commercial\n");
		}
		else if(webType.equals("biz")){
			System.out.printf("Website type is Business\n");
		}
		else if(webType.equals("gov")){
			System.out.printf("Website type is Goverment\n");
		}
		else if(webType.equals("org")){
			System.out.printf("Website type is Organization\n");
		}
		else if(webType.equals("net")){
			System.out.printf("Website type is Network\n");
		}


	}
}