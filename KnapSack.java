package programs;

//Implementation of 0/1 Knapsack
//Using recursion(Greedy)
//Using iterative/memoization(DP)
public class KnapSack {

	public static void main(String[] args) {
		int[] weights = {3,4,2};
		int[] profits = {5,6,4};
		int space = 6;
		//System.out.println("Max profit is: "+knapsack(weights,profits,space,weights.length-1));
		System.out.println("Max profit is: "+knapSackMemo(weights,profits,space,weights.length));
	}

	private static int knapSackMemo(int[] weights, int[] profits, int space, int length) {
		int [][] a = new int [length+1][space+1];
		int i=0,j=0;
		for(;i< length;i++) {//row
			for(;j< space ;j++) {//column
				if( i==0 || j==0) {
					a[i][j] = 0;
				}else if(weights[i-1]> j) {//If weight of i-1th item is > than space
					a[i][j] = a[i-1][j];//Assigning previous row value of same column
				}else {
					a[i][j] = getMax(a[i-1][j],profits[i-1]+a[i-1][j-weights[i-1]]);
				}
			}
			
		}
		return a[i][j];//return last value of the array
		
	}

	private static int knapsack(int[] weights, int[] profits, int space, int i) {
		
		if(space == 0 || i == 0) {
			return 0;
		}else if(weights[i] > space) {
			return knapsack(weights,profits,space,i--);
		}else {
			return getMax(knapsack(weights,profits,space,i-1) , profits[i] + knapsack(weights,profits,space - weights[i],i-1));
		}
	}
	private static int getMax(int a, int b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}

}
