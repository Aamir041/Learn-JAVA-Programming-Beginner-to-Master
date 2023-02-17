class MyThread extends Thread{
	public MyThread(String name){

		// passing name to parent constructor to set thread name
		// super(name);

		// setPriority(Thread.MAX_PRIORITY);
		// setPriority(Thread.MIN_PRIORITY);
	}

	public void run(){
		int i =0;
		while(true){
			try{
				System.out.println(i++);
				Thread.sleep(i*10);
			}
			catch(InterruptedException e){
				System.out.println("Who the hell interrupted me!");
			}
		}
	}
} 

public class ThreadConstructors{
	public static void main(String[] args) {
		
		MyThread mt1 = new MyThread("MyThread1");
		

		// System.out.println("Name:  " + mt1.getName());
		// System.out.println("Id: " + mt1.threadId());
		// System.out.println("Priority: " + mt1.getPriority());
		// System.out.println("(Before start() )State: " + mt1.getState());
		// mt1.start();
		// System.out.println("(After start() )State: " + mt1.getState());
		
		// Sleep
		mt1.start();
		// Interrupting thread
		mt1.interrupt();


	}
}