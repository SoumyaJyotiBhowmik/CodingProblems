package programs;

public class BestTimetoBuyAndSellStock {

	public static void main(String[] args) {
		System.out.println(maxProfitOptimal(new int[] {7,1,5,3,6,4}));
	}
	//O(n^2)
	public static int maxProfit(int [] prices) {
		int max = Integer.MIN_VALUE;
		int temp = 0;
	for(int i=0;i<prices.length;i++) {
		for(int j=i+1;j<prices.length;j++) {
			temp = prices[j] - prices[i];
			if(temp > max) {
				max = temp;
			}
		}
	}
	return max;
	}
	//O(n)
	public static int maxProfitOptimal(int [] prices) {
		
		int min = Integer.MAX_VALUE;
		int maxDiff = 0;
	for(int i=0;i<prices.length;i++) {	
		if(prices[i] < min) {
			min = prices[i];
		}
		if(prices[i] - min > maxDiff) {
			maxDiff = prices[i] - min;
		}
	}
	return maxDiff;
	}

}
