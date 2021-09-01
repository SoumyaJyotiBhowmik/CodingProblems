package programs;

import java.util.Arrays;

public class NextPermutation {

	public static void main(String[] args) {
		int[] input = new int[] {1,2,3};
		nextPermutation(input);
		Arrays.stream(input).forEach(System.out::println);

	}
	 public static void nextPermutation(int[] nums) {
	        if(nums.length == 0 || nums.length == 1){
	            return;
	        }
	        int index = nums.length-2;
	        while(index>=0 && nums[index] >= nums[index+1]) index--;
	        
	         if(index == -1){
	            reverse(nums,0,nums.length-1);
	            return;
	        }
	        
	        int j = nums.length-1;
	        while(j>=0 && nums[j] <=nums[index])j--;
	        swap(nums,index,j);

	        reverse(nums,index+1,nums.length-1);
	           
	    
	        
	    }
	    
	    private static void reverse(int[] nums,int start,int end){
	        while(start < end){
	            swap(nums,start++,end--);
	        }
	    }
	    private static void swap(int[] nums,int i, int j ){
	          int temp = nums[i];
	                nums[i] = nums[j];
	                nums[j] = temp;
	    }

}
