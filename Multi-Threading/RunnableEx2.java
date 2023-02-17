public class RunnableEx2 implements Runnable{
	public void run(){
		for(int i=0;i>=0;i++){
			System.out.println(i+" "+"Thread");
		}
	}

	public static void main(String[] args) {
		RunnableEx2 r1 = new RunnableEx2();
		Thread t1 = new Thread(r1);
		t1.start();

		for(int i=0;i>=0;i++){
			System.out.println(i+" "+"Main");
		}
	}
}