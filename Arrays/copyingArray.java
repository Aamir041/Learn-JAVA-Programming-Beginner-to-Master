public class copyingArray{
	public static void main(String[] args){
		int[] numArray = {1, 79, 60, 49, 37, 30, 65, 24, 19, 16};
		// int arrLen = ;
		int[] copyArray = new int[numArray.length];

		for(int i=0; i<numArray.length; i++){
			copyArray[i] = numArray[i];
		}

		for(int i=0; i<copyArray.length; i++){
			System.out.print(copyArray[i] + " ");
		}

	}
}