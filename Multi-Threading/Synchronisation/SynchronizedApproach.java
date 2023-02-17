class MyData{
	synchronized public void display(String s){
		
		for(int i=0; i<s.length()-1; i=i+2){
			try{
				System.out.println(s.charAt(i)+" "+s.charAt(i+1));
				Thread.sleep(70);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
		}
	}
}

class MyThread1 extends Thread{
	MyData md;
	
	MyThread1(MyData data){
		md = data;
	}

	public void run(){
		md.display("KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK");
	}
}

class MyThread2 extends Thread{
	MyData md;
	
	MyThread2(MyData data){
		md = data;
	}

	public void run(){
		md.display("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
	}
}

public class SynchronizedApproach{
	public static void main(String[] args) {
		MyData md = new MyData();
		MyThread1 t11 = new MyThread1(md);
		MyThread2 t21 = new MyThread2(md);
		t11.start();
		t21.start();
	}
}