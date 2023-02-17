class SharedObj {
    private int value=0;
    boolean flag = true;
    
    synchronized public void setData(int v){
        while(flag != true){
            value = v;
        }
        
    }

    synchronized public int getData(){
        return value;
    }

}

class Producer extends Thread{

    SharedObj obj;

    Producer(SharedObj obj){
        this.obj = obj;
    }
    
    @Override
    public void run(){
        for(int i=1; i>=0; i++){
            System.out.println("Producer set: "+i);
        }
    }
}

class Consumer extends Thread{
    SharedObj obj;

    Consumer(SharedObj obj){
        this.obj = obj;
    }
    
    @Override
    public void run(){
        for(int i=1; i>=0; i++){
            System.out.println("Consumer reads: "+obj.getData());
        }
    }
}

public class UnsyncThreadCommn {
    
    public static void main(String[] args) {
        
        SharedObj obj = new SharedObj();
        
        Producer p1 = new Producer(obj);
        Consumer c1 = new Consumer(obj);
        
        p1.start();
        c1.start();
    
    }

}
