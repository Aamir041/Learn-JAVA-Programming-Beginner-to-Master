class Test extends Thread{
	
	public void run(){
		
		for(int i=0; i>=0; i++){
			
			try{
				System.out.println(i + " Thread");
				Thread.sleep(10);
			}
			catch(InterruptedException e){ System.out.println(e);}
		}

	}
}


public class DaemonJoinEx{
	public static void main(String[] args) {
	    
	    Test t1 = new Test();
	    t1.setDaemon(true);
	    t1.start();
	    Thread mainThread = Thread.currentThread();
	    
	    try{
	    	mainThread.join();
	    }
	    catch(InterruptedException e){
	    }
	}
}