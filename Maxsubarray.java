class Maxsubarray {
	public static int maxSubArray(int[] nums) {
		int maxSum=nums[0];
		int currentSum=nums[0];

		for(int i=1; i<nums.length; i++)
		{
			if(currentSum<0)
			{
				currentSum=nums[i];
			}
			else {
				currentSum+=nums[i];
			}

			if(currentSum>maxSum)
			{
				maxSum=currentSum;
			}


 
		}
		return maxSum;

	}
	public static void main(String args[])
	{
		int nums[]= {1,-2,-6,-2};


		int result=maxSubArray(nums);
		System.out.println(result);
	}
}