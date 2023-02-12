import java.io.*;

public class checkedExceptions{
	public static void main(String[] args) {
		try{
			FileInputStream file = new FileInputStream("ample.txt"); // if try catch block not written throws error. 
		}
		catch(IOException e){
			// System.out.println(e);
			e.printStackTrace();
		}
	}
}