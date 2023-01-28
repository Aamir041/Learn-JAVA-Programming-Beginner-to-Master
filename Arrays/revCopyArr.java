public class revCopyArr{
	public static void main(String[] args){
		int[] numArray = {1, 79, 60, 49, 37, 30, 65, 24, 19, 16};

		int[] revCopyArray = new int[numArray.length];

		int count = 0;
		for(int i=numArray.length-1 ; i>=0; i--){
			revCopyArray[count] = numArray[i];
			count++;
		}

		for(int i=0; i<revCopyArray.length; i++){
			System.out.print(revCopyArray[i] + " ");
		}

	}

}