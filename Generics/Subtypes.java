@SuppressWarnings("unchecked")
class MyArray<T>{

}

@SuppressWarnings("unchecked")
class MyArray2 extends MyArray<String>{

}

@SuppressWarnings("unchecked")
class MyArray3<T> extends MyArray<T>{

}

public class Subtypes{

	public static void main(String[] args) {

		MyArray<String> arr1 = new MyArray2();
		// MyArray<Integer> arr2 = new MyArray2(); this will giver error

		// MyArray3 will accept every type of object
		MyArray<Integer> arr2 = new MyArray3<>();
		MyArray<String> arr3 = new MyArray3<>();

	}

}