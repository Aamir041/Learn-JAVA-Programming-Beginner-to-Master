public class arrlenInc{
	public static void main(String[] args){
		int[] numArray = {1, 79, 60, 49, 37, 30, 65, 24, 19, 16};
		
		System.out.println("Intial Array Size: "+numArray.length);

		for(int i=0; i<numArray.length; i++){
		    System.out.print(numArray[i] + " ");	
		}

		System.out.println();

		int[] newIncArr =  new int[(numArray.length*2)];

		for(int i=0; i<numArray.length; i++){
			newIncArr[i] = numArray[i];	
		}

		for(int i=0; i<newIncArr.length; i++){
		    System.out.print(newIncArr[i] + " ");	
		}


	}
}