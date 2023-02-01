import java.util.Scanner;

class subject{
	private String subID;
	private String name;
	private int maxMarks;
	private int marksObtain;

// constructors
	public subject(String subID, String name, int maxMarks, int marksObtain){
		this.subID = subID;
		this.name = name;
		this.maxMarks = maxMarks; 
		setMarksObtain(marksObtain);
	}

	// getters
	public String getSubId(){
		return subID;
	}

	public String getName(){
		return name;
	}

	public int getMaxMarks(){
		return maxMarks;
	}

	public int getMarksObtain(){
		return marksObtain;
	}

	// setters
	public void setMarksObtain(int marksObtain){
		this.marksObtain = marksObtain;
	}

	// methods
	public boolean isQualified(){
		return marksObtain>(0.4*maxMarks);
	}

	public String toString(){
		return"\nSubject ID: " + subID + "\nName: " + name + "\nMax Marks: " + maxMarks + "\nMarks Obtain: " + marksObtain + "\nQualified: " + isQualified();
	}

}

public class studentSubjectClass{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		subject[] subs = new subject[3];
		String subID;
		String subName;
		int subMaxMark;
		int subMarks;

		System.out.println();
		for(int i = 0; i<3; i++){
			System.out.print("Enter Subject Id: ");
			subID = in.next();

			System.out.print("Enter Subject Name: ");
			subName = in.next();

			System.out.print("Enter Subject Max Mark: ");
			subMaxMark = in.nextInt();

			System.out.print("Enter Subject Marks: ");
			subMarks = in.nextInt();

			subs[i] = new subject(subID, subName, subMaxMark, subMarks);
			System.out.println();
		}

		for(subject s : subs){
			System.out.println(s);
		}

	}
}