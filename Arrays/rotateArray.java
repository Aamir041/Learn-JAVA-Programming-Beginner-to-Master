public class rotateArray{
	public static void main(String[] args){
// left rotation
		int[] numArr1 = {87, 69, 31, 89, 10, 31, 29};

// printing original array
		System.out.print("Original Array: ");
		for(int i = 0; i<numArr1.length; i++){
			System.out.print(numArr1[i] + " ");
		}
		System.out.println();
// left ward shifting
		int intialNumber = 0;
		for(int i = 0; i<numArr1.length; i++){
			if(i == 0){
				intialNumber = numArr1[0];
			}
			if(i == numArr1.length-1){
				numArr1[i] = intialNumber;
			}
			else{
				numArr1[i] = numArr1[i+1];
			}
		}
		
		System.out.print("Left Rotation: ");
		for(int i = 0; i<numArr1.length; i++){
			System.out.print(numArr1[i] + " ");
		}

		System.out.println();
		System.out.println();


// Right Rotation
		int[] numArr2 = {9, 47, 34, 47, 85, 95, 14};

// printing original array
		System.out.print("Original Array: ");
		for(int i = 0; i<numArr2.length; i++){
			System.out.print(numArr2[i] + " ");
		}
		System.out.println();

// right ward shifting
		int temp1=0;
		int temp2=0;

		for(int i = 0; i<numArr2.length; i++){
			if(i == 0){
				temp1 = numArr2[i];
				numArr2[i] = numArr2[numArr2.length-1];
			}
			else{
				temp2 = numArr2[i];
				numArr2[i] = temp1;
				temp1 = temp2;
			}
		}

		System.out.print("Right Rotation: ");
		for(int i = 0; i<numArr2.length; i++){
			System.out.print(numArr2[i] + " ");
		}

	}
}