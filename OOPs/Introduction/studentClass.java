class student{
	public int roll;
	public String name;
	public String course;
	public int m1,m2,m3;

	public int total(){
		return (m1+m2+m3);
	}

	public int average(){
		return ((m1+m2+m3)/3);
	}

	public char grade(){
		int avgMarks = average();
		
		if(avgMarks >= 90){
			return 'A';
		}

		else if(avgMarks >= 70 && avgMarks<90){
			return 'B';
		}

		else if(avgMarks >= 60 && avgMarks<70){
			return 'C';
		}
		else{
			return 'D';
		}
	}

}

public class studentClass{
	public static void main(String[] args){
		student s1 = new student();
		s1.name = "Json";
		s1.roll = 2541;
		s1.m1 = 40;
		s1.m2 = 40;
		s1.m3 = 40;
		System.out.println(s1.name + " , " + s1.roll + " , Total marks: "+s1.total()+ " Average: "+ s1.average()+ " Grade: "+ s1.grade());
	}
}