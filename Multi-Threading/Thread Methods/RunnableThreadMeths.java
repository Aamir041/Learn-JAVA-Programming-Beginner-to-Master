class MyRun implements Runnable{
	public void run(){
		int i=0;
		while(true){
			try{
				Thread.sleep(i+100);
				System.out.println(i++);
			}
			catch(InterruptedException e){
				System.out.println("I was Interrupted :(");
			}
		}
	}
}

public class RunnableThreadMeths{
	public static void main(String[] args) {
		MyRun mr1 = new MyRun();
		Thread t1 = new Thread(mr1, "MyRun1");
		System.out.println("Name:  " + t1.getName());
		System.out.println("Id: " + t1.threadId());
		System.out.println("Priority: " + t1.getPriority());
		System.out.println("(Before start() )State: " + t1.getState());
		t1.start();
		System.out.println("(After start() )State: " + t1.getState());
		t1.interrupt();
	}
}