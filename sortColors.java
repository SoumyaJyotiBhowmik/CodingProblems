package programs;
/*
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]

*/
public class sortColors {

	public static void main(String[] args) {
		//Can be done using any sorting algo
		//QuickSort--O(nlogn)
		//countSort--O(2n)
		sortColorsCount(new int[] {2,0,2,1,1,0});
		//Dutch National Flag Algo--O(n)
		sortColorsBest(new int[] {2,0,2,1,1,0});
		
	}
	
public static void sortColorsCount(int[] nums) {
        
        int[] count = new int[3];
        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;
        }
        int index = 0;
        for(int i=0;i<count.length;i++){
            int k = count[i];
            while(k!=0){
                nums[index++] = i;
                k--;
            }
        }
        
    }
	
	 public static void sortColorsBest(int[] nums) {
	        
	        int low = 0;
	        int mid = 0;
	        int high = nums.length-1;
	        int temp;
	        while(mid <= high){
	            switch(nums[mid]){
	                case 0 : {
	                    temp = nums[low];
	                    nums[low] = nums[mid];
	                    nums[mid] = temp;
	                    mid++;
	                    low++;
	                    break;
	                }
	                case 1 : {
	                    mid++; 
	                    break;
	                }
	                case 2 : {
	                    temp = nums[high];
	                    nums[high] = nums[mid];
	                    nums[mid] = temp;
	                    high--;
	                    break;
	                }
	            }
	        }
	        
	    }

}
