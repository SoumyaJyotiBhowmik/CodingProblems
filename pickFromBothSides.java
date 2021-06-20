package programs;

import java.util.ArrayList;
import java.util.Arrays;


/*Problem Description

Given an integer array A of size N.

You can pick B elements from either left or right end of the array A to get maximum sum.

Find and return this maximum possible sum.

NOTE: Suppose B = 4 and array A contains 10 elements then:

You can pick first four elements or can pick last four elements or can pick 1 from front and 3 from back etc . you need to return the maximum possible sum of elements you can pick.


Problem Constraints
1 <= N <= 105

1 <= B <= N

-103 <= A[i] <= 103



Input Format
First argument is an integer array A.

Second argument is an integer B.



Output Format
Return an integer denoting the maximum possible sum of elements you picked.



Example Input
Input 1:

 A = [5, -2, 3 , 1, 2]
 B = 3
Input 2:

 A = [1, 2]
 B = 1


Example Output
Output 1:

 8
Output 2:

 2*/
public class pickFromBothSides {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList(Arrays.asList(5,-2,3,1,2));
		System.out.println(solve(a,3));
		

	}
	  public static int solve(ArrayList<Integer> A, int B) {
		  Integer[] a = new Integer[A.size()];
		  a = A.toArray(a);
		  int max = 0;
		  for(int i=0;i<B;i++) {
			  max += a[i];
		  }
		  
		  int left=max,right=0,k=B-1,j=a.length-1;
		  while(k>=0) {
			  
			  left -= a[k];
			  right+= a[j];
			  max = Math.max(max, left+right);
			  k--;
			  j--;
		  }
		  return max;
	  }
		  
}
