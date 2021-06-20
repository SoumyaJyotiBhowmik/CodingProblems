package programs;


/*Given an integer array A of size N.

You need to check that whether there exist a element which is strictly greater than all the elements on left of it and strictly smaller than all the elements on right of it.

If it exists return 1 else return 0.

NOTE:

Do not consider the corner elements i.e A[0] and A[N-1] as the answer.


Problem Constraints
3 <= N <= 105

1 <= A[i] <= 109



Input Format
First and only argument is an integer array A containing N integers.



Output Format
Return 1 if there exist a element that is strictly greater than all the elements on left of it and strictly smaller than all the elements on right of it else return 0.



Example Input
Input 1:

 A = [5, 1, 4, 3, 6, 8, 10, 7, 9]
Input 2:

 A = [5, 1, 4, 4]


Example Output
Output 1:

 1
Output 2:

 0*/
public class perfectPeakofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {5706, 26963, 24465, 29359, 16828, 26501, 28146, 18468, 9962, 2996, 492, 11479, 23282, 19170, 15725, 6335};
		//System.out.println(perfectPeak(a)); //O(n^2)
		System.out.println(perfectPeak1(a)); //O(n)
	}
	public static int perfectPeak1(int[] a) {
		
		int [] min = new int[a.length];
		int[] max = new int[a.length];
		max[0] = Integer.MIN_VALUE;
		min[a.length-1] = Integer.MAX_VALUE;
		for(int i=1;i<a.length-1;i++) {
			max[i] = Math.max(a[i-1], a[i]);
		}
		for(int j=a.length-2;j>0;j--) {
			min[j] = Math.min(a[j+1], a[j]);
		}
		
		for(int k=1;k<a.length-1;k++) {
			if(a[k] == min[k] && a[k]== max[k]) {
				return 1;
			}
		}
		return 0;
	}
	
	 public static int perfectPeak(int[] a) {
	
	     int k=1,count=0;
while(k < a.length-1){
	         
	         int i=0,j=a.length-1;
	         while(i <k){
	             if(a[i]<a[k]){
	                 i++;
	             }else{
	                 break;
	             }
	         }
	         while(j > k){
	             if(a[j] > a[k]){
	                 j--;
	             }else{
	                 break;
	             }
	         }
	         
	         if(i==k && j==k){
	             count =1; break;
	         }
	         k++;
	     }
	     return count;
	    }

}
