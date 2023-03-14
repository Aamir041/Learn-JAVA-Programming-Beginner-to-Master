@SuppressWarnings("unchecked")
class MyArray<K,V>{

	K key[] = (K[]) new Object[10];
	V value[] = (V[]) new Object[10];
	
	int count = 0;

	MyArray(){
		System.out.println("MyArray created !");
	}
	
	public void add(K k, V v){
		key[count] = k;
		value[count] = v;
		count++;
	}

	public void display(){
		for(int i=0; i<count; i++){
			System.out.println(key[i]+" : "+value[i]);
		}
	}

 }

public class MultipleParameters{
	
	public static void main(String[] args) {
		
		MyArray<Integer,String> map = new MyArray<>();
		map.add(21,"Aamir");
		map.add(15,"Owais");
		map.add(40,"Seema");
		map.add(49,"Alipasha");
		map.display();

	}
}