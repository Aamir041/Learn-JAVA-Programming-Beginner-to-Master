class SharedObj {
    private int value=0;
    boolean flag = true;
    
    synchronized public void setData(int v){
        while(flag != true)
            try{wait();}catch(InterruptedException e){System.out.println(e);}
        
        value = v;
        flag = false;
        notify();

    }

    synchronized public int getData(){
        int x = 0;
        while(flag != false)
            try{wait();}catch(InterruptedException e){System.out.println(e);}
        
        x = value;
        flag = true;
        notify();
        return x;
        
    }

}

class Producer extends Thread{

    SharedObj obj;

    Producer(SharedObj obj){
        this.obj = obj;
    }
    
    public void run(){
        int count=1;
        while(true)
        {
            obj.setData(count);
            System.out.println("Producer "+count);
            count++;
        }
    }
}

class Consumer extends Thread{
    SharedObj obj;

    Consumer(SharedObj obj){
        this.obj = obj;
    }
    
    public void run(){
        int value;
        while(true)
        {
            value=obj.getData();
            System.out.println("Consumer "+value);
        }
    }
}

public class SyncThreadCommn {
    
    public static void main(String[] args) {
        
        SharedObj obj = new SharedObj();
        
        Producer p1 = new Producer(obj);
        Consumer c1 = new Consumer(obj);
        
        p1.start();
        c1.start();
    
    }

}
