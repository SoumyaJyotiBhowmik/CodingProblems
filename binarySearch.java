package programs;

import java.util.Arrays;

public class binarySearch {

	public static void main(String[] args) {
		System.out.println("Found"+binarySearchRecursive(new int[] {1,2,3,4,5,6},6));
		System.out.println("Found"+iterativeBinarySearch(new int[] {1,2,3,4,5,6},0));
	}

		
		private static boolean binarySearchRecursive(int [] nums,int val) {
			Arrays.sort(nums);
			return binarySearch(nums,0,nums.length-1,val);
		}
		private static boolean binarySearch(int [] nums,int left,int right, int val) {
			if(right >= left) {
				int mid = (left+right)/2;
				if(nums[mid] == val) {
					return true;
				}
				if(val > nums[mid]) {
					return binarySearch(nums, mid+1, right, val);
				}else {
					return binarySearch(nums, left, mid-1, val);
				}
			}
			
			
			return false;
			
		}
		private static boolean iterativeBinarySearch(int [] nums,int val) {
			
			int left = 0;
			int right = nums.length;
			while(right >= left) {
				int mid = (left+right)/2;
				if(nums[mid] == val) {
					return true;
				}else if(val > nums[mid]) {
					left = mid+1;
				}else {
					right = mid-1;
				}
			}
			return false;
		}
}
