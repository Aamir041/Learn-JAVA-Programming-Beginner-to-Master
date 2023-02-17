public class ThreadClassEx2 extends Thread{

	public void run(){
		for(;;){
			System.out.println("..Test Thread");
		}
	}

	public static void main(String[] args) {
		ThreadClassEx2 t1 = new ThreadClassEx2();
		t1.start();
		for(;;){
		    System.out.println(".Main Thread");	
		}
	}
}