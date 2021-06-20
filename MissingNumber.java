package programs;

public class MissingNumber {

	public static void main(String[] args) {
		System.out.println(missingNumber(new int [] {3,0,2,4}));

	}
	 public static int missingNumber(int[] nums) {
	    int xor = 0,correctXor=0;
		for (int i = 0; i < nums.length; i++) {
			xor = xor ^ nums[i];
		}
		for(int i = 0;i<=nums.length;i++) {
			correctXor = correctXor	^ i;
		}

		return xor ^ correctXor;
	    }
	 
	 public int missingNumberNormal(int[] nums) {
	       int size = nums.length;
	       int total = size*(size+1)/2; //Finding correct sum
	        int sum = 0;
	        for(int i=0; i < size ; i++){
	           sum += nums[i]; // Finding actual solution
	        }
	        if(total - sum >= 0){
	            return total - sum;
	        }else
	            return -1;
	       
	}

}
