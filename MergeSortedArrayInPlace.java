package programs;

import java.util.Arrays;

public class MergeSortedArrayInPlace {

	/*
	 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing
	 * order, and two integers m and n, representing the number of elements in nums1
	 * and nums2 respectively.
	 * 
	 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
	 * 
	 * The final sorted array should not be returned by the function, but instead be
	 * stored inside the array nums1. To accommodate this, nums1 has a length of m +
	 * n, where the first m elements denote the elements that should be merged, and
	 * the last n elements are set to 0 and should be ignored. nums2 has a length of
	 * n.
	 */
	public static void main(String[] args) {
	/*	int [] nums1 = new int[] {1,2,3,0,0,0};
		int m = 3,n = 3;
		int [] nums2 = new int[] {2,5,6};
		merge(nums1,m,nums2,n);				
		Arrays.stream(nums1).forEach(System.out::println);
		*/
		int [] nums1 = new int[] {1,2,4,5,6,0};
		int m = 5,n = 1;
		int [] nums2 = new int[] {3};
		//mergeWithGap(nums1,m,nums2,n);	
		mergeInPlace(nums1,m,nums2,n);	
		Arrays.stream(nums1).forEach(System.out::println);
	}
	//using GAP Algo
	 public static void mergeWithGap(int[] nums1, int m, int[] nums2, int n) {
	       
	      for(int i=0;i<n;i++){
	          nums1[m+i] = nums2[i];
	      }
	        
	        //Gap Algo
	        int gap = (int) Math.ceil((m+n)/2);
	        while(gap>=1){
	             int i=0;
	            while(i+gap < m+n){
	           
	            if(nums1[i] > nums1[i+gap]){
	                int temp = nums1[i];
	                nums1[i] = nums1[i+gap];
	                nums1[i+gap] = temp;
	            }
	            i++;
	            }
	            gap = (gap <= 1 ? 0 : gap/2 + gap%2);
	        }
	        
	        
	    }
	 
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int i=m-1;
      int j=n-1;
          int k= m+n-1;
          //Filling from back
          while(i>=0 && j>=0){
              
              if(nums2[j] > nums1[i]){
                  nums1[k--] = nums2[j--];
              }else{
                   nums1[k--] = nums1[i--];
              }
          }
          while(j>=0){
              nums1[k--] = nums2[j--];
          }
          
      }
    
    public static void mergeInPlace(int[] nums1, int m, int[] nums2, int n) {
        
    	 int i=0;
         if(n==0){
             return;
         }
           
           while(i< m){
               if(nums1[i] > nums2[0]){
                   int temp = nums1[i];
                   nums1[i] = nums2[0];
                   nums2[0] = temp;
                   int val = nums2[0];
                   int j=1;
                    while(j<n && val > nums2[j]){
                        nums2[j-1] = nums2[j];
                        j++;
                    } 
                   nums2[j-1] = val;
                    i++;
               }else {
            	   i++; 
               }
           }
           for(int k=0;k<n;k++) {
        	   nums1[m+k] = nums2[k];
           }
           
       }
	

}
