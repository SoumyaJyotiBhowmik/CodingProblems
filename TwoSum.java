package programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class TwoSum {

	public static void main(String[] args) {
		Arrays.stream(twoSum(new int[] {1,2,3,4,5,6,7,8},12)).forEach(System.out::println);

	}

	private static int[] twoSum(int[] array, int sum) {
		int start = 0;
		int end = 0;
		boolean found = false;
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(; end<array.length ;end++) {
			if(map.get(sum-array[end]) != null) {
				start = map.get(sum-array[end]);
				found = true;
				break;
			}else {
				map.put(array[end], end);
			}
		}
		return found ? new int[] {start,end} : new int[] {0};
	}

}
