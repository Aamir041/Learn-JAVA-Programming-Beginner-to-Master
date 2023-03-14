@SuppressWarnings ("unchecked")// this annotation is used to remove warning that we get from type casting Object to T while compiling

class MyList<T>{
	
	T data[] = (T[]) new Object[10]; // Type casting Object to T

	int length = 0;
	
	public void append(T v){
		data[length++] = v;
	}

	public void display(){
		for(int i=0; i<length; i++){
			System.out.println(data[i]);
		}
	}

}

public class GenericClassDefine{
	public static void main(String[] args) {
		
		MyList<Integer> ml1 = new MyList<>();
		ml1.append(12);
		ml1.append(21);
		ml1.append(45);
		ml1.display();

		MyList<String> ml2 = new MyList<>();
		ml2.append("Aamir");
		ml2.append("Alipasha");
		ml2.append("Saudagar");
		ml2.display();


 	}
}