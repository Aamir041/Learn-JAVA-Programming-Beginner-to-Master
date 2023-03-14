public class GenericMethod{
	
	static<T> void display(T[] array){
		for(int i=0; i<array.length; i++){
			System.out.println(array[i]);
		}
	}

	public static void main(String[] args) {
		display(new Integer[] {12,32,18,99,67});
		display(new String[] {"Aamir","Owais","Seema","Alipasha"});
	}	
}