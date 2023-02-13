interface sayHello{
    void greet();
    void greet(String name);
    default void sayHi(){
        System.out.println("Hallo");
    }

    static void sayHola(){
        System.out.println("\nHola Amigos");   
    } 
}

class englishGreet implements sayHello{
    
    @Override   
    public void greet(){
        System.out.println("Hello");
    }

    @Override
    public void greet(String name){
        System.out.println("Hello "+name);
    }
}

public class defaultMethod{
    public static void main(String[] args) {
        sayHello h1 = new englishGreet();
        h1.sayHi();
        h1.greet();
        h1.greet("Aamir");
        // h1.sayHola(); // can not call static method using a object reference
        sayHello.sayHola();

        System.out.println();

        englishGreet e1 = new englishGreet();
        e1.sayHi();
        e1.greet();
        e1.greet("Aamir Saudagar");
        // e1.sayHola(); // can not call static method using a object reference         
    }
}