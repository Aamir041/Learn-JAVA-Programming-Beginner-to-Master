interface test {
    static final int X  = 100;
    void meth1();
    default void meth2(){
        System.out.println("This is meth2");
    }
    static void meth3(){
        System.out.println("This is meth3");
    }
}

class test1 implements test{
    @Override
    public void meth1(){
        System.out.println("This is meth1");
    }
}

public class defaultMethod {
    public static void main(String[] args) {
        test.meth3(); // calling static method
        System.out.println(test.X); // this is identifier
        // test.meth2(); can not use like this
        test1 t1 = new test1();
        t1.meth2();
        t1.meth1();
        // t1.meth3(); -> implemented class can not call static method from interface
    }
}
