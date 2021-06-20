package programs;

/*
Given an integer array A of size N. You need to count the number of special elements in the given array.

A element is special if removal of that element make the array balanced.

Array will be balanced if sum of even index element equal to sum of odd index element.



Problem Constraints
1 <= N <= 105

1 <= A[i] <= 109



Input Format
First and only argument is an integer array A of size N.



Output Format
Return an integer denoting the count of special elements.



Example Input
Input 1:

 A = [2, 1, 6, 4]
Input 2:

 A = [5, 5, 2, 5, 8]


Example Output
Output 1:

 1
Output 2:

 2*/
public class BalanceArray {

	public static void main(String[] args) {
		
		int[] array = {5,5,2,5,8};
		System.out.println(balanceArray(array));

	}

	private static int balanceArray(int[] a) {
		
		int index = 0,count =0;
		
		while(index <a.length) {
			int i=0,j=a.length-1,leftEven=0,leftOdd = 0, rightEven = 0, rightOdd = 0;
			while(i< index) {
				if(i % 2 == 0) {
					leftEven += a[i];
				}else
				{
					leftOdd += a[i];
				}
				i++;
			}
			while(j>index) {
				if(j % 2 == 0) {
					rightOdd += a[j];
				}else
				{
					rightEven += a[j];
				}
				j--;
			}
			if((leftEven + rightEven) == (leftOdd + rightOdd)) {
				count++;
			}
			index++;
		}
		return count;
	}
		

}
