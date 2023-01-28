public class multiMatrix{
	public static void main(String[] args){
		int[][] matrix1 = {
			{3,5,9},
			{7,6,2},
			{4,3,5}
		};

		int[][] matrix2 = {
			{1,5,2},
			{6,8,4},
			{3,9,7}
		};

		int[][] mulMat = new int[matrix1.length][matrix2.length];

		for(int i = 0; i<matrix1.length; i++){
			for(int j = 0; j<matrix1.length; j++){
				for(int k = 0; k<matrix2.length; k++){
					mulMat[i][j] = mulMat[i][j] + (matrix1[i][k] * matrix2[k][j]);
				}
			}
		}

		for(int i = 0; i<mulMat.length; i++){
			for(int j = 0; j<mulMat.length; j++){
				System.out.print(mulMat[i][j] + " ");
			}
			System.out.println();
		}  
	}
}