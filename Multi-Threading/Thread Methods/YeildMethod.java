class Test extends Thread{
	
	public void run(){
		
		for(int i=0;i>=0;i++){
			System.out.println(i+" Thread");
			Thread.yield();
		}
	}
}


public class YeildMethod{
	public static void main(String[] args) {
	    
	    Test t1 = new Test();
	   
	    t1.start();
	    // Thread mainThread = Thread.currentThread();
	    for(int i=0;i>= 0;i++){
	    	System.out.println(i+ " Main Thread");
	    	
	    }
	 }	    	
}