class WhiteBoard{
    
    String text;
    int NumStudents=0;
    int count=0;

    public void attendance(){
        NumStudents++;
    }

    synchronized public void write(String t){

        System.out.println("Teacher is Writing " +t);
        while(count!=0)
                try{wait();}catch(Exception e){}

        text =t;
        count=NumStudents;
        notifyAll(); 
    }

    synchronized public String read(){
        
        while(count==0)
                try{wait();}catch(Exception e){}

        String t = text;
        count--;
        if(count == 0)
            notify();
        return t;
    }
}

class Teacher extends Thread{
    
    WhiteBoard wb;
    String notes[]={"Java is language","It is OOPs","It is Platform Independent","It supports Thread","end"};

    Teacher(WhiteBoard w){
        wb = w;
    }

    public void run(){
        for(int i=0; i<notes.length; i++){
            wb.write(notes[i]);
        }
    }
}

class Student extends Thread{
    
    WhiteBoard wb;
    String name;

    Student(WhiteBoard w,String n){
        wb = w;
        name = n;
    }

    public void run(){
        String text;
        wb.attendance();
        do{
            text = wb.read();
            System.out.println(name+" Reading: "+text);
            System.out.flush();
        }while(!text.equals("end"));
    }
}

public class Classroom {
    public static void main(String[] args) {
        WhiteBoard wb = new WhiteBoard();
        Teacher teacher = new Teacher(wb);
        Student s1 = new Student(wb, "1-> Aamir");
        Student s2 = new Student(wb, "2-> Owais");
        Student s3 = new Student(wb, "3-> Kamran");
        Student s4 = new Student(wb, "4-> Qasim");

        teacher.start();
        s1.start();
        s2.start();
        s3.start();
        s4.start();
    }
}
