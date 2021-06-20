package programs;

import java.util.HashSet;
import java.util.Set;

public class distributeCandies {

	public static void main(String[] args) {
		System.out.println(distributeCandies(new int[] {1,1,2,2,3,3}));

	}
	
	 public static int distributeCandies(int[] candyType) {
	        Set<Integer> set = new HashSet<Integer>();
	        int noOfDiffItems = 0;
	        for(int i =0 ; i< candyType.length; i++){
	                 set.add(candyType[i]);
	        } 
	        return Math.min(candyType.length/2,set.size());
	    }

}
