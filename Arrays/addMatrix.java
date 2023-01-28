public class addMatrix{
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

		int[][] addMat = new int[matrix1.length][matrix2.length];

		for(int i = 0 ; i<matrix1.length; i++){
			for(int j = 0; j<matrix2.length; j++){
				addMat[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}

		for(int i = 0 ; i<addMat.length; i++){
			for(int j = 0; j<addMat.length; j++){
				System.out.printf("%02d ",addMat[i][j]);
			}
			System.out.println();
		}
		
	}

}