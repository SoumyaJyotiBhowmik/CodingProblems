package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

	public static void main(String[] args) {
		/*
		 * int[][] res = mergeIntervals(new int[][] {{1,3},{8,10},{2,6},{9,9},{15,18}});
		 * System.out.println("output"); Arrays.stream(res).forEach(a ->{
		 * System.out.println(a[0]+","+a[1]); });
		 */
		
		int[][] res = mergeIntervalsBruteForce(new int[][] {{1,3},{8,10},{2,6},{9,9},{15,18}});
		System.out.println("output");
		Arrays.stream(res).forEach(a ->{
			System.out.println(a[0]+","+a[1]);
		});
		
		

	}
	
	
	private static int[][] mergeIntervalsBruteForce(int[][] input){
		List<int []> res = new ArrayList<int []>();
		Arrays.sort(input,(a,b)->a[0]-b[0]);
		for(int i=0;i<input.length;i++) {
			int min = input[i][0];
			int max = input[i][1];
			for(int j=i;j<input.length;j++) {
				if(input[j][0] >= input[i][0] && input[j][0] <= input[i][1]) {//Overlapping condition
					min = Math.min(input[j][0], min);
					max = Math.max(input[j][1], max);
				}
			}
			if(!(res.size()>0 && min >= res.get(res.size()-1)[0] && min <= res.get(res.size()-1)[1])) {//If not already present in the result
				res.add(new int[] {min,max});
			}
			
			
		}
		return res.toArray(new int[res.size()][]);
	}
	private static int[][] mergeIntervals(int[][] input) {

		List<int []> res = new ArrayList<int []>();
		int[] temp = new int[2];
		Arrays.sort(input,(a,b)->a[0]-b[0]);
		
		temp = input[0];
		for(int i=1;i<input.length;i++) {
			if(input[i][0] >= temp[0] && input[i][0] <= temp[1]){//Overlapping condition
				temp[0] = Math.min(temp[0],input[i][0]);
				temp[1] = Math.max(temp[1], input[i][1]);
			}else {
				res.add(new int[] {temp[0],temp[1]});
				temp[0] = input[i][0];
				temp[1] = input[i][1];
			}
		}
		res.add(new int[] {temp[0],temp[1]});
		
		return res.toArray(new int[res.size()][]);
		
		
	}

}
