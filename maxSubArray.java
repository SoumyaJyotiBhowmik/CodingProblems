package programs;

public class maxSubArray {

	public static void main(String[] args) {
		System.out.println(maxSubArray(new int[] {-1,0,5,6,-1,6,-3,0}));
		System.out.println(maxSubArrayRecursive(new int[] {-1,0,5,6,-1,6,-3,0}));

	}
	//Using divide amd conquer
	public static int maxSubArrayRecursive(int[] nums) {
		return maxSubArray(nums,0,nums.length-1);
	}
	private static int maxSubArray(int[] nums, int left, int right) {
		if(left == right) {
			return nums[left];
		}
		int mid = (left+right)/ 2;
		return Math.max(Math.max(maxSubArray(nums,left,mid),maxSubArray(nums,mid+1,right)), maxSubArrayCross(nums,left,mid,right));
	}
	private static int maxSubArrayCross(int[] nums, int left, int mid, int right) {
		
		int maxLeftSum = Integer.MIN_VALUE;
		int maxRightSum = Integer.MIN_VALUE;
		int temp = 0;
		
		//Finding max from left part
		for(int i= mid ; i >= left ; i--) {
			temp += nums[i];
			if(temp > maxLeftSum) {
				maxLeftSum = temp;
			}
		}
		//Finding max from right part
		temp = 0;
		for(int i= mid+1 ; i <=right ; i++) {
			temp += nums[i];
			if(temp > maxRightSum) {
				maxRightSum = temp;
			}
		}
		
		
		return Math.max(Math.max(maxRightSum, maxLeftSum), maxLeftSum+maxRightSum);
	}
	//Kaden's Algo
	public static int maxSubArray(int[] nums){
		int temp = 0;
		int maxSum = Integer.MIN_VALUE;
		for(int num : nums) {
			temp += num;
			if(temp > maxSum) {
				maxSum = temp;
			}
			if(temp < 0) {
				temp = 0;
			}
		}
		return maxSum;
	}
	//O(n^2)
	private static int maxSubarray2(int[] input) {
		int temp = 0;
		int max = Integer.MIN_VALUE;
		for(int i=0;i<input.length;i++) {
			int sum = 0;
			for(int j=i;j<input.length;j++) {
				sum+= input[j];
				if(sum > max) {
					max = sum;
				}
			}
			
		}
		return max;
	}

}
