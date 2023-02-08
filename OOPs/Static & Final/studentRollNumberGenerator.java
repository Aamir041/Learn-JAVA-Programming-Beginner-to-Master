import java.util.*;

final class student{

	// STATIC MEMBERS
	private static int numOfStudent = 0;
	private static int totalStudentCapacity = 5;
	
	private String name;
	private String rollNumber;
	
	private final String DEFAULT_PREFIX = "MITU20BTIT000";

	static student getInstance(String name){
		
		if(totalStudentCapacity != 0){
			
			totalStudentCapacity = totalStudentCapacity - 1;
			numOfStudent = numOfStudent + 1;

			return new student(name);
		}
		return null;
	}

	private student(String name){
		setName(name);
		setRollNumber();
	}

	private void setName(String name){
		this.name = name;
	}

	private void setRollNumber(){
		this.rollNumber = generateRollNumber();
	}

	private String generateRollNumber(){
		return DEFAULT_PREFIX+numOfStudent;
	}

	String getName(){
		return name;
	}

	String getRollNumber(){
		return rollNumber;
	}


}

public class studentRollNumberGenerator{
    public static void main(String[] args) {
    	    student s1 = student.getInstance("Stud1");
    	    System.out.println("Name: "+s1.getName() + " Roll Number: "+ s1.getRollNumber());
    	    
    	    student s2 = student.getInstance("Stud2");
    	    System.out.println("Name: "+s2.getName() + " Roll Number: "+ s2.getRollNumber());
    	    
    	    student s3 = student.getInstance("Stud3");
    	    System.out.println("Name: "+s3.getName() + " Roll Number: "+ s3.getRollNumber());
    	    
    	    student s4 = student.getInstance("Stud4");
    	    System.out.println("Name: "+s4.getName() + " Roll Number: "+ s4.getRollNumber());
    	    
    	    student s5 = student.getInstance("Stud5");
    	    System.out.println("Name: "+s5.getName() + " Roll Number: "+ s5.getRollNumber());
    	    
    	    // this will give Null Pointer Exception cause all 5 student information are filled
    	    // student s6 = student.getInstance("Stud6");
    	    // System.out.println("Name: "+s6.getName() + " Roll Number: "+ s6.getRollNumber());
    	}	
}