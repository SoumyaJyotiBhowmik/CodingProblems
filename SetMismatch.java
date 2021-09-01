package programs;

import java.util.Arrays;

//Repeat and Missing Number
/*You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

You are given an integer array nums representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return them in the form of an array.
		Input: nums = [1,2,2,4]
				Output: [2,3]*/

public class SetMismatch {

	public static void main(String[] args) {
		Arrays.stream(findErrorNums(new int[] {1,2,2,4})).forEach(System.out::println);;

	}
	
	 public static int[] findErrorNums(int[] nums) {
	       int count[] = new int[nums.length];
	        int[] res = new int[2];
	        for(int i=0;i<nums.length;i++){
	            count[nums[i]-1]++;
	        }
	         for(int i=0;i<nums.length;i++){
	            if(count [i] == 2){
	              res[0] = i+1;  
	            }
	              if(count [i] == 0){
	              res[1] = i+1;  
	            }
	        }
	        return res;
	    }

}
