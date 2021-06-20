package programs;

public class findDuplicateNumber {

	public static void main(String[] args) {
		System.out.println(duplicateNumberXOR(new int [] {23,21,24,27,22,27,26,25}));
		System.out.println(duplicateNumber(new int [] {23,21,24,27,22,27,26,25}));

	}
	
	public static int duplicateNumberXOR(int[] nums) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int xor = 0;
		int actualXor = 0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i] <min) {
				min = nums[i];
			}
			if(nums[i] > max) {
				max = nums[i];
			}
		}
		
		for(int i = min; i <= max;i++) {
			xor = xor ^ i;
		}
		for(int i = 0;i<nums.length ;i++) {
			actualXor = actualXor ^ nums[i];
		}
		return actualXor ^ xor;
	}
	
	public static int duplicateNumber(int [] nums) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int sum = 0;
		int actualSum = 0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i] <min) {
				min = nums[i];
			}
			if(nums[i] > max) {
				max = nums[i];
			}
		}
		
		for(int i = min; i <= max; i++) {
			sum += i;
		}
		for(int i = 0; i <nums.length; i++) {
			actualSum += nums[i];
		}
		return actualSum - sum;
	}

}
