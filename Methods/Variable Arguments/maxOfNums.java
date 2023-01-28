public class maxOfNums{
	static int max(int ...nums){
		int maxNum = nums[0];
		for(int i=1; i<nums.length; i++){
			if(maxNum < nums[i]){
				maxNum = nums[i];
			}
		}

		return maxNum; 
	}

	public static void main(String[] args){
		int maximum = max(18, 49, 35, 39);
		System.out.println(maximum);
	}
}