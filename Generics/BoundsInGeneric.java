class A{}
class B extends A {}
class C extends B {}

class D{}

@SuppressWarnings("unchecked")
class MyArray<T extends A>{
	T data[] = (T[]) new Object[3];
	MyArray(){
		System.out.println("Created");
	}
}

public class BoundsInGeneric{

	public static void main(String[] args) {

		MyArray<A> myarr1 = new MyArray<A>();
		
		MyArray<B> myarr2 = new MyArray<B>();
	
		MyArray<C> myarr3 = new MyArray<C>();
		
		// MyArray<D> myarr4 = new MyArray<>(); This will throw an error

	}

}