public class findMaxEle{

	static int maxEle(int[] array){
		int max = array[0];

		for(int i=1; i<array.length; i++){
			if(max < array[i]){
				max = array[i];
			}
		}

		return max;
	} 

	public static void main(String[] args){
		int[] array = {96, 25, 99, 76, 75, 10, 94, 14, 96, 5};
		int max = maxEle(array);
		System.out.println("Ans: "+max);
	}
}