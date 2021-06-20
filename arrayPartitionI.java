package programs;

import java.util.Arrays;

public class arrayPartitionI {

	public static void main(String[] args) {
		System.out.println(arrayPairSum(new int [] {1,4,3,2}));

	}
	//Concept is the closer the values in pairs ,the maximum can be returned.
	//So we sort the array, then take every 2nd element.
	//Eg: 1 2 3 4 , so 1=min(1,2) , 3=min(3,4)  max sum = 1+3
	public static int arrayPairSum(int[] nums) {
        
	       Arrays.sort(nums);
	        int max = 0;
	        for(int i=0;i < nums.length ;i+=2){
	            max += nums[i];
	        }
	        return max;
	    }

}
