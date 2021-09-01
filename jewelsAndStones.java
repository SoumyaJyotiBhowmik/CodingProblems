package programs;
//Two strings, 1 containing stones asnother jewels, find number of stones which are also jewels
//Eg : stones [] = "abc" jewels[] = "axy" return 1
public class jewelsAndStones {

	public static void main(String[] args) {
		System.out.println(findCommon("abcdfdsfffsdabc","abcppppppppppabc"));
	}

	private static int findCommon(String jewels, String stones) {
		int [] array = new int [26];
		int count =0;
		for(char ch : jewels.toCharArray()) {
			++array[ch - 'a'];
		}
		for(char ch : stones.toCharArray()) {
			if(array[ch - 'a'] > 0) {
				count ++;
				--array[ch - 'a'];
			}
		}
		return count;
	}

}
